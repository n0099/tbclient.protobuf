package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class ForumRecommendResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumRecommendResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ForumRecommendResIdl forumRecommendResIdl) {
            super(forumRecommendResIdl);
            if (forumRecommendResIdl == null) {
                return;
            }
            this.error = forumRecommendResIdl.error;
            this.data = forumRecommendResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRecommendResIdl build(boolean z) {
            return new ForumRecommendResIdl(this, z);
        }
    }

    public ForumRecommendResIdl(Builder builder, boolean z) {
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
