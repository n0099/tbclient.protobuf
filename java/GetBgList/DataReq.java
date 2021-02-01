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
    public final CommonReq f14489common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer rn;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            this.f14489common = builder.f14490common;
            return;
        }
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.f14489common = builder.f14490common;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14490common;
        public Integer pn;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.f14490common = dataReq.f14489common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
