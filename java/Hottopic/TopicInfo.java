package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoInfo;
/* loaded from: classes15.dex */
public final class TopicInfo extends Message {
    public static final String DEFAULT_BANG_JUMP_DESC = "";
    public static final String DEFAULT_BANG_TITLE = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DISCUSS_FORUM = "";
    public static final String DEFAULT_HEAD_PHOTO_JUMP_URL = "";
    public static final String DEFAULT_HEAD_PHOTO_URL = "";
    public static final String DEFAULT_SHARE_PIC = "";
    public static final String DEFAULT_SHARE_TITLE = "";
    public static final String DEFAULT_TAG_LIST_TYPE = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String bang_jump_desc;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String bang_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String discuss_forum;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String head_photo_jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String head_photo_url;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long idx_num;
    @ProtoField(tag = 16)
    public final JoinUser join_info;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer pmy_source;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long pmy_topic_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String share_pic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String share_title;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String tag_list_type;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer topic_tag;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long total_post_num;
    @ProtoField(tag = 12)
    public final VideoInfo video_info;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_TOTAL_POST_NUM = 0L;
    public static final Long DEFAULT_IDX_NUM = 0L;
    public static final Long DEFAULT_PMY_TOPIC_ID = 0L;
    public static final Integer DEFAULT_PMY_SOURCE = 0;
    public static final Integer DEFAULT_TOPIC_TAG = 0;

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
            } else {
                this.discuss_forum = builder.discuss_forum;
            }
            if (builder.bang_title == null) {
                this.bang_title = "";
            } else {
                this.bang_title = builder.bang_title;
            }
            if (builder.bang_jump_desc == null) {
                this.bang_jump_desc = "";
            } else {
                this.bang_jump_desc = builder.bang_jump_desc;
            }
            this.video_info = builder.video_info;
            if (builder.tag_list_type == null) {
                this.tag_list_type = "";
            } else {
                this.tag_list_type = builder.tag_list_type;
            }
            if (builder.pmy_topic_id == null) {
                this.pmy_topic_id = DEFAULT_PMY_TOPIC_ID;
            } else {
                this.pmy_topic_id = builder.pmy_topic_id;
            }
            if (builder.pmy_source == null) {
                this.pmy_source = DEFAULT_PMY_SOURCE;
            } else {
                this.pmy_source = builder.pmy_source;
            }
            this.join_info = builder.join_info;
            if (builder.head_photo_jump_url == null) {
                this.head_photo_jump_url = "";
            } else {
                this.head_photo_jump_url = builder.head_photo_jump_url;
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
        this.desc = builder.desc;
        this.total_post_num = builder.total_post_num;
        this.head_photo_url = builder.head_photo_url;
        this.share_title = builder.share_title;
        this.share_pic = builder.share_pic;
        this.idx_num = builder.idx_num;
        this.discuss_forum = builder.discuss_forum;
        this.bang_title = builder.bang_title;
        this.bang_jump_desc = builder.bang_jump_desc;
        this.video_info = builder.video_info;
        this.tag_list_type = builder.tag_list_type;
        this.pmy_topic_id = builder.pmy_topic_id;
        this.pmy_source = builder.pmy_source;
        this.join_info = builder.join_info;
        this.head_photo_jump_url = builder.head_photo_jump_url;
        this.topic_tag = builder.topic_tag;
    }

    /* loaded from: classes15.dex */
    public static final class Builder extends Message.Builder<TopicInfo> {
        public String bang_jump_desc;
        public String bang_title;
        public String desc;
        public String discuss_forum;
        public String head_photo_jump_url;
        public String head_photo_url;
        public Long idx_num;
        public JoinUser join_info;
        public Integer pmy_source;
        public Long pmy_topic_id;
        public String share_pic;
        public String share_title;
        public String tag_list_type;
        public Long topic_id;
        public String topic_name;
        public Integer topic_tag;
        public Long total_post_num;
        public VideoInfo video_info;

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
                this.bang_title = topicInfo.bang_title;
                this.bang_jump_desc = topicInfo.bang_jump_desc;
                this.video_info = topicInfo.video_info;
                this.tag_list_type = topicInfo.tag_list_type;
                this.pmy_topic_id = topicInfo.pmy_topic_id;
                this.pmy_source = topicInfo.pmy_source;
                this.join_info = topicInfo.join_info;
                this.head_photo_jump_url = topicInfo.head_photo_jump_url;
                this.topic_tag = topicInfo.topic_tag;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicInfo build(boolean z) {
            return new TopicInfo(this, z);
        }
    }
}
