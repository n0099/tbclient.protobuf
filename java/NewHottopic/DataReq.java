package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    public static final Long DEFAULT_TOPIC_ID = 0L;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69434common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long topic_id;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69435common;
        public Long topic_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69435common = dataReq.f69434common;
            this.topic_id = dataReq.topic_id;
            this.call_from = dataReq.call_from;
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
            this.f69434common = builder.f69435common;
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str = builder.call_from;
            if (str == null) {
                this.call_from = "";
                return;
            } else {
                this.call_from = str;
                return;
            }
        }
        this.f69434common = builder.f69435common;
        this.topic_id = builder.topic_id;
        this.call_from = builder.call_from;
    }
}
