package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class ChannelInfo extends Message {
    public static final String DEFAULT_CHANNEL_AVATAR = "";
    public static final String DEFAULT_CHANNEL_COVER = "";
    public static final String DEFAULT_CHANNEL_NAME = "";
    public static final String DEFAULT_CHANNEL_SMALL_COVER = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String channel_avatar;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String channel_cover;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long channel_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String channel_name;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String channel_small_cover;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer fans_count;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_subscribe;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer push_switch;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer video_count;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer video_play_count;
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_VIDEO_COUNT = 0;
    public static final Integer DEFAULT_FANS_COUNT = 0;
    public static final Integer DEFAULT_VIDEO_PLAY_COUNT = 0;
    public static final Integer DEFAULT_IS_SUBSCRIBE = 0;
    public static final Integer DEFAULT_PUSH_SWITCH = 0;

    private ChannelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.channel_id == null) {
                this.channel_id = DEFAULT_CHANNEL_ID;
            } else {
                this.channel_id = builder.channel_id;
            }
            if (builder.channel_name == null) {
                this.channel_name = "";
            } else {
                this.channel_name = builder.channel_name;
            }
            if (builder.channel_cover == null) {
                this.channel_cover = "";
            } else {
                this.channel_cover = builder.channel_cover;
            }
            if (builder.channel_avatar == null) {
                this.channel_avatar = "";
            } else {
                this.channel_avatar = builder.channel_avatar;
            }
            if (builder.description == null) {
                this.description = "";
            } else {
                this.description = builder.description;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.video_count == null) {
                this.video_count = DEFAULT_VIDEO_COUNT;
            } else {
                this.video_count = builder.video_count;
            }
            if (builder.fans_count == null) {
                this.fans_count = DEFAULT_FANS_COUNT;
            } else {
                this.fans_count = builder.fans_count;
            }
            if (builder.video_play_count == null) {
                this.video_play_count = DEFAULT_VIDEO_PLAY_COUNT;
            } else {
                this.video_play_count = builder.video_play_count;
            }
            if (builder.is_subscribe == null) {
                this.is_subscribe = DEFAULT_IS_SUBSCRIBE;
            } else {
                this.is_subscribe = builder.is_subscribe;
            }
            if (builder.push_switch == null) {
                this.push_switch = DEFAULT_PUSH_SWITCH;
            } else {
                this.push_switch = builder.push_switch;
            }
            if (builder.channel_small_cover == null) {
                this.channel_small_cover = "";
                return;
            } else {
                this.channel_small_cover = builder.channel_small_cover;
                return;
            }
        }
        this.channel_id = builder.channel_id;
        this.channel_name = builder.channel_name;
        this.channel_cover = builder.channel_cover;
        this.channel_avatar = builder.channel_avatar;
        this.description = builder.description;
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.video_count = builder.video_count;
        this.fans_count = builder.fans_count;
        this.video_play_count = builder.video_play_count;
        this.is_subscribe = builder.is_subscribe;
        this.push_switch = builder.push_switch;
        this.channel_small_cover = builder.channel_small_cover;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<ChannelInfo> {
        public String channel_avatar;
        public String channel_cover;
        public Long channel_id;
        public String channel_name;
        public String channel_small_cover;
        public String description;
        public Integer fans_count;
        public Integer is_subscribe;
        public String portrait;
        public Integer push_switch;
        public Long user_id;
        public String user_name;
        public Integer video_count;
        public Integer video_play_count;

        public Builder() {
        }

        public Builder(ChannelInfo channelInfo) {
            super(channelInfo);
            if (channelInfo != null) {
                this.channel_id = channelInfo.channel_id;
                this.channel_name = channelInfo.channel_name;
                this.channel_cover = channelInfo.channel_cover;
                this.channel_avatar = channelInfo.channel_avatar;
                this.description = channelInfo.description;
                this.user_id = channelInfo.user_id;
                this.user_name = channelInfo.user_name;
                this.portrait = channelInfo.portrait;
                this.video_count = channelInfo.video_count;
                this.fans_count = channelInfo.fans_count;
                this.video_play_count = channelInfo.video_play_count;
                this.is_subscribe = channelInfo.is_subscribe;
                this.push_switch = channelInfo.push_switch;
                this.channel_small_cover = channelInfo.channel_small_cover;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChannelInfo build(boolean z) {
            return new ChannelInfo(this, z);
        }
    }
}
