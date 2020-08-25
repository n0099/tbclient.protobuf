package tbclient.ExcZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes17.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer action;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1040common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long excid;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Long DEFAULT_EXCID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_ACTION = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1040common = builder.f1041common;
            if (builder.excid == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = builder.excid;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.action == null) {
                this.action = DEFAULT_ACTION;
                return;
            } else {
                this.action = builder.action;
                return;
            }
        }
        this.f1040common = builder.f1041common;
        this.excid = builder.excid;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.action = builder.action;
    }

    /* loaded from: classes17.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer action;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1041common;
        public Long excid;
        public Long post_id;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1041common = dataReq.f1040common;
                this.excid = dataReq.excid;
                this.thread_id = dataReq.thread_id;
                this.post_id = dataReq.post_id;
                this.action = dataReq.action;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
