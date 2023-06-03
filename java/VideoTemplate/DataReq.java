package tbclient.VideoTemplate;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_SOURCE = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1536common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer source;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1537common;
        public Integer source;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1537common = dataReq.f1536common;
            this.source = dataReq.source;
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
            this.f1536common = builder.f1537common;
            Integer num = builder.source;
            if (num == null) {
                this.source = DEFAULT_SOURCE;
                return;
            } else {
                this.source = num;
                return;
            }
        }
        this.f1536common = builder.f1537common;
        this.source = builder.source;
    }
}
