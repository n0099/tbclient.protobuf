package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetLockWindowMsgResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetLockWindowMsgResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetLockWindowMsgResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetLockWindowMsgResIdl getLockWindowMsgResIdl) {
            super(getLockWindowMsgResIdl);
            if (getLockWindowMsgResIdl != null) {
                this.error = getLockWindowMsgResIdl.error;
                this.data = getLockWindowMsgResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetLockWindowMsgResIdl build(boolean z) {
            return new GetLockWindowMsgResIdl(this, z);
        }
    }
}
