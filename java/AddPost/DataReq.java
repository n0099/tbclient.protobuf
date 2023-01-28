package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_ANONYMOUS = "";
  
  public static final String DEFAULT_AUTHSID = "";
  
  public static final String DEFAULT_BARRAGE_TIME = "";
  
  public static final String DEFAULT_CAN_NO_FORUM = "";
  
  public static final String DEFAULT_COMMENT_HEAD = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_DURING_TIME = "";
  
  public static final String DEFAULT_ENTRANCE_TYPE = "";
  
  public static final String DEFAULT_FID = "";
  
  public static final String DEFAULT_FLOOR_NUM = "";
  
  public static final String DEFAULT_FROM_CATEGORY_ID = "";
  
  public static final String DEFAULT_FROM_FOURM_ID = "";
  
  public static final String DEFAULT_IS_AD = "";
  
  public static final String DEFAULT_IS_ADDITION = "";
  
  public static final String DEFAULT_IS_BARRAGE = "";
  
  public static final String DEFAULT_IS_FEEDBACK = "";
  
  public static final String DEFAULT_IS_GIFTPOST = "";
  
  public static final String DEFAULT_IS_LOCATION = "";
  
  public static final String DEFAULT_IS_PICTXT = "";
  
  public static final Integer DEFAULT_IS_SHOW_BLESS;
  
  public static final String DEFAULT_IS_STORY = "";
  
  public static final String DEFAULT_IS_TWZHIBO_THREAD = "";
  
  public static final String DEFAULT_IS_WORKS = "";
  
  public static final String DEFAULT_ITEM_ID = "";
  
  public static final String DEFAULT_JFROM = "";
  
  public static final String DEFAULT_JID = "";
  
  public static final String DEFAULT_KW = "";
  
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LNG = "";
  
  public static final String DEFAULT_MEME_CONT_SIGN = "";
  
  public static final String DEFAULT_MEME_TEXT = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_NEW_VCODE = "";
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final String DEFAULT_ORI_UGC_TYPE = "";
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final String DEFAULT_POST_FROM = "";
  
  public static final String DEFAULT_PTYPE = "";
  
  public static final String DEFAULT_QUOTE_ID = "";
  
  public static final String DEFAULT_REAL_LAT = "";
  
  public static final String DEFAULT_REAL_LNG = "";
  
  public static final String DEFAULT_REPLY_UID = "";
  
  public static final String DEFAULT_REPOSTID = "";
  
  public static final Integer DEFAULT_SHOW_CUSTOM_FIGURE;
  
  public static final String DEFAULT_SIG = "";
  
  public static final String DEFAULT_SN = "";
  
  public static final String DEFAULT_ST_PARAM = "";
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final String DEFAULT_SUB_POST_ID = "";
  
  public static final String DEFAULT_TAKEPHOTO_NUM = "";
  
  public static final String DEFAULT_TBS = "";
  
  public static final String DEFAULT_TID = "";
  
  public static final String DEFAULT_TOPIC_ID = "";
  
  public static final String DEFAULT_TO_CATEGORY_ID = "";
  
  public static final String DEFAULT_TRANSFORM_FORUMS = "";
  
  public static final String DEFAULT_VCODE = "";
  
  public static final String DEFAULT_VCODE_MD5 = "";
  
  public static final String DEFAULT_VCODE_TAG = "";
  
  public static final String DEFAULT_VCODE_TYPE = "";
  
  public static final String DEFAULT_VIDEO_OTHER = "";
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  public static final String DEFAULT_V_FID = "";
  
  public static final String DEFAULT_V_FNAME = "";
  
  public static final String DEFAULT_WORKS_TAG = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String anonymous;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String authsid;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String barrage_time;
  
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
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String floor_num;
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String from_category_id;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String from_fourm_id;
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String is_ad;
  
  @ProtoField(tag = 52, type = Message.Datatype.STRING)
  public final String is_addition;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String is_barrage;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String is_feedback;
  
  @ProtoField(tag = 53, type = Message.Datatype.STRING)
  public final String is_giftpost;
  
  @ProtoField(tag = 39, type = Message.Datatype.STRING)
  public final String is_location;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String is_pictxt;
  
  @ProtoField(tag = 67, type = Message.Datatype.INT32)
  public final Integer is_show_bless;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String is_story;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String is_twzhibo_thread;
  
  @ProtoField(tag = 59, type = Message.Datatype.STRING)
  public final String is_works;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String item_id;
  
  @ProtoField(tag = 63, type = Message.Datatype.STRING)
  public final String jfrom;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String jid;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String kw;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String lng;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String meme_cont_sign;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String meme_text;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String new_vcode;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 38, type = Message.Datatype.STRING)
  public final String ori_ugc_type;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  @ProtoField(tag = 55, type = Message.Datatype.STRING)
  public final String post_from;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String ptype;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String quote_id;
  
  @ProtoField(tag = 56, type = Message.Datatype.STRING)
  public final String real_lat;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String real_lng;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String reply_uid;
  
  @ProtoField(tag = 49, type = Message.Datatype.STRING)
  public final String repostid;
  
  @ProtoField(tag = 64, type = Message.Datatype.INT32)
  public final Integer show_custom_figure;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sig;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String sn;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String st_param;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String sub_post_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String takephoto_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tbs;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String tid;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String to_category_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String topic_id;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String transform_forums;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String v_fid;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String v_fname;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String vcode;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String vcode_md5;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String vcode_tag;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String vcode_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String video_other;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String works_tag;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_CUSTOM_FIGURE = integer;
    DEFAULT_IS_SHOW_BLESS = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
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
      str2 = paramBuilder.transform_forums;
      if (str2 == null) {
        this.transform_forums = "";
      } else {
        this.transform_forums = str2;
      } 
      str2 = paramBuilder.v_fid;
      if (str2 == null) {
        this.v_fid = "";
      } else {
        this.v_fid = str2;
      } 
      str2 = paramBuilder.v_fname;
      if (str2 == null) {
        this.v_fname = "";
      } else {
        this.v_fname = str2;
      } 
      str2 = paramBuilder.kw;
      if (str2 == null) {
        this.kw = "";
      } else {
        this.kw = str2;
      } 
      str2 = paramBuilder.is_barrage;
      if (str2 == null) {
        this.is_barrage = "";
      } else {
        this.is_barrage = str2;
      } 
      str2 = paramBuilder.barrage_time;
      if (str2 == null) {
        this.barrage_time = "";
      } else {
        this.barrage_time = str2;
      } 
      str2 = paramBuilder.st_param;
      if (str2 == null) {
        this.st_param = "";
      } else {
        this.st_param = str2;
      } 
      str2 = paramBuilder.ptype;
      if (str2 == null) {
        this.ptype = "";
      } else {
        this.ptype = str2;
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
      str2 = paramBuilder.from_fourm_id;
      if (str2 == null) {
        this.from_fourm_id = "";
      } else {
        this.from_fourm_id = str2;
      } 
      str2 = paramBuilder.tid;
      if (str2 == null) {
        this.tid = "";
      } else {
        this.tid = str2;
      } 
      str2 = paramBuilder.quote_id;
      if (str2 == null) {
        this.quote_id = "";
      } else {
        this.quote_id = str2;
      } 
      str2 = paramBuilder.is_twzhibo_thread;
      if (str2 == null) {
        this.is_twzhibo_thread = "";
      } else {
        this.is_twzhibo_thread = str2;
      } 
      str2 = paramBuilder.floor_num;
      if (str2 == null) {
        this.floor_num = "";
      } else {
        this.floor_num = str2;
      } 
      str2 = paramBuilder.repostid;
      if (str2 == null) {
        this.repostid = "";
      } else {
        this.repostid = str2;
      } 
      str2 = paramBuilder.sub_post_id;
      if (str2 == null) {
        this.sub_post_id = "";
      } else {
        this.sub_post_id = str2;
      } 
      str2 = paramBuilder.is_ad;
      if (str2 == null) {
        this.is_ad = "";
      } else {
        this.is_ad = str2;
      } 
      str2 = paramBuilder.is_addition;
      if (str2 == null) {
        this.is_addition = "";
      } else {
        this.is_addition = str2;
      } 
      str2 = paramBuilder.is_giftpost;
      if (str2 == null) {
        this.is_giftpost = "";
      } else {
        this.is_giftpost = str2;
      } 
      str2 = paramBuilder.st_type;
      if (str2 == null) {
        this.st_type = "";
      } else {
        this.st_type = str2;
      } 
      str2 = paramBuilder.post_from;
      if (str2 == null) {
        this.post_from = "";
      } else {
        this.post_from = str2;
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
      str2 = paramBuilder.is_story;
      if (str2 == null) {
        this.is_story = "";
      } else {
        this.is_story = str2;
      } 
      str2 = paramBuilder.jid;
      if (str2 == null) {
        this.jid = "";
      } else {
        this.jid = str2;
      } 
      str2 = paramBuilder.jfrom;
      if (str2 == null) {
        this.jfrom = "";
      } else {
        this.jfrom = str2;
      } 
      Integer integer1 = paramBuilder.show_custom_figure;
      if (integer1 == null) {
        this.show_custom_figure = DEFAULT_SHOW_CUSTOM_FIGURE;
      } else {
        this.show_custom_figure = integer1;
      } 
      String str1 = paramBuilder.from_category_id;
      if (str1 == null) {
        this.from_category_id = "";
      } else {
        this.from_category_id = str1;
      } 
      str1 = paramBuilder.to_category_id;
      if (str1 == null) {
        this.to_category_id = "";
      } else {
        this.to_category_id = str1;
      } 
      integer = paramBuilder.is_show_bless;
      if (integer == null) {
        this.is_show_bless = DEFAULT_IS_SHOW_BLESS;
      } else {
        this.is_show_bless = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.authsid = ((Builder)integer).authsid;
      this.sig = ((Builder)integer).sig;
      this.tbs = ((Builder)integer).tbs;
      this.video_other = ((Builder)integer).video_other;
      this.anonymous = ((Builder)integer).anonymous;
      this.can_no_forum = ((Builder)integer).can_no_forum;
      this.is_feedback = ((Builder)integer).is_feedback;
      this.takephoto_num = ((Builder)integer).takephoto_num;
      this.entrance_type = ((Builder)integer).entrance_type;
      this.voice_md5 = ((Builder)integer).voice_md5;
      this.during_time = ((Builder)integer).during_time;
      this.vcode = ((Builder)integer).vcode;
      this.vcode_md5 = ((Builder)integer).vcode_md5;
      this.vcode_type = ((Builder)integer).vcode_type;
      this.vcode_tag = ((Builder)integer).vcode_tag;
      this.topic_id = ((Builder)integer).topic_id;
      this.new_vcode = ((Builder)integer).new_vcode;
      this.content = ((Builder)integer).content;
      this.reply_uid = ((Builder)integer).reply_uid;
      this.meme_text = ((Builder)integer).meme_text;
      this.meme_cont_sign = ((Builder)integer).meme_cont_sign;
      this.item_id = ((Builder)integer).item_id;
      this.comment_head = ((Builder)integer).comment_head;
      this.works_tag = ((Builder)integer).works_tag;
      this.fid = ((Builder)integer).fid;
      this.transform_forums = ((Builder)integer).transform_forums;
      this.v_fid = ((Builder)integer).v_fid;
      this.v_fname = ((Builder)integer).v_fname;
      this.kw = ((Builder)integer).kw;
      this.is_barrage = ((Builder)integer).is_barrage;
      this.barrage_time = ((Builder)integer).barrage_time;
      this.st_param = ((Builder)integer).st_param;
      this.ptype = ((Builder)integer).ptype;
      this.ori_ugc_nid = ((Builder)integer).ori_ugc_nid;
      this.ori_ugc_vid = ((Builder)integer).ori_ugc_vid;
      this.ori_ugc_tid = ((Builder)integer).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)integer).ori_ugc_type;
      this.is_location = ((Builder)integer).is_location;
      this.lat = ((Builder)integer).lat;
      this.lng = ((Builder)integer).lng;
      this.name = ((Builder)integer).name;
      this.sn = ((Builder)integer).sn;
      this.from_fourm_id = ((Builder)integer).from_fourm_id;
      this.tid = ((Builder)integer).tid;
      this.quote_id = ((Builder)integer).quote_id;
      this.is_twzhibo_thread = ((Builder)integer).is_twzhibo_thread;
      this.floor_num = ((Builder)integer).floor_num;
      this.repostid = ((Builder)integer).repostid;
      this.sub_post_id = ((Builder)integer).sub_post_id;
      this.is_ad = ((Builder)integer).is_ad;
      this.is_addition = ((Builder)integer).is_addition;
      this.is_giftpost = ((Builder)integer).is_giftpost;
      this.st_type = ((Builder)integer).st_type;
      this.post_from = ((Builder)integer).post_from;
      this.real_lat = ((Builder)integer).real_lat;
      this.real_lng = ((Builder)integer).real_lng;
      this.name_show = ((Builder)integer).name_show;
      this.is_works = ((Builder)integer).is_works;
      this.is_pictxt = ((Builder)integer).is_pictxt;
      this.is_story = ((Builder)integer).is_story;
      this.jid = ((Builder)integer).jid;
      this.jfrom = ((Builder)integer).jfrom;
      this.show_custom_figure = ((Builder)integer).show_custom_figure;
      this.from_category_id = ((Builder)integer).from_category_id;
      this.to_category_id = ((Builder)integer).to_category_id;
      this.is_show_bless = ((Builder)integer).is_show_bless;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String anonymous;
    
    public String authsid;
    
    public String barrage_time;
    
    public String can_no_forum;
    
    public String comment_head;
    
    public CommonReq common;
    
    public String content;
    
    public String during_time;
    
    public String entrance_type;
    
    public String fid;
    
    public String floor_num;
    
    public String from_category_id;
    
    public String from_fourm_id;
    
    public String is_ad;
    
    public String is_addition;
    
    public String is_barrage;
    
    public String is_feedback;
    
    public String is_giftpost;
    
    public String is_location;
    
    public String is_pictxt;
    
    public Integer is_show_bless;
    
    public String is_story;
    
    public String is_twzhibo_thread;
    
    public String is_works;
    
    public String item_id;
    
    public String jfrom;
    
    public String jid;
    
    public String kw;
    
    public String lat;
    
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
    
    public String post_from;
    
    public String ptype;
    
    public String quote_id;
    
    public String real_lat;
    
    public String real_lng;
    
    public String reply_uid;
    
    public String repostid;
    
    public Integer show_custom_figure;
    
    public String sig;
    
    public String sn;
    
    public String st_param;
    
    public String st_type;
    
    public String sub_post_id;
    
    public String takephoto_num;
    
    public String tbs;
    
    public String tid;
    
    public String to_category_id;
    
    public String topic_id;
    
    public String transform_forums;
    
    public String v_fid;
    
    public String v_fname;
    
    public String vcode;
    
    public String vcode_md5;
    
    public String vcode_tag;
    
    public String vcode_type;
    
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
      this.transform_forums = param1DataReq.transform_forums;
      this.v_fid = param1DataReq.v_fid;
      this.v_fname = param1DataReq.v_fname;
      this.kw = param1DataReq.kw;
      this.is_barrage = param1DataReq.is_barrage;
      this.barrage_time = param1DataReq.barrage_time;
      this.st_param = param1DataReq.st_param;
      this.ptype = param1DataReq.ptype;
      this.ori_ugc_nid = param1DataReq.ori_ugc_nid;
      this.ori_ugc_vid = param1DataReq.ori_ugc_vid;
      this.ori_ugc_tid = param1DataReq.ori_ugc_tid;
      this.ori_ugc_type = param1DataReq.ori_ugc_type;
      this.is_location = param1DataReq.is_location;
      this.lat = param1DataReq.lat;
      this.lng = param1DataReq.lng;
      this.name = param1DataReq.name;
      this.sn = param1DataReq.sn;
      this.from_fourm_id = param1DataReq.from_fourm_id;
      this.tid = param1DataReq.tid;
      this.quote_id = param1DataReq.quote_id;
      this.is_twzhibo_thread = param1DataReq.is_twzhibo_thread;
      this.floor_num = param1DataReq.floor_num;
      this.repostid = param1DataReq.repostid;
      this.sub_post_id = param1DataReq.sub_post_id;
      this.is_ad = param1DataReq.is_ad;
      this.is_addition = param1DataReq.is_addition;
      this.is_giftpost = param1DataReq.is_giftpost;
      this.st_type = param1DataReq.st_type;
      this.post_from = param1DataReq.post_from;
      this.real_lat = param1DataReq.real_lat;
      this.real_lng = param1DataReq.real_lng;
      this.name_show = param1DataReq.name_show;
      this.is_works = param1DataReq.is_works;
      this.is_pictxt = param1DataReq.is_pictxt;
      this.is_story = param1DataReq.is_story;
      this.jid = param1DataReq.jid;
      this.jfrom = param1DataReq.jfrom;
      this.show_custom_figure = param1DataReq.show_custom_figure;
      this.from_category_id = param1DataReq.from_category_id;
      this.to_category_id = param1DataReq.to_category_id;
      this.is_show_bless = param1DataReq.is_show_bless;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
