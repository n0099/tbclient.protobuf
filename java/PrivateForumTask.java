package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class PrivateForumTask extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer active_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer like_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer main_post_status;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer task_left_time;
    public static final Integer DEFAULT_AUDIT_STATUS = 0;
    public static final Integer DEFAULT_LIKE_STATUS = 0;
    public static final Integer DEFAULT_ACTIVE_STATUS = 0;
    public static final Integer DEFAULT_MAIN_POST_STATUS = 0;
    public static final Integer DEFAULT_TASK_LEFT_TIME = 0;

    private PrivateForumTask(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.audit_status == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = builder.audit_status;
            }
            if (builder.like_status == null) {
                this.like_status = DEFAULT_LIKE_STATUS;
            } else {
                this.like_status = builder.like_status;
            }
            if (builder.active_status == null) {
                this.active_status = DEFAULT_ACTIVE_STATUS;
            } else {
                this.active_status = builder.active_status;
            }
            if (builder.main_post_status == null) {
                this.main_post_status = DEFAULT_MAIN_POST_STATUS;
            } else {
                this.main_post_status = builder.main_post_status;
            }
            if (builder.task_left_time == null) {
                this.task_left_time = DEFAULT_TASK_LEFT_TIME;
                return;
            } else {
                this.task_left_time = builder.task_left_time;
                return;
            }
        }
        this.audit_status = builder.audit_status;
        this.like_status = builder.like_status;
        this.active_status = builder.active_status;
        this.main_post_status = builder.main_post_status;
        this.task_left_time = builder.task_left_time;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<PrivateForumTask> {
        public Integer active_status;
        public Integer audit_status;
        public Integer like_status;
        public Integer main_post_status;
        public Integer task_left_time;

        public Builder() {
        }

        public Builder(PrivateForumTask privateForumTask) {
            super(privateForumTask);
            if (privateForumTask != null) {
                this.audit_status = privateForumTask.audit_status;
                this.like_status = privateForumTask.like_status;
                this.active_status = privateForumTask.active_status;
                this.main_post_status = privateForumTask.main_post_status;
                this.task_left_time = privateForumTask.task_left_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumTask build(boolean z) {
            return new PrivateForumTask(this, z);
        }
    }
}
