package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_OPTIONS = "";
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14708common;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String options;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.options == null) {
                this.options = "";
            } else {
                this.options = builder.options;
            }
            this.f14708common = builder.f14709common;
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = builder.forum_id;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.options = builder.options;
        this.f14708common = builder.f14709common;
        this.forum_id = builder.forum_id;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14709common;
        public Long forum_id;
        public String options;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.thread_id = dataReq.thread_id;
                this.options = dataReq.options;
                this.f14709common = dataReq.f14708common;
                this.forum_id = dataReq.forum_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
