package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ChatroomConfig extends Message {
    public static final String DEFAULT_GUIDE_BKG_DAY = "";
    public static final String DEFAULT_GUIDE_BKG_NIGHT = "";
    public static final String DEFAULT_GUIDE_ICON_DAY = "";
    public static final String DEFAULT_GUIDE_ICON_NIGHT = "";
    public static final Integer DEFAULT_GUIDE_NUM = 0;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String guide_bkg_day;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String guide_bkg_night;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String guide_icon_day;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String guide_icon_night;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer guide_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChatroomConfig> {
        public String guide_bkg_day;
        public String guide_bkg_night;
        public String guide_icon_day;
        public String guide_icon_night;
        public Integer guide_num;

        public Builder() {
        }

        public Builder(ChatroomConfig chatroomConfig) {
            super(chatroomConfig);
            if (chatroomConfig == null) {
                return;
            }
            this.guide_num = chatroomConfig.guide_num;
            this.guide_icon_day = chatroomConfig.guide_icon_day;
            this.guide_icon_night = chatroomConfig.guide_icon_night;
            this.guide_bkg_day = chatroomConfig.guide_bkg_day;
            this.guide_bkg_night = chatroomConfig.guide_bkg_night;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomConfig build(boolean z) {
            return new ChatroomConfig(this, z);
        }
    }

    public ChatroomConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.guide_num;
            if (num == null) {
                this.guide_num = DEFAULT_GUIDE_NUM;
            } else {
                this.guide_num = num;
            }
            String str = builder.guide_icon_day;
            if (str == null) {
                this.guide_icon_day = "";
            } else {
                this.guide_icon_day = str;
            }
            String str2 = builder.guide_icon_night;
            if (str2 == null) {
                this.guide_icon_night = "";
            } else {
                this.guide_icon_night = str2;
            }
            String str3 = builder.guide_bkg_day;
            if (str3 == null) {
                this.guide_bkg_day = "";
            } else {
                this.guide_bkg_day = str3;
            }
            String str4 = builder.guide_bkg_night;
            if (str4 == null) {
                this.guide_bkg_night = "";
                return;
            } else {
                this.guide_bkg_night = str4;
                return;
            }
        }
        this.guide_num = builder.guide_num;
        this.guide_icon_day = builder.guide_icon_day;
        this.guide_icon_night = builder.guide_icon_night;
        this.guide_bkg_day = builder.guide_bkg_day;
        this.guide_bkg_night = builder.guide_bkg_night;
    }
}
