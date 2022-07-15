<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Revision/ReplyRevisionNullFields.proto

namespace TbClient\Revision;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.revision.ReplyRevisionNullFields</code>
 */
class ReplyRevisionNullFields extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bool authorManagerType = 1;</code>
     */
    protected $authorManagerType = false;
    /**
     * Generated from protobuf field <code>bool subReplyNum = 3;</code>
     */
    protected $subReplyNum = false;
    /**
     * Generated from protobuf field <code>bool isFold = 4;</code>
     */
    protected $isFold = false;
    /**
     * Generated from protobuf field <code>bool agreeNum = 5;</code>
     */
    protected $agreeNum = false;
    /**
     * Generated from protobuf field <code>bool disagreeNum = 6;</code>
     */
    protected $disagreeNum = false;
    /**
     * Generated from protobuf field <code>bool location = 7;</code>
     */
    protected $location = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $authorManagerType
     *     @type bool $subReplyNum
     *     @type bool $isFold
     *     @type bool $agreeNum
     *     @type bool $disagreeNum
     *     @type bool $location
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Revision\ReplyRevisionNullFields::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bool authorManagerType = 1;</code>
     * @return bool
     */
    public function getAuthorManagerType()
    {
        return $this->authorManagerType;
    }

    /**
     * Generated from protobuf field <code>bool authorManagerType = 1;</code>
     * @param bool $var
     * @return $this
     */
    public function setAuthorManagerType($var)
    {
        GPBUtil::checkBool($var);
        $this->authorManagerType = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool subReplyNum = 3;</code>
     * @return bool
     */
    public function getSubReplyNum()
    {
        return $this->subReplyNum;
    }

    /**
     * Generated from protobuf field <code>bool subReplyNum = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setSubReplyNum($var)
    {
        GPBUtil::checkBool($var);
        $this->subReplyNum = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool isFold = 4;</code>
     * @return bool
     */
    public function getIsFold()
    {
        return $this->isFold;
    }

    /**
     * Generated from protobuf field <code>bool isFold = 4;</code>
     * @param bool $var
     * @return $this
     */
    public function setIsFold($var)
    {
        GPBUtil::checkBool($var);
        $this->isFold = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool agreeNum = 5;</code>
     * @return bool
     */
    public function getAgreeNum()
    {
        return $this->agreeNum;
    }

    /**
     * Generated from protobuf field <code>bool agreeNum = 5;</code>
     * @param bool $var
     * @return $this
     */
    public function setAgreeNum($var)
    {
        GPBUtil::checkBool($var);
        $this->agreeNum = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool disagreeNum = 6;</code>
     * @return bool
     */
    public function getDisagreeNum()
    {
        return $this->disagreeNum;
    }

    /**
     * Generated from protobuf field <code>bool disagreeNum = 6;</code>
     * @param bool $var
     * @return $this
     */
    public function setDisagreeNum($var)
    {
        GPBUtil::checkBool($var);
        $this->disagreeNum = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool location = 7;</code>
     * @return bool
     */
    public function getLocation()
    {
        return $this->location;
    }

    /**
     * Generated from protobuf field <code>bool location = 7;</code>
     * @param bool $var
     * @return $this
     */
    public function setLocation($var)
    {
        GPBUtil::checkBool($var);
        $this->location = $var;

        return $this;
    }

}

