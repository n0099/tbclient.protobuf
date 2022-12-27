package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class LiveUserInfo extends Message {
    public static final Integer DEFAULT_CHARM_COUNT;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Integer DEFAULT_FANS_COUNT;
    public static final Integer DEFAULT_FOLLOW_COUNT;
    public static final Double DEFAULT_LAT;
    public static final Double DEFAULT_LNG;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final Integer DEFAULT_USER_STATUS;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long ala_id;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer charm_count;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer fans_count;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer follow_count;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double lat;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer level_exp;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double lng;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer sex;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer user_status;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_ALA_ID = 0L;
    public static final Integer DEFAULT_SEX = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_LEVEL_EXP = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveUserInfo> {
        public Long ala_id;
        public Integer charm_count;
        public String description;
        public Integer fans_count;
        public Integer follow_count;
        public Double lat;
        public Integer level_exp;
        public Integer level_id;
        public Double lng;
        public String portrait;
        public Integer sex;
        public Long user_id;
        public String user_name;
        public Integer user_status;

        public Builder() {
        }

        public Builder(LiveUserInfo liveUserInfo) {
            super(liveUserInfo);
            if (liveUserInfo == null) {
                return;
            }
            this.user_id = liveUserInfo.user_id;
            this.ala_id = liveUserInfo.ala_id;
            this.user_name = liveUserInfo.user_name;
            this.sex = liveUserInfo.sex;
            this.description = liveUserInfo.description;
            this.portrait = liveUserInfo.portrait;
            this.level_id = liveUserInfo.level_id;
            this.level_exp = liveUserInfo.level_exp;
            this.lng = liveUserInfo.lng;
            this.lat = liveUserInfo.lat;
            this.fans_count = liveUserInfo.fans_count;
            this.follow_count = liveUserInfo.follow_count;
            this.charm_count = liveUserInfo.charm_count;
            this.user_status = liveUserInfo.user_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveUserInfo build(boolean z) {
            return new LiveUserInfo(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_LNG = valueOf;
        DEFAULT_LAT = valueOf;
        DEFAULT_FANS_COUNT = 0;
        DEFAULT_FOLLOW_COUNT = 0;
        DEFAULT_CHARM_COUNT = 0;
        DEFAULT_USER_STATUS = 0;
    }

    public LiveUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Long l2 = builder.ala_id;
            if (l2 == null) {
                this.ala_id = DEFAULT_ALA_ID;
            } else {
                this.ala_id = l2;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Integer num = builder.sex;
            if (num == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = num;
            }
            String str2 = builder.description;
            if (str2 == null) {
                this.description = "";
            } else {
                this.description = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Integer num2 = builder.level_id;
            if (num2 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num2;
            }
            Integer num3 = builder.level_exp;
            if (num3 == null) {
                this.level_exp = DEFAULT_LEVEL_EXP;
            } else {
                this.level_exp = num3;
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
            Integer num4 = builder.fans_count;
            if (num4 == null) {
                this.fans_count = DEFAULT_FANS_COUNT;
            } else {
                this.fans_count = num4;
            }
            Integer num5 = builder.follow_count;
            if (num5 == null) {
                this.follow_count = DEFAULT_FOLLOW_COUNT;
            } else {
                this.follow_count = num5;
            }
            Integer num6 = builder.charm_count;
            if (num6 == null) {
                this.charm_count = DEFAULT_CHARM_COUNT;
            } else {
                this.charm_count = num6;
            }
            Integer num7 = builder.user_status;
            if (num7 == null) {
                this.user_status = DEFAULT_USER_STATUS;
                return;
            } else {
                this.user_status = num7;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.ala_id = builder.ala_id;
        this.user_name = builder.user_name;
        this.sex = builder.sex;
        this.description = builder.description;
        this.portrait = builder.portrait;
        this.level_id = builder.level_id;
        this.level_exp = builder.level_exp;
        this.lng = builder.lng;
        this.lat = builder.lat;
        this.fans_count = builder.fans_count;
        this.follow_count = builder.follow_count;
        this.charm_count = builder.charm_count;
        this.user_status = builder.user_status;
    }
}
