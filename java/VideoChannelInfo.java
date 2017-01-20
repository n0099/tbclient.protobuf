package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class VideoChannelInfo extends Message {
    public static final String DEFAULT_CHANNEL_AVATAR = "";
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final String DEFAULT_CHANNEL_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String channel_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long channel_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String channel_name;

    /* synthetic */ VideoChannelInfo(Builder builder, boolean z, VideoChannelInfo videoChannelInfo) {
        this(builder, z);
    }

    private VideoChannelInfo(Builder builder, boolean z) {
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
            if (builder.channel_avatar == null) {
                this.channel_avatar = "";
                return;
            } else {
                this.channel_avatar = builder.channel_avatar;
                return;
            }
        }
        this.channel_id = builder.channel_id;
        this.channel_name = builder.channel_name;
        this.channel_avatar = builder.channel_avatar;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<VideoChannelInfo> {
        public String channel_avatar;
        public Long channel_id;
        public String channel_name;

        public Builder() {
        }

        public Builder(VideoChannelInfo videoChannelInfo) {
            super(videoChannelInfo);
            if (videoChannelInfo != null) {
                this.channel_id = videoChannelInfo.channel_id;
                this.channel_name = videoChannelInfo.channel_name;
                this.channel_avatar = videoChannelInfo.channel_avatar;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoChannelInfo build(boolean z) {
            return new VideoChannelInfo(this, z, null);
        }
    }
}
