package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class ReqData extends Message {
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69545common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tailId;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_TAILID = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69546common;
        public Integer tailId;
        public Integer type;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.type = reqData.type;
            this.tailId = reqData.tailId;
            this.f69546common = reqData.f69545common;
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
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.tailId;
            if (num2 == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = num2;
            }
            this.f69545common = builder.f69546common;
            return;
        }
        this.type = builder.type;
        this.tailId = builder.tailId;
        this.f69545common = builder.f69546common;
    }
}
