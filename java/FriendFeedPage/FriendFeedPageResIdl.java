package tbclient.FriendFeedPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class FriendFeedPageResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ FriendFeedPageResIdl(Builder builder, boolean z, FriendFeedPageResIdl friendFeedPageResIdl) {
        this(builder, z);
    }

    private FriendFeedPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<FriendFeedPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder(FriendFeedPageResIdl friendFeedPageResIdl) {
            super(friendFeedPageResIdl);
            if (friendFeedPageResIdl != null) {
                this.error = friendFeedPageResIdl.error;
                this.data = friendFeedPageResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FriendFeedPageResIdl build(boolean z) {
            return new FriendFeedPageResIdl(this, z, null);
        }
    }
}
