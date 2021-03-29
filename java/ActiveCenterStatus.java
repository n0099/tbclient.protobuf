package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ActiveCenterStatus extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_MISSION = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer day;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_completed;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_today_mission;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String mission;
    public static final Integer DEFAULT_DAY = 0;
    public static final Integer DEFAULT_IS_COMPLETED = 0;
    public static final Integer DEFAULT_IS_TODAY_MISSION = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ActiveCenterStatus> {
        public Integer day;
        public String desc;
        public Integer is_completed;
        public Integer is_today_mission;
        public String mission;

        public Builder() {
        }

        public Builder(ActiveCenterStatus activeCenterStatus) {
            super(activeCenterStatus);
            if (activeCenterStatus == null) {
                return;
            }
            this.day = activeCenterStatus.day;
            this.is_completed = activeCenterStatus.is_completed;
            this.mission = activeCenterStatus.mission;
            this.is_today_mission = activeCenterStatus.is_today_mission;
            this.desc = activeCenterStatus.desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveCenterStatus build(boolean z) {
            return new ActiveCenterStatus(this, z);
        }
    }

    public ActiveCenterStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.day;
            if (num == null) {
                this.day = DEFAULT_DAY;
            } else {
                this.day = num;
            }
            Integer num2 = builder.is_completed;
            if (num2 == null) {
                this.is_completed = DEFAULT_IS_COMPLETED;
            } else {
                this.is_completed = num2;
            }
            String str = builder.mission;
            if (str == null) {
                this.mission = "";
            } else {
                this.mission = str;
            }
            Integer num3 = builder.is_today_mission;
            if (num3 == null) {
                this.is_today_mission = DEFAULT_IS_TODAY_MISSION;
            } else {
                this.is_today_mission = num3;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
                return;
            } else {
                this.desc = str2;
                return;
            }
        }
        this.day = builder.day;
        this.is_completed = builder.is_completed;
        this.mission = builder.mission;
        this.is_today_mission = builder.is_today_mission;
        this.desc = builder.desc;
    }
}
