package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class UserlikeResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private UserlikeResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserlikeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserlikeResIdl userlikeResIdl) {
            super(userlikeResIdl);
            if (userlikeResIdl != null) {
                this.error = userlikeResIdl.error;
                this.data = userlikeResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserlikeResIdl build(boolean z) {
            return new UserlikeResIdl(this, z);
        }
    }
}
