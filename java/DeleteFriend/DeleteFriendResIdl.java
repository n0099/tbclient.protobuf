package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes16.dex */
public final class DeleteFriendResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private DeleteFriendResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DeleteFriendResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(DeleteFriendResIdl deleteFriendResIdl) {
            super(deleteFriendResIdl);
            if (deleteFriendResIdl != null) {
                this.error = deleteFriendResIdl.error;
                this.data = deleteFriendResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DeleteFriendResIdl build(boolean z) {
            return new DeleteFriendResIdl(this, z);
        }
    }
}
