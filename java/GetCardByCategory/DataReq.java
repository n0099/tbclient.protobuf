package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1325common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer rn;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1326common;
        public Integer pn;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1326common = dataReq.f1325common;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
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
            this.f1325common = builder.f1326common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.rn;
            if (num2 == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = num2;
                return;
            }
        }
        this.f1325common = builder.f1326common;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }
}
