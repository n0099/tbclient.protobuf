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
    public final CommonReq f1447common;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long last_feed_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long page_no;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long topic_id;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_PAGE_NO = 0L;
    public static final Long DEFAULT_LAST_FEED_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1448common;
        public Long last_feed_id;
        public Long page_no;
        public Long topic_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1448common = dataReq.f1447common;
            this.topic_id = dataReq.topic_id;
            this.page_no = dataReq.page_no;
            this.call_from = dataReq.call_from;
            this.last_feed_id = dataReq.last_feed_id;
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
            this.f1447common = builder.f1448common;
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            Long l2 = builder.page_no;
            if (l2 == null) {
                this.page_no = DEFAULT_PAGE_NO;
            } else {
                this.page_no = l2;
            }
            String str = builder.call_from;
            if (str == null) {
                this.call_from = "";
            } else {
                this.call_from = str;
            }
            Long l3 = builder.last_feed_id;
            if (l3 == null) {
                this.last_feed_id = DEFAULT_LAST_FEED_ID;
                return;
            } else {
                this.last_feed_id = l3;
                return;
            }
        }
        this.f1447common = builder.f1448common;
        this.topic_id = builder.topic_id;
        this.page_no = builder.page_no;
        this.call_from = builder.call_from;
        this.last_feed_id = builder.last_feed_id;
    }
}
