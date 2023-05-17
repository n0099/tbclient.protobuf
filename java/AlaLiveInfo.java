package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class AlaLiveInfo extends Message {
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_COVER_WIDE = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_FIRST_HEADLINE = "";
    public static final String DEFAULT_FORUM_USER_LIVE_MSG = "";
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
    @ProtoField(tag = 48, type = Message.Datatype.STRING)
    public final String cover_wide;
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
    @ProtoField(tag = 47, type = Message.Datatype.STRING)
    public final String forum_user_live_msg;
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
    @ProtoField(tag = 50, type = Message.Datatype.INT32)
    public final Integer show_page;
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
    @ProtoField(tag = 51)
    public final UniversalLabel user_label;
    @ProtoField(tag = 49)
    public final YyExt yy_ext;
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
    public static final Integer DEFAULT_SHOW_PAGE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AlaLiveInfo> {
        public Integer audience_count;
        public AlaChallengeInfo challenge_info;
        public String cover;
        public String cover_wide;
        public String description;
        public List<DislikeInfo> dislike_info;
        public Long distance;
        public Integer duration;
        public String first_headline;
        public String forum_user_live_msg;
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
        public Integer show_page;
        public List<AlaStageDislikeInfo> stage_dislike_info;
        public String third_app_id;
        public String third_live_type;
        public String third_room_id;
        public Long thread_id;
        public AlaUserInfo user_info;
        public UniversalLabel user_label;
        public YyExt yy_ext;

        public Builder() {
        }

        public Builder(AlaLiveInfo alaLiveInfo) {
            super(alaLiveInfo);
            if (alaLiveInfo == null) {
                return;
            }
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
            this.stage_dislike_info = Message.copyOf(alaLiveInfo.stage_dislike_info);
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
            this.dislike_info = Message.copyOf(alaLiveInfo.dislike_info);
            this.room_id = alaLiveInfo.room_id;
            this.room_status = alaLiveInfo.room_status;
            this.room_name = alaLiveInfo.room_name;
            this.forum_user_live_msg = alaLiveInfo.forum_user_live_msg;
            this.cover_wide = alaLiveInfo.cover_wide;
            this.yy_ext = alaLiveInfo.yy_ext;
            this.show_page = alaLiveInfo.show_page;
            this.user_label = alaLiveInfo.user_label;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveInfo build(boolean z) {
            return new AlaLiveInfo(this, z);
        }
    }

    public AlaLiveInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.live_id;
            if (l == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l;
            }
            String str = builder.cover;
            if (str == null) {
                this.cover = "";
            } else {
                this.cover = str;
            }
            String str2 = builder.session_id;
            if (str2 == null) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            String str3 = builder.rtmp_url;
            if (str3 == null) {
                this.rtmp_url = "";
            } else {
                this.rtmp_url = str3;
            }
            String str4 = builder.hls_url;
            if (str4 == null) {
                this.hls_url = "";
            } else {
                this.hls_url = str4;
            }
            Long l2 = builder.group_id;
            if (l2 == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = l2;
            }
            String str5 = builder.media_url;
            if (str5 == null) {
                this.media_url = "";
            } else {
                this.media_url = str5;
            }
            String str6 = builder.media_pic;
            if (str6 == null) {
                this.media_pic = "";
            } else {
                this.media_pic = str6;
            }
            String str7 = builder.media_id;
            if (str7 == null) {
                this.media_id = "";
            } else {
                this.media_id = str7;
            }
            String str8 = builder.media_subtitle;
            if (str8 == null) {
                this.media_subtitle = "";
            } else {
                this.media_subtitle = str8;
            }
            String str9 = builder.description;
            if (str9 == null) {
                this.description = "";
            } else {
                this.description = str9;
            }
            this.user_info = builder.user_info;
            Integer num = builder.duration;
            if (num == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num;
            }
            Integer num2 = builder.audience_count;
            if (num2 == null) {
                this.audience_count = DEFAULT_AUDIENCE_COUNT;
            } else {
                this.audience_count = num2;
            }
            Integer num3 = builder.live_type;
            if (num3 == null) {
                this.live_type = DEFAULT_LIVE_TYPE;
            } else {
                this.live_type = num3;
            }
            Integer num4 = builder.screen_direction;
            if (num4 == null) {
                this.screen_direction = DEFAULT_SCREEN_DIRECTION;
            } else {
                this.screen_direction = num4;
            }
            String str10 = builder.label_name;
            if (str10 == null) {
                this.label_name = "";
            } else {
                this.label_name = str10;
            }
            Integer num5 = builder.live_status;
            if (num5 == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
            } else {
                this.live_status = num5;
            }
            this.share_info = builder.share_info;
            Long l3 = builder.distance;
            if (l3 == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = l3;
            }
            String str11 = builder.third_app_id;
            if (str11 == null) {
                this.third_app_id = "";
            } else {
                this.third_app_id = str11;
            }
            Long l4 = builder.thread_id;
            if (l4 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l4;
            }
            List<AlaStageDislikeInfo> list = builder.stage_dislike_info;
            if (list == null) {
                this.stage_dislike_info = DEFAULT_STAGE_DISLIKE_INFO;
            } else {
                this.stage_dislike_info = Message.immutableCopyOf(list);
            }
            this.label = builder.label;
            this.challenge_info = builder.challenge_info;
            Integer num6 = builder.frs_toplive_type;
            if (num6 == null) {
                this.frs_toplive_type = DEFAULT_FRS_TOPLIVE_TYPE;
            } else {
                this.frs_toplive_type = num6;
            }
            String str12 = builder.frs_toplive_pic;
            if (str12 == null) {
                this.frs_toplive_pic = "";
            } else {
                this.frs_toplive_pic = str12;
            }
            Integer num7 = builder.frs_toplive_force;
            if (num7 == null) {
                this.frs_toplive_force = DEFAULT_FRS_TOPLIVE_FORCE;
            } else {
                this.frs_toplive_force = num7;
            }
            Integer num8 = builder.live_from;
            if (num8 == null) {
                this.live_from = DEFAULT_LIVE_FROM;
            } else {
                this.live_from = num8;
            }
            String str13 = builder.third_room_id;
            if (str13 == null) {
                this.third_room_id = "";
            } else {
                this.third_room_id = str13;
            }
            String str14 = builder.router_type;
            if (str14 == null) {
                this.router_type = "";
            } else {
                this.router_type = str14;
            }
            String str15 = builder.third_live_type;
            if (str15 == null) {
                this.third_live_type = "";
            } else {
                this.third_live_type = str15;
            }
            String str16 = builder.first_headline;
            if (str16 == null) {
                this.first_headline = "";
            } else {
                this.first_headline = str16;
            }
            String str17 = builder.second_headline;
            if (str17 == null) {
                this.second_headline = "";
            } else {
                this.second_headline = str17;
            }
            Integer num9 = builder.pb_display_type;
            if (num9 == null) {
                this.pb_display_type = DEFAULT_PB_DISPLAY_TYPE;
            } else {
                this.pb_display_type = num9;
            }
            String str18 = builder.recom_reason;
            if (str18 == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = str18;
            }
            Integer num10 = builder.open_recom_reason;
            if (num10 == null) {
                this.open_recom_reason = DEFAULT_OPEN_RECOM_REASON;
            } else {
                this.open_recom_reason = num10;
            }
            Integer num11 = builder.open_recom_location;
            if (num11 == null) {
                this.open_recom_location = DEFAULT_OPEN_RECOM_LOCATION;
            } else {
                this.open_recom_location = num11;
            }
            Integer num12 = builder.open_recom_fans;
            if (num12 == null) {
                this.open_recom_fans = DEFAULT_OPEN_RECOM_FANS;
            } else {
                this.open_recom_fans = num12;
            }
            Integer num13 = builder.open_recom_duration;
            if (num13 == null) {
                this.open_recom_duration = DEFAULT_OPEN_RECOM_DURATION;
            } else {
                this.open_recom_duration = num13;
            }
            List<DislikeInfo> list2 = builder.dislike_info;
            if (list2 == null) {
                this.dislike_info = DEFAULT_DISLIKE_INFO;
            } else {
                this.dislike_info = Message.immutableCopyOf(list2);
            }
            Long l5 = builder.room_id;
            if (l5 == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = l5;
            }
            Integer num14 = builder.room_status;
            if (num14 == null) {
                this.room_status = DEFAULT_ROOM_STATUS;
            } else {
                this.room_status = num14;
            }
            String str19 = builder.room_name;
            if (str19 == null) {
                this.room_name = "";
            } else {
                this.room_name = str19;
            }
            String str20 = builder.forum_user_live_msg;
            if (str20 == null) {
                this.forum_user_live_msg = "";
            } else {
                this.forum_user_live_msg = str20;
            }
            String str21 = builder.cover_wide;
            if (str21 == null) {
                this.cover_wide = "";
            } else {
                this.cover_wide = str21;
            }
            this.yy_ext = builder.yy_ext;
            Integer num15 = builder.show_page;
            if (num15 == null) {
                this.show_page = DEFAULT_SHOW_PAGE;
            } else {
                this.show_page = num15;
            }
            this.user_label = builder.user_label;
            return;
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
        this.stage_dislike_info = Message.immutableCopyOf(builder.stage_dislike_info);
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
        this.dislike_info = Message.immutableCopyOf(builder.dislike_info);
        this.room_id = builder.room_id;
        this.room_status = builder.room_status;
        this.room_name = builder.room_name;
        this.forum_user_live_msg = builder.forum_user_live_msg;
        this.cover_wide = builder.cover_wide;
        this.yy_ext = builder.yy_ext;
        this.show_page = builder.show_page;
        this.user_label = builder.user_label;
    }
}
