package tbclient.GetUserOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetUserOrderReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetUserOrderReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetUserOrderReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserOrderReqIdl getUserOrderReqIdl) {
            super(getUserOrderReqIdl);
            if (getUserOrderReqIdl != null) {
                this.data = getUserOrderReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserOrderReqIdl build(boolean z) {
            return new GetUserOrderReqIdl(this, z);
        }
    }
}
