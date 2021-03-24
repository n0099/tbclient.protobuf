package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
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
            if (recomTopicList == null) {
                return;
            }
            this.topic_id = recomTopicList.topic_id;
            this.topic_name = recomTopicList.topic_name;
            this.type = recomTopicList.type;
            this.discuss_num = recomTopicList.discuss_num;
            this.tag = recomTopicList.tag;
            this.topic_desc = recomTopicList.topic_desc;
            this.topic_pic = recomTopicList.topic_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomTopicList build(boolean z) {
            return new RecomTopicList(this, z);
        }
    }

    public RecomTopicList(Builder builder, boolean z) {
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
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l2 = builder.discuss_num;
            if (l2 == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = l2;
            }
            Integer num2 = builder.tag;
            if (num2 == null) {
                this.tag = DEFAULT_TAG;
            } else {
                this.tag = num2;
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
                return;
            } else {
                this.topic_pic = str3;
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
}
