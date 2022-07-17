package tbclient.AddThread;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ANONYMOUS = "";
  
  public static final String DEFAULT_AUTHSID = "";
  
  public static final String DEFAULT_CALL_FROM = "";
  
  public static final String DEFAULT_CAN_NO_FORUM = "";
  
  public static final String DEFAULT_COMMENT_HEAD = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_DURING_TIME = "";
  
  public static final String DEFAULT_ENTRANCE_TYPE = "";
  
  public static final String DEFAULT_FID = "";
  
  public static final String DEFAULT_FIRST_FRAME_PID = "";
  
  public static final String DEFAULT_FROM_CATEGORY_ID = "";
  
  public static final String DEFAULT_FROM_TID = "";
  
  public static final String DEFAULT_IS_ARTICLE = "";
  
  public static final String DEFAULT_IS_BOTTLE = "";
  
  public static final String DEFAULT_IS_FEEDBACK = "";
  
  public static final String DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = "";
  
  public static final String DEFAULT_IS_GENERAL_TAB = "";
  
  public static final String DEFAULT_IS_HIDE = "";
  
  public static final String DEFAULT_IS_LINK_THREAD = "";
  
  public static final String DEFAULT_IS_LOCATION = "";
  
  public static final String DEFAULT_IS_NTITLE = "";
  
  public static final String DEFAULT_IS_PICTXT = "";
  
  public static final String DEFAULT_IS_REPOST_TO_DYNAMIC = "";
  
  public static final String DEFAULT_IS_SHARE = "";
  
  public static final String DEFAULT_IS_WORKS = "";
  
  public static final String DEFAULT_ITEM_ID = "";
  
  public static final String DEFAULT_KW = "";
  
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LBS = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_LINK_URL_CODE = "";
  
  public static final String DEFAULT_LNG = "";
  
  public static final String DEFAULT_MEME_CONT_SIGN = "";
  
  public static final String DEFAULT_MEME_TEXT = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_NEW_VCODE = "";
  
  public static final String DEFAULT_ORIGIN_VIDEO_COVER = "";
  
  public static final String DEFAULT_ORIGIN_VIDEO_TITLE = "";
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final String DEFAULT_ORI_UGC_TYPE = "";
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final String DEFAULT_POST_PREFIX = "";
  
  public static final String DEFAULT_PRO_ZONE = "";
  
  public static final String DEFAULT_REAL_LAT = "";
  
  public static final String DEFAULT_REAL_LNG = "";
  
  public static final String DEFAULT_RECOMMEND_EXT = "";
  
  public static final String DEFAULT_REPLY_UID = "";
  
  public static final String DEFAULT_SHARE_ABSTRACT = "";
  
  public static final String DEFAULT_SHARE_H5_URL = "";
  
  public static final String DEFAULT_SHARE_IMAGE = "";
  
  public static final String DEFAULT_SHARE_SWAN_APP_KEY = "";
  
  public static final String DEFAULT_SHARE_SWAN_PATH = "";
  
  public static final Integer DEFAULT_SHOW_CUSTOM_FIGURE = Integer.valueOf(0);
  
  public static final String DEFAULT_SIG = "";
  
  public static final String DEFAULT_SN = "";
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final String DEFAULT_TAB_ID = "";
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final String DEFAULT_TAKEPHOTO_NUM = "";
  
  public static final String DEFAULT_TBOPEN_APP_ICON = "";
  
  public static final String DEFAULT_TBOPEN_APP_KEY = "";
  
  public static final String DEFAULT_TBOPEN_APP_NAME = "";
  
  public static final String DEFAULT_TBS = "";
  
  public static final String DEFAULT_THREAD_TYPE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TOPIC_ID = "";
  
  public static final String DEFAULT_TO_CATEGORY_ID = "";
  
  public static final String DEFAULT_TRANSFORM_FORUMS = "";
  
  public static final String DEFAULT_VCODE = "";
  
  public static final String DEFAULT_VCODE_MD5 = "";
  
  public static final String DEFAULT_VCODE_TAG = "";
  
  public static final String DEFAULT_VCODE_TYPE = "";
  
  public static final String DEFAULT_VIDEO_ABSTRACT = "";
  
  public static final String DEFAULT_VIDEO_ID = "";
  
  public static final String DEFAULT_VIDEO_OTHER = "";
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  public static final String DEFAULT_WORKS_TAG = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String anonymous;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String authsid;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String call_from;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String can_no_forum;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String comment_head;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String during_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String entrance_type;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String fid;
  
  @ProtoField(tag = 78, type = Message.Datatype.STRING)
  public final String first_frame_pid;
  
  @ProtoField(tag = 81, type = Message.Datatype.STRING)
  public final String from_category_id;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String from_tid;
  
  @ProtoField(tag = 79, type = Message.Datatype.STRING)
  public final String is_article;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String is_bottle;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String is_feedback;
  
  @ProtoField(tag = 63, type = Message.Datatype.STRING)
  public final String is_forum_business_account;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String is_general_tab;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String is_hide;
  
  @ProtoField(tag = 55, type = Message.Datatype.STRING)
  public final String is_link_thread;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String is_location;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String is_ntitle;
  
  @ProtoField(tag = 77, type = Message.Datatype.STRING)
  public final String is_pictxt;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String is_repost_to_dynamic;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String is_share;
  
  @ProtoField(tag = 76, type = Message.Datatype.STRING)
  public final String is_works;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String item_id;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String kw;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String lbs;
  
  @ProtoField(tag = 53, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String link_url_code;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String lng;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String meme_cont_sign;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String meme_text;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 75, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String new_vcode;
  
  @ProtoField(tag = 56, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 59, type = Message.Datatype.STRING)
  public final String ori_ugc_type;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String origin_video_cover;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String origin_video_title;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String post_prefix;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String pro_zone;
  
  @ProtoField(tag = 73, type = Message.Datatype.STRING)
  public final String real_lat;
  
  @ProtoField(tag = 74, type = Message.Datatype.STRING)
  public final String real_lng;
  
  @ProtoField(tag = 52, type = Message.Datatype.STRING)
  public final String recommend_ext;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String reply_uid;
  
  @ProtoField(tag = 68, type = Message.Datatype.STRING)
  public final String share_abstract;
  
  @ProtoField(tag = 70, type = Message.Datatype.STRING)
  public final String share_h5_url;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String share_image;
  
  @ProtoField(tag = 71, type = Message.Datatype.STRING)
  public final String share_swan_app_key;
  
  @ProtoField(tag = 72, type = Message.Datatype.STRING)
  public final String share_swan_path;
  
  @ProtoField(tag = 80, type = Message.Datatype.INT32)
  public final Integer show_custom_figure;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sig;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String sn;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String tab_id;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String takephoto_num;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String tbopen_app_icon;
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String tbopen_app_key;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String tbopen_app_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tbs;
  
  @ProtoField(tag = 64, type = Message.Datatype.STRING)
  public final String thread_type;
  
  @ProtoField(tag = 38, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 82, type = Message.Datatype.STRING)
  public final String to_category_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String topic_id;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String transform_forums;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String vcode;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String vcode_md5;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String vcode_tag;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String vcode_type;
  
  @ProtoField(tag = 39, type = Message.Datatype.STRING)
  public final String video_abstract;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String video_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String video_other;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String works_tag;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str2 = paramBuilder.authsid;
      if (str2 == null) {
        this.authsid = "";
      } else {
        this.authsid = str2;
      } 
      str2 = paramBuilder.sig;
      if (str2 == null) {
        this.sig = "";
      } else {
        this.sig = str2;
      } 
      str2 = paramBuilder.tbs;
      if (str2 == null) {
        this.tbs = "";
      } else {
        this.tbs = str2;
      } 
      str2 = paramBuilder.video_other;
      if (str2 == null) {
        this.video_other = "";
      } else {
        this.video_other = str2;
      } 
      str2 = paramBuilder.anonymous;
      if (str2 == null) {
        this.anonymous = "";
      } else {
        this.anonymous = str2;
      } 
      str2 = paramBuilder.can_no_forum;
      if (str2 == null) {
        this.can_no_forum = "";
      } else {
        this.can_no_forum = str2;
      } 
      str2 = paramBuilder.is_feedback;
      if (str2 == null) {
        this.is_feedback = "";
      } else {
        this.is_feedback = str2;
      } 
      str2 = paramBuilder.takephoto_num;
      if (str2 == null) {
        this.takephoto_num = "";
      } else {
        this.takephoto_num = str2;
      } 
      str2 = paramBuilder.entrance_type;
      if (str2 == null) {
        this.entrance_type = "";
      } else {
        this.entrance_type = str2;
      } 
      str2 = paramBuilder.voice_md5;
      if (str2 == null) {
        this.voice_md5 = "";
      } else {
        this.voice_md5 = str2;
      } 
      str2 = paramBuilder.during_time;
      if (str2 == null) {
        this.during_time = "";
      } else {
        this.during_time = str2;
      } 
      str2 = paramBuilder.vcode;
      if (str2 == null) {
        this.vcode = "";
      } else {
        this.vcode = str2;
      } 
      str2 = paramBuilder.vcode_md5;
      if (str2 == null) {
        this.vcode_md5 = "";
      } else {
        this.vcode_md5 = str2;
      } 
      str2 = paramBuilder.vcode_type;
      if (str2 == null) {
        this.vcode_type = "";
      } else {
        this.vcode_type = str2;
      } 
      str2 = paramBuilder.vcode_tag;
      if (str2 == null) {
        this.vcode_tag = "";
      } else {
        this.vcode_tag = str2;
      } 
      str2 = paramBuilder.topic_id;
      if (str2 == null) {
        this.topic_id = "";
      } else {
        this.topic_id = str2;
      } 
      str2 = paramBuilder.new_vcode;
      if (str2 == null) {
        this.new_vcode = "";
      } else {
        this.new_vcode = str2;
      } 
      str2 = paramBuilder.content;
      if (str2 == null) {
        this.content = "";
      } else {
        this.content = str2;
      } 
      str2 = paramBuilder.reply_uid;
      if (str2 == null) {
        this.reply_uid = "";
      } else {
        this.reply_uid = str2;
      } 
      str2 = paramBuilder.meme_text;
      if (str2 == null) {
        this.meme_text = "";
      } else {
        this.meme_text = str2;
      } 
      str2 = paramBuilder.meme_cont_sign;
      if (str2 == null) {
        this.meme_cont_sign = "";
      } else {
        this.meme_cont_sign = str2;
      } 
      str2 = paramBuilder.item_id;
      if (str2 == null) {
        this.item_id = "";
      } else {
        this.item_id = str2;
      } 
      str2 = paramBuilder.comment_head;
      if (str2 == null) {
        this.comment_head = "";
      } else {
        this.comment_head = str2;
      } 
      str2 = paramBuilder.works_tag;
      if (str2 == null) {
        this.works_tag = "";
      } else {
        this.works_tag = str2;
      } 
      str2 = paramBuilder.fid;
      if (str2 == null) {
        this.fid = "";
      } else {
        this.fid = str2;
      } 
      str2 = paramBuilder.kw;
      if (str2 == null) {
        this.kw = "";
      } else {
        this.kw = str2;
      } 
      str2 = paramBuilder.transform_forums;
      if (str2 == null) {
        this.transform_forums = "";
      } else {
        this.transform_forums = str2;
      } 
      str2 = paramBuilder.is_hide;
      if (str2 == null) {
        this.is_hide = "";
      } else {
        this.is_hide = str2;
      } 
      str2 = paramBuilder.is_repost_to_dynamic;
      if (str2 == null) {
        this.is_repost_to_dynamic = "";
      } else {
        this.is_repost_to_dynamic = str2;
      } 
      str2 = paramBuilder.video_id;
      if (str2 == null) {
        this.video_id = "";
      } else {
        this.video_id = str2;
      } 
      str2 = paramBuilder.origin_video_cover;
      if (str2 == null) {
        this.origin_video_cover = "";
      } else {
        this.origin_video_cover = str2;
      } 
      str2 = paramBuilder.origin_video_title;
      if (str2 == null) {
        this.origin_video_title = "";
      } else {
        this.origin_video_title = str2;
      } 
      str2 = paramBuilder.is_share;
      if (str2 == null) {
        this.is_share = "";
      } else {
        this.is_share = str2;
      } 
      str2 = paramBuilder.from_tid;
      if (str2 == null) {
        this.from_tid = "";
      } else {
        this.from_tid = str2;
      } 
      str2 = paramBuilder.pro_zone;
      if (str2 == null) {
        this.pro_zone = "";
      } else {
        this.pro_zone = str2;
      } 
      str2 = paramBuilder.call_from;
      if (str2 == null) {
        this.call_from = "";
      } else {
        this.call_from = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.video_abstract;
      if (str2 == null) {
        this.video_abstract = "";
      } else {
        this.video_abstract = str2;
      } 
      str2 = paramBuilder.post_prefix;
      if (str2 == null) {
        this.post_prefix = "";
      } else {
        this.post_prefix = str2;
      } 
      str2 = paramBuilder.is_ntitle;
      if (str2 == null) {
        this.is_ntitle = "";
      } else {
        this.is_ntitle = str2;
      } 
      str2 = paramBuilder.st_type;
      if (str2 == null) {
        this.st_type = "";
      } else {
        this.st_type = str2;
      } 
      str2 = paramBuilder.lbs;
      if (str2 == null) {
        this.lbs = "";
      } else {
        this.lbs = str2;
      } 
      str2 = paramBuilder.is_location;
      if (str2 == null) {
        this.is_location = "";
      } else {
        this.is_location = str2;
      } 
      str2 = paramBuilder.lat;
      if (str2 == null) {
        this.lat = "";
      } else {
        this.lat = str2;
      } 
      str2 = paramBuilder.lng;
      if (str2 == null) {
        this.lng = "";
      } else {
        this.lng = str2;
      } 
      str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.sn;
      if (str2 == null) {
        this.sn = "";
      } else {
        this.sn = str2;
      } 
      str2 = paramBuilder.is_bottle;
      if (str2 == null) {
        this.is_bottle = "";
      } else {
        this.is_bottle = str2;
      } 
      str2 = paramBuilder.recommend_ext;
      if (str2 == null) {
        this.recommend_ext = "";
      } else {
        this.recommend_ext = str2;
      } 
      str2 = paramBuilder.link_url;
      if (str2 == null) {
        this.link_url = "";
      } else {
        this.link_url = str2;
      } 
      str2 = paramBuilder.link_url_code;
      if (str2 == null) {
        this.link_url_code = "";
      } else {
        this.link_url_code = str2;
      } 
      str2 = paramBuilder.is_link_thread;
      if (str2 == null) {
        this.is_link_thread = "";
      } else {
        this.is_link_thread = str2;
      } 
      str2 = paramBuilder.ori_ugc_nid;
      if (str2 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str2;
      } 
      str2 = paramBuilder.ori_ugc_vid;
      if (str2 == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str2;
      } 
      str2 = paramBuilder.ori_ugc_tid;
      if (str2 == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str2;
      } 
      str2 = paramBuilder.ori_ugc_type;
      if (str2 == null) {
        this.ori_ugc_type = "";
      } else {
        this.ori_ugc_type = str2;
      } 
      str2 = paramBuilder.tab_name;
      if (str2 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str2;
      } 
      str2 = paramBuilder.tab_id;
      if (str2 == null) {
        this.tab_id = "";
      } else {
        this.tab_id = str2;
      } 
      str2 = paramBuilder.is_general_tab;
      if (str2 == null) {
        this.is_general_tab = "";
      } else {
        this.is_general_tab = str2;
      } 
      str2 = paramBuilder.is_forum_business_account;
      if (str2 == null) {
        this.is_forum_business_account = "";
      } else {
        this.is_forum_business_account = str2;
      } 
      str2 = paramBuilder.thread_type;
      if (str2 == null) {
        this.thread_type = "";
      } else {
        this.thread_type = str2;
      } 
      str2 = paramBuilder.tbopen_app_key;
      if (str2 == null) {
        this.tbopen_app_key = "";
      } else {
        this.tbopen_app_key = str2;
      } 
      str2 = paramBuilder.tbopen_app_icon;
      if (str2 == null) {
        this.tbopen_app_icon = "";
      } else {
        this.tbopen_app_icon = str2;
      } 
      str2 = paramBuilder.tbopen_app_name;
      if (str2 == null) {
        this.tbopen_app_name = "";
      } else {
        this.tbopen_app_name = str2;
      } 
      str2 = paramBuilder.share_abstract;
      if (str2 == null) {
        this.share_abstract = "";
      } else {
        this.share_abstract = str2;
      } 
      str2 = paramBuilder.share_image;
      if (str2 == null) {
        this.share_image = "";
      } else {
        this.share_image = str2;
      } 
      str2 = paramBuilder.share_h5_url;
      if (str2 == null) {
        this.share_h5_url = "";
      } else {
        this.share_h5_url = str2;
      } 
      str2 = paramBuilder.share_swan_app_key;
      if (str2 == null) {
        this.share_swan_app_key = "";
      } else {
        this.share_swan_app_key = str2;
      } 
      str2 = paramBuilder.share_swan_path;
      if (str2 == null) {
        this.share_swan_path = "";
      } else {
        this.share_swan_path = str2;
      } 
      str2 = paramBuilder.real_lat;
      if (str2 == null) {
        this.real_lat = "";
      } else {
        this.real_lat = str2;
      } 
      str2 = paramBuilder.real_lng;
      if (str2 == null) {
        this.real_lng = "";
      } else {
        this.real_lng = str2;
      } 
      str2 = paramBuilder.name_show;
      if (str2 == null) {
        this.name_show = "";
      } else {
        this.name_show = str2;
      } 
      str2 = paramBuilder.is_works;
      if (str2 == null) {
        this.is_works = "";
      } else {
        this.is_works = str2;
      } 
      str2 = paramBuilder.is_pictxt;
      if (str2 == null) {
        this.is_pictxt = "";
      } else {
        this.is_pictxt = str2;
      } 
      str2 = paramBuilder.first_frame_pid;
      if (str2 == null) {
        this.first_frame_pid = "";
      } else {
        this.first_frame_pid = str2;
      } 
      str2 = paramBuilder.is_article;
      if (str2 == null) {
        this.is_article = "";
      } else {
        this.is_article = str2;
      } 
      Integer integer = paramBuilder.show_custom_figure;
      if (integer == null) {
        this.show_custom_figure = DEFAULT_SHOW_CUSTOM_FIGURE;
      } else {
        this.show_custom_figure = integer;
      } 
      String str1 = paramBuilder.from_category_id;
      if (str1 == null) {
        this.from_category_id = "";
      } else {
        this.from_category_id = str1;
      } 
      str = paramBuilder.to_category_id;
      if (str == null) {
        this.to_category_id = "";
      } else {
        this.to_category_id = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.authsid = ((Builder)str).authsid;
      this.sig = ((Builder)str).sig;
      this.tbs = ((Builder)str).tbs;
      this.video_other = ((Builder)str).video_other;
      this.anonymous = ((Builder)str).anonymous;
      this.can_no_forum = ((Builder)str).can_no_forum;
      this.is_feedback = ((Builder)str).is_feedback;
      this.takephoto_num = ((Builder)str).takephoto_num;
      this.entrance_type = ((Builder)str).entrance_type;
      this.voice_md5 = ((Builder)str).voice_md5;
      this.during_time = ((Builder)str).during_time;
      this.vcode = ((Builder)str).vcode;
      this.vcode_md5 = ((Builder)str).vcode_md5;
      this.vcode_type = ((Builder)str).vcode_type;
      this.vcode_tag = ((Builder)str).vcode_tag;
      this.topic_id = ((Builder)str).topic_id;
      this.new_vcode = ((Builder)str).new_vcode;
      this.content = ((Builder)str).content;
      this.reply_uid = ((Builder)str).reply_uid;
      this.meme_text = ((Builder)str).meme_text;
      this.meme_cont_sign = ((Builder)str).meme_cont_sign;
      this.item_id = ((Builder)str).item_id;
      this.comment_head = ((Builder)str).comment_head;
      this.works_tag = ((Builder)str).works_tag;
      this.fid = ((Builder)str).fid;
      this.kw = ((Builder)str).kw;
      this.transform_forums = ((Builder)str).transform_forums;
      this.is_hide = ((Builder)str).is_hide;
      this.is_repost_to_dynamic = ((Builder)str).is_repost_to_dynamic;
      this.video_id = ((Builder)str).video_id;
      this.origin_video_cover = ((Builder)str).origin_video_cover;
      this.origin_video_title = ((Builder)str).origin_video_title;
      this.is_share = ((Builder)str).is_share;
      this.from_tid = ((Builder)str).from_tid;
      this.pro_zone = ((Builder)str).pro_zone;
      this.call_from = ((Builder)str).call_from;
      this.title = ((Builder)str).title;
      this.video_abstract = ((Builder)str).video_abstract;
      this.post_prefix = ((Builder)str).post_prefix;
      this.is_ntitle = ((Builder)str).is_ntitle;
      this.st_type = ((Builder)str).st_type;
      this.lbs = ((Builder)str).lbs;
      this.is_location = ((Builder)str).is_location;
      this.lat = ((Builder)str).lat;
      this.lng = ((Builder)str).lng;
      this.name = ((Builder)str).name;
      this.sn = ((Builder)str).sn;
      this.is_bottle = ((Builder)str).is_bottle;
      this.recommend_ext = ((Builder)str).recommend_ext;
      this.link_url = ((Builder)str).link_url;
      this.link_url_code = ((Builder)str).link_url_code;
      this.is_link_thread = ((Builder)str).is_link_thread;
      this.ori_ugc_nid = ((Builder)str).ori_ugc_nid;
      this.ori_ugc_vid = ((Builder)str).ori_ugc_vid;
      this.ori_ugc_tid = ((Builder)str).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)str).ori_ugc_type;
      this.tab_name = ((Builder)str).tab_name;
      this.tab_id = ((Builder)str).tab_id;
      this.is_general_tab = ((Builder)str).is_general_tab;
      this.is_forum_business_account = ((Builder)str).is_forum_business_account;
      this.thread_type = ((Builder)str).thread_type;
      this.tbopen_app_key = ((Builder)str).tbopen_app_key;
      this.tbopen_app_icon = ((Builder)str).tbopen_app_icon;
      this.tbopen_app_name = ((Builder)str).tbopen_app_name;
      this.share_abstract = ((Builder)str).share_abstract;
      this.share_image = ((Builder)str).share_image;
      this.share_h5_url = ((Builder)str).share_h5_url;
      this.share_swan_app_key = ((Builder)str).share_swan_app_key;
      this.share_swan_path = ((Builder)str).share_swan_path;
      this.real_lat = ((Builder)str).real_lat;
      this.real_lng = ((Builder)str).real_lng;
      this.name_show = ((Builder)str).name_show;
      this.is_works = ((Builder)str).is_works;
      this.is_pictxt = ((Builder)str).is_pictxt;
      this.first_frame_pid = ((Builder)str).first_frame_pid;
      this.is_article = ((Builder)str).is_article;
      this.show_custom_figure = ((Builder)str).show_custom_figure;
      this.from_category_id = ((Builder)str).from_category_id;
      this.to_category_id = ((Builder)str).to_category_id;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1039206347, "Ltbclient/AddThread/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1039206347, "Ltbclient/AddThread/DataReq;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String anonymous;
    
    public String authsid;
    
    public String call_from;
    
    public String can_no_forum;
    
    public String comment_head;
    
    public CommonReq common;
    
    public String content;
    
    public String during_time;
    
    public String entrance_type;
    
    public String fid;
    
    public String first_frame_pid;
    
    public String from_category_id;
    
    public String from_tid;
    
    public String is_article;
    
    public String is_bottle;
    
    public String is_feedback;
    
    public String is_forum_business_account;
    
    public String is_general_tab;
    
    public String is_hide;
    
    public String is_link_thread;
    
    public String is_location;
    
    public String is_ntitle;
    
    public String is_pictxt;
    
    public String is_repost_to_dynamic;
    
    public String is_share;
    
    public String is_works;
    
    public String item_id;
    
    public String kw;
    
    public String lat;
    
    public String lbs;
    
    public String link_url;
    
    public String link_url_code;
    
    public String lng;
    
    public String meme_cont_sign;
    
    public String meme_text;
    
    public String name;
    
    public String name_show;
    
    public String new_vcode;
    
    public String ori_ugc_nid;
    
    public String ori_ugc_tid;
    
    public String ori_ugc_type;
    
    public String ori_ugc_vid;
    
    public String origin_video_cover;
    
    public String origin_video_title;
    
    public String post_prefix;
    
    public String pro_zone;
    
    public String real_lat;
    
    public String real_lng;
    
    public String recommend_ext;
    
    public String reply_uid;
    
    public String share_abstract;
    
    public String share_h5_url;
    
    public String share_image;
    
    public String share_swan_app_key;
    
    public String share_swan_path;
    
    public Integer show_custom_figure;
    
    public String sig;
    
    public String sn;
    
    public String st_type;
    
    public String tab_id;
    
    public String tab_name;
    
    public String takephoto_num;
    
    public String tbopen_app_icon;
    
    public String tbopen_app_key;
    
    public String tbopen_app_name;
    
    public String tbs;
    
    public String thread_type;
    
    public String title;
    
    public String to_category_id;
    
    public String topic_id;
    
    public String transform_forums;
    
    public String vcode;
    
    public String vcode_md5;
    
    public String vcode_tag;
    
    public String vcode_type;
    
    public String video_abstract;
    
    public String video_id;
    
    public String video_other;
    
    public String voice_md5;
    
    public String works_tag;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.authsid = param1DataReq.authsid;
      this.sig = param1DataReq.sig;
      this.tbs = param1DataReq.tbs;
      this.video_other = param1DataReq.video_other;
      this.anonymous = param1DataReq.anonymous;
      this.can_no_forum = param1DataReq.can_no_forum;
      this.is_feedback = param1DataReq.is_feedback;
      this.takephoto_num = param1DataReq.takephoto_num;
      this.entrance_type = param1DataReq.entrance_type;
      this.voice_md5 = param1DataReq.voice_md5;
      this.during_time = param1DataReq.during_time;
      this.vcode = param1DataReq.vcode;
      this.vcode_md5 = param1DataReq.vcode_md5;
      this.vcode_type = param1DataReq.vcode_type;
      this.vcode_tag = param1DataReq.vcode_tag;
      this.topic_id = param1DataReq.topic_id;
      this.new_vcode = param1DataReq.new_vcode;
      this.content = param1DataReq.content;
      this.reply_uid = param1DataReq.reply_uid;
      this.meme_text = param1DataReq.meme_text;
      this.meme_cont_sign = param1DataReq.meme_cont_sign;
      this.item_id = param1DataReq.item_id;
      this.comment_head = param1DataReq.comment_head;
      this.works_tag = param1DataReq.works_tag;
      this.fid = param1DataReq.fid;
      this.kw = param1DataReq.kw;
      this.transform_forums = param1DataReq.transform_forums;
      this.is_hide = param1DataReq.is_hide;
      this.is_repost_to_dynamic = param1DataReq.is_repost_to_dynamic;
      this.video_id = param1DataReq.video_id;
      this.origin_video_cover = param1DataReq.origin_video_cover;
      this.origin_video_title = param1DataReq.origin_video_title;
      this.is_share = param1DataReq.is_share;
      this.from_tid = param1DataReq.from_tid;
      this.pro_zone = param1DataReq.pro_zone;
      this.call_from = param1DataReq.call_from;
      this.title = param1DataReq.title;
      this.video_abstract = param1DataReq.video_abstract;
      this.post_prefix = param1DataReq.post_prefix;
      this.is_ntitle = param1DataReq.is_ntitle;
      this.st_type = param1DataReq.st_type;
      this.lbs = param1DataReq.lbs;
      this.is_location = param1DataReq.is_location;
      this.lat = param1DataReq.lat;
      this.lng = param1DataReq.lng;
      this.name = param1DataReq.name;
      this.sn = param1DataReq.sn;
      this.is_bottle = param1DataReq.is_bottle;
      this.recommend_ext = param1DataReq.recommend_ext;
      this.link_url = param1DataReq.link_url;
      this.link_url_code = param1DataReq.link_url_code;
      this.is_link_thread = param1DataReq.is_link_thread;
      this.ori_ugc_nid = param1DataReq.ori_ugc_nid;
      this.ori_ugc_vid = param1DataReq.ori_ugc_vid;
      this.ori_ugc_tid = param1DataReq.ori_ugc_tid;
      this.ori_ugc_type = param1DataReq.ori_ugc_type;
      this.tab_name = param1DataReq.tab_name;
      this.tab_id = param1DataReq.tab_id;
      this.is_general_tab = param1DataReq.is_general_tab;
      this.is_forum_business_account = param1DataReq.is_forum_business_account;
      this.thread_type = param1DataReq.thread_type;
      this.tbopen_app_key = param1DataReq.tbopen_app_key;
      this.tbopen_app_icon = param1DataReq.tbopen_app_icon;
      this.tbopen_app_name = param1DataReq.tbopen_app_name;
      this.share_abstract = param1DataReq.share_abstract;
      this.share_image = param1DataReq.share_image;
      this.share_h5_url = param1DataReq.share_h5_url;
      this.share_swan_app_key = param1DataReq.share_swan_app_key;
      this.share_swan_path = param1DataReq.share_swan_path;
      this.real_lat = param1DataReq.real_lat;
      this.real_lng = param1DataReq.real_lng;
      this.name_show = param1DataReq.name_show;
      this.is_works = param1DataReq.is_works;
      this.is_pictxt = param1DataReq.is_pictxt;
      this.first_frame_pid = param1DataReq.first_frame_pid;
      this.is_article = param1DataReq.is_article;
      this.show_custom_figure = param1DataReq.show_custom_figure;
      this.from_category_id = param1DataReq.from_category_id;
      this.to_category_id = param1DataReq.to_category_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
