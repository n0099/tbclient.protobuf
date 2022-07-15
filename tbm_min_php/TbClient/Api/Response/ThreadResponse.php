<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Api/Response/ThreadResponse.proto

namespace TbClient\Api\Response;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.api.response.ThreadResponse</code>
 */
class ThreadResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.tbClient.Error error = 1;</code>
     */
    protected $error = null;
    /**
     * Generated from protobuf field <code>.tbClient.api.response.ThreadResponse.Data data = 2;</code>
     */
    protected $data = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \TbClient\Error $error
     *     @type \TbClient\Api\Response\ThreadResponse\Data $data
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Api\Response\ThreadResponse::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.tbClient.Error error = 1;</code>
     * @return \TbClient\Error|null
     */
    public function getError()
    {
        return $this->error;
    }

    public function hasError()
    {
        return isset($this->error);
    }

    public function clearError()
    {
        unset($this->error);
    }

    /**
     * Generated from protobuf field <code>.tbClient.Error error = 1;</code>
     * @param \TbClient\Error $var
     * @return $this
     */
    public function setError($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Error::class);
        $this->error = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.api.response.ThreadResponse.Data data = 2;</code>
     * @return \TbClient\Api\Response\ThreadResponse\Data|null
     */
    public function getData()
    {
        return $this->data;
    }

    public function hasData()
    {
        return isset($this->data);
    }

    public function clearData()
    {
        unset($this->data);
    }

    /**
     * Generated from protobuf field <code>.tbClient.api.response.ThreadResponse.Data data = 2;</code>
     * @param \TbClient\Api\Response\ThreadResponse\Data $var
     * @return $this
     */
    public function setData($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Api\Response\ThreadResponse\Data::class);
        $this->data = $var;

        return $this;
    }

}

