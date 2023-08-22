package tbclient.PushThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1465common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer push_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_PUSH_TYPE = 0;
    public static final Long DEFAULT_USER_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1466common;
        public Long forum_id;
        public Integer push_type;
        public Long thread_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1466common = dataReq.f1465common;
            this.forum_id = dataReq.forum_id;
            this.thread_id = dataReq.thread_id;
            this.push_type = dataReq.push_type;
            this.user_id = dataReq.user_id;
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
            this.f1465common = builder.f1466common;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Integer num = builder.push_type;
            if (num == null) {
                this.push_type = DEFAULT_PUSH_TYPE;
            } else {
                this.push_type = num;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = l3;
                return;
            }
        }
        this.f1465common = builder.f1466common;
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.push_type = builder.push_type;
        this.user_id = builder.user_id;
    }
}
