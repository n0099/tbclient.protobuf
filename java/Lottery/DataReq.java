package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long activity_id;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long award_act_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1129common;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long component_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer from_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_FROM_TYPE = 0;
    public static final Long DEFAULT_ACTIVITY_ID = 0L;
    public static final Long DEFAULT_AWARD_ACT_ID = 0L;
    public static final Long DEFAULT_COMPONENT_ID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1129common = builder.f1130common;
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.from_type == null) {
                this.from_type = DEFAULT_FROM_TYPE;
            } else {
                this.from_type = builder.from_type;
            }
            if (builder.activity_id == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = builder.activity_id;
            }
            if (builder.award_act_id == null) {
                this.award_act_id = DEFAULT_AWARD_ACT_ID;
            } else {
                this.award_act_id = builder.award_act_id;
            }
            if (builder.component_id == null) {
                this.component_id = DEFAULT_COMPONENT_ID;
                return;
            } else {
                this.component_id = builder.component_id;
                return;
            }
        }
        this.f1129common = builder.f1130common;
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.from_type = builder.from_type;
        this.activity_id = builder.activity_id;
        this.award_act_id = builder.award_act_id;
        this.component_id = builder.component_id;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long activity_id;
        public Long award_act_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1130common;
        public Long component_id;
        public Long forum_id;
        public Integer from_type;
        public Long thread_id;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1130common = dataReq.f1129common;
                this.user_id = dataReq.user_id;
                this.user_name = dataReq.user_name;
                this.forum_id = dataReq.forum_id;
                this.thread_id = dataReq.thread_id;
                this.from_type = dataReq.from_type;
                this.activity_id = dataReq.activity_id;
                this.award_act_id = dataReq.award_act_id;
                this.component_id = dataReq.component_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
