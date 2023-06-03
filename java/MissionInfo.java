package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class MissionInfo extends Message {
    public static final String DEFAULT_BROWSETIMEPAGE = "";
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer activityid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer browsetime;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String browsetimepage;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer cleartime;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer cleartype;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer missionid;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer tasktype;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer threadnum;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer total_limit;
    public static final Integer DEFAULT_MISSIONID = 0;
    public static final Integer DEFAULT_TOTAL_LIMIT = 0;
    public static final Integer DEFAULT_BROWSETIME = 0;
    public static final Integer DEFAULT_TASKTYPE = 0;
    public static final Integer DEFAULT_THREADNUM = 0;
    public static final Integer DEFAULT_ACTIVITYID = 0;
    public static final Integer DEFAULT_CLEARTYPE = 0;
    public static final Integer DEFAULT_CLEARTIME = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MissionInfo> {
        public Integer activityid;
        public Integer browsetime;
        public String browsetimepage;
        public Integer cleartime;
        public Integer cleartype;
        public Integer missionid;
        public Integer tasktype;
        public Integer threadnum;
        public Integer total_limit;

        public Builder() {
        }

        public Builder(MissionInfo missionInfo) {
            super(missionInfo);
            if (missionInfo == null) {
                return;
            }
            this.missionid = missionInfo.missionid;
            this.total_limit = missionInfo.total_limit;
            this.browsetime = missionInfo.browsetime;
            this.tasktype = missionInfo.tasktype;
            this.threadnum = missionInfo.threadnum;
            this.browsetimepage = missionInfo.browsetimepage;
            this.activityid = missionInfo.activityid;
            this.cleartype = missionInfo.cleartype;
            this.cleartime = missionInfo.cleartime;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MissionInfo build(boolean z) {
            return new MissionInfo(this, z);
        }
    }

    public MissionInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.missionid;
            if (num == null) {
                this.missionid = DEFAULT_MISSIONID;
            } else {
                this.missionid = num;
            }
            Integer num2 = builder.total_limit;
            if (num2 == null) {
                this.total_limit = DEFAULT_TOTAL_LIMIT;
            } else {
                this.total_limit = num2;
            }
            Integer num3 = builder.browsetime;
            if (num3 == null) {
                this.browsetime = DEFAULT_BROWSETIME;
            } else {
                this.browsetime = num3;
            }
            Integer num4 = builder.tasktype;
            if (num4 == null) {
                this.tasktype = DEFAULT_TASKTYPE;
            } else {
                this.tasktype = num4;
            }
            Integer num5 = builder.threadnum;
            if (num5 == null) {
                this.threadnum = DEFAULT_THREADNUM;
            } else {
                this.threadnum = num5;
            }
            String str = builder.browsetimepage;
            if (str == null) {
                this.browsetimepage = "";
            } else {
                this.browsetimepage = str;
            }
            Integer num6 = builder.activityid;
            if (num6 == null) {
                this.activityid = DEFAULT_ACTIVITYID;
            } else {
                this.activityid = num6;
            }
            Integer num7 = builder.cleartype;
            if (num7 == null) {
                this.cleartype = DEFAULT_CLEARTYPE;
            } else {
                this.cleartype = num7;
            }
            Integer num8 = builder.cleartime;
            if (num8 == null) {
                this.cleartime = DEFAULT_CLEARTIME;
                return;
            } else {
                this.cleartime = num8;
                return;
            }
        }
        this.missionid = builder.missionid;
        this.total_limit = builder.total_limit;
        this.browsetime = builder.browsetime;
        this.tasktype = builder.tasktype;
        this.threadnum = builder.threadnum;
        this.browsetimepage = builder.browsetimepage;
        this.activityid = builder.activityid;
        this.cleartype = builder.cleartype;
        this.cleartime = builder.cleartime;
    }
}
