package tbclient.GetRecommendTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3)
    public final TopicListModule recommend_topic;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public TopicListModule recommend_topic;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recommend_topic = dataRes.recommend_topic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recommend_topic = builder.recommend_topic;
        } else {
            this.recommend_topic = builder.recommend_topic;
        }
    }
}
