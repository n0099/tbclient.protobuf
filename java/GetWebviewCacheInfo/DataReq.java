package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_WEBVIEW_VERSION = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1274common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String webview_version;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1275common;
        public String webview_version;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1275common = dataReq.f1274common;
            this.webview_version = dataReq.webview_version;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1274common = builder.f1275common;
            String str = builder.webview_version;
            if (str == null) {
                this.webview_version = "";
                return;
            } else {
                this.webview_version = str;
                return;
            }
        }
        this.f1274common = builder.f1275common;
        this.webview_version = builder.webview_version;
    }
}
