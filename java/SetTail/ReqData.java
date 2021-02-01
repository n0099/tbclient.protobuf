package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class ReqData extends Message {
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14707common;
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
            this.f14707common = builder.f14708common;
            return;
        }
        this.type = builder.type;
        this.tailId = builder.tailId;
        this.f14707common = builder.f14708common;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14708common;
        public Integer tailId;
        public Integer type;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.type = reqData.type;
                this.tailId = reqData.tailId;
                this.f14708common = reqData.f14707common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
