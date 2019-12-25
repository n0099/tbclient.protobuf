package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class AlaUserInfo extends Message {
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_GREAT_ANCHOR_DESC_GRADE = "";
    public static final String DEFAULT_GREAT_ANCHOR_DESC_ROLE = "";
    public static final String DEFAULT_GREAT_ANCHOR_ICON = "";
    public static final String DEFAULT_LOCATION = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SEX = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_VERIFY_STATUS = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long ala_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long anchor_live;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long charm_count;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long enter_live;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String great_anchor_desc_grade;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String great_anchor_desc_role;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String great_anchor_icon;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer is_official;
    @ProtoField(tag = 12, type = Message.Datatype.DOUBLE)
    public final Double lat;
    @ProtoField(tag = 15, type = Message.Datatype.UINT64)
    public final Long level_exp;
    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer live_status;
    @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
    public final Double lng;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String sex;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String verify_status;
    public static final Long DEFAULT_ALA_ID = 0L;
    public static final Long DEFAULT_ENTER_LIVE = 0L;
    public static final Long DEFAULT_ANCHOR_LIVE = 0L;
    public static final Integer DEFAULT_LIVE_STATUS = 0;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Double DEFAULT_LNG = Double.valueOf(0.0d);
    public static final Double DEFAULT_LAT = Double.valueOf(0.0d);
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Long DEFAULT_CHARM_COUNT = 0L;
    public static final Long DEFAULT_LEVEL_EXP = 0L;
    public static final Integer DEFAULT_IS_OFFICIAL = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;

    private AlaUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ala_id == null) {
                this.ala_id = DEFAULT_ALA_ID;
            } else {
                this.ala_id = builder.ala_id;
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
            if (builder.description == null) {
                this.description = "";
            } else {
                this.description = builder.description;
            }
            if (builder.sex == null) {
                this.sex = "";
            } else {
                this.sex = builder.sex;
            }
            if (builder.enter_live == null) {
                this.enter_live = DEFAULT_ENTER_LIVE;
            } else {
                this.enter_live = builder.enter_live;
            }
            if (builder.anchor_live == null) {
                this.anchor_live = DEFAULT_ANCHOR_LIVE;
            } else {
                this.anchor_live = builder.anchor_live;
            }
            if (builder.live_status == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
            } else {
                this.live_status = builder.live_status;
            }
            if (builder.live_id == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = builder.live_id;
            }
            if (builder.location == null) {
                this.location = "";
            } else {
                this.location = builder.location;
            }
            if (builder.lng == null) {
                this.lng = DEFAULT_LNG;
            } else {
                this.lng = builder.lng;
            }
            if (builder.lat == null) {
                this.lat = DEFAULT_LAT;
            } else {
                this.lat = builder.lat;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.charm_count == null) {
                this.charm_count = DEFAULT_CHARM_COUNT;
            } else {
                this.charm_count = builder.charm_count;
            }
            if (builder.level_exp == null) {
                this.level_exp = DEFAULT_LEVEL_EXP;
            } else {
                this.level_exp = builder.level_exp;
            }
            if (builder.is_official == null) {
                this.is_official = DEFAULT_IS_OFFICIAL;
            } else {
                this.is_official = builder.is_official;
            }
            if (builder.verify_status == null) {
                this.verify_status = "";
            } else {
                this.verify_status = builder.verify_status;
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = builder.level_id;
            }
            if (builder.great_anchor_icon == null) {
                this.great_anchor_icon = "";
            } else {
                this.great_anchor_icon = builder.great_anchor_icon;
            }
            if (builder.great_anchor_desc_grade == null) {
                this.great_anchor_desc_grade = "";
            } else {
                this.great_anchor_desc_grade = builder.great_anchor_desc_grade;
            }
            if (builder.great_anchor_desc_role == null) {
                this.great_anchor_desc_role = "";
                return;
            } else {
                this.great_anchor_desc_role = builder.great_anchor_desc_role;
                return;
            }
        }
        this.ala_id = builder.ala_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.description = builder.description;
        this.sex = builder.sex;
        this.enter_live = builder.enter_live;
        this.anchor_live = builder.anchor_live;
        this.live_status = builder.live_status;
        this.live_id = builder.live_id;
        this.location = builder.location;
        this.lng = builder.lng;
        this.lat = builder.lat;
        this.update_time = builder.update_time;
        this.charm_count = builder.charm_count;
        this.level_exp = builder.level_exp;
        this.is_official = builder.is_official;
        this.verify_status = builder.verify_status;
        this.level_id = builder.level_id;
        this.great_anchor_icon = builder.great_anchor_icon;
        this.great_anchor_desc_grade = builder.great_anchor_desc_grade;
        this.great_anchor_desc_role = builder.great_anchor_desc_role;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<AlaUserInfo> {
        public Long ala_id;
        public Long anchor_live;
        public Long charm_count;
        public String description;
        public Long enter_live;
        public String great_anchor_desc_grade;
        public String great_anchor_desc_role;
        public String great_anchor_icon;
        public Integer is_official;
        public Double lat;
        public Long level_exp;
        public Integer level_id;
        public Long live_id;
        public Integer live_status;
        public Double lng;
        public String location;
        public String portrait;
        public String sex;
        public Integer update_time;
        public String user_name;
        public String verify_status;

        public Builder() {
        }

        public Builder(AlaUserInfo alaUserInfo) {
            super(alaUserInfo);
            if (alaUserInfo != null) {
                this.ala_id = alaUserInfo.ala_id;
                this.user_name = alaUserInfo.user_name;
                this.portrait = alaUserInfo.portrait;
                this.description = alaUserInfo.description;
                this.sex = alaUserInfo.sex;
                this.enter_live = alaUserInfo.enter_live;
                this.anchor_live = alaUserInfo.anchor_live;
                this.live_status = alaUserInfo.live_status;
                this.live_id = alaUserInfo.live_id;
                this.location = alaUserInfo.location;
                this.lng = alaUserInfo.lng;
                this.lat = alaUserInfo.lat;
                this.update_time = alaUserInfo.update_time;
                this.charm_count = alaUserInfo.charm_count;
                this.level_exp = alaUserInfo.level_exp;
                this.is_official = alaUserInfo.is_official;
                this.verify_status = alaUserInfo.verify_status;
                this.level_id = alaUserInfo.level_id;
                this.great_anchor_icon = alaUserInfo.great_anchor_icon;
                this.great_anchor_desc_grade = alaUserInfo.great_anchor_desc_grade;
                this.great_anchor_desc_role = alaUserInfo.great_anchor_desc_role;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaUserInfo build(boolean z) {
            return new AlaUserInfo(this, z);
        }
    }
}
