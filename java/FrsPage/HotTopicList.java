package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HotTopicList extends Message {
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long discuss_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer tag;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;
    public static final Integer DEFAULT_TAG = 0;

    private HotTopicList(Builder builder, boolean z) {
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
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.discuss_num == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = builder.discuss_num;
            }
            if (builder.tag == null) {
                this.tag = DEFAULT_TAG;
                return;
            } else {
                this.tag = builder.tag;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.type = builder.type;
        this.discuss_num = builder.discuss_num;
        this.tag = builder.tag;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HotTopicList> {
        public Long discuss_num;
        public Integer tag;
        public Long topic_id;
        public String topic_name;
        public Integer type;

        public Builder() {
        }

        public Builder(HotTopicList hotTopicList) {
            super(hotTopicList);
            if (hotTopicList != null) {
                this.topic_id = hotTopicList.topic_id;
                this.topic_name = hotTopicList.topic_name;
                this.type = hotTopicList.type;
                this.discuss_num = hotTopicList.discuss_num;
                this.tag = hotTopicList.tag;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTopicList build(boolean z) {
            return new HotTopicList(this, z);
        }
    }
}