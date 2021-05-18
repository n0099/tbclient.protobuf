package tbclient.GetUserOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetUserOrderResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetUserOrderResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUserOrderResIdl getUserOrderResIdl) {
            super(getUserOrderResIdl);
            if (getUserOrderResIdl == null) {
                return;
            }
            this.error = getUserOrderResIdl.error;
            this.data = getUserOrderResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserOrderResIdl build(boolean z) {
            return new GetUserOrderResIdl(this, z);
        }
    }

    public GetUserOrderResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
