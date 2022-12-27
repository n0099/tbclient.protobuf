package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetSuggestionByAddrNameResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetSuggestionByAddrNameResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetSuggestionByAddrNameResIdl getSuggestionByAddrNameResIdl) {
            super(getSuggestionByAddrNameResIdl);
            if (getSuggestionByAddrNameResIdl == null) {
                return;
            }
            this.error = getSuggestionByAddrNameResIdl.error;
            this.data = getSuggestionByAddrNameResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSuggestionByAddrNameResIdl build(boolean z) {
            return new GetSuggestionByAddrNameResIdl(this, z);
        }
    }

    public GetSuggestionByAddrNameResIdl(Builder builder, boolean z) {
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
