package tbclient.GetRemindLiveRooms;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.YyExt;
/* loaded from: classes10.dex */
public final class YyLiveInfoSimple extends Message {
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_FEED_ID = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String feed_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long room_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 5)
    public final YyExt yy_ext;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<YyLiveInfoSimple> {
        public String btn_text;
        public String desc;
        public String feed_id;
        public String portrait;
        public Long room_id;
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
            this.user_name = yyLiveInfoSimple.user_name;
            this.portrait = yyLiveInfoSimple.portrait;
            this.title = yyLiveInfoSimple.title;
            this.desc = yyLiveInfoSimple.desc;
            this.yy_ext = yyLiveInfoSimple.yy_ext;
            this.room_id = yyLiveInfoSimple.room_id;
            this.btn_text = yyLiveInfoSimple.btn_text;
            this.feed_id = yyLiveInfoSimple.feed_id;
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
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.desc;
            if (str4 == null) {
                this.desc = "";
            } else {
                this.desc = str4;
            }
            this.yy_ext = builder.yy_ext;
            Long l = builder.room_id;
            if (l == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = l;
            }
            String str5 = builder.btn_text;
            if (str5 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str5;
            }
            String str6 = builder.feed_id;
            if (str6 == null) {
                this.feed_id = "";
                return;
            } else {
                this.feed_id = str6;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.title = builder.title;
        this.desc = builder.desc;
        this.yy_ext = builder.yy_ext;
        this.room_id = builder.room_id;
        this.btn_text = builder.btn_text;
        this.feed_id = builder.feed_id;
    }
}
