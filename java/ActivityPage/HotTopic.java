package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomTopicList;
/* loaded from: classes16.dex */
public final class HotTopic extends Message {
    public static final Integer DEFAULT_FLOOR_POSITION = 0;
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer floor_position;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecomTopicList> topic_list;

    private HotTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.floor_position == null) {
                this.floor_position = DEFAULT_FLOOR_POSITION;
            } else {
                this.floor_position = builder.floor_position;
            }
            if (builder.topic_list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = immutableCopyOf(builder.topic_list);
                return;
            }
        }
        this.floor_position = builder.floor_position;
        this.topic_list = immutableCopyOf(builder.topic_list);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<HotTopic> {
        public Integer floor_position;
        public List<RecomTopicList> topic_list;

        public Builder() {
        }

        public Builder(HotTopic hotTopic) {
            super(hotTopic);
            if (hotTopic != null) {
                this.floor_position = hotTopic.floor_position;
                this.topic_list = HotTopic.copyOf(hotTopic.topic_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTopic build(boolean z) {
            return new HotTopic(this, z);
        }
    }
}
