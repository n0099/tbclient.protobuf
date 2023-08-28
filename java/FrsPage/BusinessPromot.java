package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class BusinessPromot extends Message {
    public static final Integer DEFAULT_BAN_DIALOG;
    public static final String DEFAULT_COVER_URL = "";
    public static final String DEFAULT_DOWNLOAD_APPID = "";
    public static final String DEFAULT_DOWNLOAD_APPNAME = "";
    public static final String DEFAULT_DOWNLOAD_DEVELOPER = "";
    public static final String DEFAULT_DOWNLOAD_EFFECT = "";
    public static final String DEFAULT_DOWNLOAD_IMG = "";
    public static final String DEFAULT_DOWNLOAD_ITEM_ID = "";
    public static final String DEFAULT_DOWNLOAD_PACKAGE_NAME = "";
    public static final String DEFAULT_DOWNLOAD_PACKAGE_SIZE = "";
    public static final String DEFAULT_DOWNLOAD_PRIVACY_POLICY = "";
    public static final String DEFAULT_DOWNLOAD_URL = "";
    public static final String DEFAULT_DOWNLOAD_USER_POWER = "";
    public static final String DEFAULT_DOWNLOAD_VERSION = "";
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_IMG_POPUP = "";
    public static final Boolean DEFAULT_IS_AD;
    public static final Boolean DEFAULT_IS_ALLOW_SHAKE;
    public static final Boolean DEFAULT_IS_DOWNLOAD;
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_THREAD_ID = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VIDEO_URL = "";
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer ban_dialog;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<BusinessPromotCommentList> comment_list;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String cover_url;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String download_appid;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String download_appname;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String download_developer;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String download_effect;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String download_img;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String download_item_id;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String download_package_name;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String download_package_size;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String download_privacy_policy;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String download_url;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String download_user_power;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String download_version;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_popup;
    @ProtoField(tag = 14, type = Message.Datatype.BOOL)
    public final Boolean is_ad;
    @ProtoField(tag = 13, type = Message.Datatype.BOOL)
    public final Boolean is_allow_shake;
    @ProtoField(tag = 24, type = Message.Datatype.BOOL)
    public final Boolean is_download;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer join_num;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
    public final List<String> third_statistics_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String video_url;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_JOIN_NUM = 0;
    public static final List<BusinessPromotCommentList> DEFAULT_COMMENT_LIST = Collections.emptyList();
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final List<String> DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BusinessPromot> {
        public Integer ban_dialog;
        public List<BusinessPromotCommentList> comment_list;
        public String cover_url;
        public String download_appid;
        public String download_appname;
        public String download_developer;
        public String download_effect;
        public String download_img;
        public String download_item_id;
        public String download_package_name;
        public String download_package_size;
        public String download_privacy_policy;
        public String download_url;
        public String download_user_power;
        public String download_version;
        public Long id;
        public String img;
        public String img_popup;
        public Boolean is_ad;
        public Boolean is_allow_shake;
        public Boolean is_download;
        public Integer join_num;
        public String package_name;
        public String schema;
        public List<String> third_statistics_url;
        public String thread_id;
        public Integer thread_type;
        public String title;
        public Integer type;
        public String url;
        public String video_url;

        public Builder() {
        }

        public Builder(BusinessPromot businessPromot) {
            super(businessPromot);
            if (businessPromot == null) {
                return;
            }
            this.title = businessPromot.title;
            this.img = businessPromot.img;
            this.img_popup = businessPromot.img_popup;
            this.type = businessPromot.type;
            this.thread_id = businessPromot.thread_id;
            this.url = businessPromot.url;
            this.join_num = businessPromot.join_num;
            this.comment_list = Message.copyOf(businessPromot.comment_list);
            this.id = businessPromot.id;
            this.thread_type = businessPromot.thread_type;
            this.schema = businessPromot.schema;
            this.third_statistics_url = Message.copyOf(businessPromot.third_statistics_url);
            this.is_allow_shake = businessPromot.is_allow_shake;
            this.is_ad = businessPromot.is_ad;
            this.package_name = businessPromot.package_name;
            this.download_appname = businessPromot.download_appname;
            this.download_developer = businessPromot.download_developer;
            this.download_package_size = businessPromot.download_package_size;
            this.download_privacy_policy = businessPromot.download_privacy_policy;
            this.download_url = businessPromot.download_url;
            this.download_img = businessPromot.download_img;
            this.download_version = businessPromot.download_version;
            this.download_user_power = businessPromot.download_user_power;
            this.is_download = businessPromot.is_download;
            this.download_item_id = businessPromot.download_item_id;
            this.download_package_name = businessPromot.download_package_name;
            this.download_appid = businessPromot.download_appid;
            this.cover_url = businessPromot.cover_url;
            this.video_url = businessPromot.video_url;
            this.ban_dialog = businessPromot.ban_dialog;
            this.download_effect = businessPromot.download_effect;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromot build(boolean z) {
            return new BusinessPromot(this, z);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_ALLOW_SHAKE = bool;
        DEFAULT_IS_AD = bool;
        DEFAULT_IS_DOWNLOAD = bool;
        DEFAULT_BAN_DIALOG = 0;
    }

    public BusinessPromot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.img;
            if (str2 == null) {
                this.img = "";
            } else {
                this.img = str2;
            }
            String str3 = builder.img_popup;
            if (str3 == null) {
                this.img_popup = "";
            } else {
                this.img_popup = str3;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str4 = builder.thread_id;
            if (str4 == null) {
                this.thread_id = "";
            } else {
                this.thread_id = str4;
            }
            String str5 = builder.url;
            if (str5 == null) {
                this.url = "";
            } else {
                this.url = str5;
            }
            Integer num2 = builder.join_num;
            if (num2 == null) {
                this.join_num = DEFAULT_JOIN_NUM;
            } else {
                this.join_num = num2;
            }
            List<BusinessPromotCommentList> list = builder.comment_list;
            if (list == null) {
                this.comment_list = DEFAULT_COMMENT_LIST;
            } else {
                this.comment_list = Message.immutableCopyOf(list);
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            String str6 = builder.schema;
            if (str6 == null) {
                this.schema = "";
            } else {
                this.schema = str6;
            }
            List<String> list2 = builder.third_statistics_url;
            if (list2 == null) {
                this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
            } else {
                this.third_statistics_url = Message.immutableCopyOf(list2);
            }
            Boolean bool = builder.is_allow_shake;
            if (bool == null) {
                this.is_allow_shake = DEFAULT_IS_ALLOW_SHAKE;
            } else {
                this.is_allow_shake = bool;
            }
            Boolean bool2 = builder.is_ad;
            if (bool2 == null) {
                this.is_ad = DEFAULT_IS_AD;
            } else {
                this.is_ad = bool2;
            }
            String str7 = builder.package_name;
            if (str7 == null) {
                this.package_name = "";
            } else {
                this.package_name = str7;
            }
            String str8 = builder.download_appname;
            if (str8 == null) {
                this.download_appname = "";
            } else {
                this.download_appname = str8;
            }
            String str9 = builder.download_developer;
            if (str9 == null) {
                this.download_developer = "";
            } else {
                this.download_developer = str9;
            }
            String str10 = builder.download_package_size;
            if (str10 == null) {
                this.download_package_size = "";
            } else {
                this.download_package_size = str10;
            }
            String str11 = builder.download_privacy_policy;
            if (str11 == null) {
                this.download_privacy_policy = "";
            } else {
                this.download_privacy_policy = str11;
            }
            String str12 = builder.download_url;
            if (str12 == null) {
                this.download_url = "";
            } else {
                this.download_url = str12;
            }
            String str13 = builder.download_img;
            if (str13 == null) {
                this.download_img = "";
            } else {
                this.download_img = str13;
            }
            String str14 = builder.download_version;
            if (str14 == null) {
                this.download_version = "";
            } else {
                this.download_version = str14;
            }
            String str15 = builder.download_user_power;
            if (str15 == null) {
                this.download_user_power = "";
            } else {
                this.download_user_power = str15;
            }
            Boolean bool3 = builder.is_download;
            if (bool3 == null) {
                this.is_download = DEFAULT_IS_DOWNLOAD;
            } else {
                this.is_download = bool3;
            }
            String str16 = builder.download_item_id;
            if (str16 == null) {
                this.download_item_id = "";
            } else {
                this.download_item_id = str16;
            }
            String str17 = builder.download_package_name;
            if (str17 == null) {
                this.download_package_name = "";
            } else {
                this.download_package_name = str17;
            }
            String str18 = builder.download_appid;
            if (str18 == null) {
                this.download_appid = "";
            } else {
                this.download_appid = str18;
            }
            String str19 = builder.cover_url;
            if (str19 == null) {
                this.cover_url = "";
            } else {
                this.cover_url = str19;
            }
            String str20 = builder.video_url;
            if (str20 == null) {
                this.video_url = "";
            } else {
                this.video_url = str20;
            }
            Integer num4 = builder.ban_dialog;
            if (num4 == null) {
                this.ban_dialog = DEFAULT_BAN_DIALOG;
            } else {
                this.ban_dialog = num4;
            }
            String str21 = builder.download_effect;
            if (str21 == null) {
                this.download_effect = "";
                return;
            } else {
                this.download_effect = str21;
                return;
            }
        }
        this.title = builder.title;
        this.img = builder.img;
        this.img_popup = builder.img_popup;
        this.type = builder.type;
        this.thread_id = builder.thread_id;
        this.url = builder.url;
        this.join_num = builder.join_num;
        this.comment_list = Message.immutableCopyOf(builder.comment_list);
        this.id = builder.id;
        this.thread_type = builder.thread_type;
        this.schema = builder.schema;
        this.third_statistics_url = Message.immutableCopyOf(builder.third_statistics_url);
        this.is_allow_shake = builder.is_allow_shake;
        this.is_ad = builder.is_ad;
        this.package_name = builder.package_name;
        this.download_appname = builder.download_appname;
        this.download_developer = builder.download_developer;
        this.download_package_size = builder.download_package_size;
        this.download_privacy_policy = builder.download_privacy_policy;
        this.download_url = builder.download_url;
        this.download_img = builder.download_img;
        this.download_version = builder.download_version;
        this.download_user_power = builder.download_user_power;
        this.is_download = builder.is_download;
        this.download_item_id = builder.download_item_id;
        this.download_package_name = builder.download_package_name;
        this.download_appid = builder.download_appid;
        this.cover_url = builder.cover_url;
        this.video_url = builder.video_url;
        this.ban_dialog = builder.ban_dialog;
        this.download_effect = builder.download_effect;
    }
}
