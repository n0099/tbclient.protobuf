package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class AlaLiveInfo extends Message {
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_FRS_TOPLIVE_PIC = "";
    public static final String DEFAULT_HLS_URL = "";
    public static final String DEFAULT_LABEL_NAME = "";
    public static final String DEFAULT_MEDIA_ID = "";
    public static final String DEFAULT_MEDIA_PIC = "";
    public static final String DEFAULT_MEDIA_SUBTITLE = "";
    public static final String DEFAULT_MEDIA_URL = "";
    public static final String DEFAULT_RTMP_URL = "";
    public static final String DEFAULT_SESSION_ID = "";
    public static final String DEFAULT_THIRD_APP_ID = "";
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer audience_count;
    @ProtoField(tag = 25)
    public final AlaChallengeInfo challenge_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 20, type = Message.Datatype.UINT64)
    public final Long distance;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer duration;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer frs_toplive_force;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String frs_toplive_pic;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer frs_toplive_type;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long group_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String hls_url;
    @ProtoField(tag = 24)
    public final AlaCoverLabel label;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer live_status;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer live_type;
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
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer screen_direction;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String session_id;
    @ProtoField(tag = 19)
    public final AlaShareInfo share_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<AlaStageDislikeInfo> stage_dislike_info;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String third_app_id;
    @ProtoField(tag = 22, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 12)
    public final AlaUserInfo user_info;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Integer DEFAULT_DURATION = 0;
    public static final Integer DEFAULT_AUDIENCE_COUNT = 0;
    public static final Integer DEFAULT_LIVE_TYPE = 0;
    public static final Integer DEFAULT_SCREEN_DIRECTION = 0;
    public static final Integer DEFAULT_LIVE_STATUS = 0;
    public static final Long DEFAULT_DISTANCE = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final List<AlaStageDislikeInfo> DEFAULT_STAGE_DISLIKE_INFO = Collections.emptyList();
    public static final Integer DEFAULT_FRS_TOPLIVE_TYPE = 0;
    public static final Integer DEFAULT_FRS_TOPLIVE_FORCE = 0;

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
            } else {
                this.duration = builder.duration;
            }
            if (builder.audience_count == null) {
                this.audience_count = DEFAULT_AUDIENCE_COUNT;
            } else {
                this.audience_count = builder.audience_count;
            }
            if (builder.live_type == null) {
                this.live_type = DEFAULT_LIVE_TYPE;
            } else {
                this.live_type = builder.live_type;
            }
            if (builder.screen_direction == null) {
                this.screen_direction = DEFAULT_SCREEN_DIRECTION;
            } else {
                this.screen_direction = builder.screen_direction;
            }
            if (builder.label_name == null) {
                this.label_name = "";
            } else {
                this.label_name = builder.label_name;
            }
            if (builder.live_status == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
            } else {
                this.live_status = builder.live_status;
            }
            this.share_info = builder.share_info;
            if (builder.distance == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = builder.distance;
            }
            if (builder.third_app_id == null) {
                this.third_app_id = "";
            } else {
                this.third_app_id = builder.third_app_id;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.stage_dislike_info == null) {
                this.stage_dislike_info = DEFAULT_STAGE_DISLIKE_INFO;
            } else {
                this.stage_dislike_info = immutableCopyOf(builder.stage_dislike_info);
            }
            this.label = builder.label;
            this.challenge_info = builder.challenge_info;
            if (builder.frs_toplive_type == null) {
                this.frs_toplive_type = DEFAULT_FRS_TOPLIVE_TYPE;
            } else {
                this.frs_toplive_type = builder.frs_toplive_type;
            }
            if (builder.frs_toplive_pic == null) {
                this.frs_toplive_pic = "";
            } else {
                this.frs_toplive_pic = builder.frs_toplive_pic;
            }
            if (builder.frs_toplive_force == null) {
                this.frs_toplive_force = DEFAULT_FRS_TOPLIVE_FORCE;
                return;
            } else {
                this.frs_toplive_force = builder.frs_toplive_force;
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
        this.audience_count = builder.audience_count;
        this.live_type = builder.live_type;
        this.screen_direction = builder.screen_direction;
        this.label_name = builder.label_name;
        this.live_status = builder.live_status;
        this.share_info = builder.share_info;
        this.distance = builder.distance;
        this.third_app_id = builder.third_app_id;
        this.thread_id = builder.thread_id;
        this.stage_dislike_info = immutableCopyOf(builder.stage_dislike_info);
        this.label = builder.label;
        this.challenge_info = builder.challenge_info;
        this.frs_toplive_type = builder.frs_toplive_type;
        this.frs_toplive_pic = builder.frs_toplive_pic;
        this.frs_toplive_force = builder.frs_toplive_force;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<AlaLiveInfo> {
        public Integer audience_count;
        public AlaChallengeInfo challenge_info;
        public String cover;
        public String description;
        public Long distance;
        public Integer duration;
        public Integer frs_toplive_force;
        public String frs_toplive_pic;
        public Integer frs_toplive_type;
        public Long group_id;
        public String hls_url;
        public AlaCoverLabel label;
        public String label_name;
        public Long live_id;
        public Integer live_status;
        public Integer live_type;
        public String media_id;
        public String media_pic;
        public String media_subtitle;
        public String media_url;
        public String rtmp_url;
        public Integer screen_direction;
        public String session_id;
        public AlaShareInfo share_info;
        public List<AlaStageDislikeInfo> stage_dislike_info;
        public String third_app_id;
        public Long thread_id;
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
                this.audience_count = alaLiveInfo.audience_count;
                this.live_type = alaLiveInfo.live_type;
                this.screen_direction = alaLiveInfo.screen_direction;
                this.label_name = alaLiveInfo.label_name;
                this.live_status = alaLiveInfo.live_status;
                this.share_info = alaLiveInfo.share_info;
                this.distance = alaLiveInfo.distance;
                this.third_app_id = alaLiveInfo.third_app_id;
                this.thread_id = alaLiveInfo.thread_id;
                this.stage_dislike_info = AlaLiveInfo.copyOf(alaLiveInfo.stage_dislike_info);
                this.label = alaLiveInfo.label;
                this.challenge_info = alaLiveInfo.challenge_info;
                this.frs_toplive_type = alaLiveInfo.frs_toplive_type;
                this.frs_toplive_pic = alaLiveInfo.frs_toplive_pic;
                this.frs_toplive_force = alaLiveInfo.frs_toplive_force;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveInfo build(boolean z) {
            return new AlaLiveInfo(this, z);
        }
    }
}
