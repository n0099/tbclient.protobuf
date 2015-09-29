package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ActInfo extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer activity_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer activity_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer award_act_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer begin_time;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer component_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer total_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ACTIVITY_TYPE = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_BEGIN_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_ACTIVITY_ID = 0;
    public static final Integer DEFAULT_AWARD_ACT_ID = 0;
    public static final Integer DEFAULT_COMPONENT_ID = 0;

    /* synthetic */ ActInfo(Builder builder, boolean z, ActInfo actInfo) {
        this(builder, z);
    }

    private ActInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.activity_type == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = builder.activity_type;
            }
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
            }
            if (builder.begin_time == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = builder.begin_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.total_num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = builder.total_num;
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
        this.activity_type = builder.activity_type;
        this.status = builder.status;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.url = builder.url;
        this.total_num = builder.total_num;
        this.activity_id = builder.activity_id;
        this.award_act_id = builder.award_act_id;
        this.component_id = builder.component_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ActInfo> {
        public Integer activity_id;
        public Integer activity_type;
        public Integer award_act_id;
        public Integer begin_time;
        public Integer component_id;
        public Integer end_time;
        public Integer status;
        public Integer total_num;
        public String url;

        public Builder() {
        }

        public Builder(ActInfo actInfo) {
            super(actInfo);
            if (actInfo != null) {
                this.activity_type = actInfo.activity_type;
                this.status = actInfo.status;
                this.begin_time = actInfo.begin_time;
                this.end_time = actInfo.end_time;
                this.url = actInfo.url;
                this.total_num = actInfo.total_num;
                this.activity_id = actInfo.activity_id;
                this.award_act_id = actInfo.award_act_id;
                this.component_id = actInfo.component_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActInfo build(boolean z) {
            return new ActInfo(this, z, null);
        }
    }
}
