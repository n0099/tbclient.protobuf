package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class HotTopicItem extends Message {
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long topic_discuss_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_TOPIC_DISCUSS_NUM = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<HotTopicItem> {
        public Long topic_discuss_num;
        public Long topic_id;
        public String topic_name;

        public Builder() {
        }

        public Builder(HotTopicItem hotTopicItem) {
            super(hotTopicItem);
            if (hotTopicItem == null) {
                return;
            }
            this.topic_id = hotTopicItem.topic_id;
            this.topic_name = hotTopicItem.topic_name;
            this.topic_discuss_num = hotTopicItem.topic_discuss_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTopicItem build(boolean z) {
            return new HotTopicItem(this, z);
        }
    }

    public HotTopicItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            Long l2 = builder.topic_discuss_num;
            if (l2 == null) {
                this.topic_discuss_num = DEFAULT_TOPIC_DISCUSS_NUM;
                return;
            } else {
                this.topic_discuss_num = l2;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.topic_discuss_num = builder.topic_discuss_num;
    }
}
