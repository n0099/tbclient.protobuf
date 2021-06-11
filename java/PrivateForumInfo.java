package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class PrivateForumInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer private_forum_audit_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer private_forum_status;
    public static final Integer DEFAULT_PRIVATE_FORUM_STATUS = 0;
    public static final Integer DEFAULT_PRIVATE_FORUM_AUDIT_STATUS = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PrivateForumInfo> {
        public Integer private_forum_audit_status;
        public Integer private_forum_status;

        public Builder() {
        }

        public Builder(PrivateForumInfo privateForumInfo) {
            super(privateForumInfo);
            if (privateForumInfo == null) {
                return;
            }
            this.private_forum_status = privateForumInfo.private_forum_status;
            this.private_forum_audit_status = privateForumInfo.private_forum_audit_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumInfo build(boolean z) {
            return new PrivateForumInfo(this, z);
        }
    }

    public PrivateForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.private_forum_status;
            if (num == null) {
                this.private_forum_status = DEFAULT_PRIVATE_FORUM_STATUS;
            } else {
                this.private_forum_status = num;
            }
            Integer num2 = builder.private_forum_audit_status;
            if (num2 == null) {
                this.private_forum_audit_status = DEFAULT_PRIVATE_FORUM_AUDIT_STATUS;
                return;
            } else {
                this.private_forum_audit_status = num2;
                return;
            }
        }
        this.private_forum_status = builder.private_forum_status;
        this.private_forum_audit_status = builder.private_forum_audit_status;
    }
}
