<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Api/Response/ReplyResponse.proto

namespace GPBMetadata\Api\Response;

class ReplyResponse
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Post\Reply::initOnce();
        \GPBMetadata\Forum\SimpleForum::initOnce();
        \GPBMetadata\Error::initOnce();
        \GPBMetadata\Page::initOnce();
        \GPBMetadata\User::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
 Api/Response/ReplyResponse.prototbClient.api.responseForum/SimpleForum.protoError.proto
Page.proto
User.proto"�

error (2.tbClient.Error7
data (2).tbClient.api.response.ReplyResponse.Data�
Data
page (2.tbClient.Page*
forum (2.tbClient.forum.SimpleForum\'
	post_list (2.tbClient.post.Reply!
	user_list
has_fold_commentD (bproto3'
        , true);

        static::$is_initialized = true;
    }
}
