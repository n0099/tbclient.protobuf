package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f8979common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer req_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_REQ_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f8979common = builder.f8980common;
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.req_type == null) {
                this.req_type = DEFAULT_REQ_TYPE;
                return;
            } else {
                this.req_type = builder.req_type;
                return;
            }
        }
        this.f8979common = builder.f8980common;
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.req_type = builder.req_type;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f8980common;
        public Long forum_id;
        public Integer req_type;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f8980common = dataReq.f8979common;
                this.thread_id = dataReq.thread_id;
                this.forum_id = dataReq.forum_id;
                this.req_type = dataReq.req_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
