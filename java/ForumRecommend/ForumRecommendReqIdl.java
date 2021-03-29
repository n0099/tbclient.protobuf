package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ForumRecommendReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ForumRecommendReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ForumRecommendReqIdl forumRecommendReqIdl) {
            super(forumRecommendReqIdl);
            if (forumRecommendReqIdl == null) {
                return;
            }
            this.data = forumRecommendReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRecommendReqIdl build(boolean z) {
            return new ForumRecommendReqIdl(this, z);
        }
    }

    public ForumRecommendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
