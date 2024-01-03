package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PointTaskInfo extends Message {
    public static final String DEFAULT_TASK_INTRO = "";
    public static final String DEFAULT_TASK_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_finish;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer points_add;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long task_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String task_intro;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String task_name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_TASK_ID = 0L;
    public static final Integer DEFAULT_IS_FINISH = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_POINTS_ADD = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PointTaskInfo> {
        public Integer is_finish;
        public Integer points_add;
        public Long task_id;
        public String task_intro;
        public String task_name;
        public Integer type;

        public Builder() {
        }

        public Builder(PointTaskInfo pointTaskInfo) {
            super(pointTaskInfo);
            if (pointTaskInfo == null) {
                return;
            }
            this.task_id = pointTaskInfo.task_id;
            this.task_name = pointTaskInfo.task_name;
            this.task_intro = pointTaskInfo.task_intro;
            this.is_finish = pointTaskInfo.is_finish;
            this.type = pointTaskInfo.type;
            this.points_add = pointTaskInfo.points_add;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PointTaskInfo build(boolean z) {
            return new PointTaskInfo(this, z);
        }
    }

    public PointTaskInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.task_id;
            if (l == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = l;
            }
            String str = builder.task_name;
            if (str == null) {
                this.task_name = "";
            } else {
                this.task_name = str;
            }
            String str2 = builder.task_intro;
            if (str2 == null) {
                this.task_intro = "";
            } else {
                this.task_intro = str2;
            }
            Integer num = builder.is_finish;
            if (num == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            Integer num3 = builder.points_add;
            if (num3 == null) {
                this.points_add = DEFAULT_POINTS_ADD;
                return;
            } else {
                this.points_add = num3;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.task_name = builder.task_name;
        this.task_intro = builder.task_intro;
        this.is_finish = builder.is_finish;
        this.type = builder.type;
        this.points_add = builder.points_add;
    }
}
