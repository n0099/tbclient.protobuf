#!/bin/bash
set -x
USAGE='Usage: <PROTO_PATH> <langs...>'
i=0
for lang in "$@"; do
    i=$((i+1));
    if [ $i -eq 1 ]; then
        PROTO_PATH=$lang
        echo "PROTO_PATH=$PROTO_PATH"
        continue
    fi

    echo "    codegen for $lang started:";
    DIR=${PROTO_PATH}_$lang;
    rm -r "$DIR"
    mkdir -v "$DIR"

    case $lang in
        cs)
            find "$PROTO_PATH" -type f -name '*.proto' -printf '"%p" ' | xargs ./protoc --csharp_out="$DIR" --csharp_opt=base_namespace=TbClient,file_extension=.g.cs --proto_path="$PROTO_PATH"
            ;;
        *)
            find "$PROTO_PATH" -type f -name '*.proto' -printf '"%p" ' | xargs ./protoc --"$lang"_out="$DIR" --proto_path="$PROTO_PATH"
            ;;
    esac

    rm -vf "$DIR".7z
    7z a -mx=9 "$DIR".7z ./"$DIR"/*
    echo '    codegen for' "$lang" 'finished.';
done

if [ $i -eq 0 ]; then
    echo "$USAGE"
fi
