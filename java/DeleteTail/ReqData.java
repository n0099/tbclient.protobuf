package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class ReqData extends Message {
    public static final Integer DEFAULT_TAILID = 0;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14447common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer tailId;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tailId == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = builder.tailId;
            }
            this.f14447common = builder.f14448common;
            return;
        }
        this.tailId = builder.tailId;
        this.f14447common = builder.f14448common;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14448common;
        public Integer tailId;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.tailId = reqData.tailId;
                this.f14448common = reqData.f14447common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
