package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;
/* loaded from: classes4.dex */
public final class TopicThread extends Message {
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long feed_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer source;
    @ProtoField(tag = 2)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_agree;
    public static final Long DEFAULT_FEED_ID = 0L;
    public static final Integer DEFAULT_USER_AGREE = 0;
    public static final Integer DEFAULT_SOURCE = 0;

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
                this.user_agree = DEFAULT_USER_AGREE;
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

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<TopicThread> {
        public Long feed_id;
        public Integer source;
        public ThreadInfo thread_info;
        public Integer user_agree;

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