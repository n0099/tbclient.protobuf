<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Api/Response/ReplyResponse.proto

namespace TbClient\Api\Response\ReplyResponse;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.api.response.ReplyResponse.Data</code>
 */
class Data extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.tbClient.Page page = 3;</code>
     */
    protected $page = null;
    /**
     * Generated from protobuf field <code>.tbClient.forum.SimpleForum forum = 2;</code>
     */
    protected $forum = null;
    /**
     * Generated from protobuf field <code>repeated .tbClient.post.Reply post_list = 6;</code>
     */
    private $post_list;
    /**
     * Generated from protobuf field <code>repeated .tbClient.User user_list = 13;</code>
     */
    private $user_list;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \TbClient\Page $page
     *     @type \TbClient\Forum\SimpleForum $forum
     *     @type array<\TbClient\Post\Reply>|\Google\Protobuf\Internal\RepeatedField $post_list
     *     @type array<\TbClient\User>|\Google\Protobuf\Internal\RepeatedField $user_list
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Api\Response\ReplyResponse::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.tbClient.Page page = 3;</code>
     * @return \TbClient\Page|null
     */
    public function getPage()
    {
        return $this->page;
    }

    public function hasPage()
    {
        return isset($this->page);
    }

    public function clearPage()
    {
        unset($this->page);
    }

    /**
     * Generated from protobuf field <code>.tbClient.Page page = 3;</code>
     * @param \TbClient\Page $var
     * @return $this
     */
    public function setPage($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Page::class);
        $this->page = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.tbClient.forum.SimpleForum forum = 2;</code>
     * @return \TbClient\Forum\SimpleForum|null
     */
    public function getForum()
    {
        return $this->forum;
    }

    public function hasForum()
    {
        return isset($this->forum);
    }

    public function clearForum()
    {
        unset($this->forum);
    }

    /**
     * Generated from protobuf field <code>.tbClient.forum.SimpleForum forum = 2;</code>
     * @param \TbClient\Forum\SimpleForum $var
     * @return $this
     */
    public function setForum($var)
    {
        GPBUtil::checkMessage($var, \TbClient\Forum\SimpleForum::class);
        $this->forum = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.post.Reply post_list = 6;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPostList()
    {
        return $this->post_list;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.post.Reply post_list = 6;</code>
     * @param array<\TbClient\Post\Reply>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPostList($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \TbClient\Post\Reply::class);
        $this->post_list = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.User user_list = 13;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getUserList()
    {
        return $this->user_list;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.User user_list = 13;</code>
     * @param array<\TbClient\User>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setUserList($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \TbClient\User::class);
        $this->user_list = $arr;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(Data::class, \TbClient\Api\Response\ReplyResponse_Data::class);

