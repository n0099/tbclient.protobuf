package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class NamoaixudEntry extends Message {
    public static final String DEFAULT_ACTIVITY_DESC = "";
    public static final String DEFAULT_ACTIVITY_LINK_ADDR = "";
    public static final String DEFAULT_ACTIVITY_LINK_TYPE = "";
    public static final String DEFAULT_ACTIVITY_TIMESTAMP = "";
    public static final String DEFAULT_AMOUNT = "";
    public static final String DEFAULT_AMOUNT_MSG = "";
    public static final String DEFAULT_ENCOURAGE_DESC = "";
    public static final String DEFAULT_ENCOURAGE_ICON = "";
    public static final String DEFAULT_ENCOURAGE_ICON_DARK = "";
    public static final String DEFAULT_GOTO_BUTTON_NAME = "";
    public static final String DEFAULT_GOTO_BUTTON_URL = "";
    public static final String DEFAULT_LAYOUT_TYPE = "";
    public static final String DEFAULT_TIP = "";
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String activity_desc;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String activity_link_addr;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String activity_link_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String activity_timestamp;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String amount;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String amount_msg;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String encourage_desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String encourage_icon;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String encourage_icon_dark;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String goto_button_name;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String goto_button_url;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String layout_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tip;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NamoaixudEntry> {
        public String activity_desc;
        public String activity_link_addr;
        public String activity_link_type;
        public String activity_timestamp;
        public String amount;
        public String amount_msg;
        public String encourage_desc;
        public String encourage_icon;
        public String encourage_icon_dark;
        public String goto_button_name;
        public String goto_button_url;
        public String layout_type;
        public String tip;

        public Builder() {
        }

        public Builder(NamoaixudEntry namoaixudEntry) {
            super(namoaixudEntry);
            if (namoaixudEntry == null) {
                return;
            }
            this.tip = namoaixudEntry.tip;
            this.amount = namoaixudEntry.amount;
            this.amount_msg = namoaixudEntry.amount_msg;
            this.encourage_icon = namoaixudEntry.encourage_icon;
            this.encourage_desc = namoaixudEntry.encourage_desc;
            this.goto_button_name = namoaixudEntry.goto_button_name;
            this.goto_button_url = namoaixudEntry.goto_button_url;
            this.activity_timestamp = namoaixudEntry.activity_timestamp;
            this.activity_desc = namoaixudEntry.activity_desc;
            this.activity_link_type = namoaixudEntry.activity_link_type;
            this.activity_link_addr = namoaixudEntry.activity_link_addr;
            this.layout_type = namoaixudEntry.layout_type;
            this.encourage_icon_dark = namoaixudEntry.encourage_icon_dark;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NamoaixudEntry build(boolean z) {
            return new NamoaixudEntry(this, z);
        }
    }

    public NamoaixudEntry(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tip;
            if (str == null) {
                this.tip = "";
            } else {
                this.tip = str;
            }
            String str2 = builder.amount;
            if (str2 == null) {
                this.amount = "";
            } else {
                this.amount = str2;
            }
            String str3 = builder.amount_msg;
            if (str3 == null) {
                this.amount_msg = "";
            } else {
                this.amount_msg = str3;
            }
            String str4 = builder.encourage_icon;
            if (str4 == null) {
                this.encourage_icon = "";
            } else {
                this.encourage_icon = str4;
            }
            String str5 = builder.encourage_desc;
            if (str5 == null) {
                this.encourage_desc = "";
            } else {
                this.encourage_desc = str5;
            }
            String str6 = builder.goto_button_name;
            if (str6 == null) {
                this.goto_button_name = "";
            } else {
                this.goto_button_name = str6;
            }
            String str7 = builder.goto_button_url;
            if (str7 == null) {
                this.goto_button_url = "";
            } else {
                this.goto_button_url = str7;
            }
            String str8 = builder.activity_timestamp;
            if (str8 == null) {
                this.activity_timestamp = "";
            } else {
                this.activity_timestamp = str8;
            }
            String str9 = builder.activity_desc;
            if (str9 == null) {
                this.activity_desc = "";
            } else {
                this.activity_desc = str9;
            }
            String str10 = builder.activity_link_type;
            if (str10 == null) {
                this.activity_link_type = "";
            } else {
                this.activity_link_type = str10;
            }
            String str11 = builder.activity_link_addr;
            if (str11 == null) {
                this.activity_link_addr = "";
            } else {
                this.activity_link_addr = str11;
            }
            String str12 = builder.layout_type;
            if (str12 == null) {
                this.layout_type = "";
            } else {
                this.layout_type = str12;
            }
            String str13 = builder.encourage_icon_dark;
            if (str13 == null) {
                this.encourage_icon_dark = "";
                return;
            } else {
                this.encourage_icon_dark = str13;
                return;
            }
        }
        this.tip = builder.tip;
        this.amount = builder.amount;
        this.amount_msg = builder.amount_msg;
        this.encourage_icon = builder.encourage_icon;
        this.encourage_desc = builder.encourage_desc;
        this.goto_button_name = builder.goto_button_name;
        this.goto_button_url = builder.goto_button_url;
        this.activity_timestamp = builder.activity_timestamp;
        this.activity_desc = builder.activity_desc;
        this.activity_link_type = builder.activity_link_type;
        this.activity_link_addr = builder.activity_link_addr;
        this.layout_type = builder.layout_type;
        this.encourage_icon_dark = builder.encourage_icon_dark;
    }
}
