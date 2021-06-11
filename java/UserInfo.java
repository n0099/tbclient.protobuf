package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class UserInfo extends Message {
    public static final String DEFAULT_USER_ID = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_id;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<UserInfo> {
        public String user_id;

        public Builder() {
        }

        public Builder(UserInfo userInfo) {
            super(userInfo);
            if (userInfo == null) {
                return;
            }
            this.user_id = userInfo.user_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfo build(boolean z) {
            return new UserInfo(this, z);
        }
    }

    public UserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.user_id;
            if (str == null) {
                this.user_id = "";
                return;
            } else {
                this.user_id = str;
                return;
            }
        }
        this.user_id = builder.user_id;
    }
}
