package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AlaUserInfo extends Message {
    public static final Integer DEFAULT_ANCHOR_FANS;
    public static final Long DEFAULT_CHARM_COUNT;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_GREAT_ANCHOR_DESC_GRADE = "";
    public static final String DEFAULT_GREAT_ANCHOR_DESC_ROLE = "";
    public static final String DEFAULT_GREAT_ANCHOR_ICON = "";
    public static final Integer DEFAULT_IS_OFFICIAL;
    public static final Double DEFAULT_LAT;
    public static final Long DEFAULT_LEVEL_EXP;
    public static final Integer DEFAULT_LEVEL_ID;
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final Double DEFAULT_LNG;
    public static final String DEFAULT_LOCATION = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SEX = "";
    public static final Integer DEFAULT_UPDATE_TIME;
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_VERIFY_STATUS = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long ala_id;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer anchor_fans;
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
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String level_name;
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
    @ProtoField(tag = 23, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String verify_status;
    @ProtoField(tag = 25)
    public final YyExt yy_ext;
    public static final Long DEFAULT_ALA_ID = 0L;
    public static final Long DEFAULT_ENTER_LIVE = 0L;
    public static final Long DEFAULT_ANCHOR_LIVE = 0L;
    public static final Integer DEFAULT_LIVE_STATUS = 0;
    public static final Long DEFAULT_LIVE_ID = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AlaUserInfo> {
        public Long ala_id;
        public Integer anchor_fans;
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
        public String level_name;
        public Long live_id;
        public Integer live_status;
        public Double lng;
        public String location;
        public String portrait;
        public String sex;
        public Integer update_time;
        public Long user_id;
        public String user_name;
        public String verify_status;
        public YyExt yy_ext;

        public Builder() {
        }

        public Builder(AlaUserInfo alaUserInfo) {
            super(alaUserInfo);
            if (alaUserInfo == null) {
                return;
            }
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
            this.level_name = alaUserInfo.level_name;
            this.user_id = alaUserInfo.user_id;
            this.anchor_fans = alaUserInfo.anchor_fans;
            this.yy_ext = alaUserInfo.yy_ext;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaUserInfo build(boolean z) {
            return new AlaUserInfo(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_LNG = valueOf;
        DEFAULT_LAT = valueOf;
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_CHARM_COUNT = 0L;
        DEFAULT_LEVEL_EXP = 0L;
        DEFAULT_IS_OFFICIAL = 0;
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_USER_ID = 0L;
        DEFAULT_ANCHOR_FANS = 0;
    }

    public AlaUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.ala_id;
            if (l == null) {
                this.ala_id = DEFAULT_ALA_ID;
            } else {
                this.ala_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.description;
            if (str3 == null) {
                this.description = "";
            } else {
                this.description = str3;
            }
            String str4 = builder.sex;
            if (str4 == null) {
                this.sex = "";
            } else {
                this.sex = str4;
            }
            Long l2 = builder.enter_live;
            if (l2 == null) {
                this.enter_live = DEFAULT_ENTER_LIVE;
            } else {
                this.enter_live = l2;
            }
            Long l3 = builder.anchor_live;
            if (l3 == null) {
                this.anchor_live = DEFAULT_ANCHOR_LIVE;
            } else {
                this.anchor_live = l3;
            }
            Integer num = builder.live_status;
            if (num == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
            } else {
                this.live_status = num;
            }
            Long l4 = builder.live_id;
            if (l4 == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l4;
            }
            String str5 = builder.location;
            if (str5 == null) {
                this.location = "";
            } else {
                this.location = str5;
            }
            Double d = builder.lng;
            if (d == null) {
                this.lng = DEFAULT_LNG;
            } else {
                this.lng = d;
            }
            Double d2 = builder.lat;
            if (d2 == null) {
                this.lat = DEFAULT_LAT;
            } else {
                this.lat = d2;
            }
            Integer num2 = builder.update_time;
            if (num2 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num2;
            }
            Long l5 = builder.charm_count;
            if (l5 == null) {
                this.charm_count = DEFAULT_CHARM_COUNT;
            } else {
                this.charm_count = l5;
            }
            Long l6 = builder.level_exp;
            if (l6 == null) {
                this.level_exp = DEFAULT_LEVEL_EXP;
            } else {
                this.level_exp = l6;
            }
            Integer num3 = builder.is_official;
            if (num3 == null) {
                this.is_official = DEFAULT_IS_OFFICIAL;
            } else {
                this.is_official = num3;
            }
            String str6 = builder.verify_status;
            if (str6 == null) {
                this.verify_status = "";
            } else {
                this.verify_status = str6;
            }
            Integer num4 = builder.level_id;
            if (num4 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num4;
            }
            String str7 = builder.great_anchor_icon;
            if (str7 == null) {
                this.great_anchor_icon = "";
            } else {
                this.great_anchor_icon = str7;
            }
            String str8 = builder.great_anchor_desc_grade;
            if (str8 == null) {
                this.great_anchor_desc_grade = "";
            } else {
                this.great_anchor_desc_grade = str8;
            }
            String str9 = builder.great_anchor_desc_role;
            if (str9 == null) {
                this.great_anchor_desc_role = "";
            } else {
                this.great_anchor_desc_role = str9;
            }
            String str10 = builder.level_name;
            if (str10 == null) {
                this.level_name = "";
            } else {
                this.level_name = str10;
            }
            Long l7 = builder.user_id;
            if (l7 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l7;
            }
            Integer num5 = builder.anchor_fans;
            if (num5 == null) {
                this.anchor_fans = DEFAULT_ANCHOR_FANS;
            } else {
                this.anchor_fans = num5;
            }
            this.yy_ext = builder.yy_ext;
            return;
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
        this.level_name = builder.level_name;
        this.user_id = builder.user_id;
        this.anchor_fans = builder.anchor_fans;
        this.yy_ext = builder.yy_ext;
    }
}
