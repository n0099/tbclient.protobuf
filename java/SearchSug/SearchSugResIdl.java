package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class SearchSugResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SearchSugResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SearchSugResIdl searchSugResIdl) {
            super(searchSugResIdl);
            if (searchSugResIdl == null) {
                return;
            }
            this.error = searchSugResIdl.error;
            this.data = searchSugResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchSugResIdl build(boolean z) {
            return new SearchSugResIdl(this, z);
        }
    }

    public SearchSugResIdl(Builder builder, boolean z) {
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
