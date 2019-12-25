package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class TaskInfo extends Message {
    public static final String DEFAULT_BGIMG = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_THREAD_IMG = "";
    public static final String DEFAULT_THREAD_IMG_SIZE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bgimg;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long start_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long task_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thread_img;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String thread_img_size;
    public static final Long DEFAULT_TASK_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;

    private TaskInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = builder.task_id;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.bgimg == null) {
                this.bgimg = "";
            } else {
                this.bgimg = builder.bgimg;
            }
            if (builder.thread_img == null) {
                this.thread_img = "";
            } else {
                this.thread_img = builder.thread_img;
            }
            if (builder.start_time == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = builder.start_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.thread_img_size == null) {
                this.thread_img_size = "";
            } else {
                this.thread_img_size = builder.thread_img_size;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.obj_id == null) {
                this.obj_id = "";
                return;
            } else {
                this.obj_id = builder.obj_id;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.thread_id = builder.thread_id;
        this.bgimg = builder.bgimg;
        this.thread_img = builder.thread_img;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.thread_img_size = builder.thread_img_size;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.obj_id = builder.obj_id;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<TaskInfo> {
        public String bgimg;
        public Long end_time;
        public Long forum_id;
        public String forum_name;
        public String obj_id;
        public Long start_time;
        public Long task_id;
        public Long thread_id;
        public String thread_img;
        public String thread_img_size;

        public Builder() {
        }

        public Builder(TaskInfo taskInfo) {
            super(taskInfo);
            if (taskInfo != null) {
                this.task_id = taskInfo.task_id;
                this.thread_id = taskInfo.thread_id;
                this.bgimg = taskInfo.bgimg;
                this.thread_img = taskInfo.thread_img;
                this.start_time = taskInfo.start_time;
                this.end_time = taskInfo.end_time;
                this.thread_img_size = taskInfo.thread_img_size;
                this.forum_id = taskInfo.forum_id;
                this.forum_name = taskInfo.forum_name;
                this.obj_id = taskInfo.obj_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TaskInfo build(boolean z) {
            return new TaskInfo(this, z);
        }
    }
}
