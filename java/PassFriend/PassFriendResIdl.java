package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class PassFriendResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PassFriendResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PassFriendResIdl passFriendResIdl) {
            super(passFriendResIdl);
            if (passFriendResIdl == null) {
                return;
            }
            this.error = passFriendResIdl.error;
            this.data = passFriendResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PassFriendResIdl build(boolean z) {
            return new PassFriendResIdl(this, z);
        }
    }

    public PassFriendResIdl(Builder builder, boolean z) {
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
