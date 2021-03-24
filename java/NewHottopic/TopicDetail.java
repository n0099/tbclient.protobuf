package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TopicDetail extends Message {
    public static final String DEFAULT_BG_IMAGE = "";
    public static final String DEFAULT_SHARE_PIC = "";
    public static final String DEFAULT_SHARE_TITLE = "";
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_IMAGE = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String bg_image;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long discuss_num;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String share_pic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String share_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_desc;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long topic_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_image;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TopicDetail> {
        public String bg_image;
        public Long discuss_num;
        public String share_pic;
        public String share_title;
        public String topic_desc;
        public Long topic_id;
        public String topic_image;
        public String topic_name;

        public Builder() {
        }

        public Builder(TopicDetail topicDetail) {
            super(topicDetail);
            if (topicDetail == null) {
                return;
            }
            this.topic_id = topicDetail.topic_id;
            this.topic_name = topicDetail.topic_name;
            this.topic_desc = topicDetail.topic_desc;
            this.discuss_num = topicDetail.discuss_num;
            this.topic_image = topicDetail.topic_image;
            this.share_title = topicDetail.share_title;
            this.share_pic = topicDetail.share_pic;
            this.bg_image = topicDetail.bg_image;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicDetail build(boolean z) {
            return new TopicDetail(this, z);
        }
    }

    public TopicDetail(Builder builder, boolean z) {
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
            String str2 = builder.topic_desc;
            if (str2 == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = str2;
            }
            Long l2 = builder.discuss_num;
            if (l2 == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = l2;
            }
            String str3 = builder.topic_image;
            if (str3 == null) {
                this.topic_image = "";
            } else {
                this.topic_image = str3;
            }
            String str4 = builder.share_title;
            if (str4 == null) {
                this.share_title = "";
            } else {
                this.share_title = str4;
            }
            String str5 = builder.share_pic;
            if (str5 == null) {
                this.share_pic = "";
            } else {
                this.share_pic = str5;
            }
            String str6 = builder.bg_image;
            if (str6 == null) {
                this.bg_image = "";
                return;
            } else {
                this.bg_image = str6;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.topic_desc = builder.topic_desc;
        this.discuss_num = builder.discuss_num;
        this.topic_image = builder.topic_image;
        this.share_title = builder.share_title;
        this.share_pic = builder.share_pic;
        this.bg_image = builder.bg_image;
    }
}
