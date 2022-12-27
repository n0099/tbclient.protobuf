package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class YyExt extends Message {
    public static final String DEFAULT_FEED_ID = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_IS_YY_GAME = 0;
    public static final String DEFAULT_RANK_SHOW = "";
    public static final String DEFAULT_SID = "";
    public static final String DEFAULT_SSID = "";
    public static final String DEFAULT_STREAM_INFO = "";
    public static final String DEFAULT_TEMPLATE_ID = "";
    public static final String DEFAULT_YY_UID = "";
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String feed_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_yy_game;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String rank_show;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String sid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ssid;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String stream_info;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String template_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String yy_uid;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<YyExt> {
        public String feed_id;
        public String icon_url;
        public Integer is_yy_game;
        public String rank_show;
        public String sid;
        public String ssid;
        public String stream_info;
        public String template_id;
        public String yy_uid;

        public Builder() {
        }

        public Builder(YyExt yyExt) {
            super(yyExt);
            if (yyExt == null) {
                return;
            }
            this.sid = yyExt.sid;
            this.ssid = yyExt.ssid;
            this.template_id = yyExt.template_id;
            this.yy_uid = yyExt.yy_uid;
            this.is_yy_game = yyExt.is_yy_game;
            this.stream_info = yyExt.stream_info;
            this.rank_show = yyExt.rank_show;
            this.icon_url = yyExt.icon_url;
            this.feed_id = yyExt.feed_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public YyExt build(boolean z) {
            return new YyExt(this, z);
        }
    }

    public YyExt(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.sid;
            if (str == null) {
                this.sid = "";
            } else {
                this.sid = str;
            }
            String str2 = builder.ssid;
            if (str2 == null) {
                this.ssid = "";
            } else {
                this.ssid = str2;
            }
            String str3 = builder.template_id;
            if (str3 == null) {
                this.template_id = "";
            } else {
                this.template_id = str3;
            }
            String str4 = builder.yy_uid;
            if (str4 == null) {
                this.yy_uid = "";
            } else {
                this.yy_uid = str4;
            }
            Integer num = builder.is_yy_game;
            if (num == null) {
                this.is_yy_game = DEFAULT_IS_YY_GAME;
            } else {
                this.is_yy_game = num;
            }
            String str5 = builder.stream_info;
            if (str5 == null) {
                this.stream_info = "";
            } else {
                this.stream_info = str5;
            }
            String str6 = builder.rank_show;
            if (str6 == null) {
                this.rank_show = "";
            } else {
                this.rank_show = str6;
            }
            String str7 = builder.icon_url;
            if (str7 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str7;
            }
            String str8 = builder.feed_id;
            if (str8 == null) {
                this.feed_id = "";
                return;
            } else {
                this.feed_id = str8;
                return;
            }
        }
        this.sid = builder.sid;
        this.ssid = builder.ssid;
        this.template_id = builder.template_id;
        this.yy_uid = builder.yy_uid;
        this.is_yy_game = builder.is_yy_game;
        this.stream_info = builder.stream_info;
        this.rank_show = builder.rank_show;
        this.icon_url = builder.icon_url;
        this.feed_id = builder.feed_id;
    }
}
