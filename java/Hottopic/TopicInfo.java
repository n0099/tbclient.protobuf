package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoInfo;
/* loaded from: classes2.dex */
public final class TopicInfo extends Message {
    public static final String DEFAULT_BANG_JUMP_DESC = "";
    public static final String DEFAULT_BANG_TITLE = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DISCUSS_FORUM = "";
    public static final String DEFAULT_HEAD_BACKGROUND_URL = "";
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
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String head_background_url;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String head_photo_jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String head_photo_url;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long idx_num;
    @ProtoField(tag = 19, type = Message.Datatype.INT64)
    public final Long is_deleted;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_video_topic;
    @ProtoField(tag = 16)
    public final JoinUser join_info;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer play_count;
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
    public static final Long DEFAULT_IS_DELETED = 0L;
    public static final Integer DEFAULT_IS_VIDEO_TOPIC = 0;
    public static final Integer DEFAULT_PLAY_COUNT = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TopicInfo> {
        public String bang_jump_desc;
        public String bang_title;
        public String desc;
        public String discuss_forum;
        public String head_background_url;
        public String head_photo_jump_url;
        public String head_photo_url;
        public Long idx_num;
        public Long is_deleted;
        public Integer is_video_topic;
        public JoinUser join_info;
        public Integer play_count;
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
            if (topicInfo == null) {
                return;
            }
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
            this.is_deleted = topicInfo.is_deleted;
            this.is_video_topic = topicInfo.is_video_topic;
            this.play_count = topicInfo.play_count;
            this.head_background_url = topicInfo.head_background_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicInfo build(boolean z) {
            return new TopicInfo(this, z);
        }
    }

    public TopicInfo(Builder builder, boolean z) {
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
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            Long l2 = builder.total_post_num;
            if (l2 == null) {
                this.total_post_num = DEFAULT_TOTAL_POST_NUM;
            } else {
                this.total_post_num = l2;
            }
            String str3 = builder.head_photo_url;
            if (str3 == null) {
                this.head_photo_url = "";
            } else {
                this.head_photo_url = str3;
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
            Long l3 = builder.idx_num;
            if (l3 == null) {
                this.idx_num = DEFAULT_IDX_NUM;
            } else {
                this.idx_num = l3;
            }
            String str6 = builder.discuss_forum;
            if (str6 == null) {
                this.discuss_forum = "";
            } else {
                this.discuss_forum = str6;
            }
            String str7 = builder.bang_title;
            if (str7 == null) {
                this.bang_title = "";
            } else {
                this.bang_title = str7;
            }
            String str8 = builder.bang_jump_desc;
            if (str8 == null) {
                this.bang_jump_desc = "";
            } else {
                this.bang_jump_desc = str8;
            }
            this.video_info = builder.video_info;
            String str9 = builder.tag_list_type;
            if (str9 == null) {
                this.tag_list_type = "";
            } else {
                this.tag_list_type = str9;
            }
            Long l4 = builder.pmy_topic_id;
            if (l4 == null) {
                this.pmy_topic_id = DEFAULT_PMY_TOPIC_ID;
            } else {
                this.pmy_topic_id = l4;
            }
            Integer num = builder.pmy_source;
            if (num == null) {
                this.pmy_source = DEFAULT_PMY_SOURCE;
            } else {
                this.pmy_source = num;
            }
            this.join_info = builder.join_info;
            String str10 = builder.head_photo_jump_url;
            if (str10 == null) {
                this.head_photo_jump_url = "";
            } else {
                this.head_photo_jump_url = str10;
            }
            Integer num2 = builder.topic_tag;
            if (num2 == null) {
                this.topic_tag = DEFAULT_TOPIC_TAG;
            } else {
                this.topic_tag = num2;
            }
            Long l5 = builder.is_deleted;
            if (l5 == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
            } else {
                this.is_deleted = l5;
            }
            Integer num3 = builder.is_video_topic;
            if (num3 == null) {
                this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
            } else {
                this.is_video_topic = num3;
            }
            Integer num4 = builder.play_count;
            if (num4 == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = num4;
            }
            String str11 = builder.head_background_url;
            if (str11 == null) {
                this.head_background_url = "";
                return;
            } else {
                this.head_background_url = str11;
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
        this.is_deleted = builder.is_deleted;
        this.is_video_topic = builder.is_video_topic;
        this.play_count = builder.play_count;
        this.head_background_url = builder.head_background_url;
    }
}
