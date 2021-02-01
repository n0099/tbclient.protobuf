package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipSpreadItem extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link;

    private VipSpreadItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
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
        this.link = builder.link;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipSpreadItem> {
        public String img_url;
        public String link;

        public Builder() {
        }

        public Builder(VipSpreadItem vipSpreadItem) {
            super(vipSpreadItem);
            if (vipSpreadItem != null) {
                this.img_url = vipSpreadItem.img_url;
                this.link = vipSpreadItem.link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipSpreadItem build(boolean z) {
            return new VipSpreadItem(this, z);
        }
    }
}
