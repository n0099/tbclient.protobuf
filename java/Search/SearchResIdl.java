package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes3.dex */
public final class SearchResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private SearchResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<SearchResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SearchResIdl searchResIdl) {
            super(searchResIdl);
            if (searchResIdl != null) {
                this.error = searchResIdl.error;
                this.data = searchResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchResIdl build(boolean z) {
            return new SearchResIdl(this, z);
        }
    }
}
