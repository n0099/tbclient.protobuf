package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class BannerShowUrl extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BannerShowUrl> {
        public String url;

        public Builder() {
        }

        public Builder(BannerShowUrl bannerShowUrl) {
            super(bannerShowUrl);
            if (bannerShowUrl == null) {
                return;
            }
            this.url = bannerShowUrl.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerShowUrl build(boolean z) {
            return new BannerShowUrl(this, z);
        }
    }

    public BannerShowUrl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.url = builder.url;
    }
}
