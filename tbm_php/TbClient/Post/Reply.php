<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Post/Reply.proto

namespace TbClient\Post;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.post.Reply</code>
 */
class Reply extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint64 pid = 1;</code>
     */
    protected $pid = 0;
    /**
     * Generated from protobuf field <code>string title = 2;</code>
     */
    protected $title = '';
    /**
     * Generated from protobuf field <code>uint32 floor = 3;</code>
     */
    protected $floor = 0;
    /**
     * Generated from protobuf field <code>uint32 time = 4;</code>
     */
    protected $time = 0;
    /**
     * Generated from protobuf field <code>repeated .tbClient.post.common.Content content = 5;</code>
     */
    private $content;
    /**
     * Generated from protobuf field <code>.tbClient.post.common.Lbs lbs_info = 7;</code>
     */
    protected $lbs_info = null;
    /**
     * Generated from protobuf field <code>uint32 sub_post_number = 13;</code>
     */
    protected $sub_post_number = 0;
    /**
     * Generated from protobuf field <code>int64 author_id = 19;</code>
     */
    protected $author_id = 0;
    /**
     * Generated from protobuf field <code>.tbClient.post.Reply.SignatureData signature = 21;</code>
     */
    protected $signature = null;
    /**
     * Generated from protobuf field <code>.tbClient.User author = 23;</code>
     */
    protected $author = null;
    /**
     * Generated from protobuf field <code>.tbClient.post.common.Zan zan = 24;</code>
     */
    protected $zan = null;
    /**
     * Generated from protobuf field <code>.tbClient.post.common.Agree agree = 37;</code>
     */
    protected $agree = null;
    /**
     * Generated from protobuf field <code>int32 is_fold = 43;</code>
     */
    protected $is_fold = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $pid
     *     @type string $title
     *     @type int $floor
     *     @type int $time
     *     @type array<\TbClient\Post\Common\Content>|\Google\Protobuf\Internal\RepeatedField $content
     *     @type \TbClient\Post\Common\Lbs $lbs_info
     *     @type int $sub_post_number
     *     @type int|string $author_id
     *     @type \TbClient\Post\Reply\SignatureData $signature
     *     @type \TbClient\User $author
     *     @type \TbClient\Post\Common\Zan $zan
     *     @type \TbClient\Post\Common\Agree $agree
     *     @type int $is_fold
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Post\Reply::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint64 pid = 1;</code>
     * @return int|string
     */
    public function getPid()
    {
        return $this->pid;
    }

    /**
     * Generated from protobuf field <code>uint64 pid = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setPid($var)
    {
        GPBUtil::checkUint64($var);
        $this->pid = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string title = 2;</code>
     * @return string
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * Generated from protobuf field <code>string title = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setTitle($var)
    {
        GPBUtil::checkString($var, True);
        $this->title = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 floor = 3;</code>
     * @return int
     */
    public function getFloor()
    {
        return $this->floor;
    }

    /**
     * Generated from protobuf field <code>uint32 floor = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setFloor($var)
    {
        GPBUtil::checkUint32($var);
        $this->floor = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 time = 4;</code>
     * @return int
     */
    public function getTime()
    {
        return $this->time;
    }

    /**
     * Generated from protobuf field <code>uint32 time = 4;</code>
     * @param int $var
     * @return $this
     */
    public function setTime($var)
    {
        GPBUtil::checkUint32($var);
        $this->time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.post.common.Content content = 5;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getContent()
    {
        return $this->content;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.post.common.Content content = 5;</code>
     * @param array<\TbClient\Post\Common\Content>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setContent($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \TbClient\Post\Common\Content::class);
        $this->content = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.common.Lbs lbs_info = 7;</code>
     * @return \TbClient\Post\Common\Lbs|null
     */
    public function getLbsInfo()
    {
        return $this->lbs_info;
    }

    public function hasLbsInfo()
    {
        return isset($this->lbs_info);
    }

    public function clearLbsInfo()
    {
        unset($this->lbs_info);
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.common.Lbs lbs_info = 7;</code>
     * @param \TbClient\Post\Common\Lbs $var
     * @return $this
     */
    public function setLbsInfo($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Post\Common\Lbs::class);
        $this->lbs_info = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 sub_post_number = 13;</code>
     * @return int
     */
    public function getSubPostNumber()
    {
        return $this->sub_post_number;
    }

    /**
     * Generated from protobuf field <code>uint32 sub_post_number = 13;</code>
     * @param int $var
     * @return $this
     */
    public function setSubPostNumber($var)
    {
        GPBUtil::checkUint32($var);
        $this->sub_post_number = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 author_id = 19;</code>
     * @return int|string
     */
    public function getAuthorId()
    {
        return $this->author_id;
    }

    /**
     * Generated from protobuf field <code>int64 author_id = 19;</code>
     * @param int|string $var
     * @return $this
     */
    public function setAuthorId($var)
    {
        GPBUtil::checkInt64($var);
        $this->author_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.Reply.SignatureData signature = 21;</code>
     * @return \TbClient\Post\Reply\SignatureData|null
     */
    public function getSignature()
    {
        return $this->signature;
    }

    public function hasSignature()
    {
        return isset($this->signature);
    }

    public function clearSignature()
    {
        unset($this->signature);
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.Reply.SignatureData signature = 21;</code>
     * @param \TbClient\Post\Reply\SignatureData $var
     * @return $this
     */
    public function setSignature($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Post\Reply\SignatureData::class);
        $this->signature = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.User author = 23;</code>
     * @return \TbClient\User|null
     */
    public function getAuthor()
    {
        return $this->author;
    }

    public function hasAuthor()
    {
        return isset($this->author);
    }

    public function clearAuthor()
    {
        unset($this->author);
    }

    /**
     * Generated from protobuf field <code>.tbClient.User author = 23;</code>
     * @param \TbClient\User $var
     * @return $this
     */
    public function setAuthor($var)
    {
        GPBUtil::checkMessage($var, \TbClient\User::class);
        $this->author = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.common.Zan zan = 24;</code>
     * @return \TbClient\Post\Common\Zan|null
     */
    public function getZan()
    {
        return $this->zan;
    }

    public function hasZan()
    {
        return isset($this->zan);
    }

    public function clearZan()
    {
        unset($this->zan);
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.common.Zan zan = 24;</code>
     * @param \TbClient\Post\Common\Zan $var
     * @return $this
     */
    public function setZan($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Post\Common\Zan::class);
        $this->zan = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.common.Agree agree = 37;</code>
     * @return \TbClient\Post\Common\Agree|null
     */
    public function getAgree()
    {
        return $this->agree;
    }

    public function hasAgree()
    {
        return isset($this->agree);
    }

    public function clearAgree()
    {
        unset($this->agree);
    }

    /**
     * Generated from protobuf field <code>.tbClient.post.common.Agree agree = 37;</code>
     * @param \TbClient\Post\Common\Agree $var
     * @return $this
     */
    public function setAgree($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Post\Common\Agree::class);
        $this->agree = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 is_fold = 43;</code>
     * @return int
     */
    public function getIsFold()
    {
        return $this->is_fold;
    }

    /**
     * Generated from protobuf field <code>int32 is_fold = 43;</code>
     * @param int $var
     * @return $this
     */
    public function setIsFold($var)
    {
        GPBUtil::checkInt32($var);
        $this->is_fold = $var;

        return $this;
    }

}

