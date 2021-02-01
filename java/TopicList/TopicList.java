package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Media;
import tbclient.VideoInfo;
/* loaded from: classes8.dex */
public final class TopicList extends Message {
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_H5_URL = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final String DEFAULT_TOPIC_PIC = "";
    public static final String DEFAULT_TOPIC_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long discuss_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<Media> media;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer tag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_desc;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String topic_h5_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String topic_pic;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer topic_thread_types;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long topic_tid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String topic_user_name;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long update_time;
    @ProtoField(tag = 12)
    public final VideoInfo video_info;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;
    public static final Integer DEFAULT_TAG = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final Long DEFAULT_TOPIC_TID = 0L;
    public static final Integer DEFAULT_TOPIC_THREAD_TYPES = 0;

    private TopicList(Builder builder, boolean z) {
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
            } else {
                this.topic_pic = builder.topic_pic;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.topic_user_name == null) {
                this.topic_user_name = "";
            } else {
                this.topic_user_name = builder.topic_user_name;
            }
            if (builder.media == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = immutableCopyOf(builder.media);
            }
            if (builder.topic_tid == null) {
                this.topic_tid = DEFAULT_TOPIC_TID;
            } else {
                this.topic_tid = builder.topic_tid;
            }
            if (builder.topic_h5_url == null) {
                this.topic_h5_url = "";
            } else {
                this.topic_h5_url = builder.topic_h5_url;
            }
            this.video_info = builder.video_info;
            if (builder.topic_thread_types == null) {
                this.topic_thread_types = DEFAULT_TOPIC_THREAD_TYPES;
                return;
            } else {
                this.topic_thread_types = builder.topic_thread_types;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.discuss_num = builder.discuss_num;
        this.tag = builder.tag;
        this.topic_desc = builder.topic_desc;
        this.topic_pic = builder.topic_pic;
        this.update_time = builder.update_time;
        this.topic_user_name = builder.topic_user_name;
        this.media = immutableCopyOf(builder.media);
        this.topic_tid = builder.topic_tid;
        this.topic_h5_url = builder.topic_h5_url;
        this.video_info = builder.video_info;
        this.topic_thread_types = builder.topic_thread_types;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TopicList> {
        public Long discuss_num;
        public List<Media> media;
        public Integer tag;
        public String topic_desc;
        public String topic_h5_url;
        public Long topic_id;
        public String topic_name;
        public String topic_pic;
        public Integer topic_thread_types;
        public Long topic_tid;
        public String topic_user_name;
        public Long update_time;
        public VideoInfo video_info;

        public Builder() {
        }

        public Builder(TopicList topicList) {
            super(topicList);
            if (topicList != null) {
                this.topic_id = topicList.topic_id;
                this.topic_name = topicList.topic_name;
                this.discuss_num = topicList.discuss_num;
                this.tag = topicList.tag;
                this.topic_desc = topicList.topic_desc;
                this.topic_pic = topicList.topic_pic;
                this.update_time = topicList.update_time;
                this.topic_user_name = topicList.topic_user_name;
                this.media = TopicList.copyOf(topicList.media);
                this.topic_tid = topicList.topic_tid;
                this.topic_h5_url = topicList.topic_h5_url;
                this.video_info = topicList.video_info;
                this.topic_thread_types = topicList.topic_thread_types;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicList build(boolean z) {
            return new TopicList(this, z);
        }
    }
}
