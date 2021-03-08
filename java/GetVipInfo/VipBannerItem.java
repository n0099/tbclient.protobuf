package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class VipBannerItem extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    private VipBannerItem(Builder builder, boolean z) {
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
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.link == null) {
                this.link = "";
                return;
            } else {
                this.link = builder.link;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.title = builder.title;
        this.desc = builder.desc;
        this.link = builder.link;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<VipBannerItem> {
        public String desc;
        public String img_url;
        public String link;
        public String title;

        public Builder() {
        }

        public Builder(VipBannerItem vipBannerItem) {
            super(vipBannerItem);
            if (vipBannerItem != null) {
                this.img_url = vipBannerItem.img_url;
                this.title = vipBannerItem.title;
                this.desc = vipBannerItem.desc;
                this.link = vipBannerItem.link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipBannerItem build(boolean z) {
            return new VipBannerItem(this, z);
        }
    }
}
