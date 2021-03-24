package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetTokenReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetTokenReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetTokenReqIdl getTokenReqIdl) {
            super(getTokenReqIdl);
            if (getTokenReqIdl == null) {
                return;
            }
            this.data = getTokenReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetTokenReqIdl build(boolean z) {
            return new GetTokenReqIdl(this, z);
        }
    }

    public GetTokenReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
