package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_TASK_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1274common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long task_id;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1275common;
        public Long task_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1275common = dataReq.f1274common;
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
            this.f1274common = builder.f1275common;
            Long l = builder.task_id;
            if (l == null) {
                this.task_id = DEFAULT_TASK_ID;
                return;
            } else {
                this.task_id = l;
                return;
            }
        }
        this.f1274common = builder.f1275common;
        this.task_id = builder.task_id;
    }
}
