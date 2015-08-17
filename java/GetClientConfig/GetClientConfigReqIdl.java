package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetClientConfigReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetClientConfigReqIdl(Builder builder, boolean z, GetClientConfigReqIdl getClientConfigReqIdl) {
        this(builder, z);
    }

    private GetClientConfigReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetClientConfigReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetClientConfigReqIdl getClientConfigReqIdl) {
            super(getClientConfigReqIdl);
            if (getClientConfigReqIdl != null) {
                this.data = getClientConfigReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetClientConfigReqIdl build(boolean z) {
            return new GetClientConfigReqIdl(this, z, null);
        }
    }
}
