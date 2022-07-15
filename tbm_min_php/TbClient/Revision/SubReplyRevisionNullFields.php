<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Revision/SubReplyRevisionNullFields.proto

namespace TbClient\Revision;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.revision.SubReplyRevisionNullFields</code>
 */
class SubReplyRevisionNullFields extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bool authorManagerType = 1;</code>
     */
    protected $authorManagerType = false;
    /**
     * Generated from protobuf field <code>bool authorExpGrade = 2;</code>
     */
    protected $authorExpGrade = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $authorManagerType
     *     @type bool $authorExpGrade
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Revision\SubReplyRevisionNullFields::initOnce();
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
     * Generated from protobuf field <code>bool authorExpGrade = 2;</code>
     * @return bool
     */
    public function getAuthorExpGrade()
    {
        return $this->authorExpGrade;
    }

    /**
     * Generated from protobuf field <code>bool authorExpGrade = 2;</code>
     * @param bool $var
     * @return $this
     */
    public function setAuthorExpGrade($var)
    {
        GPBUtil::checkBool($var);
        $this->authorExpGrade = $var;

        return $this;
    }

}

