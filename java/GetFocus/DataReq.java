package tbclient.GetFocus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72750common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pn;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72751common;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72751common = dataReq.f72750common;
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
            this.f72750common = builder.f72751common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = num;
                return;
            }
        }
        this.f72750common = builder.f72751common;
        this.pn = builder.pn;
    }
}
