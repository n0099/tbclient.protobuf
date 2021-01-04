package tbclient.NewTopicThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14869common;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long last_feed_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long page_no;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long topic_id;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_PAGE_NO = 0L;
    public static final Long DEFAULT_LAST_FEED_ID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14869common = builder.f14870common;
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.page_no == null) {
                this.page_no = DEFAULT_PAGE_NO;
            } else {
                this.page_no = builder.page_no;
            }
            if (builder.call_from == null) {
                this.call_from = "";
            } else {
                this.call_from = builder.call_from;
            }
            if (builder.last_feed_id == null) {
                this.last_feed_id = DEFAULT_LAST_FEED_ID;
                return;
            } else {
                this.last_feed_id = builder.last_feed_id;
                return;
            }
        }
        this.f14869common = builder.f14870common;
        this.topic_id = builder.topic_id;
        this.page_no = builder.page_no;
        this.call_from = builder.call_from;
        this.last_feed_id = builder.last_feed_id;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14870common;
        public Long last_feed_id;
        public Long page_no;
        public Long topic_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14870common = dataReq.f14869common;
                this.topic_id = dataReq.topic_id;
                this.page_no = dataReq.page_no;
                this.call_from = dataReq.call_from;
                this.last_feed_id = dataReq.last_feed_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
