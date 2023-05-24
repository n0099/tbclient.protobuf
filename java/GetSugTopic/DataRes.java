package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_TOPIC_INVALID = 0;
    @ProtoField(tag = 2)
    public final TopicListModule bang_topic;
    @ProtoField(tag = 3)
    public final TopicListModule sug_topic;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer topic_invalid;
    @ProtoField(tag = 1)
    public final TopicListModule user_his_topic;
    @ProtoField(tag = 5)
    public final TopicListModule video_topic;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public TopicListModule bang_topic;
        public TopicListModule sug_topic;
        public Integer topic_invalid;
        public TopicListModule user_his_topic;
        public TopicListModule video_topic;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user_his_topic = dataRes.user_his_topic;
            this.bang_topic = dataRes.bang_topic;
            this.sug_topic = dataRes.sug_topic;
            this.topic_invalid = dataRes.topic_invalid;
            this.video_topic = dataRes.video_topic;
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
            this.user_his_topic = builder.user_his_topic;
            this.bang_topic = builder.bang_topic;
            this.sug_topic = builder.sug_topic;
            Integer num = builder.topic_invalid;
            if (num == null) {
                this.topic_invalid = DEFAULT_TOPIC_INVALID;
            } else {
                this.topic_invalid = num;
            }
            this.video_topic = builder.video_topic;
            return;
        }
        this.user_his_topic = builder.user_his_topic;
        this.bang_topic = builder.bang_topic;
        this.sug_topic = builder.sug_topic;
        this.topic_invalid = builder.topic_invalid;
        this.video_topic = builder.video_topic;
    }
}
