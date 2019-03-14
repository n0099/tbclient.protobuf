package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class ForumCreateInfo extends Message {
    public static final String DEFAULT_CAN_CREATE_ERRDATA = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String can_create_errdata;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer can_create_errno;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_can_create;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_show_create;
    public static final Integer DEFAULT_IS_SHOW_CREATE = 0;
    public static final Integer DEFAULT_IS_CAN_CREATE = 0;
    public static final Integer DEFAULT_CAN_CREATE_ERRNO = 0;

    private ForumCreateInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_show_create == null) {
                this.is_show_create = DEFAULT_IS_SHOW_CREATE;
            } else {
                this.is_show_create = builder.is_show_create;
            }
            if (builder.is_can_create == null) {
                this.is_can_create = DEFAULT_IS_CAN_CREATE;
            } else {
                this.is_can_create = builder.is_can_create;
            }
            if (builder.can_create_errno == null) {
                this.can_create_errno = DEFAULT_CAN_CREATE_ERRNO;
            } else {
                this.can_create_errno = builder.can_create_errno;
            }
            if (builder.can_create_errdata == null) {
                this.can_create_errdata = "";
                return;
            } else {
                this.can_create_errdata = builder.can_create_errdata;
                return;
            }
        }
        this.is_show_create = builder.is_show_create;
        this.is_can_create = builder.is_can_create;
        this.can_create_errno = builder.can_create_errno;
        this.can_create_errdata = builder.can_create_errdata;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ForumCreateInfo> {
        public String can_create_errdata;
        public Integer can_create_errno;
        public Integer is_can_create;
        public Integer is_show_create;

        public Builder() {
        }

        public Builder(ForumCreateInfo forumCreateInfo) {
            super(forumCreateInfo);
            if (forumCreateInfo != null) {
                this.is_show_create = forumCreateInfo.is_show_create;
                this.is_can_create = forumCreateInfo.is_can_create;
                this.can_create_errno = forumCreateInfo.can_create_errno;
                this.can_create_errdata = forumCreateInfo.can_create_errdata;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumCreateInfo build(boolean z) {
            return new ForumCreateInfo(this, z);
        }
    }
}