package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Custom extends Message {
    public static final String DEFAULT_CREATE_TIME = "";
    public static final String DEFAULT_ICON_ID = "";
    public static final String DEFAULT_ICON_NAME = "";
    public static final String DEFAULT_ICON_PIC = "";
    public static final String DEFAULT_IOS_ICON_ID = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PACKAGE_PIC = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PRODUCT_ID = "";
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String create_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<Discount> discount;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer dubi;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer dubi_ios;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer duration;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer hide;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String icon_id;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String icon_name;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String icon_pic;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer ios_display;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ios_icon_id;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_custom_price;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer non_member_i;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer non_member_t;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String package_pic;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String product_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String update_time;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer validity;
    public static final Integer DEFAULT_NON_MEMBER_T = 0;
    public static final Integer DEFAULT_NON_MEMBER_I = 0;
    public static final Integer DEFAULT_DUBI = 0;
    public static final Integer DEFAULT_DUBI_IOS = 0;
    public static final Integer DEFAULT_IOS_DISPLAY = 0;
    public static final Integer DEFAULT_DURATION = 0;
    public static final Integer DEFAULT_HIDE = 0;
    public static final List<Discount> DEFAULT_DISCOUNT = Collections.emptyList();
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_VALIDITY = 0;
    public static final Integer DEFAULT_IS_CUSTOM_PRICE = 0;

    private Custom(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.non_member_t == null) {
                this.non_member_t = DEFAULT_NON_MEMBER_T;
            } else {
                this.non_member_t = builder.non_member_t;
            }
            if (builder.non_member_i == null) {
                this.non_member_i = DEFAULT_NON_MEMBER_I;
            } else {
                this.non_member_i = builder.non_member_i;
            }
            if (builder.dubi == null) {
                this.dubi = DEFAULT_DUBI;
            } else {
                this.dubi = builder.dubi;
            }
            if (builder.dubi_ios == null) {
                this.dubi_ios = DEFAULT_DUBI_IOS;
            } else {
                this.dubi_ios = builder.dubi_ios;
            }
            if (builder.ios_display == null) {
                this.ios_display = DEFAULT_IOS_DISPLAY;
            } else {
                this.ios_display = builder.ios_display;
            }
            if (builder.duration == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = builder.duration;
            }
            if (builder.hide == null) {
                this.hide = DEFAULT_HIDE;
            } else {
                this.hide = builder.hide;
            }
            if (builder.discount == null) {
                this.discount = DEFAULT_DISCOUNT;
            } else {
                this.discount = immutableCopyOf(builder.discount);
            }
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.ios_icon_id == null) {
                this.ios_icon_id = "";
            } else {
                this.ios_icon_id = builder.ios_icon_id;
            }
            if (builder.validity == null) {
                this.validity = DEFAULT_VALIDITY;
            } else {
                this.validity = builder.validity;
            }
            if (builder.update_time == null) {
                this.update_time = "";
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.create_time == null) {
                this.create_time = "";
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.package_pic == null) {
                this.package_pic = "";
            } else {
                this.package_pic = builder.package_pic;
            }
            if (builder.is_custom_price == null) {
                this.is_custom_price = DEFAULT_IS_CUSTOM_PRICE;
            } else {
                this.is_custom_price = builder.is_custom_price;
            }
            if (builder.tag_name == null) {
                this.tag_name = "";
            } else {
                this.tag_name = builder.tag_name;
            }
            if (builder.product_id == null) {
                this.product_id = "";
            } else {
                this.product_id = builder.product_id;
            }
            if (builder.icon_id == null) {
                this.icon_id = "";
            } else {
                this.icon_id = builder.icon_id;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.icon_name == null) {
                this.icon_name = "";
            } else {
                this.icon_name = builder.icon_name;
            }
            if (builder.icon_pic == null) {
                this.icon_pic = "";
                return;
            } else {
                this.icon_pic = builder.icon_pic;
                return;
            }
        }
        this.name = builder.name;
        this.non_member_t = builder.non_member_t;
        this.non_member_i = builder.non_member_i;
        this.dubi = builder.dubi;
        this.dubi_ios = builder.dubi_ios;
        this.ios_display = builder.ios_display;
        this.duration = builder.duration;
        this.hide = builder.hide;
        this.discount = immutableCopyOf(builder.discount);
        this.props_id = builder.props_id;
        this.ios_icon_id = builder.ios_icon_id;
        this.validity = builder.validity;
        this.update_time = builder.update_time;
        this.create_time = builder.create_time;
        this.package_pic = builder.package_pic;
        this.is_custom_price = builder.is_custom_price;
        this.tag_name = builder.tag_name;
        this.product_id = builder.product_id;
        this.icon_id = builder.icon_id;
        this.pic_url = builder.pic_url;
        this.icon_name = builder.icon_name;
        this.icon_pic = builder.icon_pic;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Custom> {
        public String create_time;
        public List<Discount> discount;
        public Integer dubi;
        public Integer dubi_ios;
        public Integer duration;
        public Integer hide;
        public String icon_id;
        public String icon_name;
        public String icon_pic;
        public Integer ios_display;
        public String ios_icon_id;
        public Integer is_custom_price;
        public String name;
        public Integer non_member_i;
        public Integer non_member_t;
        public String package_pic;
        public String pic_url;
        public String product_id;
        public Integer props_id;
        public String tag_name;
        public String update_time;
        public Integer validity;

        public Builder() {
        }

        public Builder(Custom custom) {
            super(custom);
            if (custom != null) {
                this.name = custom.name;
                this.non_member_t = custom.non_member_t;
                this.non_member_i = custom.non_member_i;
                this.dubi = custom.dubi;
                this.dubi_ios = custom.dubi_ios;
                this.ios_display = custom.ios_display;
                this.duration = custom.duration;
                this.hide = custom.hide;
                this.discount = Custom.copyOf(custom.discount);
                this.props_id = custom.props_id;
                this.ios_icon_id = custom.ios_icon_id;
                this.validity = custom.validity;
                this.update_time = custom.update_time;
                this.create_time = custom.create_time;
                this.package_pic = custom.package_pic;
                this.is_custom_price = custom.is_custom_price;
                this.tag_name = custom.tag_name;
                this.product_id = custom.product_id;
                this.icon_id = custom.icon_id;
                this.pic_url = custom.pic_url;
                this.icon_name = custom.icon_name;
                this.icon_pic = custom.icon_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Custom build(boolean z) {
            return new Custom(this, z);
        }
    }
}
