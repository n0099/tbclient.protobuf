package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BannerData extends Message {
    public static final String DEFAULT_TPL_NAME = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 3)
    public final BannerContent content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tpl_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String version;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BannerData> {
        public BannerContent content;
        public String tpl_name;
        public String version;

        public Builder() {
        }

        public Builder(BannerData bannerData) {
            super(bannerData);
            if (bannerData == null) {
                return;
            }
            this.tpl_name = bannerData.tpl_name;
            this.version = bannerData.version;
            this.content = bannerData.content;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerData build(boolean z) {
            return new BannerData(this, z);
        }
    }

    public BannerData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tpl_name;
            if (str == null) {
                this.tpl_name = "";
            } else {
                this.tpl_name = str;
            }
            String str2 = builder.version;
            if (str2 == null) {
                this.version = "";
            } else {
                this.version = str2;
            }
            this.content = builder.content;
            return;
        }
        this.tpl_name = builder.tpl_name;
        this.version = builder.version;
        this.content = builder.content;
    }
}
