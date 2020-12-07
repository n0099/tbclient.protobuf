package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class Topic extends Message {
    public static final String DEFAULT_LINK = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_lpost;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer topic_type;
    public static final Integer DEFAULT_IS_LPOST = 0;
    public static final Integer DEFAULT_TOPIC_TYPE = 0;

    private Topic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_lpost == null) {
                this.is_lpost = DEFAULT_IS_LPOST;
            } else {
                this.is_lpost = builder.is_lpost;
            }
            if (builder.topic_type == null) {
                this.topic_type = DEFAULT_TOPIC_TYPE;
            } else {
                this.topic_type = builder.topic_type;
            }
            if (builder.link == null) {
                this.link = "";
                return;
            } else {
                this.link = builder.link;
                return;
            }
        }
        this.is_lpost = builder.is_lpost;
        this.topic_type = builder.topic_type;
        this.link = builder.link;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<Topic> {
        public Integer is_lpost;
        public String link;
        public Integer topic_type;

        public Builder() {
        }

        public Builder(Topic topic) {
            super(topic);
            if (topic != null) {
                this.is_lpost = topic.is_lpost;
                this.topic_type = topic.topic_type;
                this.link = topic.link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Topic build(boolean z) {
            return new Topic(this, z);
        }
    }
}
