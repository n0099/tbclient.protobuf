package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes6.dex */
public final class UserMuteCheckResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    private UserMuteCheckResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<UserMuteCheckResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserMuteCheckResIdl userMuteCheckResIdl) {
            super(userMuteCheckResIdl);
            if (userMuteCheckResIdl != null) {
                this.data = userMuteCheckResIdl.data;
                this.error = userMuteCheckResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserMuteCheckResIdl build(boolean z) {
            return new UserMuteCheckResIdl(this, z);
        }
    }
}
