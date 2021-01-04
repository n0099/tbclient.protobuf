package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14867common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14867common = builder.f14868common;
            if (builder.call_from == null) {
                this.call_from = "";
                return;
            } else {
                this.call_from = builder.call_from;
                return;
            }
        }
        this.f14867common = builder.f14868common;
        this.call_from = builder.call_from;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14868common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14868common = dataReq.f14867common;
                this.call_from = dataReq.call_from;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
