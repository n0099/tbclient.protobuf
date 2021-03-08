package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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

    private PointTaskInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = builder.task_id;
            }
            if (builder.task_name == null) {
                this.task_name = "";
            } else {
                this.task_name = builder.task_name;
            }
            if (builder.task_intro == null) {
                this.task_intro = "";
            } else {
                this.task_intro = builder.task_intro;
            }
            if (builder.is_finish == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = builder.is_finish;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.points_add == null) {
                this.points_add = DEFAULT_POINTS_ADD;
                return;
            } else {
                this.points_add = builder.points_add;
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

    /* loaded from: classes8.dex */
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
            if (pointTaskInfo != null) {
                this.task_id = pointTaskInfo.task_id;
                this.task_name = pointTaskInfo.task_name;
                this.task_intro = pointTaskInfo.task_intro;
                this.is_finish = pointTaskInfo.is_finish;
                this.type = pointTaskInfo.type;
                this.points_add = pointTaskInfo.points_add;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PointTaskInfo build(boolean z) {
            return new PointTaskInfo(this, z);
        }
    }
}
