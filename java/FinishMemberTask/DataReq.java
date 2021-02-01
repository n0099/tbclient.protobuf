package tbclient.FinishMemberTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_TASK_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14465common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long task_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14465common = builder.f14466common;
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
                return;
            } else {
                this.task_id = builder.task_id;
                return;
            }
        }
        this.f14465common = builder.f14466common;
        this.task_id = builder.task_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14466common;
        public Long task_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14466common = dataReq.f14465common;
                this.task_id = dataReq.task_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
