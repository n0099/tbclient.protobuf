package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class AlaLiveInfo extends Message {
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_FIRST_HEADLINE = "";
    public static final String DEFAULT_FRS_TOPLIVE_PIC = "";
    public static final String DEFAULT_HLS_URL = "";
    public static final String DEFAULT_LABEL_NAME = "";
    public static final String DEFAULT_MEDIA_ID = "";
    public static final String DEFAULT_MEDIA_PIC = "";
    public static final String DEFAULT_MEDIA_SUBTITLE = "";
    public static final String DEFAULT_MEDIA_URL = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_ROOM_NAME = "";
    public static final String DEFAULT_ROUTER_TYPE = "";
    public static final String DEFAULT_RTMP_URL = "";
    public static final String DEFAULT_SECOND_HEADLINE = "";
    public static final String DEFAULT_SESSION_ID = "";
    public static final String DEFAULT_THIRD_APP_ID = "";
    public static final String DEFAULT_THIRD_LIVE_TYPE = "";
    public static final String DEFAULT_THIRD_ROOM_ID = "";
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer audience_count;
    @ProtoField(tag = 25)
    public final AlaChallengeInfo challenge_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(label = Message.Label.REPEATED, tag = 43)
    public final List<DislikeInfo> dislike_info;
    @ProtoField(tag = 20, type = Message.Datatype.UINT64)
    public final Long distance;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer duration;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String first_headline;
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
    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer live_from;
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
    @ProtoField(tag = 41, type = Message.Datatype.UINT32)
    public final Integer open_recom_duration;
    @ProtoField(tag = 40, type = Message.Datatype.UINT32)
    public final Integer open_recom_fans;
    @ProtoField(tag = 39, type = Message.Datatype.UINT32)
    public final Integer open_recom_location;
    @ProtoField(tag = 38, type = Message.Datatype.UINT32)
    public final Integer open_recom_reason;
    @ProtoField(tag = 36, type = Message.Datatype.UINT32)
    public final Integer pb_display_type;
    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = 44, type = Message.Datatype.UINT64)
    public final Long room_id;
    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String room_name;
    @ProtoField(tag = 45, type = Message.Datatype.INT32)
    public final Integer room_status;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String router_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rtmp_url;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer screen_direction;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String second_headline;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String session_id;
    @ProtoField(tag = 19)
    public final AlaShareInfo share_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<AlaStageDislikeInfo> stage_dislike_info;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String third_app_id;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String third_live_type;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String third_room_id;
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
    public static final Integer DEFAULT_LIVE_FROM = 0;
    public static final Integer DEFAULT_PB_DISPLAY_TYPE = 0;
    public static final Integer DEFAULT_OPEN_RECOM_REASON = 0;
    public static final Integer DEFAULT_OPEN_RECOM_LOCATION = 0;
    public static final Integer DEFAULT_OPEN_RECOM_FANS = 0;
    public static final Integer DEFAULT_OPEN_RECOM_DURATION = 0;
    public static final List<DislikeInfo> DEFAULT_DISLIKE_INFO = Collections.emptyList();
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Integer DEFAULT_ROOM_STATUS = 0;

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
            } else {
                this.frs_toplive_force = builder.frs_toplive_force;
            }
            if (builder.live_from == null) {
                this.live_from = DEFAULT_LIVE_FROM;
            } else {
                this.live_from = builder.live_from;
            }
            if (builder.third_room_id == null) {
                this.third_room_id = "";
            } else {
                this.third_room_id = builder.third_room_id;
            }
            if (builder.router_type == null) {
                this.router_type = "";
            } else {
                this.router_type = builder.router_type;
            }
            if (builder.third_live_type == null) {
                this.third_live_type = "";
            } else {
                this.third_live_type = builder.third_live_type;
            }
            if (builder.first_headline == null) {
                this.first_headline = "";
            } else {
                this.first_headline = builder.first_headline;
            }
            if (builder.second_headline == null) {
                this.second_headline = "";
            } else {
                this.second_headline = builder.second_headline;
            }
            if (builder.pb_display_type == null) {
                this.pb_display_type = DEFAULT_PB_DISPLAY_TYPE;
            } else {
                this.pb_display_type = builder.pb_display_type;
            }
            if (builder.recom_reason == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = builder.recom_reason;
            }
            if (builder.open_recom_reason == null) {
                this.open_recom_reason = DEFAULT_OPEN_RECOM_REASON;
            } else {
                this.open_recom_reason = builder.open_recom_reason;
            }
            if (builder.open_recom_location == null) {
                this.open_recom_location = DEFAULT_OPEN_RECOM_LOCATION;
            } else {
                this.open_recom_location = builder.open_recom_location;
            }
            if (builder.open_recom_fans == null) {
                this.open_recom_fans = DEFAULT_OPEN_RECOM_FANS;
            } else {
                this.open_recom_fans = builder.open_recom_fans;
            }
            if (builder.open_recom_duration == null) {
                this.open_recom_duration = DEFAULT_OPEN_RECOM_DURATION;
            } else {
                this.open_recom_duration = builder.open_recom_duration;
            }
            if (builder.dislike_info == null) {
                this.dislike_info = DEFAULT_DISLIKE_INFO;
            } else {
                this.dislike_info = immutableCopyOf(builder.dislike_info);
            }
            if (builder.room_id == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = builder.room_id;
            }
            if (builder.room_status == null) {
                this.room_status = DEFAULT_ROOM_STATUS;
            } else {
                this.room_status = builder.room_status;
            }
            if (builder.room_name == null) {
                this.room_name = "";
                return;
            } else {
                this.room_name = builder.room_name;
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
        this.live_from = builder.live_from;
        this.third_room_id = builder.third_room_id;
        this.router_type = builder.router_type;
        this.third_live_type = builder.third_live_type;
        this.first_headline = builder.first_headline;
        this.second_headline = builder.second_headline;
        this.pb_display_type = builder.pb_display_type;
        this.recom_reason = builder.recom_reason;
        this.open_recom_reason = builder.open_recom_reason;
        this.open_recom_location = builder.open_recom_location;
        this.open_recom_fans = builder.open_recom_fans;
        this.open_recom_duration = builder.open_recom_duration;
        this.dislike_info = immutableCopyOf(builder.dislike_info);
        this.room_id = builder.room_id;
        this.room_status = builder.room_status;
        this.room_name = builder.room_name;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<AlaLiveInfo> {
        public Integer audience_count;
        public AlaChallengeInfo challenge_info;
        public String cover;
        public String description;
        public List<DislikeInfo> dislike_info;
        public Long distance;
        public Integer duration;
        public String first_headline;
        public Integer frs_toplive_force;
        public String frs_toplive_pic;
        public Integer frs_toplive_type;
        public Long group_id;
        public String hls_url;
        public AlaCoverLabel label;
        public String label_name;
        public Integer live_from;
        public Long live_id;
        public Integer live_status;
        public Integer live_type;
        public String media_id;
        public String media_pic;
        public String media_subtitle;
        public String media_url;
        public Integer open_recom_duration;
        public Integer open_recom_fans;
        public Integer open_recom_location;
        public Integer open_recom_reason;
        public Integer pb_display_type;
        public String recom_reason;
        public Long room_id;
        public String room_name;
        public Integer room_status;
        public String router_type;
        public String rtmp_url;
        public Integer screen_direction;
        public String second_headline;
        public String session_id;
        public AlaShareInfo share_info;
        public List<AlaStageDislikeInfo> stage_dislike_info;
        public String third_app_id;
        public String third_live_type;
        public String third_room_id;
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
                this.live_from = alaLiveInfo.live_from;
                this.third_room_id = alaLiveInfo.third_room_id;
                this.router_type = alaLiveInfo.router_type;
                this.third_live_type = alaLiveInfo.third_live_type;
                this.first_headline = alaLiveInfo.first_headline;
                this.second_headline = alaLiveInfo.second_headline;
                this.pb_display_type = alaLiveInfo.pb_display_type;
                this.recom_reason = alaLiveInfo.recom_reason;
                this.open_recom_reason = alaLiveInfo.open_recom_reason;
                this.open_recom_location = alaLiveInfo.open_recom_location;
                this.open_recom_fans = alaLiveInfo.open_recom_fans;
                this.open_recom_duration = alaLiveInfo.open_recom_duration;
                this.dislike_info = AlaLiveInfo.copyOf(alaLiveInfo.dislike_info);
                this.room_id = alaLiveInfo.room_id;
                this.room_status = alaLiveInfo.room_status;
                this.room_name = alaLiveInfo.room_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveInfo build(boolean z) {
            return new AlaLiveInfo(this, z);
        }
    }
}
