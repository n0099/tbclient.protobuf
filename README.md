## 从百度贴吧客户端`12.27.5.0`中提取出的所有 protoBuf 定义文件`.proto`

|路径|其文件用途|
|---|---|
|java|[@Starry-OvO](https://github.com/Starry-OvO) 使用 [dex2jar](https://github.com/ThexXTURBOXx/dex2jar) 与 [jd-cli](https://github.com/intoolswetrust/jd-cli) 反编译贴吧客户端 apk 后取出 tbclient 根命名空间下的 `.class` 源码文件|
|proto|使用 `squareWireProtoBufJavaGeneratedClassesDecompiler.php` 将这些通过 [square/wire](https://github.com/square/wire) 生成的 java 类源码转换回 .proto 文件|
|interested|从 `proto` 中遴选出并重新组织目录结构和 namespace了 的部分 .proto 文件|
|tbm|用于项目 https://github.com/n0099/TiebaMonitor 而从 `interested` 中遴选出的部分 .proto 文件|
|`protoc.sh <PROTO_PATH> <lang...>`|将 `<PROTO_PATH>/**/*.proto` 文件codegen为用于 `<lang>` 语言环境的类文件，置于 `<PROTO_PATH>_<lang>` 下并打包为 `<PROTO_PATH>_<lang>.7z`，依赖于 [protoc](https://github.com/protocolbuffers/protobuf/releases) 和 [7z](https://7-zip.org/download.html) |
