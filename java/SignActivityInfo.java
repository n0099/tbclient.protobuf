package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    private SignActivityInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.activity_id == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = builder.activity_id;
            }
            if (builder.activity_time == null) {
                this.activity_time = DEFAULT_ACTIVITY_TIME;
            } else {
                this.activity_time = builder.activity_time;
            }
            if (builder.countdown_time == null) {
                this.countdown_time = DEFAULT_COUNTDOWN_TIME;
            } else {
                this.countdown_time = builder.countdown_time;
            }
            if (builder.activity_duration == null) {
                this.activity_duration = DEFAULT_ACTIVITY_DURATION;
            } else {
                this.activity_duration = builder.activity_duration;
            }
            if (builder.countdown_msg == null) {
                this.countdown_msg = "";
            } else {
                this.countdown_msg = builder.countdown_msg;
            }
            if (builder.activity_msg == null) {
                this.activity_msg = "";
            } else {
                this.activity_msg = builder.activity_msg;
            }
            if (builder.activity_suc_msg == null) {
                this.activity_suc_msg = "";
            } else {
                this.activity_suc_msg = builder.activity_suc_msg;
            }
            if (builder.activity_fail_msg == null) {
                this.activity_fail_msg = "";
            } else {
                this.activity_fail_msg = builder.activity_fail_msg;
            }
            if (builder.gift_type == null) {
                this.gift_type = DEFAULT_GIFT_TYPE;
            } else {
                this.gift_type = builder.gift_type;
            }
            if (builder.gift_url == null) {
                this.gift_url = "";
            } else {
                this.gift_url = builder.gift_url;
            }
            if (builder.gift_name == null) {
                this.gift_name = "";
            } else {
                this.gift_name = builder.gift_name;
            }
            if (builder.icon_name == null) {
                this.icon_name = "";
            } else {
                this.icon_name = builder.icon_name;
            }
            if (builder.icon_lifecycle == null) {
                this.icon_lifecycle = DEFAULT_ICON_LIFECYCLE;
            } else {
                this.icon_lifecycle = builder.icon_lifecycle;
            }
            if (builder.activity_name == null) {
                this.activity_name = "";
            } else {
                this.activity_name = builder.activity_name;
            }
            if (builder.image_url == null) {
                this.image_url = "";
                return;
            } else {
                this.image_url = builder.image_url;
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

    /* loaded from: classes2.dex */
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
            if (signActivityInfo != null) {
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
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignActivityInfo build(boolean z) {
            return new SignActivityInfo(this, z);
        }
    }
}
