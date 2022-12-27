package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SignActivityInfo extends Message {
    public static final String DEFAULT_ACTIVITY_FAIL_MSG = "";
    public static final String DEFAULT_ACTIVITY_MSG = "";
    public static final String DEFAULT_ACTIVITY_NAME = "";
    public static final String DEFAULT_ACTIVITY_SUC_MSG = "";
    public static final String DEFAULT_COUNTDOWN_MSG = "";
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_GIFT_URL = "";
    public static final String DEFAULT_ICON_NAME = "";
    public static final String DEFAULT_IMAGE_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer activity_duration;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String activity_fail_msg;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long activity_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_msg;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String activity_name;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String activity_suc_msg;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer activity_time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String countdown_msg;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer countdown_time;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer gift_type;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String gift_url;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer icon_lifecycle;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String icon_name;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String image_url;
    public static final Long DEFAULT_ACTIVITY_ID = 0L;
    public static final Integer DEFAULT_ACTIVITY_TIME = 0;
    public static final Integer DEFAULT_COUNTDOWN_TIME = 0;
    public static final Integer DEFAULT_ACTIVITY_DURATION = 0;
    public static final Integer DEFAULT_GIFT_TYPE = 0;
    public static final Integer DEFAULT_ICON_LIFECYCLE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SignActivityInfo> {
        public Integer activity_duration;
        public String activity_fail_msg;
        public Long activity_id;
        public String activity_msg;
        public String activity_name;
        public String activity_suc_msg;
        public Integer activity_time;
        public String countdown_msg;
        public Integer countdown_time;
        public String gift_name;
        public Integer gift_type;
        public String gift_url;
        public Integer icon_lifecycle;
        public String icon_name;
        public String image_url;

        public Builder() {
        }

        public Builder(SignActivityInfo signActivityInfo) {
            super(signActivityInfo);
            if (signActivityInfo == null) {
                return;
            }
            this.activity_id = signActivityInfo.activity_id;
            this.activity_time = signActivityInfo.activity_time;
            this.countdown_time = signActivityInfo.countdown_time;
            this.activity_duration = signActivityInfo.activity_duration;
            this.countdown_msg = signActivityInfo.countdown_msg;
            this.activity_msg = signActivityInfo.activity_msg;
            this.activity_suc_msg = signActivityInfo.activity_suc_msg;
            this.activity_fail_msg = signActivityInfo.activity_fail_msg;
            this.gift_type = signActivityInfo.gift_type;
            this.gift_url = signActivityInfo.gift_url;
            this.gift_name = signActivityInfo.gift_name;
            this.icon_name = signActivityInfo.icon_name;
            this.icon_lifecycle = signActivityInfo.icon_lifecycle;
            this.activity_name = signActivityInfo.activity_name;
            this.image_url = signActivityInfo.image_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignActivityInfo build(boolean z) {
            return new SignActivityInfo(this, z);
        }
    }

    public SignActivityInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.activity_id;
            if (l == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l;
            }
            Integer num = builder.activity_time;
            if (num == null) {
                this.activity_time = DEFAULT_ACTIVITY_TIME;
            } else {
                this.activity_time = num;
            }
            Integer num2 = builder.countdown_time;
            if (num2 == null) {
                this.countdown_time = DEFAULT_COUNTDOWN_TIME;
            } else {
                this.countdown_time = num2;
            }
            Integer num3 = builder.activity_duration;
            if (num3 == null) {
                this.activity_duration = DEFAULT_ACTIVITY_DURATION;
            } else {
                this.activity_duration = num3;
            }
            String str = builder.countdown_msg;
            if (str == null) {
                this.countdown_msg = "";
            } else {
                this.countdown_msg = str;
            }
            String str2 = builder.activity_msg;
            if (str2 == null) {
                this.activity_msg = "";
            } else {
                this.activity_msg = str2;
            }
            String str3 = builder.activity_suc_msg;
            if (str3 == null) {
                this.activity_suc_msg = "";
            } else {
                this.activity_suc_msg = str3;
            }
            String str4 = builder.activity_fail_msg;
            if (str4 == null) {
                this.activity_fail_msg = "";
            } else {
                this.activity_fail_msg = str4;
            }
            Integer num4 = builder.gift_type;
            if (num4 == null) {
                this.gift_type = DEFAULT_GIFT_TYPE;
            } else {
                this.gift_type = num4;
            }
            String str5 = builder.gift_url;
            if (str5 == null) {
                this.gift_url = "";
            } else {
                this.gift_url = str5;
            }
            String str6 = builder.gift_name;
            if (str6 == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str6;
            }
            String str7 = builder.icon_name;
            if (str7 == null) {
                this.icon_name = "";
            } else {
                this.icon_name = str7;
            }
            Integer num5 = builder.icon_lifecycle;
            if (num5 == null) {
                this.icon_lifecycle = DEFAULT_ICON_LIFECYCLE;
            } else {
                this.icon_lifecycle = num5;
            }
            String str8 = builder.activity_name;
            if (str8 == null) {
                this.activity_name = "";
            } else {
                this.activity_name = str8;
            }
            String str9 = builder.image_url;
            if (str9 == null) {
                this.image_url = "";
                return;
            } else {
                this.image_url = str9;
                return;
            }
        }
        this.activity_id = builder.activity_id;
        this.activity_time = builder.activity_time;
        this.countdown_time = builder.countdown_time;
        this.activity_duration = builder.activity_duration;
        this.countdown_msg = builder.countdown_msg;
        this.activity_msg = builder.activity_msg;
        this.activity_suc_msg = builder.activity_suc_msg;
        this.activity_fail_msg = builder.activity_fail_msg;
        this.gift_type = builder.gift_type;
        this.gift_url = builder.gift_url;
        this.gift_name = builder.gift_name;
        this.icon_name = builder.icon_name;
        this.icon_lifecycle = builder.icon_lifecycle;
        this.activity_name = builder.activity_name;
        this.image_url = builder.image_url;
    }
}
