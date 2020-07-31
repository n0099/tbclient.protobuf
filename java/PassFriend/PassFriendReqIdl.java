package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class PassFriendReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    private PassFriendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<PassFriendReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(PassFriendReqIdl passFriendReqIdl) {
            super(passFriendReqIdl);
            if (passFriendReqIdl != null) {
                this.data = passFriendReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PassFriendReqIdl build(boolean z) {
            return new PassFriendReqIdl(this, z);
        }
    }
}
