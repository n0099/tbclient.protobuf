package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class RecomTopicList extends Message {
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final String DEFAULT_TOPIC_PIC = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long discuss_num;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer tag;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String topic_desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String topic_pic;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;
    public static final Integer DEFAULT_TAG = 0;

    private RecomTopicList(Builder builder, boolean z) {
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
            } else {
                this.tag = builder.tag;
            }
            if (builder.topic_desc == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = builder.topic_desc;
            }
            if (builder.topic_pic == null) {
                this.topic_pic = "";
                return;
            } else {
                this.topic_pic = builder.topic_pic;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.type = builder.type;
        this.discuss_num = builder.discuss_num;
        this.tag = builder.tag;
        this.topic_desc = builder.topic_desc;
        this.topic_pic = builder.topic_pic;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecomTopicList> {
        public Long discuss_num;
        public Integer tag;
        public String topic_desc;
        public Long topic_id;
        public String topic_name;
        public String topic_pic;
        public Integer type;

        public Builder() {
        }

        public Builder(RecomTopicList recomTopicList) {
            super(recomTopicList);
            if (recomTopicList != null) {
                this.topic_id = recomTopicList.topic_id;
                this.topic_name = recomTopicList.topic_name;
                this.type = recomTopicList.type;
                this.discuss_num = recomTopicList.discuss_num;
                this.tag = recomTopicList.tag;
                this.topic_desc = recomTopicList.topic_desc;
                this.topic_pic = recomTopicList.topic_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomTopicList build(boolean z) {
            return new RecomTopicList(this, z);
        }
    }
}
