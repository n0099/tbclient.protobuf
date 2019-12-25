package tbclient.ReplyFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes6.dex */
public final class ReplyFriendResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    private ReplyFriendResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<ReplyFriendResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(ReplyFriendResIdl replyFriendResIdl) {
            super(replyFriendResIdl);
            if (replyFriendResIdl != null) {
                this.data = replyFriendResIdl.data;
                this.error = replyFriendResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyFriendResIdl build(boolean z) {
            return new ReplyFriendResIdl(this, z);
        }
    }
}
