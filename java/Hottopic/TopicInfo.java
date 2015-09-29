package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TopicInfo extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long total_post_num;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_TOTAL_POST_NUM = 0L;

    /* synthetic */ TopicInfo(Builder builder, boolean z, TopicInfo topicInfo) {
        this(builder, z);
    }

    private TopicInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.topic_name == null) {
                this.topic_name = "";
            } else {
                this.topic_name = builder.topic_name;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.total_post_num == null) {
                this.total_post_num = DEFAULT_TOTAL_POST_NUM;
                return;
            } else {
                this.total_post_num = builder.total_post_num;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.desc = builder.desc;
        this.total_post_num = builder.total_post_num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TopicInfo> {
        public String desc;
        public Long topic_id;
        public String topic_name;
        public Long total_post_num;

        public Builder() {
        }

        public Builder(TopicInfo topicInfo) {
            super(topicInfo);
            if (topicInfo != null) {
                this.topic_id = topicInfo.topic_id;
                this.topic_name = topicInfo.topic_name;
                this.desc = topicInfo.desc;
                this.total_post_num = topicInfo.total_post_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicInfo build(boolean z) {
            return new TopicInfo(this, z, null);
        }
    }
}
