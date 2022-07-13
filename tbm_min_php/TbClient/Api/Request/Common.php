<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Api/Request/Common.proto

namespace TbClient\Api\Request;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.api.request.Common</code>
 */
class Common extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string _client_version = 2;</code>
     */
    protected $_client_version = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $_client_version
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Api\Request\Common::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string _client_version = 2;</code>
     * @return string
     */
    public function getClientVersion()
    {
        return $this->_client_version;
    }

    /**
     * Generated from protobuf field <code>string _client_version = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setClientVersion($var)
    {
        GPBUtil::checkString($var, True);
        $this->_client_version = $var;

        return $this;
    }

}

