package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GetLockWindowMsgReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetLockWindowMsgReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetLockWindowMsgReqIdl getLockWindowMsgReqIdl) {
            super(getLockWindowMsgReqIdl);
            if (getLockWindowMsgReqIdl == null) {
                return;
            }
            this.data = getLockWindowMsgReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetLockWindowMsgReqIdl build(boolean z) {
            return new GetLockWindowMsgReqIdl(this, z);
        }
    }

    public GetLockWindowMsgReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
