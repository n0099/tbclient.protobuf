package tbclient.AddThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
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
    public static final String DEFAULT_QUESTION_TAG_ID = "";
    public static final String DEFAULT_REAL_LAT = "";
    public static final String DEFAULT_REAL_LNG = "";
    public static final String DEFAULT_RECOMMEND_EXT = "";
    public static final String DEFAULT_REPLY_UID = "";
    public static final String DEFAULT_SHARE_ABSTRACT = "";
    public static final String DEFAULT_SHARE_H5_URL = "";
    public static final String DEFAULT_SHARE_IMAGE = "";
    public static final String DEFAULT_SHARE_NAWS_APP_KEY = "";
    public static final String DEFAULT_SHARE_NAWS_PATH = "";
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

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1254common;
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
    @ProtoField(tag = 85, type = Message.Datatype.INT32)
    public final Integer is_create_tag;
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
    @ProtoField(tag = 83, type = Message.Datatype.INT32)
    public final Integer is_question;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String is_repost_to_dynamic;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String is_share;
    @ProtoField(tag = 87, type = Message.Datatype.INT32)
    public final Integer is_show_bless;
    @ProtoField(tag = 76, type = Message.Datatype.STRING)
    public final String is_works;
    @ProtoField(tag = 86, type = Message.Datatype.INT32)
    public final Integer is_xiuxiu_thread;
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
    @ProtoField(tag = 84, type = Message.Datatype.STRING)
    public final String question_tag_id;
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
    public final String share_naws_app_key;
    @ProtoField(tag = 72, type = Message.Datatype.STRING)
    public final String share_naws_path;
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
    public static final Integer DEFAULT_SHOW_CUSTOM_FIGURE = 0;
    public static final Integer DEFAULT_IS_QUESTION = 0;
    public static final Integer DEFAULT_IS_CREATE_TAG = 0;
    public static final Integer DEFAULT_IS_XIUXIU_THREAD = 0;
    public static final Integer DEFAULT_IS_SHOW_BLESS = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String anonymous;
        public String authsid;
        public String call_from;
        public String can_no_forum;
        public String comment_head;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1255common;
        public String content;
        public String during_time;
        public String entrance_type;
        public String fid;
        public String first_frame_pid;
        public String from_category_id;
        public String from_tid;
        public String is_article;
        public String is_bottle;
        public Integer is_create_tag;
        public String is_feedback;
        public String is_forum_business_account;
        public String is_general_tab;
        public String is_hide;
        public String is_link_thread;
        public String is_location;
        public String is_ntitle;
        public String is_pictxt;
        public Integer is_question;
        public String is_repost_to_dynamic;
        public String is_share;
        public Integer is_show_bless;
        public String is_works;
        public Integer is_xiuxiu_thread;
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
        public String question_tag_id;
        public String real_lat;
        public String real_lng;
        public String recommend_ext;
        public String reply_uid;
        public String share_abstract;
        public String share_h5_url;
        public String share_image;
        public String share_naws_app_key;
        public String share_naws_path;
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

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1255common = dataReq.f1254common;
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
            this.kw = dataReq.kw;
            this.transform_forums = dataReq.transform_forums;
            this.is_hide = dataReq.is_hide;
            this.is_repost_to_dynamic = dataReq.is_repost_to_dynamic;
            this.video_id = dataReq.video_id;
            this.origin_video_cover = dataReq.origin_video_cover;
            this.origin_video_title = dataReq.origin_video_title;
            this.is_share = dataReq.is_share;
            this.from_tid = dataReq.from_tid;
            this.pro_zone = dataReq.pro_zone;
            this.call_from = dataReq.call_from;
            this.title = dataReq.title;
            this.video_abstract = dataReq.video_abstract;
            this.post_prefix = dataReq.post_prefix;
            this.is_ntitle = dataReq.is_ntitle;
            this.st_type = dataReq.st_type;
            this.lbs = dataReq.lbs;
            this.is_location = dataReq.is_location;
            this.lat = dataReq.lat;
            this.lng = dataReq.lng;
            this.name = dataReq.name;
            this.sn = dataReq.sn;
            this.is_bottle = dataReq.is_bottle;
            this.recommend_ext = dataReq.recommend_ext;
            this.link_url = dataReq.link_url;
            this.link_url_code = dataReq.link_url_code;
            this.is_link_thread = dataReq.is_link_thread;
            this.ori_ugc_nid = dataReq.ori_ugc_nid;
            this.ori_ugc_vid = dataReq.ori_ugc_vid;
            this.ori_ugc_tid = dataReq.ori_ugc_tid;
            this.ori_ugc_type = dataReq.ori_ugc_type;
            this.tab_name = dataReq.tab_name;
            this.tab_id = dataReq.tab_id;
            this.is_general_tab = dataReq.is_general_tab;
            this.is_forum_business_account = dataReq.is_forum_business_account;
            this.thread_type = dataReq.thread_type;
            this.tbopen_app_key = dataReq.tbopen_app_key;
            this.tbopen_app_icon = dataReq.tbopen_app_icon;
            this.tbopen_app_name = dataReq.tbopen_app_name;
            this.share_abstract = dataReq.share_abstract;
            this.share_image = dataReq.share_image;
            this.share_h5_url = dataReq.share_h5_url;
            this.share_naws_app_key = dataReq.share_naws_app_key;
            this.share_naws_path = dataReq.share_naws_path;
            this.real_lat = dataReq.real_lat;
            this.real_lng = dataReq.real_lng;
            this.name_show = dataReq.name_show;
            this.is_works = dataReq.is_works;
            this.is_pictxt = dataReq.is_pictxt;
            this.first_frame_pid = dataReq.first_frame_pid;
            this.is_article = dataReq.is_article;
            this.show_custom_figure = dataReq.show_custom_figure;
            this.from_category_id = dataReq.from_category_id;
            this.to_category_id = dataReq.to_category_id;
            this.is_question = dataReq.is_question;
            this.question_tag_id = dataReq.question_tag_id;
            this.is_create_tag = dataReq.is_create_tag;
            this.is_xiuxiu_thread = dataReq.is_xiuxiu_thread;
            this.is_show_bless = dataReq.is_show_bless;
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
            this.f1254common = builder.f1255common;
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
            String str26 = builder.kw;
            if (str26 == null) {
                this.kw = "";
            } else {
                this.kw = str26;
            }
            String str27 = builder.transform_forums;
            if (str27 == null) {
                this.transform_forums = "";
            } else {
                this.transform_forums = str27;
            }
            String str28 = builder.is_hide;
            if (str28 == null) {
                this.is_hide = "";
            } else {
                this.is_hide = str28;
            }
            String str29 = builder.is_repost_to_dynamic;
            if (str29 == null) {
                this.is_repost_to_dynamic = "";
            } else {
                this.is_repost_to_dynamic = str29;
            }
            String str30 = builder.video_id;
            if (str30 == null) {
                this.video_id = "";
            } else {
                this.video_id = str30;
            }
            String str31 = builder.origin_video_cover;
            if (str31 == null) {
                this.origin_video_cover = "";
            } else {
                this.origin_video_cover = str31;
            }
            String str32 = builder.origin_video_title;
            if (str32 == null) {
                this.origin_video_title = "";
            } else {
                this.origin_video_title = str32;
            }
            String str33 = builder.is_share;
            if (str33 == null) {
                this.is_share = "";
            } else {
                this.is_share = str33;
            }
            String str34 = builder.from_tid;
            if (str34 == null) {
                this.from_tid = "";
            } else {
                this.from_tid = str34;
            }
            String str35 = builder.pro_zone;
            if (str35 == null) {
                this.pro_zone = "";
            } else {
                this.pro_zone = str35;
            }
            String str36 = builder.call_from;
            if (str36 == null) {
                this.call_from = "";
            } else {
                this.call_from = str36;
            }
            String str37 = builder.title;
            if (str37 == null) {
                this.title = "";
            } else {
                this.title = str37;
            }
            String str38 = builder.video_abstract;
            if (str38 == null) {
                this.video_abstract = "";
            } else {
                this.video_abstract = str38;
            }
            String str39 = builder.post_prefix;
            if (str39 == null) {
                this.post_prefix = "";
            } else {
                this.post_prefix = str39;
            }
            String str40 = builder.is_ntitle;
            if (str40 == null) {
                this.is_ntitle = "";
            } else {
                this.is_ntitle = str40;
            }
            String str41 = builder.st_type;
            if (str41 == null) {
                this.st_type = "";
            } else {
                this.st_type = str41;
            }
            String str42 = builder.lbs;
            if (str42 == null) {
                this.lbs = "";
            } else {
                this.lbs = str42;
            }
            String str43 = builder.is_location;
            if (str43 == null) {
                this.is_location = "";
            } else {
                this.is_location = str43;
            }
            String str44 = builder.lat;
            if (str44 == null) {
                this.lat = "";
            } else {
                this.lat = str44;
            }
            String str45 = builder.lng;
            if (str45 == null) {
                this.lng = "";
            } else {
                this.lng = str45;
            }
            String str46 = builder.name;
            if (str46 == null) {
                this.name = "";
            } else {
                this.name = str46;
            }
            String str47 = builder.sn;
            if (str47 == null) {
                this.sn = "";
            } else {
                this.sn = str47;
            }
            String str48 = builder.is_bottle;
            if (str48 == null) {
                this.is_bottle = "";
            } else {
                this.is_bottle = str48;
            }
            String str49 = builder.recommend_ext;
            if (str49 == null) {
                this.recommend_ext = "";
            } else {
                this.recommend_ext = str49;
            }
            String str50 = builder.link_url;
            if (str50 == null) {
                this.link_url = "";
            } else {
                this.link_url = str50;
            }
            String str51 = builder.link_url_code;
            if (str51 == null) {
                this.link_url_code = "";
            } else {
                this.link_url_code = str51;
            }
            String str52 = builder.is_link_thread;
            if (str52 == null) {
                this.is_link_thread = "";
            } else {
                this.is_link_thread = str52;
            }
            String str53 = builder.ori_ugc_nid;
            if (str53 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str53;
            }
            String str54 = builder.ori_ugc_vid;
            if (str54 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str54;
            }
            String str55 = builder.ori_ugc_tid;
            if (str55 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str55;
            }
            String str56 = builder.ori_ugc_type;
            if (str56 == null) {
                this.ori_ugc_type = "";
            } else {
                this.ori_ugc_type = str56;
            }
            String str57 = builder.tab_name;
            if (str57 == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str57;
            }
            String str58 = builder.tab_id;
            if (str58 == null) {
                this.tab_id = "";
            } else {
                this.tab_id = str58;
            }
            String str59 = builder.is_general_tab;
            if (str59 == null) {
                this.is_general_tab = "";
            } else {
                this.is_general_tab = str59;
            }
            String str60 = builder.is_forum_business_account;
            if (str60 == null) {
                this.is_forum_business_account = "";
            } else {
                this.is_forum_business_account = str60;
            }
            String str61 = builder.thread_type;
            if (str61 == null) {
                this.thread_type = "";
            } else {
                this.thread_type = str61;
            }
            String str62 = builder.tbopen_app_key;
            if (str62 == null) {
                this.tbopen_app_key = "";
            } else {
                this.tbopen_app_key = str62;
            }
            String str63 = builder.tbopen_app_icon;
            if (str63 == null) {
                this.tbopen_app_icon = "";
            } else {
                this.tbopen_app_icon = str63;
            }
            String str64 = builder.tbopen_app_name;
            if (str64 == null) {
                this.tbopen_app_name = "";
            } else {
                this.tbopen_app_name = str64;
            }
            String str65 = builder.share_abstract;
            if (str65 == null) {
                this.share_abstract = "";
            } else {
                this.share_abstract = str65;
            }
            String str66 = builder.share_image;
            if (str66 == null) {
                this.share_image = "";
            } else {
                this.share_image = str66;
            }
            String str67 = builder.share_h5_url;
            if (str67 == null) {
                this.share_h5_url = "";
            } else {
                this.share_h5_url = str67;
            }
            String str68 = builder.share_naws_app_key;
            if (str68 == null) {
                this.share_naws_app_key = "";
            } else {
                this.share_naws_app_key = str68;
            }
            String str69 = builder.share_naws_path;
            if (str69 == null) {
                this.share_naws_path = "";
            } else {
                this.share_naws_path = str69;
            }
            String str70 = builder.real_lat;
            if (str70 == null) {
                this.real_lat = "";
            } else {
                this.real_lat = str70;
            }
            String str71 = builder.real_lng;
            if (str71 == null) {
                this.real_lng = "";
            } else {
                this.real_lng = str71;
            }
            String str72 = builder.name_show;
            if (str72 == null) {
                this.name_show = "";
            } else {
                this.name_show = str72;
            }
            String str73 = builder.is_works;
            if (str73 == null) {
                this.is_works = "";
            } else {
                this.is_works = str73;
            }
            String str74 = builder.is_pictxt;
            if (str74 == null) {
                this.is_pictxt = "";
            } else {
                this.is_pictxt = str74;
            }
            String str75 = builder.first_frame_pid;
            if (str75 == null) {
                this.first_frame_pid = "";
            } else {
                this.first_frame_pid = str75;
            }
            String str76 = builder.is_article;
            if (str76 == null) {
                this.is_article = "";
            } else {
                this.is_article = str76;
            }
            Integer num = builder.show_custom_figure;
            if (num == null) {
                this.show_custom_figure = DEFAULT_SHOW_CUSTOM_FIGURE;
            } else {
                this.show_custom_figure = num;
            }
            String str77 = builder.from_category_id;
            if (str77 == null) {
                this.from_category_id = "";
            } else {
                this.from_category_id = str77;
            }
            String str78 = builder.to_category_id;
            if (str78 == null) {
                this.to_category_id = "";
            } else {
                this.to_category_id = str78;
            }
            Integer num2 = builder.is_question;
            if (num2 == null) {
                this.is_question = DEFAULT_IS_QUESTION;
            } else {
                this.is_question = num2;
            }
            String str79 = builder.question_tag_id;
            if (str79 == null) {
                this.question_tag_id = "";
            } else {
                this.question_tag_id = str79;
            }
            Integer num3 = builder.is_create_tag;
            if (num3 == null) {
                this.is_create_tag = DEFAULT_IS_CREATE_TAG;
            } else {
                this.is_create_tag = num3;
            }
            Integer num4 = builder.is_xiuxiu_thread;
            if (num4 == null) {
                this.is_xiuxiu_thread = DEFAULT_IS_XIUXIU_THREAD;
            } else {
                this.is_xiuxiu_thread = num4;
            }
            Integer num5 = builder.is_show_bless;
            if (num5 == null) {
                this.is_show_bless = DEFAULT_IS_SHOW_BLESS;
                return;
            } else {
                this.is_show_bless = num5;
                return;
            }
        }
        this.f1254common = builder.f1255common;
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
        this.kw = builder.kw;
        this.transform_forums = builder.transform_forums;
        this.is_hide = builder.is_hide;
        this.is_repost_to_dynamic = builder.is_repost_to_dynamic;
        this.video_id = builder.video_id;
        this.origin_video_cover = builder.origin_video_cover;
        this.origin_video_title = builder.origin_video_title;
        this.is_share = builder.is_share;
        this.from_tid = builder.from_tid;
        this.pro_zone = builder.pro_zone;
        this.call_from = builder.call_from;
        this.title = builder.title;
        this.video_abstract = builder.video_abstract;
        this.post_prefix = builder.post_prefix;
        this.is_ntitle = builder.is_ntitle;
        this.st_type = builder.st_type;
        this.lbs = builder.lbs;
        this.is_location = builder.is_location;
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.name = builder.name;
        this.sn = builder.sn;
        this.is_bottle = builder.is_bottle;
        this.recommend_ext = builder.recommend_ext;
        this.link_url = builder.link_url;
        this.link_url_code = builder.link_url_code;
        this.is_link_thread = builder.is_link_thread;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.tab_name = builder.tab_name;
        this.tab_id = builder.tab_id;
        this.is_general_tab = builder.is_general_tab;
        this.is_forum_business_account = builder.is_forum_business_account;
        this.thread_type = builder.thread_type;
        this.tbopen_app_key = builder.tbopen_app_key;
        this.tbopen_app_icon = builder.tbopen_app_icon;
        this.tbopen_app_name = builder.tbopen_app_name;
        this.share_abstract = builder.share_abstract;
        this.share_image = builder.share_image;
        this.share_h5_url = builder.share_h5_url;
        this.share_naws_app_key = builder.share_naws_app_key;
        this.share_naws_path = builder.share_naws_path;
        this.real_lat = builder.real_lat;
        this.real_lng = builder.real_lng;
        this.name_show = builder.name_show;
        this.is_works = builder.is_works;
        this.is_pictxt = builder.is_pictxt;
        this.first_frame_pid = builder.first_frame_pid;
        this.is_article = builder.is_article;
        this.show_custom_figure = builder.show_custom_figure;
        this.from_category_id = builder.from_category_id;
        this.to_category_id = builder.to_category_id;
        this.is_question = builder.is_question;
        this.question_tag_id = builder.question_tag_id;
        this.is_create_tag = builder.is_create_tag;
        this.is_xiuxiu_thread = builder.is_xiuxiu_thread;
        this.is_show_bless = builder.is_show_bless;
    }
}
