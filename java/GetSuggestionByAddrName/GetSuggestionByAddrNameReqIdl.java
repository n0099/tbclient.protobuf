package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetSuggestionByAddrNameReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetSuggestionByAddrNameReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetSuggestionByAddrNameReqIdl getSuggestionByAddrNameReqIdl) {
            super(getSuggestionByAddrNameReqIdl);
            if (getSuggestionByAddrNameReqIdl == null) {
                return;
            }
            this.data = getSuggestionByAddrNameReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSuggestionByAddrNameReqIdl build(boolean z) {
            return new GetSuggestionByAddrNameReqIdl(this, z);
        }
    }

    public GetSuggestionByAddrNameReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
