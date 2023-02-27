package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class ReqData extends Message {
    public static final Integer DEFAULT_TAILID = 0;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1132common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer tailId;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1133common;
        public Integer tailId;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.tailId = reqData.tailId;
            this.f1133common = reqData.f1132common;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }

    public ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.tailId;
            if (num == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = num;
            }
            this.f1132common = builder.f1133common;
            return;
        }
        this.tailId = builder.tailId;
        this.f1132common = builder.f1133common;
    }
}
