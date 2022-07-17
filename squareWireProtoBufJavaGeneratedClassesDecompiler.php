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
    $imports = [];
    $missingImports = [];
    foreach ($fieldMatches as $field) {
        ['label' => $label, 'id' => $id, 'type' => $type, 'javaType' => $javaType, 'name' => $name] = $field;
        $label = strtolower($label);
        $label = empty($label) ? '' : "$label ";
        if (empty($type)) {
            $typeWithoutList = [];
            preg_match('/(List<|)(?<typeWithoutList>.*[^>])/', $javaType, $typeWithoutList);
            $type = $typeWithoutList['typeWithoutList'];
            if (file_exists("{$inputDir}/{$type}.java")) {
                $imports[] = 'import "' . $type . '.proto";';
            } else {
                $package = [];
                preg_match('/package (?<package>.*?);/', $file, $package);
                $typePathWithPackagePrefix = str_replace('.', '/', str_replace('tbclient.', '', $package['package'])) . "/{$type}";
                if (file_exists("{$inputDir}/{$typePathWithPackagePrefix}.java")) {
                    $imports[] = 'import "' . $typePathWithPackagePrefix . '.proto";';
                } else {
                    // insert without package prefix since missing imports usually will be relatively imported by $javaImports
                    $missingImports[] = 'import "' . $type . '.proto";';
                }
            }
        } else {
            // lowercasing values in `@ProtoField(label = Message.Label.REPEATED, type = Message.Datatype.STRING)` attribute
            $type = strtolower($type);
        }
        $fields[$id] = "$label$type $name = $id;";
    }

    $javaImports = [];
    preg_match_all('/import tbclient\.(?<import>.*?);/', $file, $javaImports);
    $imports += array_map(fn ($importPath) => 'import "' . str_replace('.', '/', $importPath) . '.proto";', $javaImports['import']);
    
    ksort($fields);
    sort($imports);
    $imports = array_unique($imports);
    if (count(array_diff($missingImports, $imports)) !== 0) {
        echo "  failed to reslove following type names:\n";
        var_dump(array_diff($missingImports, $imports));
    }

    $pathInfo = pathinfo($filePath);
    $messageName = $pathInfo['filename'];
    $indent = "\n    ";
    $importsStr = count($imports) === 0 ? '' : join("\n", $imports) . "\n\n";
    $outputProtoFile = "syntax = \"proto3\";\n\n{$importsStr}message $messageName {" . $indent . join($indent, $fields) . "\n}\n";
    $outFileDirPath = "$outDir/{$pathInfo['dirname']}";
    if (!is_dir($outFileDirPath)) mkdir(trim($outFileDirPath, '.'));
    file_put_contents("$outFileDirPath/$messageName.proto", $outputProtoFile);
}
