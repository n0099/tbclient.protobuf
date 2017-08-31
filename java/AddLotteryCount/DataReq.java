package tbclient.AddLotteryCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long award_act_id;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer from_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_AWARD_ACT_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_FROM_TYPE = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.award_act_id == null) {
                this.award_act_id = DEFAULT_AWARD_ACT_ID;
            } else {
                this.award_act_id = builder.award_act_id;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.from_type == null) {
                this.from_type = DEFAULT_FROM_TYPE;
            } else {
                this.from_type = builder.from_type;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
                return;
            } else {
                this.thread_id = builder.thread_id;
                return;
            }
        }
        this.common = builder.common;
        this.award_act_id = builder.award_act_id;
        this.user_id = builder.user_id;
        this.from_type = builder.from_type;
        this.thread_id = builder.thread_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long award_act_id;
        public CommonReq common;
        public Integer from_type;
        public Long thread_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.award_act_id = dataReq.award_act_id;
                this.user_id = dataReq.user_id;
                this.from_type = dataReq.from_type;
                this.thread_id = dataReq.thread_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}