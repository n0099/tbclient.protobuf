package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PackageInfo> {
        public String download_url;
        public String md5;
        public String version;

        public Builder() {
        }

        public Builder(PackageInfo packageInfo) {
            super(packageInfo);
            if (packageInfo == null) {
                return;
            }
            this.version = packageInfo.version;
            this.download_url = packageInfo.download_url;
            this.md5 = packageInfo.md5;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PackageInfo build(boolean z) {
            return new PackageInfo(this, z);
        }
    }

    public PackageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.version;
            if (str == null) {
                this.version = "";
            } else {
                this.version = str;
            }
            String str2 = builder.download_url;
            if (str2 == null) {
                this.download_url = "";
            } else {
                this.download_url = str2;
            }
            String str3 = builder.md5;
            if (str3 == null) {
                this.md5 = "";
                return;
            } else {
                this.md5 = str3;
                return;
            }
        }
        this.version = builder.version;
        this.download_url = builder.download_url;
        this.md5 = builder.md5;
    }
}
