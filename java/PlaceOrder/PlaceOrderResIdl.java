package tbclient.PlaceOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class PlaceOrderResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PlaceOrderResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PlaceOrderResIdl placeOrderResIdl) {
            super(placeOrderResIdl);
            if (placeOrderResIdl == null) {
                return;
            }
            this.data = placeOrderResIdl.data;
            this.error = placeOrderResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PlaceOrderResIdl build(boolean z) {
            return new PlaceOrderResIdl(this, z);
        }
    }

    public PlaceOrderResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
