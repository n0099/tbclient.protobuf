package tbclient.GetConsentList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetConsentListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetConsentListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetConsentListResIdl getConsentListResIdl) {
            super(getConsentListResIdl);
            if (getConsentListResIdl == null) {
                return;
            }
            this.error = getConsentListResIdl.error;
            this.data = getConsentListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetConsentListResIdl build(boolean z) {
            return new GetConsentListResIdl(this, z);
        }
    }

    public GetConsentListResIdl(Builder builder, boolean z) {
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
