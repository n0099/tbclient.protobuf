package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AlaLiveInfo extends Message {
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_HLS_URL = "";
    public static final String DEFAULT_MEDIA_ID = "";
    public static final String DEFAULT_MEDIA_PIC = "";
    public static final String DEFAULT_MEDIA_SUBTITLE = "";
    public static final String DEFAULT_MEDIA_URL = "";
    public static final String DEFAULT_RTMP_URL = "";
    public static final String DEFAULT_SESSION_ID = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer duration;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long group_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String hls_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String media_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String media_pic;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String media_subtitle;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String media_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rtmp_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String session_id;
    @ProtoField(tag = 12)
    public final AlaUserInfo user_info;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Integer DEFAULT_DURATION = 0;

    /* synthetic */ AlaLiveInfo(Builder builder, boolean z, AlaLiveInfo alaLiveInfo) {
        this(builder, z);
    }

    private AlaLiveInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.live_id == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = builder.live_id;
            }
            if (builder.cover == null) {
                this.cover = "";
            } else {
                this.cover = builder.cover;
            }
            if (builder.session_id == null) {
                this.session_id = "";
            } else {
                this.session_id = builder.session_id;
            }
            if (builder.rtmp_url == null) {
                this.rtmp_url = "";
            } else {
                this.rtmp_url = builder.rtmp_url;
            }
            if (builder.hls_url == null) {
                this.hls_url = "";
            } else {
                this.hls_url = builder.hls_url;
            }
            if (builder.group_id == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = builder.group_id;
            }
            if (builder.media_url == null) {
                this.media_url = "";
            } else {
                this.media_url = builder.media_url;
            }
            if (builder.media_pic == null) {
                this.media_pic = "";
            } else {
                this.media_pic = builder.media_pic;
            }
            if (builder.media_id == null) {
                this.media_id = "";
            } else {
                this.media_id = builder.media_id;
            }
            if (builder.media_subtitle == null) {
                this.media_subtitle = "";
            } else {
                this.media_subtitle = builder.media_subtitle;
            }
            if (builder.description == null) {
                this.description = "";
            } else {
                this.description = builder.description;
            }
            this.user_info = builder.user_info;
            if (builder.duration == null) {
                this.duration = DEFAULT_DURATION;
                return;
            } else {
                this.duration = builder.duration;
                return;
            }
        }
        this.live_id = builder.live_id;
        this.cover = builder.cover;
        this.session_id = builder.session_id;
        this.rtmp_url = builder.rtmp_url;
        this.hls_url = builder.hls_url;
        this.group_id = builder.group_id;
        this.media_url = builder.media_url;
        this.media_pic = builder.media_pic;
        this.media_id = builder.media_id;
        this.media_subtitle = builder.media_subtitle;
        this.description = builder.description;
        this.user_info = builder.user_info;
        this.duration = builder.duration;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AlaLiveInfo> {
        public String cover;
        public String description;
        public Integer duration;
        public Long group_id;
        public String hls_url;
        public Long live_id;
        public String media_id;
        public String media_pic;
        public String media_subtitle;
        public String media_url;
        public String rtmp_url;
        public String session_id;
        public AlaUserInfo user_info;

        public Builder() {
        }

        public Builder(AlaLiveInfo alaLiveInfo) {
            super(alaLiveInfo);
            if (alaLiveInfo != null) {
                this.live_id = alaLiveInfo.live_id;
                this.cover = alaLiveInfo.cover;
                this.session_id = alaLiveInfo.session_id;
                this.rtmp_url = alaLiveInfo.rtmp_url;
                this.hls_url = alaLiveInfo.hls_url;
                this.group_id = alaLiveInfo.group_id;
                this.media_url = alaLiveInfo.media_url;
                this.media_pic = alaLiveInfo.media_pic;
                this.media_id = alaLiveInfo.media_id;
                this.media_subtitle = alaLiveInfo.media_subtitle;
                this.description = alaLiveInfo.description;
                this.user_info = alaLiveInfo.user_info;
                this.duration = alaLiveInfo.duration;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveInfo build(boolean z) {
            return new AlaLiveInfo(this, z, null);
        }
    }
}
