<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Api/Request/SubReplyRequest.proto

namespace TbClient\Api\Request;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.api.request.SubReplyRequest</code>
 */
class SubReplyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.tbClient.api.request.SubReplyRequest.Data data = 1;</code>
     */
    protected $data = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \TbClient\Api\Request\SubReplyRequest\Data $data
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Api\Request\SubReplyRequest::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.tbClient.api.request.SubReplyRequest.Data data = 1;</code>
     * @return \TbClient\Api\Request\SubReplyRequest\Data|null
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
     * Generated from protobuf field <code>.tbClient.api.request.SubReplyRequest.Data data = 1;</code>
     * @param \TbClient\Api\Request\SubReplyRequest\Data $var
     * @return $this
     */
    public function setData($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Api\Request\SubReplyRequest\Data::class);
        $this->data = $var;

        return $this;
    }

}
