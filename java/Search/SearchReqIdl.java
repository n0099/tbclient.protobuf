package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes15.dex */
public final class SearchReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private SearchReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes15.dex */
    public static final class Builder extends Message.Builder<SearchReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SearchReqIdl searchReqIdl) {
            super(searchReqIdl);
            if (searchReqIdl != null) {
                this.data = searchReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchReqIdl build(boolean z) {
            return new SearchReqIdl(this, z);
        }
    }
}
