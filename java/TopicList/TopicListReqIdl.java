package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class TopicListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TopicListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(TopicListReqIdl topicListReqIdl) {
            super(topicListReqIdl);
            if (topicListReqIdl == null) {
                return;
            }
            this.data = topicListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicListReqIdl build(boolean z) {
            return new TopicListReqIdl(this, z);
        }
    }

    public TopicListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
