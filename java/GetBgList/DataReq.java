package tbclient.GetBgList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1168common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer rn;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1169common;
        public Integer pn;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.f1169common = dataReq.f1168common;
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
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.rn;
            if (num2 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num2;
            }
            this.f1168common = builder.f1169common;
            return;
        }
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.f1168common = builder.f1169common;
    }
}
