package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TopicInfo extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DISCUSS_FORUM = "";
    public static final String DEFAULT_HEAD_PHOTO_URL = "";
    public static final String DEFAULT_SHARE_PIC = "";
    public static final String DEFAULT_SHARE_TITLE = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String discuss_forum;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String head_photo_url;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long idx_num;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String share_pic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String share_title;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long total_post_num;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_TOTAL_POST_NUM = 0L;
    public static final Long DEFAULT_IDX_NUM = 0L;

    /* synthetic */ TopicInfo(Builder builder, boolean z, TopicInfo topicInfo) {
        this(builder, z);
    }

    private TopicInfo(Builder builder, boolean z) {
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
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.total_post_num == null) {
                this.total_post_num = DEFAULT_TOTAL_POST_NUM;
            } else {
                this.total_post_num = builder.total_post_num;
            }
            if (builder.head_photo_url == null) {
                this.head_photo_url = "";
            } else {
                this.head_photo_url = builder.head_photo_url;
            }
            if (builder.share_title == null) {
                this.share_title = "";
            } else {
                this.share_title = builder.share_title;
            }
            if (builder.share_pic == null) {
                this.share_pic = "";
            } else {
                this.share_pic = builder.share_pic;
            }
            if (builder.idx_num == null) {
                this.idx_num = DEFAULT_IDX_NUM;
            } else {
                this.idx_num = builder.idx_num;
            }
            if (builder.discuss_forum == null) {
                this.discuss_forum = "";
                return;
            } else {
                this.discuss_forum = builder.discuss_forum;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.desc = builder.desc;
        this.total_post_num = builder.total_post_num;
        this.head_photo_url = builder.head_photo_url;
        this.share_title = builder.share_title;
        this.share_pic = builder.share_pic;
        this.idx_num = builder.idx_num;
        this.discuss_forum = builder.discuss_forum;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TopicInfo> {
        public String desc;
        public String discuss_forum;
        public String head_photo_url;
        public Long idx_num;
        public String share_pic;
        public String share_title;
        public Long topic_id;
        public String topic_name;
        public Long total_post_num;

        public Builder() {
        }

        public Builder(TopicInfo topicInfo) {
            super(topicInfo);
            if (topicInfo != null) {
                this.topic_id = topicInfo.topic_id;
                this.topic_name = topicInfo.topic_name;
                this.desc = topicInfo.desc;
                this.total_post_num = topicInfo.total_post_num;
                this.head_photo_url = topicInfo.head_photo_url;
                this.share_title = topicInfo.share_title;
                this.share_pic = topicInfo.share_pic;
                this.idx_num = topicInfo.idx_num;
                this.discuss_forum = topicInfo.discuss_forum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicInfo build(boolean z) {
            return new TopicInfo(this, z, null);
        }
    }
}
