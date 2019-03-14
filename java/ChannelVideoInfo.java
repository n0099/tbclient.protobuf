package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class ChannelVideoInfo extends Message {
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VIDEO_URL = "";
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer is_top;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer play_count;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer thumbnail_height;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer thumbnail_width;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer video_duration;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer video_height;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer video_length;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long video_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String video_url;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer video_width;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_FORUM_ID = 0;
    public static final Integer DEFAULT_PLAY_COUNT = 0;
    public static final Integer DEFAULT_VIDEO_DURATION = 0;
    public static final Integer DEFAULT_VIDEO_WIDTH = 0;
    public static final Integer DEFAULT_VIDEO_HEIGHT = 0;
    public static final Integer DEFAULT_VIDEO_LENGTH = 0;
    public static final Long DEFAULT_VIDEO_TYPE = 0L;
    public static final Integer DEFAULT_THUMBNAIL_WIDTH = 0;
    public static final Integer DEFAULT_THUMBNAIL_HEIGHT = 0;
    public static final Integer DEFAULT_IS_TOP = 0;
    public static final Integer DEFAULT_CREATE_TIME = 0;

    private ChannelVideoInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.play_count == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = builder.play_count;
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
            if (builder.video_length == null) {
                this.video_length = DEFAULT_VIDEO_LENGTH;
            } else {
                this.video_length = builder.video_length;
            }
            if (builder.video_type == null) {
                this.video_type = DEFAULT_VIDEO_TYPE;
            } else {
                this.video_type = builder.video_type;
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
            if (builder.is_top == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = builder.is_top;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
                return;
            } else {
                this.create_time = builder.create_time;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.title = builder.title;
        this.play_count = builder.play_count;
        this.video_url = builder.video_url;
        this.video_duration = builder.video_duration;
        this.video_width = builder.video_width;
        this.video_height = builder.video_height;
        this.video_length = builder.video_length;
        this.video_type = builder.video_type;
        this.thumbnail_url = builder.thumbnail_url;
        this.thumbnail_width = builder.thumbnail_width;
        this.thumbnail_height = builder.thumbnail_height;
        this.is_top = builder.is_top;
        this.create_time = builder.create_time;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<ChannelVideoInfo> {
        public Integer create_time;
        public Integer forum_id;
        public String forum_name;
        public Integer is_top;
        public Integer play_count;
        public Long thread_id;
        public Integer thumbnail_height;
        public String thumbnail_url;
        public Integer thumbnail_width;
        public String title;
        public Integer video_duration;
        public Integer video_height;
        public Integer video_length;
        public Long video_type;
        public String video_url;
        public Integer video_width;

        public Builder() {
        }

        public Builder(ChannelVideoInfo channelVideoInfo) {
            super(channelVideoInfo);
            if (channelVideoInfo != null) {
                this.thread_id = channelVideoInfo.thread_id;
                this.forum_id = channelVideoInfo.forum_id;
                this.forum_name = channelVideoInfo.forum_name;
                this.title = channelVideoInfo.title;
                this.play_count = channelVideoInfo.play_count;
                this.video_url = channelVideoInfo.video_url;
                this.video_duration = channelVideoInfo.video_duration;
                this.video_width = channelVideoInfo.video_width;
                this.video_height = channelVideoInfo.video_height;
                this.video_length = channelVideoInfo.video_length;
                this.video_type = channelVideoInfo.video_type;
                this.thumbnail_url = channelVideoInfo.thumbnail_url;
                this.thumbnail_width = channelVideoInfo.thumbnail_width;
                this.thumbnail_height = channelVideoInfo.thumbnail_height;
                this.is_top = channelVideoInfo.is_top;
                this.create_time = channelVideoInfo.create_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChannelVideoInfo build(boolean z) {
            return new ChannelVideoInfo(this, z);
        }
    }
}
