package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetOrderResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ GetOrderResIdl(Builder builder, boolean z, GetOrderResIdl getOrderResIdl) {
        this(builder, z);
    }

    private GetOrderResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetOrderResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetOrderResIdl getOrderResIdl) {
            super(getOrderResIdl);
            if (getOrderResIdl != null) {
                this.data = getOrderResIdl.data;
                this.error = getOrderResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetOrderResIdl build(boolean z) {
            return new GetOrderResIdl(this, z, null);
        }
    }
}
