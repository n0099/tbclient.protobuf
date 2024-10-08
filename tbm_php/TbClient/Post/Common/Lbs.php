<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Post/Common/Lbs.proto

namespace TbClient\Post\Common;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.post.common.Lbs</code>
 */
class Lbs extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string lat = 1;</code>
     */
    protected $lat = '';
    /**
     * Generated from protobuf field <code>string lng = 2;</code>
     */
    protected $lng = '';
    /**
     * Generated from protobuf field <code>string name = 3;</code>
     */
    protected $name = '';
    /**
     * Generated from protobuf field <code>string sn = 4;</code>
     */
    protected $sn = '';
    /**
     * Generated from protobuf field <code>string distance = 5;</code>
     */
    protected $distance = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $lat
     *     @type string $lng
     *     @type string $name
     *     @type string $sn
     *     @type string $distance
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Post\Common\Lbs::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string lat = 1;</code>
     * @return string
     */
    public function getLat()
    {
        return $this->lat;
    }

    /**
     * Generated from protobuf field <code>string lat = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setLat($var)
    {
        GPBUtil::checkString($var, True);
        $this->lat = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string lng = 2;</code>
     * @return string
     */
    public function getLng()
    {
        return $this->lng;
    }

    /**
     * Generated from protobuf field <code>string lng = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setLng($var)
    {
        GPBUtil::checkString($var, True);
        $this->lng = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string name = 3;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Generated from protobuf field <code>string name = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string sn = 4;</code>
     * @return string
     */
    public function getSn()
    {
        return $this->sn;
    }

    /**
     * Generated from protobuf field <code>string sn = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setSn($var)
    {
        GPBUtil::checkString($var, True);
        $this->sn = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string distance = 5;</code>
     * @return string
     */
    public function getDistance()
    {
        return $this->distance;
    }

    /**
     * Generated from protobuf field <code>string distance = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setDistance($var)
    {
        GPBUtil::checkString($var, True);
        $this->distance = $var;

        return $this;
    }

}

