package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipThemeItem extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_PROPS_CATEGORY_NAME = "";
    public static final String DEFAULT_TAG_IMG_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer props_category;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String props_category_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer props_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String tag_img_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String update_time;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_PROPS_CATEGORY = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_ID = 0;

    private VipThemeItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.props_category == null) {
                this.props_category = DEFAULT_PROPS_CATEGORY;
            } else {
                this.props_category = builder.props_category;
            }
            if (builder.props_category_name == null) {
                this.props_category_name = "";
            } else {
                this.props_category_name = builder.props_category_name;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.tag_img_url == null) {
                this.tag_img_url = "";
            } else {
                this.tag_img_url = builder.tag_img_url;
            }
            if (builder.update_time == null) {
                this.update_time = "";
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
                return;
            } else {
                this.id = builder.id;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.title = builder.title;
        this.props_id = builder.props_id;
        this.props_category = builder.props_category;
        this.props_category_name = builder.props_category_name;
        this.desc = builder.desc;
        this.link = builder.link;
        this.tag_img_url = builder.tag_img_url;
        this.update_time = builder.update_time;
        this.type = builder.type;
        this.id = builder.id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipThemeItem> {
        public String desc;
        public Integer id;
        public String img_url;
        public String link;
        public Integer props_category;
        public String props_category_name;
        public Integer props_id;
        public String tag_img_url;
        public String title;
        public Integer type;
        public String update_time;

        public Builder() {
        }

        public Builder(VipThemeItem vipThemeItem) {
            super(vipThemeItem);
            if (vipThemeItem != null) {
                this.img_url = vipThemeItem.img_url;
                this.title = vipThemeItem.title;
                this.props_id = vipThemeItem.props_id;
                this.props_category = vipThemeItem.props_category;
                this.props_category_name = vipThemeItem.props_category_name;
                this.desc = vipThemeItem.desc;
                this.link = vipThemeItem.link;
                this.tag_img_url = vipThemeItem.tag_img_url;
                this.update_time = vipThemeItem.update_time;
                this.type = vipThemeItem.type;
                this.id = vipThemeItem.id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipThemeItem build(boolean z) {
            return new VipThemeItem(this, z);
        }
    }
}
