package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
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

    private BannerImage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.ahead_url == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = builder.ahead_url;
            }
            if (builder.title == null) {
                this.title = "";
                return;
            } else {
                this.title = builder.title;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.ahead_url = builder.ahead_url;
        this.title = builder.title;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<BannerImage> {
        public String ahead_url;
        public String img_url;
        public String title;

        public Builder() {
        }

        public Builder(BannerImage bannerImage) {
            super(bannerImage);
            if (bannerImage != null) {
                this.img_url = bannerImage.img_url;
                this.ahead_url = bannerImage.ahead_url;
                this.title = bannerImage.title;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerImage build(boolean z) {
            return new BannerImage(this, z);
        }
    }
}
