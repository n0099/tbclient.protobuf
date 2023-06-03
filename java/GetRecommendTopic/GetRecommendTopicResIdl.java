package tbclient.GetRecommendTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class GetRecommendTopicResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetRecommendTopicResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetRecommendTopicResIdl getRecommendTopicResIdl) {
            super(getRecommendTopicResIdl);
            if (getRecommendTopicResIdl == null) {
                return;
            }
            this.error = getRecommendTopicResIdl.error;
            this.data = getRecommendTopicResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRecommendTopicResIdl build(boolean z) {
            return new GetRecommendTopicResIdl(this, z);
        }
    }

    public GetRecommendTopicResIdl(Builder builder, boolean z) {
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
