package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class SportScheduleInfo extends Message {
    public static final String DEFAULT_GUEST_TEAM_ICON = "";
    public static final String DEFAULT_GUEST_TEAM_NAME = "";
    public static final String DEFAULT_HOME_TEAM_ICON = "";
    public static final String DEFAULT_HOME_TEAM_NAME = "";
    public static final String DEFAULT_MATCH_BOTTOM_INFO = "";
    public static final String DEFAULT_MATCH_MIDDLE_INFO = "";
    public static final String DEFAULT_MATCH_TOP_INFO = "";
    public static final String DEFAULT_MSG_URL = "";
    public static final Integer DEFAULT_SPORT_TYPE = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String guest_team_icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String guest_team_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String home_team_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String home_team_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String match_bottom_info;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String match_middle_info;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String match_top_info;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String msg_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sport_type;
    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long update_time;

    private SportScheduleInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.sport_type == null) {
                this.sport_type = DEFAULT_SPORT_TYPE;
            } else {
                this.sport_type = builder.sport_type;
            }
            if (builder.home_team_name == null) {
                this.home_team_name = "";
            } else {
                this.home_team_name = builder.home_team_name;
            }
            if (builder.guest_team_name == null) {
                this.guest_team_name = "";
            } else {
                this.guest_team_name = builder.guest_team_name;
            }
            if (builder.home_team_icon == null) {
                this.home_team_icon = "";
            } else {
                this.home_team_icon = builder.home_team_icon;
            }
            if (builder.guest_team_icon == null) {
                this.guest_team_icon = "";
            } else {
                this.guest_team_icon = builder.guest_team_icon;
            }
            if (builder.match_top_info == null) {
                this.match_top_info = "";
            } else {
                this.match_top_info = builder.match_top_info;
            }
            if (builder.match_middle_info == null) {
                this.match_middle_info = "";
            } else {
                this.match_middle_info = builder.match_middle_info;
            }
            if (builder.match_bottom_info == null) {
                this.match_bottom_info = "";
            } else {
                this.match_bottom_info = builder.match_bottom_info;
            }
            if (builder.msg_url == null) {
                this.msg_url = "";
            } else {
                this.msg_url = builder.msg_url;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
                return;
            } else {
                this.update_time = builder.update_time;
                return;
            }
        }
        this.sport_type = builder.sport_type;
        this.home_team_name = builder.home_team_name;
        this.guest_team_name = builder.guest_team_name;
        this.home_team_icon = builder.home_team_icon;
        this.guest_team_icon = builder.guest_team_icon;
        this.match_top_info = builder.match_top_info;
        this.match_middle_info = builder.match_middle_info;
        this.match_bottom_info = builder.match_bottom_info;
        this.msg_url = builder.msg_url;
        this.update_time = builder.update_time;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<SportScheduleInfo> {
        public String guest_team_icon;
        public String guest_team_name;
        public String home_team_icon;
        public String home_team_name;
        public String match_bottom_info;
        public String match_middle_info;
        public String match_top_info;
        public String msg_url;
        public Integer sport_type;
        public Long update_time;

        public Builder() {
        }

        public Builder(SportScheduleInfo sportScheduleInfo) {
            super(sportScheduleInfo);
            if (sportScheduleInfo != null) {
                this.sport_type = sportScheduleInfo.sport_type;
                this.home_team_name = sportScheduleInfo.home_team_name;
                this.guest_team_name = sportScheduleInfo.guest_team_name;
                this.home_team_icon = sportScheduleInfo.home_team_icon;
                this.guest_team_icon = sportScheduleInfo.guest_team_icon;
                this.match_top_info = sportScheduleInfo.match_top_info;
                this.match_middle_info = sportScheduleInfo.match_middle_info;
                this.match_bottom_info = sportScheduleInfo.match_bottom_info;
                this.msg_url = sportScheduleInfo.msg_url;
                this.update_time = sportScheduleInfo.update_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SportScheduleInfo build(boolean z) {
            return new SportScheduleInfo(this, z);
        }
    }
}
