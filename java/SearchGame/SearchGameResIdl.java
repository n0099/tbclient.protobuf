package tbclient.SearchGame;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class SearchGameResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ SearchGameResIdl(Builder builder, boolean z, SearchGameResIdl searchGameResIdl) {
        this(builder, z);
    }

    private SearchGameResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<SearchGameResIdl> {
        public DataRes data;
        public Error error;

        public Builder(SearchGameResIdl searchGameResIdl) {
            super(searchGameResIdl);
            if (searchGameResIdl != null) {
                this.error = searchGameResIdl.error;
                this.data = searchGameResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchGameResIdl build(boolean z) {
            return new SearchGameResIdl(this, z, null);
        }
    }
}
