package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class TopicListModule extends Message {
    public static final String DEFAULT_MODULE_TITLE = "";
    public static final List<TopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TopicList> topic_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TopicListModule> {
        public String module_title;
        public List<TopicList> topic_list;

        public Builder() {
        }

        public Builder(TopicListModule topicListModule) {
            super(topicListModule);
            if (topicListModule == null) {
                return;
            }
            this.module_title = topicListModule.module_title;
            this.topic_list = Message.copyOf(topicListModule.topic_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicListModule build(boolean z) {
            return new TopicListModule(this, z);
        }
    }

    public TopicListModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.module_title;
            if (str == null) {
                this.module_title = "";
            } else {
                this.module_title = str;
            }
            List<TopicList> list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.module_title = builder.module_title;
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
    }
}
