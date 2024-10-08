package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1339common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long task_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long tid;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_TASK_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1340common;
        public Long task_id;
        public Long tid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1340common = dataReq.f1339common;
            this.tid = dataReq.tid;
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
            this.f1339common = builder.f1340common;
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
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
        this.f1339common = builder.f1340common;
        this.tid = builder.tid;
        this.task_id = builder.task_id;
    }
}
