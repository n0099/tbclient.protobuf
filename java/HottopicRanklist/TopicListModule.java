package tbclient.HottopicRanklist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class TopicListModule extends Message {
    public static final String DEFAULT_MODULE_TITLE = "";
    public static final String DEFAULT_RULE_JUMP_URL = "";
    public static final String DEFAULT_TIPS = "";
    public static final List<TopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rule_jump_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TopicList> topic_list;

    /* synthetic */ TopicListModule(Builder builder, boolean z, TopicListModule topicListModule) {
        this(builder, z);
    }

    private TopicListModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.module_title == null) {
                this.module_title = "";
            } else {
                this.module_title = builder.module_title;
            }
            if (builder.topic_list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = immutableCopyOf(builder.topic_list);
            }
            if (builder.tips == null) {
                this.tips = "";
            } else {
                this.tips = builder.tips;
            }
            if (builder.rule_jump_url == null) {
                this.rule_jump_url = "";
                return;
            } else {
                this.rule_jump_url = builder.rule_jump_url;
                return;
            }
        }
        this.module_title = builder.module_title;
        this.topic_list = immutableCopyOf(builder.topic_list);
        this.tips = builder.tips;
        this.rule_jump_url = builder.rule_jump_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TopicListModule> {
        public String module_title;
        public String rule_jump_url;
        public String tips;
        public List<TopicList> topic_list;

        public Builder() {
        }

        public Builder(TopicListModule topicListModule) {
            super(topicListModule);
            if (topicListModule != null) {
                this.module_title = topicListModule.module_title;
                this.topic_list = TopicListModule.copyOf(topicListModule.topic_list);
                this.tips = topicListModule.tips;
                this.rule_jump_url = topicListModule.rule_jump_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicListModule build(boolean z) {
            return new TopicListModule(this, z, null);
        }
    }
}
