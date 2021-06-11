package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class BannerImage extends Message {
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<BannerImage> {
        public String ahead_url;
        public String img_url;
        public String title;

        public Builder() {
        }

        public Builder(BannerImage bannerImage) {
            super(bannerImage);
            if (bannerImage == null) {
                return;
            }
            this.img_url = bannerImage.img_url;
            this.ahead_url = bannerImage.ahead_url;
            this.title = bannerImage.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerImage build(boolean z) {
            return new BannerImage(this, z);
        }
    }

    public BannerImage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.ahead_url;
            if (str2 == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
                return;
            } else {
                this.title = str3;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.ahead_url = builder.ahead_url;
        this.title = builder.title;
    }
}
