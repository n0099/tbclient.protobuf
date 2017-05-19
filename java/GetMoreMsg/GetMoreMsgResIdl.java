package tbclient.GetMoreMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class GetMoreMsgResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetMoreMsgResIdl(Builder builder, boolean z, GetMoreMsgResIdl getMoreMsgResIdl) {
        this(builder, z);
    }

    private GetMoreMsgResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetMoreMsgResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetMoreMsgResIdl getMoreMsgResIdl) {
            super(getMoreMsgResIdl);
            if (getMoreMsgResIdl != null) {
                this.error = getMoreMsgResIdl.error;
                this.data = getMoreMsgResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMoreMsgResIdl build(boolean z) {
            return new GetMoreMsgResIdl(this, z, null);
        }
    }
}
