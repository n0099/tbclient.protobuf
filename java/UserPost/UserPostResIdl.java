package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class UserPostResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserPostResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserPostResIdl userPostResIdl) {
            super(userPostResIdl);
            if (userPostResIdl == null) {
                return;
            }
            this.error = userPostResIdl.error;
            this.data = userPostResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPostResIdl build(boolean z) {
            return new UserPostResIdl(this, z);
        }
    }

    public UserPostResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
