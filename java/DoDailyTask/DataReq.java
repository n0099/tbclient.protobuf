package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68348common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long task_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_TASK_ID = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68349common;
        public Long task_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68349common = dataReq.f68348common;
            this.user_id = dataReq.user_id;
            this.task_id = dataReq.task_id;
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
            this.f68348common = builder.f68349common;
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Long l2 = builder.task_id;
            if (l2 == null) {
                this.task_id = DEFAULT_TASK_ID;
                return;
            } else {
                this.task_id = l2;
                return;
            }
        }
        this.f68348common = builder.f68349common;
        this.user_id = builder.user_id;
        this.task_id = builder.task_id;
    }
}