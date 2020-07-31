package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class GetRepostRecommendForumReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetRepostRecommendForumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<GetRepostRecommendForumReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetRepostRecommendForumReqIdl getRepostRecommendForumReqIdl) {
            super(getRepostRecommendForumReqIdl);
            if (getRepostRecommendForumReqIdl != null) {
                this.data = getRepostRecommendForumReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRepostRecommendForumReqIdl build(boolean z) {
            return new GetRepostRecommendForumReqIdl(this, z);
        }
    }
}
