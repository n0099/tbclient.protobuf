package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class BannerFlag extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BannerFlag> {
        public String icon;
        public String text;

        public Builder() {
        }

        public Builder(BannerFlag bannerFlag) {
            super(bannerFlag);
            if (bannerFlag == null) {
                return;
            }
            this.text = bannerFlag.text;
            this.icon = bannerFlag.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerFlag build(boolean z) {
            return new BannerFlag(this, z);
        }
    }

    public BannerFlag(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str2;
                return;
            }
        }
        this.text = builder.text;
        this.icon = builder.icon;
    }
}
