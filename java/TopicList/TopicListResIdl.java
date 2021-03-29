package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class TopicListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TopicListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(TopicListResIdl topicListResIdl) {
            super(topicListResIdl);
            if (topicListResIdl == null) {
                return;
            }
            this.error = topicListResIdl.error;
            this.data = topicListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicListResIdl build(boolean z) {
            return new TopicListResIdl(this, z);
        }
    }

    public TopicListResIdl(Builder builder, boolean z) {
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
