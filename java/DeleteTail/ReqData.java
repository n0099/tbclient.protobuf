package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class ReqData extends Message {
    public static final Integer DEFAULT_TAILID = 0;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1269common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer tailId;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1270common;
        public Integer tailId;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.tailId = reqData.tailId;
            this.f1270common = reqData.f1269common;
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
            this.f1269common = builder.f1270common;
            return;
        }
        this.tailId = builder.tailId;
        this.f1269common = builder.f1270common;
    }
}
