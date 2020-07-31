package tbclient.NewTopicThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;
/* loaded from: classes16.dex */
public final class TopicThread extends Message {
    public static final Long DEFAULT_FEED_ID = 0L;
    public static final Integer DEFAULT_SOURCE = 0;
    public static final String DEFAULT_USER_AGREE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long feed_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer source;
    @ProtoField(tag = 3)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_agree;

    private TopicThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.feed_id == null) {
                this.feed_id = DEFAULT_FEED_ID;
            } else {
                this.feed_id = builder.feed_id;
            }
            this.thread_info = builder.thread_info;
            if (builder.user_agree == null) {
                this.user_agree = "";
            } else {
                this.user_agree = builder.user_agree;
            }
            if (builder.source == null) {
                this.source = DEFAULT_SOURCE;
                return;
            } else {
                this.source = builder.source;
                return;
            }
        }
        this.feed_id = builder.feed_id;
        this.thread_info = builder.thread_info;
        this.user_agree = builder.user_agree;
        this.source = builder.source;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<TopicThread> {
        public Long feed_id;
        public Integer source;
        public ThreadInfo thread_info;
        public String user_agree;

        public Builder() {
        }

        public Builder(TopicThread topicThread) {
            super(topicThread);
            if (topicThread != null) {
                this.feed_id = topicThread.feed_id;
                this.thread_info = topicThread.thread_info;
                this.user_agree = topicThread.user_agree;
                this.source = topicThread.source;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicThread build(boolean z) {
            return new TopicThread(this, z);
        }
    }
}
