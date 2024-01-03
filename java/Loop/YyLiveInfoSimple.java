package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.YyExt;
/* loaded from: classes2.dex */
public final class YyLiveInfoSimple extends Message {
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_FEED_ID = "";
    public static final String DEFAULT_ICON_SCHEME = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer author_type;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer day_max_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer desc_global_max_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer disappear_second;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer disappear_type;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String feed_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer min_step_second;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer remind_type;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long room_id;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer show_page;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer single_open_max_num;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 13)
    public final YyExt yy_ext;
    public static final Integer DEFAULT_DISAPPEAR_TYPE = 0;
    public static final Integer DEFAULT_DISAPPEAR_SECOND = 0;
    public static final Integer DEFAULT_DESC_GLOBAL_MAX_NUM = 0;
    public static final Integer DEFAULT_SINGLE_OPEN_MAX_NUM = 0;
    public static final Integer DEFAULT_DAY_MAX_NUM = 0;
    public static final Integer DEFAULT_MIN_STEP_SECOND = 0;
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Integer DEFAULT_REMIND_TYPE = 0;
    public static final Integer DEFAULT_SHOW_PAGE = 0;
    public static final Integer DEFAULT_AUTHOR_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<YyLiveInfoSimple> {
        public Integer author_type;
        public String btn_text;
        public Integer day_max_num;
        public String desc;
        public Integer desc_global_max_num;
        public Integer disappear_second;
        public Integer disappear_type;
        public String feed_id;
        public String icon_scheme;
        public String icon_url;
        public Integer min_step_second;
        public String portrait;
        public Integer remind_type;
        public Long room_id;
        public Integer show_page;
        public Integer single_open_max_num;
        public String title;
        public String user_name;
        public YyExt yy_ext;

        public Builder() {
        }

        public Builder(YyLiveInfoSimple yyLiveInfoSimple) {
            super(yyLiveInfoSimple);
            if (yyLiveInfoSimple == null) {
                return;
            }
            this.icon_url = yyLiveInfoSimple.icon_url;
            this.icon_scheme = yyLiveInfoSimple.icon_scheme;
            this.disappear_type = yyLiveInfoSimple.disappear_type;
            this.disappear_second = yyLiveInfoSimple.disappear_second;
            this.desc = yyLiveInfoSimple.desc;
            this.desc_global_max_num = yyLiveInfoSimple.desc_global_max_num;
            this.single_open_max_num = yyLiveInfoSimple.single_open_max_num;
            this.day_max_num = yyLiveInfoSimple.day_max_num;
            this.min_step_second = yyLiveInfoSimple.min_step_second;
            this.user_name = yyLiveInfoSimple.user_name;
            this.portrait = yyLiveInfoSimple.portrait;
            this.title = yyLiveInfoSimple.title;
            this.yy_ext = yyLiveInfoSimple.yy_ext;
            this.room_id = yyLiveInfoSimple.room_id;
            this.btn_text = yyLiveInfoSimple.btn_text;
            this.feed_id = yyLiveInfoSimple.feed_id;
            this.remind_type = yyLiveInfoSimple.remind_type;
            this.show_page = yyLiveInfoSimple.show_page;
            this.author_type = yyLiveInfoSimple.author_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public YyLiveInfoSimple build(boolean z) {
            return new YyLiveInfoSimple(this, z);
        }
    }

    public YyLiveInfoSimple(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.icon_scheme;
            if (str2 == null) {
                this.icon_scheme = "";
            } else {
                this.icon_scheme = str2;
            }
            Integer num = builder.disappear_type;
            if (num == null) {
                this.disappear_type = DEFAULT_DISAPPEAR_TYPE;
            } else {
                this.disappear_type = num;
            }
            Integer num2 = builder.disappear_second;
            if (num2 == null) {
                this.disappear_second = DEFAULT_DISAPPEAR_SECOND;
            } else {
                this.disappear_second = num2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            Integer num3 = builder.desc_global_max_num;
            if (num3 == null) {
                this.desc_global_max_num = DEFAULT_DESC_GLOBAL_MAX_NUM;
            } else {
                this.desc_global_max_num = num3;
            }
            Integer num4 = builder.single_open_max_num;
            if (num4 == null) {
                this.single_open_max_num = DEFAULT_SINGLE_OPEN_MAX_NUM;
            } else {
                this.single_open_max_num = num4;
            }
            Integer num5 = builder.day_max_num;
            if (num5 == null) {
                this.day_max_num = DEFAULT_DAY_MAX_NUM;
            } else {
                this.day_max_num = num5;
            }
            Integer num6 = builder.min_step_second;
            if (num6 == null) {
                this.min_step_second = DEFAULT_MIN_STEP_SECOND;
            } else {
                this.min_step_second = num6;
            }
            String str4 = builder.user_name;
            if (str4 == null) {
                this.user_name = "";
            } else {
                this.user_name = str4;
            }
            String str5 = builder.portrait;
            if (str5 == null) {
                this.portrait = "";
            } else {
                this.portrait = str5;
            }
            String str6 = builder.title;
            if (str6 == null) {
                this.title = "";
            } else {
                this.title = str6;
            }
            this.yy_ext = builder.yy_ext;
            Long l = builder.room_id;
            if (l == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = l;
            }
            String str7 = builder.btn_text;
            if (str7 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str7;
            }
            String str8 = builder.feed_id;
            if (str8 == null) {
                this.feed_id = "";
            } else {
                this.feed_id = str8;
            }
            Integer num7 = builder.remind_type;
            if (num7 == null) {
                this.remind_type = DEFAULT_REMIND_TYPE;
            } else {
                this.remind_type = num7;
            }
            Integer num8 = builder.show_page;
            if (num8 == null) {
                this.show_page = DEFAULT_SHOW_PAGE;
            } else {
                this.show_page = num8;
            }
            Integer num9 = builder.author_type;
            if (num9 == null) {
                this.author_type = DEFAULT_AUTHOR_TYPE;
                return;
            } else {
                this.author_type = num9;
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.icon_scheme = builder.icon_scheme;
        this.disappear_type = builder.disappear_type;
        this.disappear_second = builder.disappear_second;
        this.desc = builder.desc;
        this.desc_global_max_num = builder.desc_global_max_num;
        this.single_open_max_num = builder.single_open_max_num;
        this.day_max_num = builder.day_max_num;
        this.min_step_second = builder.min_step_second;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.title = builder.title;
        this.yy_ext = builder.yy_ext;
        this.room_id = builder.room_id;
        this.btn_text = builder.btn_text;
        this.feed_id = builder.feed_id;
        this.remind_type = builder.remind_type;
        this.show_page = builder.show_page;
        this.author_type = builder.author_type;
    }
}
