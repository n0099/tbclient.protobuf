<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Item/Item.proto

namespace GPBMetadata\Item;

class Item
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Item\ApkDetail::initOnce();
        $pool->internalAddGeneratedFile(
            "\x0A\xE6\x02\x0A\x0FItem/Item.proto\x12\x0DtbClient.item\"\xBB\x02\x0A\x04Item\x12\x0F\x0A\x07item_id\x18\x01 \x01(\x03\x12\x11\x0A\x09item_name\x18\x02 \x01(\x09\x12\x11\x0A\x09icon_size\x18\x03 \x01(\x01\x12\x10\x0A\x08icon_url\x18\x04 \x01(\x09\x12\x0C\x0A\x04tags\x18\x05 \x03(\x09\x12\x0D\x0A\x05score\x18\x06 \x01(\x01\x12\x0C\x0A\x04star\x18\x07 \x01(\x05\x12\x13\x0A\x0Bbutton_name\x18\x08 \x01(\x09\x12\x13\x0A\x0Bbutton_link\x18\x09 \x01(\x09\x12\x12\x0A\x0Aitem_appid\x18\x0A \x01(\x09\x12\x13\x0A\x0Bcategory_id\x18\x0B \x01(\x05\x12\x18\x0A\x10button_link_type\x18\x0C \x01(\x05\x12\x10\x0A\x08apk_name\x18\x0D \x01(\x09\x12\x12\x0A\x0Aforum_name\x18\x0E \x01(\x09\x12,\x0A\x0Aapk_detail\x18\x0F \x01(\x0B2\x18.tbClient.item.ApkDetailb\x06proto3"
        , true);

        static::$is_initialized = true;
    }
}

