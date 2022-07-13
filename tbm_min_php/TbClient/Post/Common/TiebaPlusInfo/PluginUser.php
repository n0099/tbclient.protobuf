<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Post/Common/TiebaPlusInfo.proto

namespace TbClient\Post\Common\TiebaPlusInfo;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.post.common.TiebaPlusInfo.PluginUser</code>
 */
class PluginUser extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 user_id = 1;</code>
     */
    protected $user_id = 0;
    /**
     * Generated from protobuf field <code>string user_name_show = 2;</code>
     */
    protected $user_name_show = '';
    /**
     * Generated from protobuf field <code>int32 user_type = 3;</code>
     */
    protected $user_type = 0;
    /**
     * Generated from protobuf field <code>string user_photo = 4;</code>
     */
    protected $user_photo = '';
    /**
     * Generated from protobuf field <code>int32 is_download_card_whiteuser = 5;</code>
     */
    protected $is_download_card_whiteuser = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $user_id
     *     @type string $user_name_show
     *     @type int $user_type
     *     @type string $user_photo
     *     @type int $is_download_card_whiteuser
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Post\Common\TiebaPlusInfo::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 user_id = 1;</code>
     * @return int|string
     */
    public function getUserId()
    {
        return $this->user_id;
    }

    /**
     * Generated from protobuf field <code>int64 user_id = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setUserId($var)
    {
        GPBUtil::checkInt64($var);
        $this->user_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string user_name_show = 2;</code>
     * @return string
     */
    public function getUserNameShow()
    {
        return $this->user_name_show;
    }

    /**
     * Generated from protobuf field <code>string user_name_show = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setUserNameShow($var)
    {
        GPBUtil::checkString($var, True);
        $this->user_name_show = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 user_type = 3;</code>
     * @return int
     */
    public function getUserType()
    {
        return $this->user_type;
    }

    /**
     * Generated from protobuf field <code>int32 user_type = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setUserType($var)
    {
        GPBUtil::checkInt32($var);
        $this->user_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string user_photo = 4;</code>
     * @return string
     */
    public function getUserPhoto()
    {
        return $this->user_photo;
    }

    /**
     * Generated from protobuf field <code>string user_photo = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setUserPhoto($var)
    {
        GPBUtil::checkString($var, True);
        $this->user_photo = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 is_download_card_whiteuser = 5;</code>
     * @return int
     */
    public function getIsDownloadCardWhiteuser()
    {
        return $this->is_download_card_whiteuser;
    }

    /**
     * Generated from protobuf field <code>int32 is_download_card_whiteuser = 5;</code>
     * @param int $var
     * @return $this
     */
    public function setIsDownloadCardWhiteuser($var)
    {
        GPBUtil::checkInt32($var);
        $this->is_download_card_whiteuser = $var;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(PluginUser::class, \TbClient\Post\Common\TiebaPlusInfo_PluginUser::class);

