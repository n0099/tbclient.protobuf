package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class ReqData extends Message {
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14697common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tailId;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_TAILID = 0;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.tailId == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = builder.tailId;
            }
            this.f14697common = builder.f14698common;
            return;
        }
        this.type = builder.type;
        this.tailId = builder.tailId;
        this.f14697common = builder.f14698common;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14698common;
        public Integer tailId;
        public Integer type;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.type = reqData.type;
                this.tailId = reqData.tailId;
                this.f14698common = reqData.f14697common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
