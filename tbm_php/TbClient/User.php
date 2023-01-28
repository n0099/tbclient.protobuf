<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: User.proto

namespace TbClient;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>tbClient.User</code>
 */
class User extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 uid = 2;</code>
     */
    protected $uid = 0;
    /**
     * Generated from protobuf field <code>string name = 3;</code>
     */
    protected $name = '';
    /**
     * Generated from protobuf field <code>string name_show = 4;</code>
     */
    protected $name_show = '';
    /**
     * Generated from protobuf field <code>string portrait = 5;</code>
     */
    protected $portrait = '';
    /**
     * Generated from protobuf field <code>repeated .tbClient.userDeps.Icon iconinfo = 17;</code>
     */
    private $iconinfo;
    /**
     * Generated from protobuf field <code>int32 level_id = 23;</code>
     */
    protected $level_id = 0;
    /**
     * Generated from protobuf field <code>int32 gender = 42;</code>
     */
    protected $gender = 0;
    /**
     * Generated from protobuf field <code>string fans_nickname = 57;</code>
     */
    protected $fans_nickname = '';
    /**
     * Generated from protobuf field <code>string ip_address = 127;</code>
     */
    protected $ip_address = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $uid
     *     @type string $name
     *     @type string $name_show
     *     @type string $portrait
     *     @type array<\TbClient\UserDeps\Icon>|\Google\Protobuf\Internal\RepeatedField $iconinfo
     *     @type int $level_id
     *     @type int $gender
     *     @type string $fans_nickname
     *     @type string $ip_address
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\User::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 uid = 2;</code>
     * @return int|string
     */
    public function getUid()
    {
        return $this->uid;
    }

    /**
     * Generated from protobuf field <code>int64 uid = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setUid($var)
    {
        GPBUtil::checkInt64($var);
        $this->uid = $var;

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
     * Generated from protobuf field <code>string name_show = 4;</code>
     * @return string
     */
    public function getNameShow()
    {
        return $this->name_show;
    }

    /**
     * Generated from protobuf field <code>string name_show = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setNameShow($var)
    {
        GPBUtil::checkString($var, True);
        $this->name_show = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string portrait = 5;</code>
     * @return string
     */
    public function getPortrait()
    {
        return $this->portrait;
    }

    /**
     * Generated from protobuf field <code>string portrait = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setPortrait($var)
    {
        GPBUtil::checkString($var, True);
        $this->portrait = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.userDeps.Icon iconinfo = 17;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getIconinfo()
    {
        return $this->iconinfo;
    }

    /**
     * Generated from protobuf field <code>repeated .tbClient.userDeps.Icon iconinfo = 17;</code>
     * @param array<\TbClient\UserDeps\Icon>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setIconinfo($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \TbClient\UserDeps\Icon::class);
        $this->iconinfo = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 level_id = 23;</code>
     * @return int
     */
    public function getLevelId()
    {
        return $this->level_id;
    }

    /**
     * Generated from protobuf field <code>int32 level_id = 23;</code>
     * @param int $var
     * @return $this
     */
    public function setLevelId($var)
    {
        GPBUtil::checkInt32($var);
        $this->level_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 gender = 42;</code>
     * @return int
     */
    public function getGender()
    {
        return $this->gender;
    }

    /**
     * Generated from protobuf field <code>int32 gender = 42;</code>
     * @param int $var
     * @return $this
     */
    public function setGender($var)
    {
        GPBUtil::checkInt32($var);
        $this->gender = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string fans_nickname = 57;</code>
     * @return string
     */
    public function getFansNickname()
    {
        return $this->fans_nickname;
    }

    /**
     * Generated from protobuf field <code>string fans_nickname = 57;</code>
     * @param string $var
     * @return $this
     */
    public function setFansNickname($var)
    {
        GPBUtil::checkString($var, True);
        $this->fans_nickname = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string ip_address = 127;</code>
     * @return string
     */
    public function getIpAddress()
    {
        return $this->ip_address;
    }

    /**
     * Generated from protobuf field <code>string ip_address = 127;</code>
     * @param string $var
     * @return $this
     */
    public function setIpAddress($var)
    {
        GPBUtil::checkString($var, True);
        $this->ip_address = $var;

        return $this;
    }

}
