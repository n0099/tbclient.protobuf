package tbclient.GetFocus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69335common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pn;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69336common;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69336common = dataReq.f69335common;
            this.pn = dataReq.pn;
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
            this.f69335common = builder.f69336common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = num;
                return;
            }
        }
        this.f69335common = builder.f69336common;
        this.pn = builder.pn;
    }
}
