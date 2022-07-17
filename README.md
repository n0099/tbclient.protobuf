## 从百度贴吧客户端 12.26.1.0 中提取出的所有 protoBuf 定义文件.proto

|路径|其文件用途|
|---|---|
|java|[@Starry-OvO](https://github.com/Starry-OvO) 使用 [dex2jar](https://github.com/ThexXTURBOXx/dex2jar) 与 [jd-cli](https://github.com/intoolswetrust/jd-cli) 反编译贴吧客户端 apk 后取出 tbclient 根命名空间下的 `.class` 源码文件|
|proto|使用 `squareWireProtoBufJavaGeneratedClassesDecompiler.php` 将这些通过 [square/wire](https://github.com/square/wire) 生成的 java 类源码转换回 .proto 文件|
|tbm|用于项目 https://github.com/n0099/TiebaMonitor 而遴选并重命名出的部分 .proto 文件|
|tbm_min|同上但只选取了 [tbm](https://github.com/n0099/TiebaMonitor) 中所引用的字段和 .proto 文件|
|protoc.sh|将 `tbm_min/*.proto` 文件codegen为用于 php/C# 的类文件，置于 `tbm_min_{php,cs}` 下并打包为 `tbm_min_{php,cs}.7z`，依赖于 [protoc](https://github.com/protocolbuffers/protobuf/releases) 和 [7z](https://7-zip.org/download.html) |
