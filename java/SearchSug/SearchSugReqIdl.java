package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SearchSugReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SearchSugReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SearchSugReqIdl searchSugReqIdl) {
            super(searchSugReqIdl);
            if (searchSugReqIdl == null) {
                return;
            }
            this.data = searchSugReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchSugReqIdl build(boolean z) {
            return new SearchSugReqIdl(this, z);
        }
    }

    public SearchSugReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
