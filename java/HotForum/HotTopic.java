package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class HotTopic extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final List<HotTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<HotTopicList> topic_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<HotTopic> {
        public String title;
        public List<HotTopicList> topic_list;

        public Builder() {
        }

        public Builder(HotTopic hotTopic) {
            super(hotTopic);
            if (hotTopic == null) {
                return;
            }
            this.title = hotTopic.title;
            this.topic_list = Message.copyOf(hotTopic.topic_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTopic build(boolean z) {
            return new HotTopic(this, z);
        }
    }

    public HotTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<HotTopicList> list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.title = builder.title;
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
    }
}
