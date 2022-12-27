package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class LiveInfo extends Message {
    public static final String DEFAULT_CHANNEL_NAME = "";
    public static final String DEFAULT_CLOSE_REASON = "";
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_LOCATION = "";
    public static final String DEFAULT_ON_AUDIO_PRIVATE = "";
    public static final String DEFAULT_SESSION_ID = "";
    public static final String DEFAULT_SHARE_URL = "";
    public static final String DEFAULT_THIRD_APP_ID = "";
    public static final String DEFAULT_THIRD_APP_NAME = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    @ProtoField(tag = 23, type = Message.Datatype.UINT32)
    public final Integer audience_count;
    @ProtoField(tag = 24, type = Message.Datatype.UINT32)
    public final Integer backstage_type;
    @ProtoField(tag = 22, type = Message.Datatype.UINT32)
    public final Integer backstage_update_time;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long channel_id;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String channel_name;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer charm_count;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String close_reason;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer close_type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 41, type = Message.Datatype.UINT32)
    public final Integer flower_count;
    @ProtoField(tag = 30, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long group_id;
    @ProtoField(tag = 44, type = Message.Datatype.INT32)
    public final Integer im_pull_mode;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer join_count;
    @ProtoField(tag = 27, type = Message.Datatype.UINT64)
    public final Long last_msg_id;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer live_duration;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer live_status;
    @ProtoField(tag = 34, type = Message.Datatype.UINT32)
    public final Integer live_type;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 28)
    public final LiveMedia media;
    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String on_audio_private;
    @ProtoField(tag = 36, type = Message.Datatype.UINT32)
    public final Integer on_private;
    @ProtoField(tag = 43, type = Message.Datatype.UINT64)
    public final Long pk_id;
    @ProtoField(tag = 35, type = Message.Datatype.UINT32)
    public final Integer screen_direction;
    @ProtoField(tag = 39, type = Message.Datatype.UINT32)
    public final Integer session_default;
    @ProtoField(tag = 20, type = Message.Datatype.UINT64)
    public final Long session_exception;
    @ProtoField(tag = 40, type = Message.Datatype.UINT32)
    public final Integer session_force;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String session_id;
    @ProtoField(tag = 19)
    public final LiveSessionInfo session_info;
    @ProtoField(tag = 38)
    public final LiveSessionInfo session_info_backup;
    @ProtoField(tag = 25, type = Message.Datatype.UINT32)
    public final Integer session_status;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer session_update_time;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String share_url;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer start_time;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String third_app_id;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String third_app_name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String user_nickname;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer zan_count;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Integer DEFAULT_JOIN_COUNT = 0;
    public static final Integer DEFAULT_ZAN_COUNT = 0;
    public static final Integer DEFAULT_LIVE_DURATION = 0;
    public static final Integer DEFAULT_CHARM_COUNT = 0;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Integer DEFAULT_LIVE_STATUS = 0;
    public static final Integer DEFAULT_CLOSE_TYPE = 0;
    public static final Long DEFAULT_SESSION_EXCEPTION = 0L;
    public static final Integer DEFAULT_SESSION_UPDATE_TIME = 0;
    public static final Integer DEFAULT_BACKSTAGE_UPDATE_TIME = 0;
    public static final Integer DEFAULT_AUDIENCE_COUNT = 0;
    public static final Integer DEFAULT_BACKSTAGE_TYPE = 0;
    public static final Integer DEFAULT_SESSION_STATUS = 0;
    public static final Long DEFAULT_LAST_MSG_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_LIVE_TYPE = 0;
    public static final Integer DEFAULT_SCREEN_DIRECTION = 0;
    public static final Integer DEFAULT_ON_PRIVATE = 0;
    public static final Integer DEFAULT_SESSION_DEFAULT = 0;
    public static final Integer DEFAULT_SESSION_FORCE = 0;
    public static final Integer DEFAULT_FLOWER_COUNT = 0;
    public static final Long DEFAULT_PK_ID = 0L;
    public static final Integer DEFAULT_IM_PULL_MODE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveInfo> {
        public Integer audience_count;
        public Integer backstage_type;
        public Integer backstage_update_time;
        public Long channel_id;
        public String channel_name;
        public Integer charm_count;
        public String close_reason;
        public Integer close_type;
        public String cover;
        public String description;
        public Integer end_time;
        public Integer flower_count;
        public Long forum_id;
        public String forum_name;
        public Long group_id;
        public Integer im_pull_mode;
        public Integer join_count;
        public Long last_msg_id;
        public Integer live_duration;
        public Long live_id;
        public Integer live_status;
        public Integer live_type;
        public String location;
        public LiveMedia media;
        public String on_audio_private;
        public Integer on_private;
        public Long pk_id;
        public Integer screen_direction;
        public Integer session_default;
        public Long session_exception;
        public Integer session_force;
        public String session_id;
        public LiveSessionInfo session_info;
        public LiveSessionInfo session_info_backup;
        public Integer session_status;
        public Integer session_update_time;
        public String share_url;
        public Integer start_time;
        public String third_app_id;
        public String third_app_name;
        public Long user_id;
        public String user_name;
        public String user_nickname;
        public Integer zan_count;

        public Builder() {
        }

        public Builder(LiveInfo liveInfo) {
            super(liveInfo);
            if (liveInfo == null) {
                return;
            }
            this.live_id = liveInfo.live_id;
            this.user_id = liveInfo.user_id;
            this.user_name = liveInfo.user_name;
            this.group_id = liveInfo.group_id;
            this.session_id = liveInfo.session_id;
            this.description = liveInfo.description;
            this.cover = liveInfo.cover;
            this.join_count = liveInfo.join_count;
            this.zan_count = liveInfo.zan_count;
            this.live_duration = liveInfo.live_duration;
            this.charm_count = liveInfo.charm_count;
            this.start_time = liveInfo.start_time;
            this.end_time = liveInfo.end_time;
            this.channel_id = liveInfo.channel_id;
            this.channel_name = liveInfo.channel_name;
            this.live_status = liveInfo.live_status;
            this.close_type = liveInfo.close_type;
            this.close_reason = liveInfo.close_reason;
            this.session_info = liveInfo.session_info;
            this.session_exception = liveInfo.session_exception;
            this.session_update_time = liveInfo.session_update_time;
            this.backstage_update_time = liveInfo.backstage_update_time;
            this.audience_count = liveInfo.audience_count;
            this.backstage_type = liveInfo.backstage_type;
            this.session_status = liveInfo.session_status;
            this.share_url = liveInfo.share_url;
            this.last_msg_id = liveInfo.last_msg_id;
            this.media = liveInfo.media;
            this.location = liveInfo.location;
            this.forum_id = liveInfo.forum_id;
            this.forum_name = liveInfo.forum_name;
            this.third_app_id = liveInfo.third_app_id;
            this.third_app_name = liveInfo.third_app_name;
            this.live_type = liveInfo.live_type;
            this.screen_direction = liveInfo.screen_direction;
            this.on_private = liveInfo.on_private;
            this.user_nickname = liveInfo.user_nickname;
            this.session_info_backup = liveInfo.session_info_backup;
            this.session_default = liveInfo.session_default;
            this.session_force = liveInfo.session_force;
            this.flower_count = liveInfo.flower_count;
            this.on_audio_private = liveInfo.on_audio_private;
            this.pk_id = liveInfo.pk_id;
            this.im_pull_mode = liveInfo.im_pull_mode;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveInfo build(boolean z) {
            return new LiveInfo(this, z);
        }
    }

    public LiveInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.live_id;
            if (l == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Long l3 = builder.group_id;
            if (l3 == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = l3;
            }
            String str2 = builder.session_id;
            if (str2 == null) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            String str3 = builder.description;
            if (str3 == null) {
                this.description = "";
            } else {
                this.description = str3;
            }
            String str4 = builder.cover;
            if (str4 == null) {
                this.cover = "";
            } else {
                this.cover = str4;
            }
            Integer num = builder.join_count;
            if (num == null) {
                this.join_count = DEFAULT_JOIN_COUNT;
            } else {
                this.join_count = num;
            }
            Integer num2 = builder.zan_count;
            if (num2 == null) {
                this.zan_count = DEFAULT_ZAN_COUNT;
            } else {
                this.zan_count = num2;
            }
            Integer num3 = builder.live_duration;
            if (num3 == null) {
                this.live_duration = DEFAULT_LIVE_DURATION;
            } else {
                this.live_duration = num3;
            }
            Integer num4 = builder.charm_count;
            if (num4 == null) {
                this.charm_count = DEFAULT_CHARM_COUNT;
            } else {
                this.charm_count = num4;
            }
            Integer num5 = builder.start_time;
            if (num5 == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num5;
            }
            Integer num6 = builder.end_time;
            if (num6 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num6;
            }
            Long l4 = builder.channel_id;
            if (l4 == null) {
                this.channel_id = DEFAULT_CHANNEL_ID;
            } else {
                this.channel_id = l4;
            }
            String str5 = builder.channel_name;
            if (str5 == null) {
                this.channel_name = "";
            } else {
                this.channel_name = str5;
            }
            Integer num7 = builder.live_status;
            if (num7 == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
            } else {
                this.live_status = num7;
            }
            Integer num8 = builder.close_type;
            if (num8 == null) {
                this.close_type = DEFAULT_CLOSE_TYPE;
            } else {
                this.close_type = num8;
            }
            String str6 = builder.close_reason;
            if (str6 == null) {
                this.close_reason = "";
            } else {
                this.close_reason = str6;
            }
            this.session_info = builder.session_info;
            Long l5 = builder.session_exception;
            if (l5 == null) {
                this.session_exception = DEFAULT_SESSION_EXCEPTION;
            } else {
                this.session_exception = l5;
            }
            Integer num9 = builder.session_update_time;
            if (num9 == null) {
                this.session_update_time = DEFAULT_SESSION_UPDATE_TIME;
            } else {
                this.session_update_time = num9;
            }
            Integer num10 = builder.backstage_update_time;
            if (num10 == null) {
                this.backstage_update_time = DEFAULT_BACKSTAGE_UPDATE_TIME;
            } else {
                this.backstage_update_time = num10;
            }
            Integer num11 = builder.audience_count;
            if (num11 == null) {
                this.audience_count = DEFAULT_AUDIENCE_COUNT;
            } else {
                this.audience_count = num11;
            }
            Integer num12 = builder.backstage_type;
            if (num12 == null) {
                this.backstage_type = DEFAULT_BACKSTAGE_TYPE;
            } else {
                this.backstage_type = num12;
            }
            Integer num13 = builder.session_status;
            if (num13 == null) {
                this.session_status = DEFAULT_SESSION_STATUS;
            } else {
                this.session_status = num13;
            }
            String str7 = builder.share_url;
            if (str7 == null) {
                this.share_url = "";
            } else {
                this.share_url = str7;
            }
            Long l6 = builder.last_msg_id;
            if (l6 == null) {
                this.last_msg_id = DEFAULT_LAST_MSG_ID;
            } else {
                this.last_msg_id = l6;
            }
            this.media = builder.media;
            String str8 = builder.location;
            if (str8 == null) {
                this.location = "";
            } else {
                this.location = str8;
            }
            Long l7 = builder.forum_id;
            if (l7 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l7;
            }
            String str9 = builder.forum_name;
            if (str9 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str9;
            }
            String str10 = builder.third_app_id;
            if (str10 == null) {
                this.third_app_id = "";
            } else {
                this.third_app_id = str10;
            }
            String str11 = builder.third_app_name;
            if (str11 == null) {
                this.third_app_name = "";
            } else {
                this.third_app_name = str11;
            }
            Integer num14 = builder.live_type;
            if (num14 == null) {
                this.live_type = DEFAULT_LIVE_TYPE;
            } else {
                this.live_type = num14;
            }
            Integer num15 = builder.screen_direction;
            if (num15 == null) {
                this.screen_direction = DEFAULT_SCREEN_DIRECTION;
            } else {
                this.screen_direction = num15;
            }
            Integer num16 = builder.on_private;
            if (num16 == null) {
                this.on_private = DEFAULT_ON_PRIVATE;
            } else {
                this.on_private = num16;
            }
            String str12 = builder.user_nickname;
            if (str12 == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = str12;
            }
            this.session_info_backup = builder.session_info_backup;
            Integer num17 = builder.session_default;
            if (num17 == null) {
                this.session_default = DEFAULT_SESSION_DEFAULT;
            } else {
                this.session_default = num17;
            }
            Integer num18 = builder.session_force;
            if (num18 == null) {
                this.session_force = DEFAULT_SESSION_FORCE;
            } else {
                this.session_force = num18;
            }
            Integer num19 = builder.flower_count;
            if (num19 == null) {
                this.flower_count = DEFAULT_FLOWER_COUNT;
            } else {
                this.flower_count = num19;
            }
            String str13 = builder.on_audio_private;
            if (str13 == null) {
                this.on_audio_private = "";
            } else {
                this.on_audio_private = str13;
            }
            Long l8 = builder.pk_id;
            if (l8 == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l8;
            }
            Integer num20 = builder.im_pull_mode;
            if (num20 == null) {
                this.im_pull_mode = DEFAULT_IM_PULL_MODE;
                return;
            } else {
                this.im_pull_mode = num20;
                return;
            }
        }
        this.live_id = builder.live_id;
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.group_id = builder.group_id;
        this.session_id = builder.session_id;
        this.description = builder.description;
        this.cover = builder.cover;
        this.join_count = builder.join_count;
        this.zan_count = builder.zan_count;
        this.live_duration = builder.live_duration;
        this.charm_count = builder.charm_count;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.channel_id = builder.channel_id;
        this.channel_name = builder.channel_name;
        this.live_status = builder.live_status;
        this.close_type = builder.close_type;
        this.close_reason = builder.close_reason;
        this.session_info = builder.session_info;
        this.session_exception = builder.session_exception;
        this.session_update_time = builder.session_update_time;
        this.backstage_update_time = builder.backstage_update_time;
        this.audience_count = builder.audience_count;
        this.backstage_type = builder.backstage_type;
        this.session_status = builder.session_status;
        this.share_url = builder.share_url;
        this.last_msg_id = builder.last_msg_id;
        this.media = builder.media;
        this.location = builder.location;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.third_app_id = builder.third_app_id;
        this.third_app_name = builder.third_app_name;
        this.live_type = builder.live_type;
        this.screen_direction = builder.screen_direction;
        this.on_private = builder.on_private;
        this.user_nickname = builder.user_nickname;
        this.session_info_backup = builder.session_info_backup;
        this.session_default = builder.session_default;
        this.session_force = builder.session_force;
        this.flower_count = builder.flower_count;
        this.on_audio_private = builder.on_audio_private;
        this.pk_id = builder.pk_id;
        this.im_pull_mode = builder.im_pull_mode;
    }
}
