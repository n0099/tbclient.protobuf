#!/bin/bash
# https://mywiki.wooledge.org/BashFAQ/105
# https://gist.github.com/mohanpedala/1e2ff5661761d3abd0385e8223e16425
set -euxo pipefail

if [[ $# -lt 2 ]]; then
    echo 'Usage: <.proto path> <langs...>'
    exit
fi
proto_path=$1
echo "proto_path=$proto_path"

for lang in "${@:2}"; do
    echo "codegen for $lang started:";
    output_dir=${proto_path}_$lang;
    rm -rf "$output_dir"
    mkdir -v "$output_dir"

    # https://github.com/protocolbuffers/protobuf/issues/7474
    # shellcheck disable=SC2046
    # shellcheck disable=SC2014
    find "$proto_path" -type f -name '*.proto' -exec \
        ./protoc --"$lang"_out="$output_dir" \
            $([[ $lang == 'csharp' ]] \
                && echo --proto_path="$proto_path" '--csharp_opt=base_namespace=TbClient,file_extension=.g.cs' \
                || echo --proto_path="$proto_path") \
            {} \;

    rm -vf "$output_dir".zip
    zip -r9 "$output_dir".zip "$output_dir"
    echo "codegen for $lang finished, results placed under $output_dir.zip";
done
