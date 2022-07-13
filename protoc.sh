#!/bin/bash
PROTO_PATH=tbm_min
USAGE='Usage: passing following possible args: php cs, to generate corresponding codegen files.'
i=0
for type in "$@"; do
    i=$((i+1));
    echo '    codegen for' $type 'started:';
    DIR=${PROTO_PATH}_$type;
    rm -r $DIR
    mkdir -v $DIR
    case $type in
        php)
            ./protoc --php_out=$DIR --proto_path=$PROTO_PATH $(find $PROTO_PATH -type f -name '*.proto')
            ;;
        cs)
            ./protoc --csharp_out=$DIR --csharp_opt=base_namespace=TbClient,file_extension=.g.cs --proto_path=$PROTO_PATH $(find $PROTO_PATH -type f -name '*.proto')
            ;;
        *)
            echo $USAGE
            ;;
    esac
    rm -vf $DIR.7z
    7z a -mx=9 $DIR.7z ./$DIR/*
    echo '    codegen for' $type 'finished.';
done

if [ $i -eq 0 ]; then
    echo $USAGE
fi
