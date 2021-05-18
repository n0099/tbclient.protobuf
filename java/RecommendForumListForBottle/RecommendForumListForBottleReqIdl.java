package tbclient.RecommendForumListForBottle;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class RecommendForumListForBottleReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<RecommendForumListForBottleReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RecommendForumListForBottleReqIdl recommendForumListForBottleReqIdl) {
            super(recommendForumListForBottleReqIdl);
            if (recommendForumListForBottleReqIdl == null) {
                return;
            }
            this.data = recommendForumListForBottleReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumListForBottleReqIdl build(boolean z) {
            return new RecommendForumListForBottleReqIdl(this, z);
        }
    }

    public RecommendForumListForBottleReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
