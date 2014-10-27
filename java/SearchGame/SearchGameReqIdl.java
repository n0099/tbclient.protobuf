package tbclient.SearchGame;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SearchGameReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ SearchGameReqIdl(Builder builder, boolean z, SearchGameReqIdl searchGameReqIdl) {
        this(builder, z);
    }

    private SearchGameReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<SearchGameReqIdl> {
        public DataReq data;

        public Builder(SearchGameReqIdl searchGameReqIdl) {
            super(searchGameReqIdl);
            if (searchGameReqIdl != null) {
                this.data = searchGameReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchGameReqIdl build(boolean z) {
            return new SearchGameReqIdl(this, z, null);
        }
    }
}
