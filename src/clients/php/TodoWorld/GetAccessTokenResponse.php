<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: services.proto

namespace TodoWorld;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>GetAccessTokenResponse</code>
 */
class GetAccessTokenResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string AccessToken = 1;</code>
     */
    private $AccessToken = '';
    /**
     * Generated from protobuf field <code>map<string, string> Meta = 2;</code>
     */
    private $Meta;
    /**
     * Generated from protobuf field <code>.ResponseStatus ResponseStatus = 3;</code>
     */
    private $ResponseStatus = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $AccessToken
     *     @type array|\Google\Protobuf\Internal\MapField $Meta
     *     @type \TodoWorld\ResponseStatus $ResponseStatus
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Services::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string AccessToken = 1;</code>
     * @return string
     */
    public function getAccessToken()
    {
        return $this->AccessToken;
    }

    /**
     * Generated from protobuf field <code>string AccessToken = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setAccessToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->AccessToken = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>map<string, string> Meta = 2;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getMeta()
    {
        return $this->Meta;
    }

    /**
     * Generated from protobuf field <code>map<string, string> Meta = 2;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setMeta($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::STRING);
        $this->Meta = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.ResponseStatus ResponseStatus = 3;</code>
     * @return \TodoWorld\ResponseStatus
     */
    public function getResponseStatus()
    {
        return $this->ResponseStatus;
    }

    /**
     * Generated from protobuf field <code>.ResponseStatus ResponseStatus = 3;</code>
     * @param \TodoWorld\ResponseStatus $var
     * @return $this
     */
    public function setResponseStatus($var)
    {
        GPBUtil::checkMessage($var, \TodoWorld\ResponseStatus::class);
        $this->ResponseStatus = $var;

        return $this;
    }

}
