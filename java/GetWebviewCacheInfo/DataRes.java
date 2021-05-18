package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_MD5 = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_VERSION = "";
    public static final String DEFAULT_WEBVIEW_VERSION = "";
    @ProtoField(tag = 4)
    public final PackageInfo latest;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<Offpack> offpack_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PackageInfo> patch;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String version;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String webview_version;
    public static final List<PackageInfo> DEFAULT_PATCH = Collections.emptyList();
    public static final List<Offpack> DEFAULT_OFFPACK_LIST = Collections.emptyList();

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public PackageInfo latest;
        public String md5;
        public List<Offpack> offpack_list;
        public List<PackageInfo> patch;
        public String src;
        public String version;
        public String webview_version;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.src = dataRes.src;
            this.webview_version = dataRes.webview_version;
            this.md5 = dataRes.md5;
            this.latest = dataRes.latest;
            this.patch = Message.copyOf(dataRes.patch);
            this.version = dataRes.version;
            this.offpack_list = Message.copyOf(dataRes.offpack_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.src;
            if (str == null) {
                this.src = "";
            } else {
                this.src = str;
            }
            String str2 = builder.webview_version;
            if (str2 == null) {
                this.webview_version = "";
            } else {
                this.webview_version = str2;
            }
            String str3 = builder.md5;
            if (str3 == null) {
                this.md5 = "";
            } else {
                this.md5 = str3;
            }
            this.latest = builder.latest;
            List<PackageInfo> list = builder.patch;
            if (list == null) {
                this.patch = DEFAULT_PATCH;
            } else {
                this.patch = Message.immutableCopyOf(list);
            }
            String str4 = builder.version;
            if (str4 == null) {
                this.version = "";
            } else {
                this.version = str4;
            }
            List<Offpack> list2 = builder.offpack_list;
            if (list2 == null) {
                this.offpack_list = DEFAULT_OFFPACK_LIST;
                return;
            } else {
                this.offpack_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.src = builder.src;
        this.webview_version = builder.webview_version;
        this.md5 = builder.md5;
        this.latest = builder.latest;
        this.patch = Message.immutableCopyOf(builder.patch);
        this.version = builder.version;
        this.offpack_list = Message.immutableCopyOf(builder.offpack_list);
    }
}
