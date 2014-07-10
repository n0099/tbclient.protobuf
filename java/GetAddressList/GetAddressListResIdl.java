package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetAddressListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetAddressListResIdl(Builder builder, boolean z, GetAddressListResIdl getAddressListResIdl) {
        this(builder, z);
    }

    private GetAddressListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetAddressListResIdl> {
        public DataRes data;
        public Error error;

        public Builder(GetAddressListResIdl getAddressListResIdl) {
            super(getAddressListResIdl);
            if (getAddressListResIdl != null) {
                this.error = getAddressListResIdl.error;
                this.data = getAddressListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetAddressListResIdl build(boolean z) {
            return new GetAddressListResIdl(this, z, null);
        }
    }
}
