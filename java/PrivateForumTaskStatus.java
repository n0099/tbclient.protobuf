package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class PrivateForumTaskStatus extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer active_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer like_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer main_post_status;
    public static final Integer DEFAULT_AUDIT_STATUS = 0;
    public static final Integer DEFAULT_LIKE_STATUS = 0;
    public static final Integer DEFAULT_ACTIVE_STATUS = 0;
    public static final Integer DEFAULT_MAIN_POST_STATUS = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PrivateForumTaskStatus> {
        public Integer active_status;
        public Integer audit_status;
        public Integer like_status;
        public Integer main_post_status;

        public Builder() {
        }

        public Builder(PrivateForumTaskStatus privateForumTaskStatus) {
            super(privateForumTaskStatus);
            if (privateForumTaskStatus == null) {
                return;
            }
            this.audit_status = privateForumTaskStatus.audit_status;
            this.like_status = privateForumTaskStatus.like_status;
            this.active_status = privateForumTaskStatus.active_status;
            this.main_post_status = privateForumTaskStatus.main_post_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumTaskStatus build(boolean z) {
            return new PrivateForumTaskStatus(this, z);
        }
    }

    public PrivateForumTaskStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.audit_status;
            if (num == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = num;
            }
            Integer num2 = builder.like_status;
            if (num2 == null) {
                this.like_status = DEFAULT_LIKE_STATUS;
            } else {
                this.like_status = num2;
            }
            Integer num3 = builder.active_status;
            if (num3 == null) {
                this.active_status = DEFAULT_ACTIVE_STATUS;
            } else {
                this.active_status = num3;
            }
            Integer num4 = builder.main_post_status;
            if (num4 == null) {
                this.main_post_status = DEFAULT_MAIN_POST_STATUS;
                return;
            } else {
                this.main_post_status = num4;
                return;
            }
        }
        this.audit_status = builder.audit_status;
        this.like_status = builder.like_status;
        this.active_status = builder.active_status;
        this.main_post_status = builder.main_post_status;
    }
}
