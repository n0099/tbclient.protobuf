package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ANONYMOUS = "";
    public static final String DEFAULT_AUTHSID = "";
    public static final String DEFAULT_BARRAGE_TIME = "";
    public static final String DEFAULT_BOT_CONF = "";
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
    @ProtoField(tag = 68, type = Message.Datatype.STRING)
    public final String bot_conf;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String can_no_forum;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String comment_head;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1246common;
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
    public static final Integer DEFAULT_SHOW_CUSTOM_FIGURE = 0;
    public static final Integer DEFAULT_IS_SHOW_BLESS = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String anonymous;
        public String authsid;
        public String barrage_time;
        public String bot_conf;
        public String can_no_forum;
        public String comment_head;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1247common;
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

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1247common = dataReq.f1246common;
            this.authsid = dataReq.authsid;
            this.sig = dataReq.sig;
            this.tbs = dataReq.tbs;
            this.video_other = dataReq.video_other;
            this.anonymous = dataReq.anonymous;
            this.can_no_forum = dataReq.can_no_forum;
            this.is_feedback = dataReq.is_feedback;
            this.takephoto_num = dataReq.takephoto_num;
            this.entrance_type = dataReq.entrance_type;
            this.voice_md5 = dataReq.voice_md5;
            this.during_time = dataReq.during_time;
            this.vcode = dataReq.vcode;
            this.vcode_md5 = dataReq.vcode_md5;
            this.vcode_type = dataReq.vcode_type;
            this.vcode_tag = dataReq.vcode_tag;
            this.topic_id = dataReq.topic_id;
            this.new_vcode = dataReq.new_vcode;
            this.content = dataReq.content;
            this.reply_uid = dataReq.reply_uid;
            this.meme_text = dataReq.meme_text;
            this.meme_cont_sign = dataReq.meme_cont_sign;
            this.item_id = dataReq.item_id;
            this.comment_head = dataReq.comment_head;
            this.works_tag = dataReq.works_tag;
            this.fid = dataReq.fid;
            this.transform_forums = dataReq.transform_forums;
            this.v_fid = dataReq.v_fid;
            this.v_fname = dataReq.v_fname;
            this.kw = dataReq.kw;
            this.is_barrage = dataReq.is_barrage;
            this.barrage_time = dataReq.barrage_time;
            this.st_param = dataReq.st_param;
            this.ptype = dataReq.ptype;
            this.ori_ugc_nid = dataReq.ori_ugc_nid;
            this.ori_ugc_vid = dataReq.ori_ugc_vid;
            this.ori_ugc_tid = dataReq.ori_ugc_tid;
            this.ori_ugc_type = dataReq.ori_ugc_type;
            this.is_location = dataReq.is_location;
            this.lat = dataReq.lat;
            this.lng = dataReq.lng;
            this.name = dataReq.name;
            this.sn = dataReq.sn;
            this.from_fourm_id = dataReq.from_fourm_id;
            this.tid = dataReq.tid;
            this.quote_id = dataReq.quote_id;
            this.is_twzhibo_thread = dataReq.is_twzhibo_thread;
            this.floor_num = dataReq.floor_num;
            this.repostid = dataReq.repostid;
            this.sub_post_id = dataReq.sub_post_id;
            this.is_ad = dataReq.is_ad;
            this.is_addition = dataReq.is_addition;
            this.is_giftpost = dataReq.is_giftpost;
            this.st_type = dataReq.st_type;
            this.post_from = dataReq.post_from;
            this.real_lat = dataReq.real_lat;
            this.real_lng = dataReq.real_lng;
            this.name_show = dataReq.name_show;
            this.is_works = dataReq.is_works;
            this.is_pictxt = dataReq.is_pictxt;
            this.is_story = dataReq.is_story;
            this.jid = dataReq.jid;
            this.jfrom = dataReq.jfrom;
            this.show_custom_figure = dataReq.show_custom_figure;
            this.from_category_id = dataReq.from_category_id;
            this.to_category_id = dataReq.to_category_id;
            this.is_show_bless = dataReq.is_show_bless;
            this.bot_conf = dataReq.bot_conf;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1246common = builder.f1247common;
            String str = builder.authsid;
            if (str == null) {
                this.authsid = "";
            } else {
                this.authsid = str;
            }
            String str2 = builder.sig;
            if (str2 == null) {
                this.sig = "";
            } else {
                this.sig = str2;
            }
            String str3 = builder.tbs;
            if (str3 == null) {
                this.tbs = "";
            } else {
                this.tbs = str3;
            }
            String str4 = builder.video_other;
            if (str4 == null) {
                this.video_other = "";
            } else {
                this.video_other = str4;
            }
            String str5 = builder.anonymous;
            if (str5 == null) {
                this.anonymous = "";
            } else {
                this.anonymous = str5;
            }
            String str6 = builder.can_no_forum;
            if (str6 == null) {
                this.can_no_forum = "";
            } else {
                this.can_no_forum = str6;
            }
            String str7 = builder.is_feedback;
            if (str7 == null) {
                this.is_feedback = "";
            } else {
                this.is_feedback = str7;
            }
            String str8 = builder.takephoto_num;
            if (str8 == null) {
                this.takephoto_num = "";
            } else {
                this.takephoto_num = str8;
            }
            String str9 = builder.entrance_type;
            if (str9 == null) {
                this.entrance_type = "";
            } else {
                this.entrance_type = str9;
            }
            String str10 = builder.voice_md5;
            if (str10 == null) {
                this.voice_md5 = "";
            } else {
                this.voice_md5 = str10;
            }
            String str11 = builder.during_time;
            if (str11 == null) {
                this.during_time = "";
            } else {
                this.during_time = str11;
            }
            String str12 = builder.vcode;
            if (str12 == null) {
                this.vcode = "";
            } else {
                this.vcode = str12;
            }
            String str13 = builder.vcode_md5;
            if (str13 == null) {
                this.vcode_md5 = "";
            } else {
                this.vcode_md5 = str13;
            }
            String str14 = builder.vcode_type;
            if (str14 == null) {
                this.vcode_type = "";
            } else {
                this.vcode_type = str14;
            }
            String str15 = builder.vcode_tag;
            if (str15 == null) {
                this.vcode_tag = "";
            } else {
                this.vcode_tag = str15;
            }
            String str16 = builder.topic_id;
            if (str16 == null) {
                this.topic_id = "";
            } else {
                this.topic_id = str16;
            }
            String str17 = builder.new_vcode;
            if (str17 == null) {
                this.new_vcode = "";
            } else {
                this.new_vcode = str17;
            }
            String str18 = builder.content;
            if (str18 == null) {
                this.content = "";
            } else {
                this.content = str18;
            }
            String str19 = builder.reply_uid;
            if (str19 == null) {
                this.reply_uid = "";
            } else {
                this.reply_uid = str19;
            }
            String str20 = builder.meme_text;
            if (str20 == null) {
                this.meme_text = "";
            } else {
                this.meme_text = str20;
            }
            String str21 = builder.meme_cont_sign;
            if (str21 == null) {
                this.meme_cont_sign = "";
            } else {
                this.meme_cont_sign = str21;
            }
            String str22 = builder.item_id;
            if (str22 == null) {
                this.item_id = "";
            } else {
                this.item_id = str22;
            }
            String str23 = builder.comment_head;
            if (str23 == null) {
                this.comment_head = "";
            } else {
                this.comment_head = str23;
            }
            String str24 = builder.works_tag;
            if (str24 == null) {
                this.works_tag = "";
            } else {
                this.works_tag = str24;
            }
            String str25 = builder.fid;
            if (str25 == null) {
                this.fid = "";
            } else {
                this.fid = str25;
            }
            String str26 = builder.transform_forums;
            if (str26 == null) {
                this.transform_forums = "";
            } else {
                this.transform_forums = str26;
            }
            String str27 = builder.v_fid;
            if (str27 == null) {
                this.v_fid = "";
            } else {
                this.v_fid = str27;
            }
            String str28 = builder.v_fname;
            if (str28 == null) {
                this.v_fname = "";
            } else {
                this.v_fname = str28;
            }
            String str29 = builder.kw;
            if (str29 == null) {
                this.kw = "";
            } else {
                this.kw = str29;
            }
            String str30 = builder.is_barrage;
            if (str30 == null) {
                this.is_barrage = "";
            } else {
                this.is_barrage = str30;
            }
            String str31 = builder.barrage_time;
            if (str31 == null) {
                this.barrage_time = "";
            } else {
                this.barrage_time = str31;
            }
            String str32 = builder.st_param;
            if (str32 == null) {
                this.st_param = "";
            } else {
                this.st_param = str32;
            }
            String str33 = builder.ptype;
            if (str33 == null) {
                this.ptype = "";
            } else {
                this.ptype = str33;
            }
            String str34 = builder.ori_ugc_nid;
            if (str34 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str34;
            }
            String str35 = builder.ori_ugc_vid;
            if (str35 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str35;
            }
            String str36 = builder.ori_ugc_tid;
            if (str36 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str36;
            }
            String str37 = builder.ori_ugc_type;
            if (str37 == null) {
                this.ori_ugc_type = "";
            } else {
                this.ori_ugc_type = str37;
            }
            String str38 = builder.is_location;
            if (str38 == null) {
                this.is_location = "";
            } else {
                this.is_location = str38;
            }
            String str39 = builder.lat;
            if (str39 == null) {
                this.lat = "";
            } else {
                this.lat = str39;
            }
            String str40 = builder.lng;
            if (str40 == null) {
                this.lng = "";
            } else {
                this.lng = str40;
            }
            String str41 = builder.name;
            if (str41 == null) {
                this.name = "";
            } else {
                this.name = str41;
            }
            String str42 = builder.sn;
            if (str42 == null) {
                this.sn = "";
            } else {
                this.sn = str42;
            }
            String str43 = builder.from_fourm_id;
            if (str43 == null) {
                this.from_fourm_id = "";
            } else {
                this.from_fourm_id = str43;
            }
            String str44 = builder.tid;
            if (str44 == null) {
                this.tid = "";
            } else {
                this.tid = str44;
            }
            String str45 = builder.quote_id;
            if (str45 == null) {
                this.quote_id = "";
            } else {
                this.quote_id = str45;
            }
            String str46 = builder.is_twzhibo_thread;
            if (str46 == null) {
                this.is_twzhibo_thread = "";
            } else {
                this.is_twzhibo_thread = str46;
            }
            String str47 = builder.floor_num;
            if (str47 == null) {
                this.floor_num = "";
            } else {
                this.floor_num = str47;
            }
            String str48 = builder.repostid;
            if (str48 == null) {
                this.repostid = "";
            } else {
                this.repostid = str48;
            }
            String str49 = builder.sub_post_id;
            if (str49 == null) {
                this.sub_post_id = "";
            } else {
                this.sub_post_id = str49;
            }
            String str50 = builder.is_ad;
            if (str50 == null) {
                this.is_ad = "";
            } else {
                this.is_ad = str50;
            }
            String str51 = builder.is_addition;
            if (str51 == null) {
                this.is_addition = "";
            } else {
                this.is_addition = str51;
            }
            String str52 = builder.is_giftpost;
            if (str52 == null) {
                this.is_giftpost = "";
            } else {
                this.is_giftpost = str52;
            }
            String str53 = builder.st_type;
            if (str53 == null) {
                this.st_type = "";
            } else {
                this.st_type = str53;
            }
            String str54 = builder.post_from;
            if (str54 == null) {
                this.post_from = "";
            } else {
                this.post_from = str54;
            }
            String str55 = builder.real_lat;
            if (str55 == null) {
                this.real_lat = "";
            } else {
                this.real_lat = str55;
            }
            String str56 = builder.real_lng;
            if (str56 == null) {
                this.real_lng = "";
            } else {
                this.real_lng = str56;
            }
            String str57 = builder.name_show;
            if (str57 == null) {
                this.name_show = "";
            } else {
                this.name_show = str57;
            }
            String str58 = builder.is_works;
            if (str58 == null) {
                this.is_works = "";
            } else {
                this.is_works = str58;
            }
            String str59 = builder.is_pictxt;
            if (str59 == null) {
                this.is_pictxt = "";
            } else {
                this.is_pictxt = str59;
            }
            String str60 = builder.is_story;
            if (str60 == null) {
                this.is_story = "";
            } else {
                this.is_story = str60;
            }
            String str61 = builder.jid;
            if (str61 == null) {
                this.jid = "";
            } else {
                this.jid = str61;
            }
            String str62 = builder.jfrom;
            if (str62 == null) {
                this.jfrom = "";
            } else {
                this.jfrom = str62;
            }
            Integer num = builder.show_custom_figure;
            if (num == null) {
                this.show_custom_figure = DEFAULT_SHOW_CUSTOM_FIGURE;
            } else {
                this.show_custom_figure = num;
            }
            String str63 = builder.from_category_id;
            if (str63 == null) {
                this.from_category_id = "";
            } else {
                this.from_category_id = str63;
            }
            String str64 = builder.to_category_id;
            if (str64 == null) {
                this.to_category_id = "";
            } else {
                this.to_category_id = str64;
            }
            Integer num2 = builder.is_show_bless;
            if (num2 == null) {
                this.is_show_bless = DEFAULT_IS_SHOW_BLESS;
            } else {
                this.is_show_bless = num2;
            }
            String str65 = builder.bot_conf;
            if (str65 == null) {
                this.bot_conf = "";
                return;
            } else {
                this.bot_conf = str65;
                return;
            }
        }
        this.f1246common = builder.f1247common;
        this.authsid = builder.authsid;
        this.sig = builder.sig;
        this.tbs = builder.tbs;
        this.video_other = builder.video_other;
        this.anonymous = builder.anonymous;
        this.can_no_forum = builder.can_no_forum;
        this.is_feedback = builder.is_feedback;
        this.takephoto_num = builder.takephoto_num;
        this.entrance_type = builder.entrance_type;
        this.voice_md5 = builder.voice_md5;
        this.during_time = builder.during_time;
        this.vcode = builder.vcode;
        this.vcode_md5 = builder.vcode_md5;
        this.vcode_type = builder.vcode_type;
        this.vcode_tag = builder.vcode_tag;
        this.topic_id = builder.topic_id;
        this.new_vcode = builder.new_vcode;
        this.content = builder.content;
        this.reply_uid = builder.reply_uid;
        this.meme_text = builder.meme_text;
        this.meme_cont_sign = builder.meme_cont_sign;
        this.item_id = builder.item_id;
        this.comment_head = builder.comment_head;
        this.works_tag = builder.works_tag;
        this.fid = builder.fid;
        this.transform_forums = builder.transform_forums;
        this.v_fid = builder.v_fid;
        this.v_fname = builder.v_fname;
        this.kw = builder.kw;
        this.is_barrage = builder.is_barrage;
        this.barrage_time = builder.barrage_time;
        this.st_param = builder.st_param;
        this.ptype = builder.ptype;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.is_location = builder.is_location;
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.name = builder.name;
        this.sn = builder.sn;
        this.from_fourm_id = builder.from_fourm_id;
        this.tid = builder.tid;
        this.quote_id = builder.quote_id;
        this.is_twzhibo_thread = builder.is_twzhibo_thread;
        this.floor_num = builder.floor_num;
        this.repostid = builder.repostid;
        this.sub_post_id = builder.sub_post_id;
        this.is_ad = builder.is_ad;
        this.is_addition = builder.is_addition;
        this.is_giftpost = builder.is_giftpost;
        this.st_type = builder.st_type;
        this.post_from = builder.post_from;
        this.real_lat = builder.real_lat;
        this.real_lng = builder.real_lng;
        this.name_show = builder.name_show;
        this.is_works = builder.is_works;
        this.is_pictxt = builder.is_pictxt;
        this.is_story = builder.is_story;
        this.jid = builder.jid;
        this.jfrom = builder.jfrom;
        this.show_custom_figure = builder.show_custom_figure;
        this.from_category_id = builder.from_category_id;
        this.to_category_id = builder.to_category_id;
        this.is_show_bless = builder.is_show_bless;
        this.bot_conf = builder.bot_conf;
    }
}
