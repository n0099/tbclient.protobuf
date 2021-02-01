package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14421common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer task_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_TASK_ID = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14421common = builder.f14422common;
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
                return;
            } else {
                this.task_id = builder.task_id;
                return;
            }
        }
        this.f14421common = builder.f14422common;
        this.user_id = builder.user_id;
        this.task_id = builder.task_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14422common;
        public Integer task_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14422common = dataReq.f14421common;
                this.user_id = dataReq.user_id;
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
