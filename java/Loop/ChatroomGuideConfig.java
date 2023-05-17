package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ChatroomGuideConfig extends Message {
    public static final String DEFAULT_BKGRD_DAY = "";
    public static final String DEFAULT_BKGRD_NIGHT = "";
    public static final String DEFAULT_BTNON_DAY = "";
    public static final String DEFAULT_BTNON_NIGHT = "";
    public static final String DEFAULT_ICON_DAY = "";
    public static final String DEFAULT_ICON_NIGHT = "";
    public static final String DEFAULT_SMALL_BKGRD_DAY = "";
    public static final String DEFAULT_SMALL_BKGRD_NIGHT = "";
    public static final String DEFAULT_SMALL_ICON_DAY = "";
    public static final String DEFAULT_SMALL_ICON_NIGHT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bkgrd_day;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bkgrd_night;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btnon_day;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String btnon_night;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_day;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_night;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String small_bkgrd_day;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String small_bkgrd_night;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String small_icon_day;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String small_icon_night;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ChatroomGuideConfig> {
        public String bkgrd_day;
        public String bkgrd_night;
        public String btnon_day;
        public String btnon_night;
        public String icon_day;
        public String icon_night;
        public String small_bkgrd_day;
        public String small_bkgrd_night;
        public String small_icon_day;
        public String small_icon_night;

        public Builder() {
        }

        public Builder(ChatroomGuideConfig chatroomGuideConfig) {
            super(chatroomGuideConfig);
            if (chatroomGuideConfig == null) {
                return;
            }
            this.icon_day = chatroomGuideConfig.icon_day;
            this.icon_night = chatroomGuideConfig.icon_night;
            this.bkgrd_day = chatroomGuideConfig.bkgrd_day;
            this.bkgrd_night = chatroomGuideConfig.bkgrd_night;
            this.btnon_day = chatroomGuideConfig.btnon_day;
            this.btnon_night = chatroomGuideConfig.btnon_night;
            this.small_icon_day = chatroomGuideConfig.small_icon_day;
            this.small_icon_night = chatroomGuideConfig.small_icon_night;
            this.small_bkgrd_day = chatroomGuideConfig.small_bkgrd_day;
            this.small_bkgrd_night = chatroomGuideConfig.small_bkgrd_night;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomGuideConfig build(boolean z) {
            return new ChatroomGuideConfig(this, z);
        }
    }

    public ChatroomGuideConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_day;
            if (str == null) {
                this.icon_day = "";
            } else {
                this.icon_day = str;
            }
            String str2 = builder.icon_night;
            if (str2 == null) {
                this.icon_night = "";
            } else {
                this.icon_night = str2;
            }
            String str3 = builder.bkgrd_day;
            if (str3 == null) {
                this.bkgrd_day = "";
            } else {
                this.bkgrd_day = str3;
            }
            String str4 = builder.bkgrd_night;
            if (str4 == null) {
                this.bkgrd_night = "";
            } else {
                this.bkgrd_night = str4;
            }
            String str5 = builder.btnon_day;
            if (str5 == null) {
                this.btnon_day = "";
            } else {
                this.btnon_day = str5;
            }
            String str6 = builder.btnon_night;
            if (str6 == null) {
                this.btnon_night = "";
            } else {
                this.btnon_night = str6;
            }
            String str7 = builder.small_icon_day;
            if (str7 == null) {
                this.small_icon_day = "";
            } else {
                this.small_icon_day = str7;
            }
            String str8 = builder.small_icon_night;
            if (str8 == null) {
                this.small_icon_night = "";
            } else {
                this.small_icon_night = str8;
            }
            String str9 = builder.small_bkgrd_day;
            if (str9 == null) {
                this.small_bkgrd_day = "";
            } else {
                this.small_bkgrd_day = str9;
            }
            String str10 = builder.small_bkgrd_night;
            if (str10 == null) {
                this.small_bkgrd_night = "";
                return;
            } else {
                this.small_bkgrd_night = str10;
                return;
            }
        }
        this.icon_day = builder.icon_day;
        this.icon_night = builder.icon_night;
        this.bkgrd_day = builder.bkgrd_day;
        this.bkgrd_night = builder.bkgrd_night;
        this.btnon_day = builder.btnon_day;
        this.btnon_night = builder.btnon_night;
        this.small_icon_day = builder.small_icon_day;
        this.small_icon_night = builder.small_icon_night;
        this.small_bkgrd_day = builder.small_bkgrd_day;
        this.small_bkgrd_night = builder.small_bkgrd_night;
    }
}
