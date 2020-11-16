package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes20.dex */
public final class UserInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    private UserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = builder.portrait;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<UserInfo> {
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(UserInfo userInfo) {
            super(userInfo);
            if (userInfo != null) {
                this.user_id = userInfo.user_id;
                this.user_name = userInfo.user_name;
                this.portrait = userInfo.portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfo build(boolean z) {
            return new UserInfo(this, z);
        }
    }
}
