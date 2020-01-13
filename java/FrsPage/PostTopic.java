package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class PostTopic extends Message {
    public static final String DEFAULT_CONTENT_TOPIC = "";
    public static final String DEFAULT_TITLE_TOPIC = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content_topic;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title_topic;

    private PostTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title_topic == null) {
                this.title_topic = "";
            } else {
                this.title_topic = builder.title_topic;
            }
            if (builder.content_topic == null) {
                this.content_topic = "";
                return;
            } else {
                this.content_topic = builder.content_topic;
                return;
            }
        }
        this.title_topic = builder.title_topic;
        this.content_topic = builder.content_topic;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PostTopic> {
        public String content_topic;
        public String title_topic;

        public Builder() {
        }

        public Builder(PostTopic postTopic) {
            super(postTopic);
            if (postTopic != null) {
                this.title_topic = postTopic.title_topic;
                this.content_topic = postTopic.content_topic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostTopic build(boolean z) {
            return new PostTopic(this, z);
        }
    }
}
