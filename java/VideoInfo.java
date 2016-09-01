package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class VideoInfo extends Message {
    public static final String DEFAULT_MEDIA_SUBTITLE = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public static final String DEFAULT_VIDEO_MD5 = "";
    public static final String DEFAULT_VIDEO_URL = "";
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String media_subtitle;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer play_count;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer thumbnail_height;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer thumbnail_width;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer video_duration;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer video_height;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer video_length;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String video_md5;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String video_url;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer video_width;
    public static final Integer DEFAULT_VIDEO_DURATION = 0;
    public static final Integer DEFAULT_VIDEO_WIDTH = 0;
    public static final Integer DEFAULT_VIDEO_HEIGHT = 0;
    public static final Integer DEFAULT_THUMBNAIL_WIDTH = 0;
    public static final Integer DEFAULT_THUMBNAIL_HEIGHT = 0;
    public static final Integer DEFAULT_VIDEO_LENGTH = 0;
    public static final Integer DEFAULT_PLAY_COUNT = 0;

    /* synthetic */ VideoInfo(Builder builder, boolean z, VideoInfo videoInfo) {
        this(builder, z);
    }

    private VideoInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.video_md5 == null) {
                this.video_md5 = "";
            } else {
                this.video_md5 = builder.video_md5;
            }
            if (builder.video_url == null) {
                this.video_url = "";
            } else {
                this.video_url = builder.video_url;
            }
            if (builder.video_duration == null) {
                this.video_duration = DEFAULT_VIDEO_DURATION;
            } else {
                this.video_duration = builder.video_duration;
            }
            if (builder.video_width == null) {
                this.video_width = DEFAULT_VIDEO_WIDTH;
            } else {
                this.video_width = builder.video_width;
            }
            if (builder.video_height == null) {
                this.video_height = DEFAULT_VIDEO_HEIGHT;
            } else {
                this.video_height = builder.video_height;
            }
            if (builder.thumbnail_url == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = builder.thumbnail_url;
            }
            if (builder.thumbnail_width == null) {
                this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
            } else {
                this.thumbnail_width = builder.thumbnail_width;
            }
            if (builder.thumbnail_height == null) {
                this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
            } else {
                this.thumbnail_height = builder.thumbnail_height;
            }
            if (builder.video_length == null) {
                this.video_length = DEFAULT_VIDEO_LENGTH;
            } else {
                this.video_length = builder.video_length;
            }
            if (builder.play_count == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = builder.play_count;
            }
            if (builder.media_subtitle == null) {
                this.media_subtitle = "";
                return;
            } else {
                this.media_subtitle = builder.media_subtitle;
                return;
            }
        }
        this.video_md5 = builder.video_md5;
        this.video_url = builder.video_url;
        this.video_duration = builder.video_duration;
        this.video_width = builder.video_width;
        this.video_height = builder.video_height;
        this.thumbnail_url = builder.thumbnail_url;
        this.thumbnail_width = builder.thumbnail_width;
        this.thumbnail_height = builder.thumbnail_height;
        this.video_length = builder.video_length;
        this.play_count = builder.play_count;
        this.media_subtitle = builder.media_subtitle;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<VideoInfo> {
        public String media_subtitle;
        public Integer play_count;
        public Integer thumbnail_height;
        public String thumbnail_url;
        public Integer thumbnail_width;
        public Integer video_duration;
        public Integer video_height;
        public Integer video_length;
        public String video_md5;
        public String video_url;
        public Integer video_width;

        public Builder() {
        }

        public Builder(VideoInfo videoInfo) {
            super(videoInfo);
            if (videoInfo != null) {
                this.video_md5 = videoInfo.video_md5;
                this.video_url = videoInfo.video_url;
                this.video_duration = videoInfo.video_duration;
                this.video_width = videoInfo.video_width;
                this.video_height = videoInfo.video_height;
                this.thumbnail_url = videoInfo.thumbnail_url;
                this.thumbnail_width = videoInfo.thumbnail_width;
                this.thumbnail_height = videoInfo.thumbnail_height;
                this.video_length = videoInfo.video_length;
                this.play_count = videoInfo.play_count;
                this.media_subtitle = videoInfo.media_subtitle;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoInfo build(boolean z) {
            return new VideoInfo(this, z, null);
        }
    }
}
