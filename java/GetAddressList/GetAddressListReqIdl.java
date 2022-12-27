package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GetAddressListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetAddressListReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(GetAddressListReqIdl getAddressListReqIdl) {
            super(getAddressListReqIdl);
            if (getAddressListReqIdl == null) {
                return;
            }
            this.data = getAddressListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetAddressListReqIdl build(boolean z) {
            return new GetAddressListReqIdl(this, z);
        }
    }

    public GetAddressListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
