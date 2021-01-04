package tbclient.HotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14845common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pn;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14845common = builder.f14846common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.f14845common = builder.f14846common;
        this.pn = builder.pn;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14846common;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14846common = dataReq.f14845common;
                this.pn = dataReq.pn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
