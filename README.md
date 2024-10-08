# 跨`repo/barnch`索引
| repo | branch | 意义 |
|-|-|-|
| [`tbclient.protobuf`](https://github.com/n0099/tbclient.protobuf)➡️ | [`main`](https://github.com/n0099/tbclient.protobuf/tree/main)🏠➡️ | 作为`repo default branch`<br>存储此前遗留的几个版本的`.java/.proto`文件<br>以及[tbm](https://github.com/n0099/open-tbm)中所使用的部分`.proto`文件及其字段 |
| [`tbclient.protobuf`](https://github.com/n0099/tbclient.protobuf) | [`tbclient`](https://github.com/n0099/tbclient.protobuf/tree/tbclient) | 244 个历史版本中提取的`.java/.proto`文件 |
| [`open-tbclient`](https://github.com/n0099/open-tbclient) | [`main`](https://github.com/n0099/open-tbclient/tree/main)🏠 | 作为`repo default branch` |
| [`open-tbclient`](https://github.com/n0099/open-tbclient) | [`src`](https://github.com/n0099/open-tbclient/tree/src) | 293 个历史版本中的所有`.java`文件 |

# [`branch/main`](https://github.com/n0099/tbclient.protobuf/tree/main)
## 从百度贴吧客户端`12.51.7.1`中提取出的所有 protoBuf 定义文件`.proto`

| 路径 | 其文件用途 |
|-|-|
| java | [@Starry-OvO](https://github.com/Starry-OvO) 使用 [dex2jar](https://github.com/ThexXTURBOXx/dex2jar) 与 [jd-cli](https://github.com/intoolswetrust/jd-cli) 反编译贴吧客户端 apk 后取出 tbclient 根命名空间下的 `.class` 源码文件 |
| proto | 使用 `squareWireProtoBufJavaGeneratedClassesDecompiler.php` 将这些<br>通过 [square/wire](https://github.com/square/wire) 生成的 java 类源码转换回 .proto 文件 |
| interested | 从 `proto` 中遴选出并重新组织目录结构和 namespace 了的部分 .proto 文件 |
| tbm | 用于项目 https://github.com/n0099/open-tbm 而从 `interested` 中遴选出的部分 .proto 文件 |
| `protoc.sh <proto path> <langs...>` | 将 `<proto path>/**/*.proto` 文件codegen为用于 `<lang>` 语言环境的类文件<br>置于 `<proto path>_<lang>` 下并打包为 `<proto path>_<lang>.zip`<br>依赖于 [protoc](https://github.com/protocolbuffers/protobuf/releases)|

# [`branch/tbclient`](https://github.com/n0099/tbclient.protobuf/tree/tbclient)
## 从 244 个历史版本百度贴吧客户端中提取出的所有 Protocol Buffers 定义文件`.proto`
版本跨度`6.1.0`\~`12.34.3.0`

时间跨度`14-05-19`\~`22-12-27`

## 列名表
| 列名 | 说明 | [`tbclient.protobuf/issues/2`](https://github.com/n0099/tbclient.protobuf/issues/2)<br>中的相关comment |
|-|-|-|
| \* | `版本号.apk.zip/classes.dex`文件的修改时间<br>即apk编译时间或者说这个版本的首次发布时间 | https://github.com/n0099/tbclient.protobuf/issues/2#issuecomment-1416769621 |
| ⑴ | `jadx/版本号.zip`中路径以`版本号/src/tbclient/`开头的文件数量 | https://github.com/n0099/tbclient.protobuf/issues/2#issuecomment-1415365792 |
| ⑵ | `jadx/版本号.zip`中路径以`版本号/src/tbclient/`开头的目录数量<br>即根命名空间`tbclient`下的子命名空间数量 | https://github.com/n0099/tbclient.protobuf/issues/2#issuecomment-1417424277 |
| Ⓐ | https://www.wandoujia.com/apps/280375/history 源 | https://github.com/n0099/tbclient.protobuf/issues/2#issue-1560704618 |
| Ⓑ | http://static.tieba.baidu.com/client/android/tbclient_1_0_0.apk 源 | https://github.com/n0099/tbclient.protobuf/issues/2#issuecomment-1407472050 |
| Ⓒ | https://soft.shouji.com.cn/down/22020.html 源 | https://github.com/n0099/tbclient.protobuf/issues/2#issuecomment-1407476112 |
| Ⓓ | https://tieba.baidu.com/p/5008810954 源<br>合并了3个百度网盘分享：<br>[`4215848229`](https://pan.baidu.com/share/link?shareid=4215848229&uk=4080398260) [`2178084026`](https://pan.baidu.com/share/link?shareid=2178084026&uk=4080398260) [`2555595519`](https://pan.baidu.com/share/link?shareid=2555595519&uk=4080398260) | https://github.com/n0099/tbclient.protobuf/issues/2#issuecomment-1407472284 |

## 4个源列的图例
| emoji | 说明 |
|-|-|
| 🔴 | 不存在于当前源中 |
| ⚠️ | 存在于当前源中，但优先从前一个源下载<br>即按照`Ⓐ ?? Ⓑ ?? Ⓒ ?? Ⓓ`fallback |
| ✔️ | 存在于当前源中，且优先从当前源下载 |

## 版本表
| 版本号     | 编译时间*          | ⑴    | ⑵   | Ⓐ  | Ⓑ  | Ⓒ  | Ⓓ  |
| --------- | ----------------- | ---- | --- | --- | --- | --- | --- |
| 1.0.0     | 11-11-02 15:06:50 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 1.0.1     | 12-01-10 14:20:58 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 1.0.2     | 12-03-23 11:22:12 | 0    | 0   | 🔴  | ✔️  | 🔴  | 🔴  |
| 1.0.3     | 12-04-26 18:24:50 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 1.0.4     | 12-07-02 16:52:20 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 1.1.0     | 12-09-10 11:57:48 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 2.0.0     | 12-09-28 20:00:36 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 2.0.1     | 12-09-29 15:27:18 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 2.0.2     | 12-10-08 16:35:54 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 2.0.3     | 12-10-12 18:43:18 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 2.1.0     | 12-10-26 14:47:24 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 2.5.0     | 12-11-07 18:57:44 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 2.5.1     | 12-11-08 11:59:22 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 3.0.1     | 12-12-05 18:57:14 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 3.0.2     | 12-12-14 16:00:38 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 3.1.0     | 12-12-27 12:33:22 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 3.2.0     | 13-01-31 15:45:10 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 3.2.2     | 13-02-04 21:26:16 | 0    | 0   | 🔴  | ✔️  | 🔴  | 🔴  |
| 3.3.0     | 13-03-05 14:42:34 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 3.3.1     | 13-03-06 21:09:06 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 3.4.0     | 13-04-02 17:46:12 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.0.0     | 13-05-19 21:34:14 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.1.0     | 13-06-08 20:03:06 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.1.1     | 13-06-08 20:03:06 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.1.2     | 13-06-19 19:48:58 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.2.0     | 13-07-01 16:51:18 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.2.2     | 13-07-02 15:44:22 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.3.0     | 13-08-05 17:18:48 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.3.1     | 13-08-07 20:52:22 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.4.1     | 13-08-23 15:30:42 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.4.2     | 13-08-29 15:34:42 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 4.5.3     | 13-09-24 18:45:04 | 0    | 0   | 🔴  | ✔️  | ⚠️  | 🔴  |
| 5.0.8     | 13-11-05 19:54:16 | 0    | 0   | 🔴  | ✔️  | ⚠️  | ⚠️  |
| 5.1.1     | 13-11-13 21:15:10 | 0    | 0   | 🔴  | 🔴  | ✔️  | 🔴  |
| 5.1.2     | 13-11-21 13:20:22 | 0    | 0   | 🔴  | ✔️  | ⚠️  | ⚠️  |
| 5.1.3     | 13-11-22 16:48:58 | 0    | 0   | 🔴  | ✔️  | ⚠️  | ⚠️  |
| 5.1.5     | 13-11-26 14:14:02 | 0    | 0   | 🔴  | 🔴  | ✔️  | 🔴  |
| 5.2.1     | 13-12-05 15:23:00 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 5.2.2     | 13-12-09 22:21:30 | 0    | 0   | 🔴  | ✔️  | ⚠️  | ⚠️  |
| 5.3.1     | 13-12-24 11:10:04 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 5.4.2     | 14-01-06 16:13:12 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 5.5.1     | 14-01-22 13:41:22 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 5.5.2     | 14-01-23 14:12:34 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 5.6.0     | 14-02-25 20:37:58 | 0    | 0   | 🔴  | 🔴  | 🔴  | ✔️  |
| 5.6.1     | 14-02-27 22:09:52 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 5.6.2     | 14-03-04 21:39:58 | 0    | 0   | 🔴  | ✔️  | ⚠️  | ⚠️  |
| 5.6.3     | 14-03-31 22:46:56 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.0.0     | 14-04-09 15:59:26 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.0.1     | 14-04-17 16:25:18 | 0    | 0   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.1.0     | 14-05-19 17:36:06 | 80   | 2   | 🔴  | 🔴  | 🔴  | ✔️  |
| 6.1.1     | 14-05-24 16:07:02 | 86   | 2   | 🔴  | 🔴  | 🔴  | ✔️  |
| 6.1.2     | 14-05-29 15:42:14 | 86   | 2   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.1.3     | 14-06-20 13:46:28 | 86   | 2   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.2.1     | 14-07-10 12:14:48 | 134  | 9   | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.2.2     | 14-08-15 16:01:16 | 202  | 19  | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.3.2     | 14-08-21 13:25:06 | 202  | 19  | 🔴  | 🔴  | ✔️  | ⚠️  |
| 6.3.3     | 14-08-24 15:21:46 | 202  | 19  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.4.3     | 14-10-27 18:18:26 | 289  | 31  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.4.9     | 14-11-03 11:32:48 | 292  | 32  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.5.2     | 14-12-12 11:15:02 | 332  | 40  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.5.3     | 15-01-30 18:21:42 | 333  | 40  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.5.8     | 15-02-05 12:46:30 | 333  | 40  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.6.2     | 15-03-20 11:43:32 | 378  | 47  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.6.6     | 15-04-09 11:48:36 | 382  | 48  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.7.1     | 15-05-29 16:09:04 | 406  | 52  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.7.2     | 15-06-09 11:22:32 | 406  | 52  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.8.3     | 15-08-17 14:08:58 | 342  | 39  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.8.7     | 15-09-08 10:46:00 | 352  | 40  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.9.2     | 15-09-29 10:01:46 | 427  | 51  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.9.5     | 15-10-16 18:35:02 | 447  | 54  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.9.7     | 15-10-30 16:17:12 | 447  | 54  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 6.9.9     | 15-11-09 21:13:18 | 448  | 54  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 7.0.3     | 15-12-03 18:15:54 | 611  | 72  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 7.0.4     | 15-12-04 12:38:10 | 611  | 72  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 7.1.4     | 15-12-30 14:45:50 | 542  | 64  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 7.1.7     | 16-01-20 17:20:30 | 542  | 64  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 7.2.2     | 16-01-29 11:14:08 | 547  | 57  | ✔️  | 🔴  | ⚠️  | ⚠️  |
| 7.3.4     | 16-03-31 14:00:06 | 528  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 7.4.3     | 16-05-11 16:48:28 | 529  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 7.4.5     | 16-05-13 20:37:52 | 529  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 7.6.2     | 16-06-30 16:53:22 | 548  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 7.7.2     | 16-07-28 14:32:20 | 544  | 51  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 7.8.1     | 16-09-01 10:32:12 | 562  | 52  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 7.9.2     | 16-09-28 20:52:16 | 572  | 52  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.0.0.3   | 16-11-30 17:59:48 | 565  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.1.0.4   | 16-12-29 17:36:28 | 574  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.2.2     | 17-01-20 16:30:00 | 579  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.3.8.0   | 17-03-07 17:36:26 | 582  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.4.8.0   | 17-04-14 14:19:18 | 583  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.4.8.2   | 17-04-21 15:18:22 | 583  | 53  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.5.1.6   | 17-05-19 16:02:24 | 596  | 56  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.5.8.0   | 17-05-31 18:16:08 | 617  | 57  | ✔️  | 🔴  | 🔴  | 🔴  |
| 8.6.8.0   | 17-06-30 18:03:46 | 630  | 59  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.7.8.0   | 17-07-31 17:54:06 | 649  | 61  | ✔️  | 🔴  | 🔴  | 🔴  |
| 8.7.8.1   | 17-08-02 23:55:42 | 649  | 61  | ✔️  | 🔴  | 🔴  | 🔴  |
| 8.7.8.2   | 17-08-03 21:13:12 | 649  | 61  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.7.8.6   | 17-08-15 17:26:04 | 649  | 61  | ✔️  | 🔴  | 🔴  | 🔴  |
| 8.7.8.9   | 17-08-24 14:29:22 | 649  | 61  | 🔴  | 🔴  | ✔️  | 🔴  |
| 8.8.8.0   | 17-08-31 15:17:10 | 657  | 63  | ✔️  | 🔴  | 🔴  | 🔴  |
| 8.8.8.1   | 17-09-04 17:54:06 | 657  | 63  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.8.8.6   | 17-09-18 19:49:16 | 657  | 63  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.8.8.9   | 17-09-28 18:37:30 | 667  | 64  | ✔️  | 🔴  | 🔴  | 🔴  |
| 8.8.8.13  | 17-10-12 20:21:18 | 667  | 64  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.8.8.15  | 17-10-23 15:09:06 | 667  | 64  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.9.8.0   | 17-10-31 22:05:32 | 649  | 59  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 8.9.8.5   | 17-11-15 17:34:12 | 649  | 59  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.0.8.0   | 17-11-30 12:14:26 | 645  | 56  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 9.1.8.0   | 17-12-15 01:37:28 | 647  | 56  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.1.8.3   | 17-12-20 15:45:42 | 647  | 56  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.2.0.1   | 17-12-21 20:40:10 | 647  | 56  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.2.8.0   | 17-12-27 23:28:54 | 650  | 56  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.2.8.5   | 18-01-18 22:03:12 | 652  | 56  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.2.8.7   | 18-01-31 20:07:30 | 652  | 56  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.2.8.8   | 18-02-02 16:09:42 | 652  | 56  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.3.8.0   | 18-02-06 15:08:18 | 829  | 89  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.3.8.2   | 18-02-27 20:38:04 | 829  | 89  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.3.8.5   | 18-03-27 19:33:44 | 833  | 89  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.4.8.0   | 18-04-12 22:10:10 | 846  | 91  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.4.8.3   | 18-04-19 15:58:02 | 846  | 91  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.4.8.4   | 18-04-20 15:02:44 | 846  | 91  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.4.8.6   | 18-05-03 19:47:12 | 846  | 91  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.4.8.11  | 18-05-18 16:09:42 | 846  | 91  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.5.8.0   | 18-06-08 12:47:20 | 870  | 94  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.6.8.0   | 18-06-27 21:36:22 | 885  | 96  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.6.8.1   | 18-07-03 16:39:06 | 885  | 96  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.6.8.2   | 18-07-13 16:50:26 | 885  | 96  | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.7.8.0   | 18-07-30 23:52:12 | 905  | 100 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.7.8.3   | 18-09-03 15:44:30 | 905  | 100 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.8.8.0   | 18-09-26 18:08:48 | 921  | 103 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.8.8.3   | 18-10-16 17:29:32 | 925  | 104 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.8.8.5   | 18-10-22 19:55:30 | 925  | 104 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.8.8.7   | 18-10-25 20:40:16 | 925  | 104 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.8.8.13  | 18-11-12 17:46:02 | 925  | 104 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.0   | 18-12-05 22:12:08 | 931  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.10  | 18-12-18 15:35:04 | 931  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.12  | 18-12-27 18:08:34 | 932  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.20  | 19-01-02 18:55:12 | 932  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.31  | 19-01-17 01:53:48 | 932  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.32  | 19-01-21 23:31:12 | 932  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.40  | 19-01-27 15:45:10 | 932  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.41  | 19-02-17 13:27:12 | 932  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 9.9.8.42  | 19-02-21 21:39:08 | 932  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.0.8.0  | 19-03-08 02:31:44 | 775  | 72  | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.0.8.2  | 19-03-10 13:47:56 | 775  | 72  | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.0.8.4  | 19-03-14 21:48:52 | 949  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.1.8.0  | 19-04-07 23:39:52 | 949  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.1.8.1  | 19-04-09 14:14:46 | 949  | 105 | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.2.8.0  | 19-05-16 21:41:28 | 986  | 111 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.2.8.2  | 19-05-28 20:28:56 | 986  | 111 | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.2.8.5  | 19-06-03 11:59:52 | 986  | 111 | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.2.8.8  | 19-06-20 20:02:10 | 986  | 111 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.0  | 19-07-22 19:30:10 | 994  | 112 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.1  | 19-07-28 12:27:58 | 994  | 112 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.7  | 19-08-06 20:11:58 | 997  | 112 | ✔️  | 🔴  | 🔴  | 🔴  |
| 10.3.8.8  | 19-08-12 20:03:18 | 997  | 112 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.10 | 19-08-22 21:48:44 | 997  | 112 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.12 | 19-09-20 10:54:32 | 997  | 112 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.19 | 19-10-29 21:54:04 | 1027 | 118 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.30 | 19-11-20 21:23:32 | 1027 | 118 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.33 | 19-11-28 20:58:16 | 1027 | 118 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.34 | 19-12-01 23:15:58 | 1027 | 118 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 10.3.8.41 | 19-12-09 11:30:24 | 1027 | 118 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.0.0.0  | 19-12-25 10:42:26 | 1036 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.1.8.0  | 20-01-13 10:52:32 | 1036 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.1.8.1  | 20-01-14 22:43:52 | 1036 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.1.8.2  | 20-02-09 21:22:26 | 1036 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.2.8.0  | 20-02-27 23:00:12 | 1037 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.2.8.1  | 20-03-02 19:18:32 | 1037 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.2.8.4  | 20-03-13 13:20:42 | 1037 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.3.8.0  | 20-03-18 10:18:22 | 1038 | 119 | ✔️  | 🔴  | 🔴  | 🔴  |
| 11.3.8.1  | 20-03-19 12:16:48 | 1038 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.3.8.2  | 20-03-25 10:43:46 | 1038 | 119 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.4.8.0  | 20-04-17 15:15:06 | 1057 | 122 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.4.8.6  | 20-05-08 11:05:54 | 1057 | 122 | ✔️  | 🔴  | 🔴  | 🔴  |
| 11.4.8.7  | 20-05-12 09:12:52 | 1057 | 122 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.5.8.0  | 20-05-22 10:28:30 | 1063 | 123 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.5.8.3  | 20-06-04 11:19:08 | 1064 | 123 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.6.8.0  | 20-07-03 09:50:52 | 1128 | 129 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.6.8.1  | 20-07-06 21:34:12 | 1128 | 129 | ✔️  | 🔴  | 🔴  | 🔴  |
| 11.6.8.2  | 20-07-13 15:05:22 | 1128 | 129 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.7.8.0  | 20-07-31 12:16:28 | 1134 | 130 | ✔️  | 🔴  | 🔴  | 🔴  |
| 11.7.8.1  | 20-08-04 08:59:06 | 1134 | 130 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.8.8.0  | 20-08-25 12:44:54 | 1143 | 132 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.8.8.7  | 20-09-04 15:04:28 | 1143 | 132 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.9.8.0  | 20-09-21 14:07:28 | 1152 | 133 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 11.10.8.0 | 20-10-19 11:37:24 | 1155 | 133 | ✔️  | 🔴  | 🔴  | 🔴  |
| 11.10.8.6 | 20-10-27 11:00:02 | 1155 | 133 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.0.2.2  | 20-11-11 10:43:16 | 1155 | 133 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.0.8.0  | 20-11-16 10:54:34 | 1155 | 133 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.0.8.1  | 20-11-19 16:08:42 | 1155 | 133 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.1.8.0  | 20-12-07 10:30:40 | 1164 | 134 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.1.8.1  | 20-12-08 10:31:40 | 1164 | 134 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.1.8.4  | 20-12-15 10:29:04 | 1164 | 134 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.2.8.0  | 21-01-04 21:09:24 | 1167 | 134 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.2.8.1  | 21-01-07 09:53:08 | 1387 | 174 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.2.8.9  | 21-01-12 20:23:40 | 1387 | 174 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.2.8.11 | 21-01-19 10:31:12 | 1387 | 174 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.3.8.0  | 21-02-01 14:55:20 | 1399 | 176 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.3.8.3  | 21-02-04 17:08:56 | 1399 | 176 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.3.8.6  | 21-02-21 23:32:44 | 1399 | 176 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.3.8.10 | 21-03-08 10:43:44 | 1399 | 176 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.3.8.11 | 21-03-09 10:14:40 | 1399 | 176 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.4.8.0  | 21-03-25 00:57:42 | 1414 | 179 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.4.8.2  | 21-03-29 22:08:30 | 1414 | 179 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.4.8.14 | 21-04-20 11:22:04 | 1419 | 180 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.4.8.15 | 21-04-22 00:16:14 | 1419 | 180 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.4.8.24 | 21-04-26 23:59:58 | 1423 | 180 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.5.1.0  | 21-05-18 12:40:10 | 1428 | 181 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.5.6.0  | 21-05-25 10:52:00 | 1428 | 181 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.6.1.0  | 21-06-11 10:31:40 | 1433 | 182 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.6.3.0  | 21-06-22 10:18:12 | 1433 | 182 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.6.6.0  | 21-07-05 11:10:02 | 1458 | 185 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.7.1.0  | 21-07-08 12:03:58 | 1458 | 185 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.7.1.1  | 21-07-09 02:47:54 | 1458 | 185 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.7.6.0  | 21-07-26 09:01:26 | 1465 | 186 | ✔️  | 🔴  | ⚠️  | 🔴  |
| 12.8.1.0  | 21-08-11 11:00:48 | 1476 | 188 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.8.1.1  | 21-08-11 16:10:54 | 1476 | 188 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.9.1.0  | 21-08-25 22:19:46 | 1478 | 188 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.9.2.0  | 21-08-30 20:20:40 | 1478 | 188 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.9.3.0  | 21-09-01 00:15:10 | 1478 | 188 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.10.1.0 | 21-09-10 10:11:22 | 1484 | 189 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.11.1.0 | 21-09-24 07:34:26 | 1481 | 188 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.12.1.0 | 21-10-19 21:56:04 | 1485 | 189 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.13.1.0 | 21-11-02 21:43:14 | 1487 | 189 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.13.2.0 | 21-11-10 00:44:54 | 1487 | 189 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.14.1.0 | 21-11-22 12:47:24 | 1492 | 190 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.15.1.0 | 21-12-01 10:26:24 | 1424 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.16.1.0 | 21-12-16 15:29:46 | 1425 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.17.1.0 | 21-12-29 11:45:48 | 1427 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.18.1.0 | 22-01-14 15:35:46 | 1428 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.19.1.0 | 22-01-24 12:00:54 | 1424 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.20.1.0 | 22-02-22 23:27:40 | 1426 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.21.1.0 | 22-03-08 10:33:50 | 1427 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.22.1.0 | 22-03-23 00:35:44 | 1443 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.23.1.0 | 22-04-07 10:47:12 | 1438 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.23.5.0 | 22-04-18 23:06:52 | 1438 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.23.7.0 | 22-05-04 23:44:00 | 1440 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.24.1.0 | 22-05-13 16:55:56 | 1428 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.25.1.0 | 22-05-31 10:16:06 | 1413 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.25.5.0 | 22-06-20 12:20:54 | 1414 | 218 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.26.1.0 | 22-07-15 14:15:34 | 1439 | 220 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.26.3.0 | 22-07-22 11:24:12 | 1442 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.26.5.0 | 22-07-25 17:45:04 | 1444 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.27.1.0 | 22-08-10 00:31:06 | 1457 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.27.1.1 | 22-08-11 22:59:50 | 1457 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.27.5.0 | 22-08-18 00:30:58 | 1457 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.28.1.0 | 22-08-30 23:10:24 | 1458 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.28.1.1 | 22-09-01 02:43:12 | 1458 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.29.1.1 | 22-09-15 00:41:50 | 1454 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.29.5.0 | 22-09-27 10:27:24 | 1454 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.29.7.0 | 22-10-10 12:26:50 | 1455 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.30.1.0 | 22-10-26 10:52:58 | 1547 | 255 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.31.5.0 | 22-11-03 01:20:20 | 1464 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.32.1.0 | 22-11-14 23:13:22 | 1464 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.32.3.0 | 22-11-17 16:12:34 | 1464 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.32.5.1 | 22-11-23 15:36:14 | 1555 | 255 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.32.5.2 | 22-12-01 17:06:52 | 1555 | 255 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.34.1.0 | 22-12-16 11:13:32 | 1474 | 222 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.34.3.0 | 22-12-27 15:32:10 | 1568 | 256 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.35.1.0 | 23-01-13 16:40:30 | 1488 | 222 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.35.1.2 | 23-01-30 12:57:18 | 1488 | 222 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.36.1.0 | 23-02-07 15:29:22 | 1488 | 222 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.36.3.0 | 23-02-09 21:04:46 | 1488 | 222 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.36.3.1 | 23-02-13 21:26:02 | 1489 | 222 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.36.3.2 | 23-02-15 18:02:10 | 1490 | 222 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.37.1.0 | 23-02-27 18:32:50 | 1485 | 221 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.38.1.0 | 23-03-22 15:02:58 | 1481 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.38.1.1 | 23-03-27 23:00:14 | 1519 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.39.1.1 | 23-04-11 14:20:20 | 1521 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.39.7.2 | 23-04-20 14:10:26 | 1607 | 253 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.40.1.1 | 23-05-04 14:21:00 | 1522 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.41.1.0 | 23-05-17 21:27:18 | 1522 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.41.5.1 | 23-05-24 15:59:28 | 1620 | 253 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.41.7.0 | 23-05-31 14:17:36 | 1620 | 253 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.41.7.1 | 23-06-01 02:31:26 | 1620 | 253 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.42.1.1 | 23-06-03 22:52:20 | 1531 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.42.5.0 | 23-06-08 21:30:12 | 1531 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.43.1.0 | 23-06-21 19:30:38 | 1535 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.43.7.0 | 23-06-29 22:42:34 | 1537 | 219 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.44.1.0 | 23-07-14 21:50:06 | 1542 | 218 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.45.1.1 | 23-08-07 13:19:00 | 1549 | 218 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.45.7.0 | 23-08-14 12:55:48 | 1549 | 218 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.46.1.1 | 23-08-22 14:06:50 | 1551 | 218 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.46.3.0 | 23-08-28 20:43:34 | 1552 | 218 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.47.1.0 | 23-09-13 20:19:52 | 1541 | 218 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.48.1.1 | 23-09-21 23:54:20 | 1543 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.49.1.0 | 23-10-18 22:33:58 | 1550 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.50.1.1 | 23-11-03 14:47:38 | 1573 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.50.3.0 | 23-11-07 23:03:00 | 1573 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.50.3.1 | 23-11-22 10:47:26 | 1573 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.51.1.0 | 23-11-28 20:10:50 | 1576 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.51.5.1 | 23-12-02 18:03:08 | 1576 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
| 12.51.7.1 | 23-12-10 21:23:42 | 1576 | 217 | ✔️  | 🔴  | 🔴  | 🔴  |
