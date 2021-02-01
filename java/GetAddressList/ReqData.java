package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class ReqData extends Message {
    public static final Integer DEFAULT_TIMESTAMP = 0;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14481common;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer timestamp;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.timestamp == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = builder.timestamp;
            }
            this.f14481common = builder.f14482common;
            return;
        }
        this.timestamp = builder.timestamp;
        this.f14481common = builder.f14482common;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14482common;
        public Integer timestamp;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.timestamp = reqData.timestamp;
                this.f14482common = reqData.f14481common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
