<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Api/Request/ReplyRequest.proto

namespace TbClient\Api\Request;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.api.request.ReplyRequest</code>
 */
class ReplyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.tbClient.api.request.ReplyRequest.Data data = 1;</code>
     */
    protected $data = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \TbClient\Api\Request\ReplyRequest\Data $data
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Api\Request\ReplyRequest::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.tbClient.api.request.ReplyRequest.Data data = 1;</code>
     * @return \TbClient\Api\Request\ReplyRequest\Data|null
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
     * Generated from protobuf field <code>.tbClient.api.request.ReplyRequest.Data data = 1;</code>
     * @param \TbClient\Api\Request\ReplyRequest\Data $var
     * @return $this
     */
    public function setData($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Api\Request\ReplyRequest\Data::class);
        $this->data = $var;

        return $this;
    }

}

