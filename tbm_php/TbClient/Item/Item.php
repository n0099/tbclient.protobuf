<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Item/Item.proto

namespace TbClient\Item;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.item.Item</code>
 */
class Item extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 item_id = 1;</code>
     */
    protected $item_id = 0;
    /**
     * Generated from protobuf field <code>string item_name = 2;</code>
     */
    protected $item_name = '';
    /**
     * Generated from protobuf field <code>double icon_size = 3;</code>
     */
    protected $icon_size = 0.0;
    /**
     * Generated from protobuf field <code>string icon_url = 4;</code>
     */
    protected $icon_url = '';
    /**
     * Generated from protobuf field <code>repeated string tags = 5;</code>
     */
    private $tags;
    /**
     * Generated from protobuf field <code>double score = 6;</code>
     */
    protected $score = 0.0;
    /**
     * Generated from protobuf field <code>int32 star = 7;</code>
     */
    protected $star = 0;
    /**
     * Generated from protobuf field <code>string button_name = 8;</code>
     */
    protected $button_name = '';
    /**
     * Generated from protobuf field <code>string button_link = 9;</code>
     */
    protected $button_link = '';
    /**
     * Generated from protobuf field <code>string item_appid = 10;</code>
     */
    protected $item_appid = '';
    /**
     * Generated from protobuf field <code>int32 category_id = 11;</code>
     */
    protected $category_id = 0;
    /**
     * Generated from protobuf field <code>int32 button_link_type = 12;</code>
     */
    protected $button_link_type = 0;
    /**
     * Generated from protobuf field <code>string apk_name = 13;</code>
     */
    protected $apk_name = '';
    /**
     * Generated from protobuf field <code>string forum_name = 14;</code>
     */
    protected $forum_name = '';
    /**
     * Generated from protobuf field <code>.tbClient.item.ApkDetail apk_detail = 15;</code>
     */
    protected $apk_detail = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $item_id
     *     @type string $item_name
     *     @type float $icon_size
     *     @type string $icon_url
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $tags
     *     @type float $score
     *     @type int $star
     *     @type string $button_name
     *     @type string $button_link
     *     @type string $item_appid
     *     @type int $category_id
     *     @type int $button_link_type
     *     @type string $apk_name
     *     @type string $forum_name
     *     @type \TbClient\Item\ApkDetail $apk_detail
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Item\Item::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 item_id = 1;</code>
     * @return int|string
     */
    public function getItemId()
    {
        return $this->item_id;
    }

    /**
     * Generated from protobuf field <code>int64 item_id = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setItemId($var)
    {
        GPBUtil::checkInt64($var);
        $this->item_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string item_name = 2;</code>
     * @return string
     */
    public function getItemName()
    {
        return $this->item_name;
    }

    /**
     * Generated from protobuf field <code>string item_name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setItemName($var)
    {
        GPBUtil::checkString($var, True);
        $this->item_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>double icon_size = 3;</code>
     * @return float
     */
    public function getIconSize()
    {
        return $this->icon_size;
    }

    /**
     * Generated from protobuf field <code>double icon_size = 3;</code>
     * @param float $var
     * @return $this
     */
    public function setIconSize($var)
    {
        GPBUtil::checkDouble($var);
        $this->icon_size = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string icon_url = 4;</code>
     * @return string
     */
    public function getIconUrl()
    {
        return $this->icon_url;
    }

    /**
     * Generated from protobuf field <code>string icon_url = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setIconUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->icon_url = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated string tags = 5;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTags()
    {
        return $this->tags;
    }

    /**
     * Generated from protobuf field <code>repeated string tags = 5;</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setTags($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->tags = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>double score = 6;</code>
     * @return float
     */
    public function getScore()
    {
        return $this->score;
    }

    /**
     * Generated from protobuf field <code>double score = 6;</code>
     * @param float $var
     * @return $this
     */
    public function setScore($var)
    {
        GPBUtil::checkDouble($var);
        $this->score = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 star = 7;</code>
     * @return int
     */
    public function getStar()
    {
        return $this->star;
    }

    /**
     * Generated from protobuf field <code>int32 star = 7;</code>
     * @param int $var
     * @return $this
     */
    public function setStar($var)
    {
        GPBUtil::checkInt32($var);
        $this->star = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string button_name = 8;</code>
     * @return string
     */
    public function getButtonName()
    {
        return $this->button_name;
    }

    /**
     * Generated from protobuf field <code>string button_name = 8;</code>
     * @param string $var
     * @return $this
     */
    public function setButtonName($var)
    {
        GPBUtil::checkString($var, True);
        $this->button_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string button_link = 9;</code>
     * @return string
     */
    public function getButtonLink()
    {
        return $this->button_link;
    }

    /**
     * Generated from protobuf field <code>string button_link = 9;</code>
     * @param string $var
     * @return $this
     */
    public function setButtonLink($var)
    {
        GPBUtil::checkString($var, True);
        $this->button_link = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string item_appid = 10;</code>
     * @return string
     */
    public function getItemAppid()
    {
        return $this->item_appid;
    }

    /**
     * Generated from protobuf field <code>string item_appid = 10;</code>
     * @param string $var
     * @return $this
     */
    public function setItemAppid($var)
    {
        GPBUtil::checkString($var, True);
        $this->item_appid = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 category_id = 11;</code>
     * @return int
     */
    public function getCategoryId()
    {
        return $this->category_id;
    }

    /**
     * Generated from protobuf field <code>int32 category_id = 11;</code>
     * @param int $var
     * @return $this
     */
    public function setCategoryId($var)
    {
        GPBUtil::checkInt32($var);
        $this->category_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 button_link_type = 12;</code>
     * @return int
     */
    public function getButtonLinkType()
    {
        return $this->button_link_type;
    }

    /**
     * Generated from protobuf field <code>int32 button_link_type = 12;</code>
     * @param int $var
     * @return $this
     */
    public function setButtonLinkType($var)
    {
        GPBUtil::checkInt32($var);
        $this->button_link_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string apk_name = 13;</code>
     * @return string
     */
    public function getApkName()
    {
        return $this->apk_name;
    }

    /**
     * Generated from protobuf field <code>string apk_name = 13;</code>
     * @param string $var
     * @return $this
     */
    public function setApkName($var)
    {
        GPBUtil::checkString($var, True);
        $this->apk_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string forum_name = 14;</code>
     * @return string
     */
    public function getForumName()
    {
        return $this->forum_name;
    }

    /**
     * Generated from protobuf field <code>string forum_name = 14;</code>
     * @param string $var
     * @return $this
     */
    public function setForumName($var)
    {
        GPBUtil::checkString($var, True);
        $this->forum_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.item.ApkDetail apk_detail = 15;</code>
     * @return \TbClient\Item\ApkDetail|null
     */
    public function getApkDetail()
    {
        return $this->apk_detail;
    }

    public function hasApkDetail()
    {
        return isset($this->apk_detail);
    }

    public function clearApkDetail()
    {
        unset($this->apk_detail);
    }

    /**
     * Generated from protobuf field <code>.tbClient.item.ApkDetail apk_detail = 15;</code>
     * @param \TbClient\Item\ApkDetail $var
     * @return $this
     */
    public function setApkDetail($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Item\ApkDetail::class);
        $this->apk_detail = $var;

        return $this;
    }

}

