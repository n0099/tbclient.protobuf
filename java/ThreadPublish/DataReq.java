package tbclient.ThreadPublish;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1372common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long thread_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1373common;
        public Long forum_id;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1373common = dataReq.f1372common;
            this.forum_id = dataReq.forum_id;
            this.thread_id = dataReq.thread_id;
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
            this.f1372common = builder.f1373common;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
                return;
            } else {
                this.thread_id = l2;
                return;
            }
        }
        this.f1372common = builder.f1373common;
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
    }
}
