package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserPostPerm extends Message {
    public static final Integer DEFAULT_NOT_SHOW_HIDE_THREAD = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer not_show_hide_thread;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserPostPerm> {
        public Integer not_show_hide_thread;

        public Builder() {
        }

        public Builder(UserPostPerm userPostPerm) {
            super(userPostPerm);
            if (userPostPerm == null) {
                return;
            }
            this.not_show_hide_thread = userPostPerm.not_show_hide_thread;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPostPerm build(boolean z) {
            return new UserPostPerm(this, z);
        }
    }

    public UserPostPerm(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.not_show_hide_thread;
            if (num == null) {
                this.not_show_hide_thread = DEFAULT_NOT_SHOW_HIDE_THREAD;
                return;
            } else {
                this.not_show_hide_thread = num;
                return;
            }
        }
        this.not_show_hide_thread = builder.not_show_hide_thread;
    }
}
