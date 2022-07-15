<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Post/Common/Agree.proto

namespace TbClient\Post\Common;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.post.common.Agree</code>
 */
class Agree extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 agree_num = 1;</code>
     */
    protected $agree_num = 0;
    /**
     * Generated from protobuf field <code>int64 disagree_num = 4;</code>
     */
    protected $disagree_num = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $agree_num
     *     @type int|string $disagree_num
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Post\Common\Agree::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 agree_num = 1;</code>
     * @return int|string
     */
    public function getAgreeNum()
    {
        return $this->agree_num;
    }

    /**
     * Generated from protobuf field <code>int64 agree_num = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setAgreeNum($var)
    {
        GPBUtil::checkInt64($var);
        $this->agree_num = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 disagree_num = 4;</code>
     * @return int|string
     */
    public function getDisagreeNum()
    {
        return $this->disagree_num;
    }

    /**
     * Generated from protobuf field <code>int64 disagree_num = 4;</code>
     * @param int|string $var
     * @return $this
     */
    public function setDisagreeNum($var)
    {
        GPBUtil::checkInt64($var);
        $this->disagree_num = $var;

        return $this;
    }

}

