package tbclient.DelAllUserData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_OP_TYPE = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1128common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer op_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1129common;
        public Integer op_type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1129common = dataReq.f1128common;
            this.op_type = dataReq.op_type;
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
            this.f1128common = builder.f1129common;
            Integer num = builder.op_type;
            if (num == null) {
                this.op_type = DEFAULT_OP_TYPE;
                return;
            } else {
                this.op_type = num;
                return;
            }
        }
        this.f1128common = builder.f1129common;
        this.op_type = builder.op_type;
    }
}
