package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class SearchPostForumResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private SearchPostForumResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SearchPostForumResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SearchPostForumResIdl searchPostForumResIdl) {
            super(searchPostForumResIdl);
            if (searchPostForumResIdl != null) {
                this.error = searchPostForumResIdl.error;
                this.data = searchPostForumResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchPostForumResIdl build(boolean z) {
            return new SearchPostForumResIdl(this, z);
        }
    }
}
