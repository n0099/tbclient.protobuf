package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes20.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<TopicList> frs_tab_topic;
    @ProtoField(tag = 3)
    public final MediaTopic media_topic;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<TabList> tab_list;
    @ProtoField(tag = 1)
    public final TopicListModule topic_bang;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<NewTopicList> topic_list;
    @ProtoField(tag = 2)
    public final TopicListModule topic_manual;
    public static final List<TabList> DEFAULT_TAB_LIST = Collections.emptyList();
    public static final List<TopicList> DEFAULT_FRS_TAB_TOPIC = Collections.emptyList();
    public static final List<NewTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.topic_bang = builder.topic_bang;
            this.topic_manual = builder.topic_manual;
            this.media_topic = builder.media_topic;
            if (builder.tab_list == null) {
                this.tab_list = DEFAULT_TAB_LIST;
            } else {
                this.tab_list = immutableCopyOf(builder.tab_list);
            }
            if (builder.frs_tab_topic == null) {
                this.frs_tab_topic = DEFAULT_FRS_TAB_TOPIC;
            } else {
                this.frs_tab_topic = immutableCopyOf(builder.frs_tab_topic);
            }
            if (builder.topic_list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = immutableCopyOf(builder.topic_list);
                return;
            }
        }
        this.topic_bang = builder.topic_bang;
        this.topic_manual = builder.topic_manual;
        this.media_topic = builder.media_topic;
        this.tab_list = immutableCopyOf(builder.tab_list);
        this.frs_tab_topic = immutableCopyOf(builder.frs_tab_topic);
        this.topic_list = immutableCopyOf(builder.topic_list);
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<TopicList> frs_tab_topic;
        public MediaTopic media_topic;
        public List<TabList> tab_list;
        public TopicListModule topic_bang;
        public List<NewTopicList> topic_list;
        public TopicListModule topic_manual;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.topic_bang = dataRes.topic_bang;
                this.topic_manual = dataRes.topic_manual;
                this.media_topic = dataRes.media_topic;
                this.tab_list = DataRes.copyOf(dataRes.tab_list);
                this.frs_tab_topic = DataRes.copyOf(dataRes.frs_tab_topic);
                this.topic_list = DataRes.copyOf(dataRes.topic_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
