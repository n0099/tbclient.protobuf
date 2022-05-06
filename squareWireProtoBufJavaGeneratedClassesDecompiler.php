<?php
declare(strict_types=1);

set_error_handler(function ($severity, $message, $file, $line) {
    throw new \ErrorException($message, $severity, $severity, $file, $line);
});

// https://stackoverflow.com/questions/34190464/php-scandir-recursively/46697247#46697247
function scanAllDir($dir)
{
    $result = [];
    foreach (scandir($dir) as $messageName) {
        if ($messageName[0] === '.') continue;
        $filePath = $dir . '/' . $messageName;
        if (is_dir($filePath)) {
            foreach (scanAllDir($filePath) as $childFilename) {
                $result[] = $messageName . '/' . $childFilename;
            }
        } else {
            $result[] = $messageName;
        }
    }
    return $result;
}

// https://www.reddit.com/r/PHP/comments/3l368d/calculate_the_relative_difference_between_two/
// https://www.php.net/manual/en/function.realpath.php#105876
// unused since the path locator of .proto imports is sucks : https://stackoverflow.com/questions/53052911/importing-from-parent-folder-to-child-in-proto
function relativePath($from, $to, $ps = DIRECTORY_SEPARATOR)
{
    $arFrom = explode($ps, rtrim($from, $ps));
    $arTo = explode($ps, rtrim($to, $ps));
    while (count($arFrom) && count($arTo) && ($arFrom[0] == $arTo[0])) {
        array_shift($arFrom);
        array_shift($arTo);
    }
    return str_pad("", count($arFrom) * 3, '..' . $ps) . implode($ps, $arTo);
}

try {
    ['out' => $outDir, 'in' => $inputDir] = getopt('', ['in:', 'out:']);
} catch (Exception $e) {
    echo 'Usage: php squareWireProtoBufJavaGeneratedClassesDecompiler.php --in=<path to .java class files> --out=<path to .proto files>' . PHP_EOL;
    exit();
}
echo "scaning classes under ./$inputDir...\n";

foreach (scanAllDir($inputDir) as $filePath) {
    $fullFilePath = "$inputDir/$filePath";
    echo "working: $fullFilePath...\n";
    $file = file_get_contents($fullFilePath);

    $fieldMatches = [];
    preg_match_all('/\s*@ProtoField\((label = Message.Label.(?<label>.*?), |)tag = (?<id>\d+)(, type = Message\.Datatype\.(?<type>.*?)|)\)\s*public final (?<javaType>.*?) (?<name>.*?);/', $file, $fieldMatches, PREG_SET_ORDER);
    $fields = [];
    foreach ($fieldMatches as $field) {
        ['label' => $label, 'id' => $id, 'type' => $type, 'javaType' => $javaType, 'name' => $name] = $field;
        $label = strtolower($label);
        $label = empty($label) ? '' : "$label ";
        if (empty($type)) {
            $repeatedType = [];
            preg_match('/(List<|)(?<repeatedType>.*)/', $javaType, $repeatedType);
            $type = trim($repeatedType['repeatedType'], '>');
        } else {
            $type = strtolower($type);
        }
        $fields[$id] = "$label$type $name = $id;";
    }
    ksort($fields);

    $pathInfo = pathinfo($filePath);
    $messageName = $pathInfo['filename'];

    $javaImports = [];
    preg_match_all('/import tbclient\.(?<import>.*?);/', $file, $javaImports);
    $imports = array_filter(array_map(function ($importBeforePathFix)  use ($filePath, $messageName) {
        if ($importBeforePathFix === $messageName) return null; // some java class will import itself at first, so we need to filter it out of the imports of protobuf
        $importBeforePathFix = str_replace('.', '/', $importBeforePathFix);
        return "import \"{$importBeforePathFix}.proto\";";
        /*
        $fixedImport = relativePath($filePath, $importBeforePathFix);
        $trimedStartParentPath = [];
        preg_match('@../(.*$)@', $fixedImport, $trimedStartParentPath);
        return "import \"{$trimedStartParentPath[1]}.proto\";";
        */
    }, $javaImports['import']));

    $indent = "\n    ";
    $importsStr = count($imports) === 0 ? '' : join("\n", $imports) . "\n\n";
    $outputProtoFile = "syntax = \"proto3\";\n\n{$importsStr}message $messageName {" . $indent . join($indent, $fields) . "\n}\n";
    $outFileDirPath = "$outDir/{$pathInfo['dirname']}";
    if (!is_dir($outFileDirPath)) mkdir(trim($outFileDirPath, '.'));
    file_put_contents("$outFileDirPath/$messageName.proto", $outputProtoFile);
}
