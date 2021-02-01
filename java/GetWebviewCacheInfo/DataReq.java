package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_WEBVIEW_VERSION = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14609common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String webview_version;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14609common = builder.f14610common;
            if (builder.webview_version == null) {
                this.webview_version = "";
                return;
            } else {
                this.webview_version = builder.webview_version;
                return;
            }
        }
        this.f14609common = builder.f14610common;
        this.webview_version = builder.webview_version;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14610common;
        public String webview_version;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14610common = dataReq.f14609common;
                this.webview_version = dataReq.webview_version;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
