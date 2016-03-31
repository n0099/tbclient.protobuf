package tbclient.GetConsentList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetConsentListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetConsentListReqIdl(Builder builder, boolean z, GetConsentListReqIdl getConsentListReqIdl) {
        this(builder, z);
    }

    private GetConsentListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetConsentListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetConsentListReqIdl getConsentListReqIdl) {
            super(getConsentListReqIdl);
            if (getConsentListReqIdl != null) {
                this.data = getConsentListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetConsentListReqIdl build(boolean z) {
            return new GetConsentListReqIdl(this, z, null);
        }
    }
}
