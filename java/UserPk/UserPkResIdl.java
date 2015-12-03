package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class UserPkResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ UserPkResIdl(Builder builder, boolean z, UserPkResIdl userPkResIdl) {
        this(builder, z);
    }

    private UserPkResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<UserPkResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserPkResIdl userPkResIdl) {
            super(userPkResIdl);
            if (userPkResIdl != null) {
                this.data = userPkResIdl.data;
                this.error = userPkResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPkResIdl build(boolean z) {
            return new UserPkResIdl(this, z, null);
        }
    }
}
