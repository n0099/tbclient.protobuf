package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class UserMuteCheckResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserMuteCheckResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserMuteCheckResIdl userMuteCheckResIdl) {
            super(userMuteCheckResIdl);
            if (userMuteCheckResIdl == null) {
                return;
            }
            this.data = userMuteCheckResIdl.data;
            this.error = userMuteCheckResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserMuteCheckResIdl build(boolean z) {
            return new UserMuteCheckResIdl(this, z);
        }
    }

    public UserMuteCheckResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
