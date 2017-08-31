package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class GetRepostRecommendForumResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetRepostRecommendForumResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetRepostRecommendForumResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetRepostRecommendForumResIdl getRepostRecommendForumResIdl) {
            super(getRepostRecommendForumResIdl);
            if (getRepostRecommendForumResIdl != null) {
                this.error = getRepostRecommendForumResIdl.error;
                this.data = getRepostRecommendForumResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRepostRecommendForumResIdl build(boolean z) {
            return new GetRepostRecommendForumResIdl(this, z);
        }
    }
}
