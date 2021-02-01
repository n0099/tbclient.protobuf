package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PackageInfo extends Message {
    public static final String DEFAULT_DOWNLOAD_URL = "";
    public static final String DEFAULT_MD5 = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String download_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String version;

    private PackageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.version == null) {
                this.version = "";
            } else {
                this.version = builder.version;
            }
            if (builder.download_url == null) {
                this.download_url = "";
            } else {
                this.download_url = builder.download_url;
            }
            if (builder.md5 == null) {
                this.md5 = "";
                return;
            } else {
                this.md5 = builder.md5;
                return;
            }
        }
        this.version = builder.version;
        this.download_url = builder.download_url;
        this.md5 = builder.md5;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PackageInfo> {
        public String download_url;
        public String md5;
        public String version;

        public Builder() {
        }

        public Builder(PackageInfo packageInfo) {
            super(packageInfo);
            if (packageInfo != null) {
                this.version = packageInfo.version;
                this.download_url = packageInfo.download_url;
                this.md5 = packageInfo.md5;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PackageInfo build(boolean z) {
            return new PackageInfo(this, z);
        }
    }
}
