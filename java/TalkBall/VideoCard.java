package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class VideoCard extends Message {
    public static final String DEFAULT_COVER_IMAGE = "";
    public static final String DEFAULT_THREAD_ID = "";
    public static final String DEFAULT_THREAD_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TOPIC_TITLE = "";
    public static final String DEFAULT_VIDEO_DURATION = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cover_image;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String thread_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String topic_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String video_duration;

    private VideoCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.cover_image == null) {
                this.cover_image = "";
            } else {
                this.cover_image = builder.cover_image;
            }
            if (builder.video_duration == null) {
                this.video_duration = "";
            } else {
                this.video_duration = builder.video_duration;
            }
            if (builder.topic_title == null) {
                this.topic_title = "";
            } else {
                this.topic_title = builder.topic_title;
            }
            if (builder.thread_id == null) {
                this.thread_id = "";
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.thread_url == null) {
                this.thread_url = "";
                return;
            } else {
                this.thread_url = builder.thread_url;
                return;
            }
        }
        this.title = builder.title;
        this.cover_image = builder.cover_image;
        this.video_duration = builder.video_duration;
        this.topic_title = builder.topic_title;
        this.thread_id = builder.thread_id;
        this.thread_url = builder.thread_url;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<VideoCard> {
        public String cover_image;
        public String thread_id;
        public String thread_url;
        public String title;
        public String topic_title;
        public String video_duration;

        public Builder() {
        }

        public Builder(VideoCard videoCard) {
            super(videoCard);
            if (videoCard != null) {
                this.title = videoCard.title;
                this.cover_image = videoCard.cover_image;
                this.video_duration = videoCard.video_duration;
                this.topic_title = videoCard.topic_title;
                this.thread_id = videoCard.thread_id;
                this.thread_url = videoCard.thread_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoCard build(boolean z) {
            return new VideoCard(this, z);
        }
    }
}
