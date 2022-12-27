package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VideoChannelInfo> {
        public String channel_avatar;
        public Long channel_id;
        public String channel_name;

        public Builder() {
        }

        public Builder(VideoChannelInfo videoChannelInfo) {
            super(videoChannelInfo);
            if (videoChannelInfo == null) {
                return;
            }
            this.channel_id = videoChannelInfo.channel_id;
            this.channel_name = videoChannelInfo.channel_name;
            this.channel_avatar = videoChannelInfo.channel_avatar;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoChannelInfo build(boolean z) {
            return new VideoChannelInfo(this, z);
        }
    }

    public VideoChannelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.channel_id;
            if (l == null) {
                this.channel_id = DEFAULT_CHANNEL_ID;
            } else {
                this.channel_id = l;
            }
            String str = builder.channel_name;
            if (str == null) {
                this.channel_name = "";
            } else {
                this.channel_name = str;
            }
            String str2 = builder.channel_avatar;
            if (str2 == null) {
                this.channel_avatar = "";
                return;
            } else {
                this.channel_avatar = str2;
                return;
            }
        }
        this.channel_id = builder.channel_id;
        this.channel_name = builder.channel_name;
        this.channel_avatar = builder.channel_avatar;
    }
}
