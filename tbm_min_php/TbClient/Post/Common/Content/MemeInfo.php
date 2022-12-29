<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Post/Common/Content.proto

namespace TbClient\Post\Common\Content;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.post.common.Content.MemeInfo</code>
 */
class MemeInfo extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 pck_id = 1;</code>
     */
    protected $pck_id = 0;
    /**
     * Generated from protobuf field <code>uint64 pic_id = 2;</code>
     */
    protected $pic_id = 0;
    /**
     * Generated from protobuf field <code>string pic_url = 3;</code>
     */
    protected $pic_url = '';
    /**
     * Generated from protobuf field <code>string thumbnail = 4;</code>
     */
    protected $thumbnail = '';
    /**
     * Generated from protobuf field <code>uint32 width = 5;</code>
     */
    protected $width = 0;
    /**
     * Generated from protobuf field <code>uint32 height = 6;</code>
     */
    protected $height = 0;
    /**
     * Generated from protobuf field <code>string detail_link = 7;</code>
     */
    protected $detail_link = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $pck_id
     *     @type int|string $pic_id
     *     @type string $pic_url
     *     @type string $thumbnail
     *     @type int $width
     *     @type int $height
     *     @type string $detail_link
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Post\Common\Content::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint32 pck_id = 1;</code>
     * @return int
     */
    public function getPckId()
    {
        return $this->pck_id;
    }

    /**
     * Generated from protobuf field <code>uint32 pck_id = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setPckId($var)
    {
        GPBUtil::checkUint32($var);
        $this->pck_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 pic_id = 2;</code>
     * @return int|string
     */
    public function getPicId()
    {
        return $this->pic_id;
    }

    /**
     * Generated from protobuf field <code>uint64 pic_id = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setPicId($var)
    {
        GPBUtil::checkUint64($var);
        $this->pic_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string pic_url = 3;</code>
     * @return string
     */
    public function getPicUrl()
    {
        return $this->pic_url;
    }

    /**
     * Generated from protobuf field <code>string pic_url = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setPicUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->pic_url = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string thumbnail = 4;</code>
     * @return string
     */
    public function getThumbnail()
    {
        return $this->thumbnail;
    }

    /**
     * Generated from protobuf field <code>string thumbnail = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setThumbnail($var)
    {
        GPBUtil::checkString($var, True);
        $this->thumbnail = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 width = 5;</code>
     * @return int
     */
    public function getWidth()
    {
        return $this->width;
    }

    /**
     * Generated from protobuf field <code>uint32 width = 5;</code>
     * @param int $var
     * @return $this
     */
    public function setWidth($var)
    {
        GPBUtil::checkUint32($var);
        $this->width = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 height = 6;</code>
     * @return int
     */
    public function getHeight()
    {
        return $this->height;
    }

    /**
     * Generated from protobuf field <code>uint32 height = 6;</code>
     * @param int $var
     * @return $this
     */
    public function setHeight($var)
    {
        GPBUtil::checkUint32($var);
        $this->height = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string detail_link = 7;</code>
     * @return string
     */
    public function getDetailLink()
    {
        return $this->detail_link;
    }

    /**
     * Generated from protobuf field <code>string detail_link = 7;</code>
     * @param string $var
     * @return $this
     */
    public function setDetailLink($var)
    {
        GPBUtil::checkString($var, True);
        $this->detail_link = $var;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(MemeInfo::class, \TbClient\Post\Common\Content_MemeInfo::class);
