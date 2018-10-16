package tbclient.RecommendForumListForBottle;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes4.dex */
public final class RecommendForumListForBottleResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private RecommendForumListForBottleResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecommendForumListForBottleResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RecommendForumListForBottleResIdl recommendForumListForBottleResIdl) {
            super(recommendForumListForBottleResIdl);
            if (recommendForumListForBottleResIdl != null) {
                this.error = recommendForumListForBottleResIdl.error;
                this.data = recommendForumListForBottleResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumListForBottleResIdl build(boolean z) {
            return new RecommendForumListForBottleResIdl(this, z);
        }
    }
}
