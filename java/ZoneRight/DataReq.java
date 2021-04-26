package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68864common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer req_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_REQ_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68865common;
        public Long forum_id;
        public Integer req_type;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68865common = dataReq.f68864common;
            this.thread_id = dataReq.thread_id;
            this.forum_id = dataReq.forum_id;
            this.req_type = dataReq.req_type;
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
            this.f68864common = builder.f68865common;
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l2;
            }
            Integer num = builder.req_type;
            if (num == null) {
                this.req_type = DEFAULT_REQ_TYPE;
                return;
            } else {
                this.req_type = num;
                return;
            }
        }
        this.f68864common = builder.f68865common;
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.req_type = builder.req_type;
    }
}
