package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class NewTopicList extends Message {
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_IMAGE = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long discuss_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_desc;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long topic_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_image;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer topic_tag;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;
    public static final Integer DEFAULT_TOPIC_TAG = 0;

    private NewTopicList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.topic_name == null) {
                this.topic_name = "";
            } else {
                this.topic_name = builder.topic_name;
            }
            if (builder.topic_desc == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = builder.topic_desc;
            }
            if (builder.discuss_num == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = builder.discuss_num;
            }
            if (builder.topic_image == null) {
                this.topic_image = "";
            } else {
                this.topic_image = builder.topic_image;
            }
            if (builder.topic_tag == null) {
                this.topic_tag = DEFAULT_TOPIC_TAG;
                return;
            } else {
                this.topic_tag = builder.topic_tag;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.topic_desc = builder.topic_desc;
        this.discuss_num = builder.discuss_num;
        this.topic_image = builder.topic_image;
        this.topic_tag = builder.topic_tag;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NewTopicList> {
        public Long discuss_num;
        public String topic_desc;
        public Long topic_id;
        public String topic_image;
        public String topic_name;
        public Integer topic_tag;

        public Builder() {
        }

        public Builder(NewTopicList newTopicList) {
            super(newTopicList);
            if (newTopicList != null) {
                this.topic_id = newTopicList.topic_id;
                this.topic_name = newTopicList.topic_name;
                this.topic_desc = newTopicList.topic_desc;
                this.discuss_num = newTopicList.discuss_num;
                this.topic_image = newTopicList.topic_image;
                this.topic_tag = newTopicList.topic_tag;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewTopicList build(boolean z) {
            return new NewTopicList(this, z);
        }
    }
}
