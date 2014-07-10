package tbclient.FriendFeedPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FriendFeedPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ FriendFeedPageReqIdl(Builder builder, boolean z, FriendFeedPageReqIdl friendFeedPageReqIdl) {
        this(builder, z);
    }

    private FriendFeedPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<FriendFeedPageReqIdl> {
        public DataReq data;

        public Builder(FriendFeedPageReqIdl friendFeedPageReqIdl) {
            super(friendFeedPageReqIdl);
            if (friendFeedPageReqIdl != null) {
                this.data = friendFeedPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FriendFeedPageReqIdl build(boolean z) {
            return new FriendFeedPageReqIdl(this, z, null);
        }
    }
}
