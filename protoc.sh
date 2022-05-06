PROTO_PATH=tbm_min
DIR=tbm_min_cs
rm -rf $DIR
mkdir $DIR
./protoc --csharp_out=$DIR --csharp_opt=base_namespace=TbClient,file_extension=.g.cs --proto_path=$PROTO_PATH $(find $PROTO_PATH -type f -name '*.proto')
rm -f $DIR.7z
7z a -mx=9 $DIR.7z ./$DIR/*
