<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Post/Common/Content.proto

namespace GPBMetadata\Post\Common;

class Content
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Item\Item::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
Post/Common/Content.prototbClient.post.common"�
Content
type (
text (	
link (	
src (	
bsize (	
big_src (	
big_size (	
cdn_src (	
big_cdn_src	 (	
imgtype
 (		
c (	
	voice_md5 (	
during_time (
is_sub (
uid (
dynamic (	
_static (	
width (
height (
packet_name (	
	phonetype (	
is_native_app (;

native_app (2\'.tbClient.post.common.Content.NativeApp
e_type (

origin_src (	
btn_type (
origin_size (
count (A
graffiti_info (2*.tbClient.post.common.Content.GraffitiInfo?
high_together (2(.tbClient.post.common.Content.TogetherHi
media_subtitle (	
url_type  (9
	meme_info! (2&.tbClient.post.common.Content.MemeInfo
is_long_pic" (
show_original_btn# (
cdn_src_active$ (	
topic_special_icon% (	
item_id& (
item_forum_name\' (	C
tiebaplus_info( (2+.tbClient.post.common.Content.TiebaPlusInfo!
item) (2.tbClient.item.Item
pic_id* (
	link_type+ (
target_scheme, (	[
	NativeApp
jump_and (	
jump_ios (	
download_and (	
download_ios (	(
GraffitiInfo
url (	
gid (�

TogetherHi

album_name (	
album_id (

start_time (
end_time (
location (	

num_signup (
potraits (	
num_join (
pic_urls	 (	�
MemeInfo
pck_id (
pic_id (
pic_url (	
	thumbnail (	
width (
height (
detail_link (	�
TiebaPlusInfo
title (	
desc (	
jump_url (	
download_url (	
app_id (	
app_icon (	
app_package (	
app_version (	
app_privacy	 (	
	app_power
 (	
app_company (	
target_type (
h5_jump_type (
h5_jump_number (	
h5_jump_param (	
	jump_type (
item_id (	

is_appoint (K
plugin_user (26.tbClient.post.common.Content.TiebaPlusInfo.PluginUser

forum_name (	
jump_setting (
wx_thumbnail (	
button_desc (	�

PluginUser
user_id (
user_name_show (	
	user_type (

user_photo (	"
is_download_card_whiteuser (bproto3'
        , true);

        static::$is_initialized = true;
    }
}

