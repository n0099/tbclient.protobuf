package tbclient.GetRecommendTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GetRecommendTopicReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetRecommendTopicReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetRecommendTopicReqIdl getRecommendTopicReqIdl) {
            super(getRecommendTopicReqIdl);
            if (getRecommendTopicReqIdl == null) {
                return;
            }
            this.data = getRecommendTopicReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRecommendTopicReqIdl build(boolean z) {
            return new GetRecommendTopicReqIdl(this, z);
        }
    }

    public GetRecommendTopicReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
