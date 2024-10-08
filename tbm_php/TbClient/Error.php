<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Error.proto

namespace TbClient;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.Error</code>
 */
class Error extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int32 errorno = 1;</code>
     */
    protected $errorno = 0;
    /**
     * Generated from protobuf field <code>string errmsg = 2;</code>
     */
    protected $errmsg = '';
    /**
     * Generated from protobuf field <code>string usermsg = 3;</code>
     */
    protected $usermsg = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $errorno
     *     @type string $errmsg
     *     @type string $usermsg
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Error::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int32 errorno = 1;</code>
     * @return int
     */
    public function getErrorno()
    {
        return $this->errorno;
    }

    /**
     * Generated from protobuf field <code>int32 errorno = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setErrorno($var)
    {
        GPBUtil::checkInt32($var);
        $this->errorno = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string errmsg = 2;</code>
     * @return string
     */
    public function getErrmsg()
    {
        return $this->errmsg;
    }

    /**
     * Generated from protobuf field <code>string errmsg = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setErrmsg($var)
    {
        GPBUtil::checkString($var, True);
        $this->errmsg = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string usermsg = 3;</code>
     * @return string
     */
    public function getUsermsg()
    {
        return $this->usermsg;
    }

    /**
     * Generated from protobuf field <code>string usermsg = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setUsermsg($var)
    {
        GPBUtil::checkString($var, True);
        $this->usermsg = $var;

        return $this;
    }

}

