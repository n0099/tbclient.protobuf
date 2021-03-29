package tbclient.FollowDync;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class FollowDyncReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FollowDyncReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FollowDyncReqIdl followDyncReqIdl) {
            super(followDyncReqIdl);
            if (followDyncReqIdl == null) {
                return;
            }
            this.data = followDyncReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FollowDyncReqIdl build(boolean z) {
            return new FollowDyncReqIdl(this, z);
        }
    }

    public FollowDyncReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
