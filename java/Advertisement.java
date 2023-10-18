package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Advertisement extends Message {
    public static final String DEFAULT_ACTIVITY_ID = "";
    public static final String DEFAULT_ADVERTISEMENT_ID = "";
    public static final String DEFAULT_CLICK_STATISTICS_URL = "";
    public static final String DEFAULT_DEEPLINK = "";
    public static final String DEFAULT_DISPLAY_AD_ICON = "";
    public static final String DEFAULT_FLOATING_TEXT = "";
    public static final String DEFAULT_JUMP_LINK = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_PIC_CLICK = "";
    public static final String DEFAULT_SCHEME = "";
    public static final Long DEFAULT_TIME = 0L;
    public static final String DEFAULT_VIEW_STATISTICS_URL = "";
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String activity_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String advertisement_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String click_statistics_url;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String deeplink;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String display_ad_icon;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String floating_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_link;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_click;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long time;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String view_statistics_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Advertisement> {
        public String activity_id;
        public String advertisement_id;
        public String click_statistics_url;
        public String deeplink;
        public String display_ad_icon;
        public String floating_text;
        public String jump_link;
        public String package_name;
        public String pic;
        public String pic_click;
        public String scheme;
        public Long time;
        public String view_statistics_url;

        public Builder() {
        }

        public Builder(Advertisement advertisement) {
            super(advertisement);
            if (advertisement == null) {
                return;
            }
            this.time = advertisement.time;
            this.pic = advertisement.pic;
            this.pic_click = advertisement.pic_click;
            this.jump_link = advertisement.jump_link;
            this.advertisement_id = advertisement.advertisement_id;
            this.view_statistics_url = advertisement.view_statistics_url;
            this.click_statistics_url = advertisement.click_statistics_url;
            this.floating_text = advertisement.floating_text;
            this.deeplink = advertisement.deeplink;
            this.scheme = advertisement.scheme;
            this.package_name = advertisement.package_name;
            this.display_ad_icon = advertisement.display_ad_icon;
            this.activity_id = advertisement.activity_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Advertisement build(boolean z) {
            return new Advertisement(this, z);
        }
    }

    public Advertisement(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
            } else {
                this.pic = str;
            }
            String str2 = builder.pic_click;
            if (str2 == null) {
                this.pic_click = "";
            } else {
                this.pic_click = str2;
            }
            String str3 = builder.jump_link;
            if (str3 == null) {
                this.jump_link = "";
            } else {
                this.jump_link = str3;
            }
            String str4 = builder.advertisement_id;
            if (str4 == null) {
                this.advertisement_id = "";
            } else {
                this.advertisement_id = str4;
            }
            String str5 = builder.view_statistics_url;
            if (str5 == null) {
                this.view_statistics_url = "";
            } else {
                this.view_statistics_url = str5;
            }
            String str6 = builder.click_statistics_url;
            if (str6 == null) {
                this.click_statistics_url = "";
            } else {
                this.click_statistics_url = str6;
            }
            String str7 = builder.floating_text;
            if (str7 == null) {
                this.floating_text = "";
            } else {
                this.floating_text = str7;
            }
            String str8 = builder.deeplink;
            if (str8 == null) {
                this.deeplink = "";
            } else {
                this.deeplink = str8;
            }
            String str9 = builder.scheme;
            if (str9 == null) {
                this.scheme = "";
            } else {
                this.scheme = str9;
            }
            String str10 = builder.package_name;
            if (str10 == null) {
                this.package_name = "";
            } else {
                this.package_name = str10;
            }
            String str11 = builder.display_ad_icon;
            if (str11 == null) {
                this.display_ad_icon = "";
            } else {
                this.display_ad_icon = str11;
            }
            String str12 = builder.activity_id;
            if (str12 == null) {
                this.activity_id = "";
                return;
            } else {
                this.activity_id = str12;
                return;
            }
        }
        this.time = builder.time;
        this.pic = builder.pic;
        this.pic_click = builder.pic_click;
        this.jump_link = builder.jump_link;
        this.advertisement_id = builder.advertisement_id;
        this.view_statistics_url = builder.view_statistics_url;
        this.click_statistics_url = builder.click_statistics_url;
        this.floating_text = builder.floating_text;
        this.deeplink = builder.deeplink;
        this.scheme = builder.scheme;
        this.package_name = builder.package_name;
        this.display_ad_icon = builder.display_ad_icon;
        this.activity_id = builder.activity_id;
    }
}
