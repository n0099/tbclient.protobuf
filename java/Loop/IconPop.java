package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class IconPop extends Message {
    public static final String DEFAULT_CATEGORY_ID = "";
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_FORUM_LIST = "";
    public static final Long DEFAULT_ICON_ID = 0L;
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_INTRO_URL = "";
    public static final String DEFAULT_IS_ADVANCED = "";
    public static final String DEFAULT_IS_FORCE = "";
    public static final String DEFAULT_IS_NEW_STYLE = "";
    public static final String DEFAULT_LEVEL = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PAY_PIC_PAD = "";
    public static final String DEFAULT_PAY_PIC_PC = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_PIC120 = "";
    public static final String DEFAULT_PIC160 = "";
    public static final String DEFAULT_PIC78 = "";
    public static final String DEFAULT_SPRITE = "";
    public static final String DEFAULT_STATUS = "";
    public static final String DEFAULT_TIME_INTERVAL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TITLE_URL = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_WEIGHT = "";
    public static final String DEFAULT_YB_PRICE = "";
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String category_id;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String forum_list;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long icon_id;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String intro_url;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String is_advanced;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String is_force;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String is_new_style;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String level;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String pay_pic_pad;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String pay_pic_pc;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String pic120;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String pic160;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String pic78;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String sprite;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String status;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String time_interval;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String title_url;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String weight;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String yb_price;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<IconPop> {
        public String category_id;
        public String ext;
        public String forum_list;
        public Long icon_id;
        public String intro;
        public String intro_url;
        public String is_advanced;
        public String is_force;
        public String is_new_style;
        public String level;
        public String name;
        public String pay_pic_pad;
        public String pay_pic_pc;
        public String pic;
        public String pic120;
        public String pic160;
        public String pic78;
        public String sprite;
        public String status;
        public String time_interval;
        public String title;
        public String title_url;
        public String type;
        public String weight;
        public String yb_price;

        public Builder() {
        }

        public Builder(IconPop iconPop) {
            super(iconPop);
            if (iconPop == null) {
                return;
            }
            this.icon_id = iconPop.icon_id;
            this.name = iconPop.name;
            this.level = iconPop.level;
            this.weight = iconPop.weight;
            this.pic = iconPop.pic;
            this.sprite = iconPop.sprite;
            this.status = iconPop.status;
            this.type = iconPop.type;
            this.category_id = iconPop.category_id;
            this.time_interval = iconPop.time_interval;
            this.is_force = iconPop.is_force;
            this.is_advanced = iconPop.is_advanced;
            this.ext = iconPop.ext;
            this.title = iconPop.title;
            this.title_url = iconPop.title_url;
            this.intro = iconPop.intro;
            this.intro_url = iconPop.intro_url;
            this.forum_list = iconPop.forum_list;
            this.pay_pic_pc = iconPop.pay_pic_pc;
            this.pay_pic_pad = iconPop.pay_pic_pad;
            this.yb_price = iconPop.yb_price;
            this.is_new_style = iconPop.is_new_style;
            this.pic78 = iconPop.pic78;
            this.pic120 = iconPop.pic120;
            this.pic160 = iconPop.pic160;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IconPop build(boolean z) {
            return new IconPop(this, z);
        }
    }

    public IconPop(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.icon_id;
            if (l == null) {
                this.icon_id = DEFAULT_ICON_ID;
            } else {
                this.icon_id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.level;
            if (str2 == null) {
                this.level = "";
            } else {
                this.level = str2;
            }
            String str3 = builder.weight;
            if (str3 == null) {
                this.weight = "";
            } else {
                this.weight = str3;
            }
            String str4 = builder.pic;
            if (str4 == null) {
                this.pic = "";
            } else {
                this.pic = str4;
            }
            String str5 = builder.sprite;
            if (str5 == null) {
                this.sprite = "";
            } else {
                this.sprite = str5;
            }
            String str6 = builder.status;
            if (str6 == null) {
                this.status = "";
            } else {
                this.status = str6;
            }
            String str7 = builder.type;
            if (str7 == null) {
                this.type = "";
            } else {
                this.type = str7;
            }
            String str8 = builder.category_id;
            if (str8 == null) {
                this.category_id = "";
            } else {
                this.category_id = str8;
            }
            String str9 = builder.time_interval;
            if (str9 == null) {
                this.time_interval = "";
            } else {
                this.time_interval = str9;
            }
            String str10 = builder.is_force;
            if (str10 == null) {
                this.is_force = "";
            } else {
                this.is_force = str10;
            }
            String str11 = builder.is_advanced;
            if (str11 == null) {
                this.is_advanced = "";
            } else {
                this.is_advanced = str11;
            }
            String str12 = builder.ext;
            if (str12 == null) {
                this.ext = "";
            } else {
                this.ext = str12;
            }
            String str13 = builder.title;
            if (str13 == null) {
                this.title = "";
            } else {
                this.title = str13;
            }
            String str14 = builder.title_url;
            if (str14 == null) {
                this.title_url = "";
            } else {
                this.title_url = str14;
            }
            String str15 = builder.intro;
            if (str15 == null) {
                this.intro = "";
            } else {
                this.intro = str15;
            }
            String str16 = builder.intro_url;
            if (str16 == null) {
                this.intro_url = "";
            } else {
                this.intro_url = str16;
            }
            String str17 = builder.forum_list;
            if (str17 == null) {
                this.forum_list = "";
            } else {
                this.forum_list = str17;
            }
            String str18 = builder.pay_pic_pc;
            if (str18 == null) {
                this.pay_pic_pc = "";
            } else {
                this.pay_pic_pc = str18;
            }
            String str19 = builder.pay_pic_pad;
            if (str19 == null) {
                this.pay_pic_pad = "";
            } else {
                this.pay_pic_pad = str19;
            }
            String str20 = builder.yb_price;
            if (str20 == null) {
                this.yb_price = "";
            } else {
                this.yb_price = str20;
            }
            String str21 = builder.is_new_style;
            if (str21 == null) {
                this.is_new_style = "";
            } else {
                this.is_new_style = str21;
            }
            String str22 = builder.pic78;
            if (str22 == null) {
                this.pic78 = "";
            } else {
                this.pic78 = str22;
            }
            String str23 = builder.pic120;
            if (str23 == null) {
                this.pic120 = "";
            } else {
                this.pic120 = str23;
            }
            String str24 = builder.pic160;
            if (str24 == null) {
                this.pic160 = "";
                return;
            } else {
                this.pic160 = str24;
                return;
            }
        }
        this.icon_id = builder.icon_id;
        this.name = builder.name;
        this.level = builder.level;
        this.weight = builder.weight;
        this.pic = builder.pic;
        this.sprite = builder.sprite;
        this.status = builder.status;
        this.type = builder.type;
        this.category_id = builder.category_id;
        this.time_interval = builder.time_interval;
        this.is_force = builder.is_force;
        this.is_advanced = builder.is_advanced;
        this.ext = builder.ext;
        this.title = builder.title;
        this.title_url = builder.title_url;
        this.intro = builder.intro;
        this.intro_url = builder.intro_url;
        this.forum_list = builder.forum_list;
        this.pay_pic_pc = builder.pay_pic_pc;
        this.pay_pic_pad = builder.pay_pic_pad;
        this.yb_price = builder.yb_price;
        this.is_new_style = builder.is_new_style;
        this.pic78 = builder.pic78;
        this.pic120 = builder.pic120;
        this.pic160 = builder.pic160;
    }
}
