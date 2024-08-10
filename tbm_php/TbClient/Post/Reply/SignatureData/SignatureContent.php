<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Post/Reply.proto

namespace TbClient\Post\Reply\SignatureData;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.post.Reply.SignatureData.SignatureContent</code>
 */
class SignatureContent extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int32 type = 1;</code>
     */
    protected $type = 0;
    /**
     * Generated from protobuf field <code>string text = 2;</code>
     */
    protected $text = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $type
     *     @type string $text
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Post\Reply::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int32 type = 1;</code>
     * @return int
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Generated from protobuf field <code>int32 type = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setType($var)
    {
        GPBUtil::checkInt32($var);
        $this->type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string text = 2;</code>
     * @return string
     */
    public function getText()
    {
        return $this->text;
    }

    /**
     * Generated from protobuf field <code>string text = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setText($var)
    {
        GPBUtil::checkString($var, True);
        $this->text = $var;

        return $this;
    }

}

