package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TopicList extends Message {
    public static final String DEFAULT_SLOGAN = "";
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final String DEFAULT_TOPIC_PIC = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long discuss_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_video_topic;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer tag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String topic_pic;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;
    public static final Integer DEFAULT_TAG = 0;
    public static final Integer DEFAULT_IS_VIDEO_TOPIC = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TopicList> {
        public Long discuss_num;
        public Integer is_video_topic;
        public String slogan;
        public Integer tag;
        public String topic_desc;
        public Long topic_id;
        public String topic_name;
        public String topic_pic;

        public Builder() {
        }

        public Builder(TopicList topicList) {
            super(topicList);
            if (topicList == null) {
                return;
            }
            this.topic_id = topicList.topic_id;
            this.topic_name = topicList.topic_name;
            this.discuss_num = topicList.discuss_num;
            this.tag = topicList.tag;
            this.topic_desc = topicList.topic_desc;
            this.topic_pic = topicList.topic_pic;
            this.is_video_topic = topicList.is_video_topic;
            this.slogan = topicList.slogan;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicList build(boolean z) {
            return new TopicList(this, z);
        }
    }

    public TopicList(Builder builder, boolean z) {
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
            Long l2 = builder.discuss_num;
            if (l2 == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = l2;
            }
            Integer num = builder.tag;
            if (num == null) {
                this.tag = DEFAULT_TAG;
            } else {
                this.tag = num;
            }
            String str2 = builder.topic_desc;
            if (str2 == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = str2;
            }
            String str3 = builder.topic_pic;
            if (str3 == null) {
                this.topic_pic = "";
            } else {
                this.topic_pic = str3;
            }
            Integer num2 = builder.is_video_topic;
            if (num2 == null) {
                this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
            } else {
                this.is_video_topic = num2;
            }
            String str4 = builder.slogan;
            if (str4 == null) {
                this.slogan = "";
                return;
            } else {
                this.slogan = str4;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.discuss_num = builder.discuss_num;
        this.tag = builder.tag;
        this.topic_desc = builder.topic_desc;
        this.topic_pic = builder.topic_pic;
        this.is_video_topic = builder.is_video_topic;
        this.slogan = builder.slogan;
    }
}
