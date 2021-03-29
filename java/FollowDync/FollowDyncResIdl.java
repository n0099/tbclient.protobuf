package tbclient.FollowDync;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class FollowDyncResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FollowDyncResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FollowDyncResIdl followDyncResIdl) {
            super(followDyncResIdl);
            if (followDyncResIdl == null) {
                return;
            }
            this.error = followDyncResIdl.error;
            this.data = followDyncResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FollowDyncResIdl build(boolean z) {
            return new FollowDyncResIdl(this, z);
        }
    }

    public FollowDyncResIdl(Builder builder, boolean z) {
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
