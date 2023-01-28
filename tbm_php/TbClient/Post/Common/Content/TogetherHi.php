<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Post/Common/Content.proto

namespace TbClient\Post\Common\Content;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.post.common.Content.TogetherHi</code>
 */
class TogetherHi extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string album_name = 1;</code>
     */
    protected $album_name = '';
    /**
     * Generated from protobuf field <code>uint64 album_id = 2;</code>
     */
    protected $album_id = 0;
    /**
     * Generated from protobuf field <code>uint32 start_time = 3;</code>
     */
    protected $start_time = 0;
    /**
     * Generated from protobuf field <code>uint32 end_time = 4;</code>
     */
    protected $end_time = 0;
    /**
     * Generated from protobuf field <code>string location = 5;</code>
     */
    protected $location = '';
    /**
     * Generated from protobuf field <code>uint32 num_signup = 6;</code>
     */
    protected $num_signup = 0;
    /**
     * Generated from protobuf field <code>repeated string potraits = 7;</code>
     */
    private $potraits;
    /**
     * Generated from protobuf field <code>uint32 num_join = 8;</code>
     */
    protected $num_join = 0;
    /**
     * Generated from protobuf field <code>repeated string pic_urls = 9;</code>
     */
    private $pic_urls;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $album_name
     *     @type int|string $album_id
     *     @type int $start_time
     *     @type int $end_time
     *     @type string $location
     *     @type int $num_signup
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $potraits
     *     @type int $num_join
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $pic_urls
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Post\Common\Content::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string album_name = 1;</code>
     * @return string
     */
    public function getAlbumName()
    {
        return $this->album_name;
    }

    /**
     * Generated from protobuf field <code>string album_name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setAlbumName($var)
    {
        GPBUtil::checkString($var, True);
        $this->album_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 album_id = 2;</code>
     * @return int|string
     */
    public function getAlbumId()
    {
        return $this->album_id;
    }

    /**
     * Generated from protobuf field <code>uint64 album_id = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setAlbumId($var)
    {
        GPBUtil::checkUint64($var);
        $this->album_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 start_time = 3;</code>
     * @return int
     */
    public function getStartTime()
    {
        return $this->start_time;
    }

    /**
     * Generated from protobuf field <code>uint32 start_time = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setStartTime($var)
    {
        GPBUtil::checkUint32($var);
        $this->start_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 end_time = 4;</code>
     * @return int
     */
    public function getEndTime()
    {
        return $this->end_time;
    }

    /**
     * Generated from protobuf field <code>uint32 end_time = 4;</code>
     * @param int $var
     * @return $this
     */
    public function setEndTime($var)
    {
        GPBUtil::checkUint32($var);
        $this->end_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string location = 5;</code>
     * @return string
     */
    public function getLocation()
    {
        return $this->location;
    }

    /**
     * Generated from protobuf field <code>string location = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setLocation($var)
    {
        GPBUtil::checkString($var, True);
        $this->location = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 num_signup = 6;</code>
     * @return int
     */
    public function getNumSignup()
    {
        return $this->num_signup;
    }

    /**
     * Generated from protobuf field <code>uint32 num_signup = 6;</code>
     * @param int $var
     * @return $this
     */
    public function setNumSignup($var)
    {
        GPBUtil::checkUint32($var);
        $this->num_signup = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated string potraits = 7;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPotraits()
    {
        return $this->potraits;
    }

    /**
     * Generated from protobuf field <code>repeated string potraits = 7;</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPotraits($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->potraits = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 num_join = 8;</code>
     * @return int
     */
    public function getNumJoin()
    {
        return $this->num_join;
    }

    /**
     * Generated from protobuf field <code>uint32 num_join = 8;</code>
     * @param int $var
     * @return $this
     */
    public function setNumJoin($var)
    {
        GPBUtil::checkUint32($var);
        $this->num_join = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated string pic_urls = 9;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPicUrls()
    {
        return $this->pic_urls;
    }

    /**
     * Generated from protobuf field <code>repeated string pic_urls = 9;</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPicUrls($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->pic_urls = $arr;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(TogetherHi::class, \TbClient\Post\Common\Content_TogetherHi::class);
