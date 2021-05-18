package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoInfo;
/* loaded from: classes8.dex */
public final class MediaTopic extends Message {
    public static final String DEFAULT_PIC_URL = "";
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 3)
    public final VideoInfo video_info;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<MediaTopic> {
        public String pic_url;
        public Long topic_id;
        public String topic_name;
        public VideoInfo video_info;

        public Builder() {
        }

        public Builder(MediaTopic mediaTopic) {
            super(mediaTopic);
            if (mediaTopic == null) {
                return;
            }
            this.topic_id = mediaTopic.topic_id;
            this.topic_name = mediaTopic.topic_name;
            this.video_info = mediaTopic.video_info;
            this.pic_url = mediaTopic.pic_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MediaTopic build(boolean z) {
            return new MediaTopic(this, z);
        }
    }

    public MediaTopic(Builder builder, boolean z) {
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
            this.video_info = builder.video_info;
            String str2 = builder.pic_url;
            if (str2 == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = str2;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.video_info = builder.video_info;
        this.pic_url = builder.pic_url;
    }
}
