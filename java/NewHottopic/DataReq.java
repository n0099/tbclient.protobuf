package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes21.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    public static final Long DEFAULT_TOPIC_ID = 0L;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1166common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long topic_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1166common = builder.f1167common;
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.call_from == null) {
                this.call_from = "";
                return;
            } else {
                this.call_from = builder.call_from;
                return;
            }
        }
        this.f1166common = builder.f1167common;
        this.topic_id = builder.topic_id;
        this.call_from = builder.call_from;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1167common;
        public Long topic_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1167common = dataReq.f1166common;
                this.topic_id = dataReq.topic_id;
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
