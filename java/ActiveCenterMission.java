package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class ActiveCenterMission extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_FINAL_REWARD_URL = "";
    public static final String DEFAULT_MISSION = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer active_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cleartime;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer cleartype;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String final_reward_url;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String mission;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer mission_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer task_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer total_limit;
    public static final Integer DEFAULT_ACTIVE_ID = 0;
    public static final Integer DEFAULT_MISSION_ID = 0;
    public static final Integer DEFAULT_TASK_TYPE = 0;
    public static final Integer DEFAULT_CLEARTYPE = 0;
    public static final Integer DEFAULT_CLEARTIME = 0;
    public static final Integer DEFAULT_TOTAL_LIMIT = 0;

    private ActiveCenterMission(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.active_id == null) {
                this.active_id = DEFAULT_ACTIVE_ID;
            } else {
                this.active_id = builder.active_id;
            }
            if (builder.mission_id == null) {
                this.mission_id = DEFAULT_MISSION_ID;
            } else {
                this.mission_id = builder.mission_id;
            }
            if (builder.task_type == null) {
                this.task_type = DEFAULT_TASK_TYPE;
            } else {
                this.task_type = builder.task_type;
            }
            if (builder.cleartype == null) {
                this.cleartype = DEFAULT_CLEARTYPE;
            } else {
                this.cleartype = builder.cleartype;
            }
            if (builder.cleartime == null) {
                this.cleartime = DEFAULT_CLEARTIME;
            } else {
                this.cleartime = builder.cleartime;
            }
            if (builder.total_limit == null) {
                this.total_limit = DEFAULT_TOTAL_LIMIT;
            } else {
                this.total_limit = builder.total_limit;
            }
            if (builder.final_reward_url == null) {
                this.final_reward_url = "";
            } else {
                this.final_reward_url = builder.final_reward_url;
            }
            if (builder.mission == null) {
                this.mission = "";
            } else {
                this.mission = builder.mission;
            }
            if (builder.desc == null) {
                this.desc = "";
                return;
            } else {
                this.desc = builder.desc;
                return;
            }
        }
        this.active_id = builder.active_id;
        this.mission_id = builder.mission_id;
        this.task_type = builder.task_type;
        this.cleartype = builder.cleartype;
        this.cleartime = builder.cleartime;
        this.total_limit = builder.total_limit;
        this.final_reward_url = builder.final_reward_url;
        this.mission = builder.mission;
        this.desc = builder.desc;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ActiveCenterMission> {
        public Integer active_id;
        public Integer cleartime;
        public Integer cleartype;
        public String desc;
        public String final_reward_url;
        public String mission;
        public Integer mission_id;
        public Integer task_type;
        public Integer total_limit;

        public Builder() {
        }

        public Builder(ActiveCenterMission activeCenterMission) {
            super(activeCenterMission);
            if (activeCenterMission != null) {
                this.active_id = activeCenterMission.active_id;
                this.mission_id = activeCenterMission.mission_id;
                this.task_type = activeCenterMission.task_type;
                this.cleartype = activeCenterMission.cleartype;
                this.cleartime = activeCenterMission.cleartime;
                this.total_limit = activeCenterMission.total_limit;
                this.final_reward_url = activeCenterMission.final_reward_url;
                this.mission = activeCenterMission.mission;
                this.desc = activeCenterMission.desc;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveCenterMission build(boolean z) {
            return new ActiveCenterMission(this, z);
        }
    }
}
