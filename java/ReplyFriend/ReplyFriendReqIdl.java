package tbclient.ReplyFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ReplyFriendReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReplyFriendReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(ReplyFriendReqIdl replyFriendReqIdl) {
            super(replyFriendReqIdl);
            if (replyFriendReqIdl == null) {
                return;
            }
            this.data = replyFriendReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyFriendReqIdl build(boolean z) {
            return new ReplyFriendReqIdl(this, z);
        }
    }

    public ReplyFriendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
