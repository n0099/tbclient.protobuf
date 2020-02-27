package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class RecomPostTopic extends Message {
    public static final String DEFAULT_RECOM_TITLE = "";
    public static final String DEFAULT_RECOM_TOPIC = "";
    public static final Long DEFAULT_UNIQ_TOPICID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String recom_title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String recom_topic;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long uniq_topicid;

    private RecomPostTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.recom_title == null) {
                this.recom_title = "";
            } else {
                this.recom_title = builder.recom_title;
            }
            if (builder.recom_topic == null) {
                this.recom_topic = "";
            } else {
                this.recom_topic = builder.recom_topic;
            }
            if (builder.uniq_topicid == null) {
                this.uniq_topicid = DEFAULT_UNIQ_TOPICID;
                return;
            } else {
                this.uniq_topicid = builder.uniq_topicid;
                return;
            }
        }
        this.recom_title = builder.recom_title;
        this.recom_topic = builder.recom_topic;
        this.uniq_topicid = builder.uniq_topicid;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecomPostTopic> {
        public String recom_title;
        public String recom_topic;
        public Long uniq_topicid;

        public Builder() {
        }

        public Builder(RecomPostTopic recomPostTopic) {
            super(recomPostTopic);
            if (recomPostTopic != null) {
                this.recom_title = recomPostTopic.recom_title;
                this.recom_topic = recomPostTopic.recom_topic;
                this.uniq_topicid = recomPostTopic.uniq_topicid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomPostTopic build(boolean z) {
            return new RecomPostTopic(this, z);
        }
    }
}
