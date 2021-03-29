package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_BTN_CANCEL = "";
    public static final String DEFAULT_BTN_COLOR = "";
    public static final String DEFAULT_BTN_CONFIRM = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_BTN_TEXT_COLOR = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_MESSAGE_COLOR = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_TOKEN = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer activity_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer ahead_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String btn_cancel;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String btn_color;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btn_confirm;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String btn_text_color;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer interface_type;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer is_not_complete;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String message_color;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer mission_id;
    @ProtoField(tag = 14, type = Message.Datatype.DOUBLE)
    public final Double opacity;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show_type;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer toast_duration;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String token;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_SHOW_TYPE = 0;
    public static final Integer DEFAULT_AHEAD_TYPE = 0;
    public static final Integer DEFAULT_TOAST_DURATION = 0;
    public static final Integer DEFAULT_ACTIVITY_ID = 0;
    public static final Integer DEFAULT_MISSION_ID = 0;
    public static final Double DEFAULT_OPACITY = Double.valueOf(0.0d);
    public static final Integer DEFAULT_INTERFACE_TYPE = 0;
    public static final Integer DEFAULT_IS_NOT_COMPLETE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer activity_id;
        public Integer ahead_type;
        public String btn_cancel;
        public String btn_color;
        public String btn_confirm;
        public String btn_text;
        public String btn_text_color;
        public String img_url;
        public Integer interface_type;
        public Integer is_not_complete;
        public String message;
        public String message_color;
        public Integer mission_id;
        public Double opacity;
        public String schema;
        public Integer show_type;
        public Integer toast_duration;
        public String token;
        public String url;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.show_type = dataRes.show_type;
            this.ahead_type = dataRes.ahead_type;
            this.message = dataRes.message;
            this.btn_text = dataRes.btn_text;
            this.btn_confirm = dataRes.btn_confirm;
            this.btn_cancel = dataRes.btn_cancel;
            this.toast_duration = dataRes.toast_duration;
            this.img_url = dataRes.img_url;
            this.url = dataRes.url;
            this.schema = dataRes.schema;
            this.token = dataRes.token;
            this.activity_id = dataRes.activity_id;
            this.mission_id = dataRes.mission_id;
            this.opacity = dataRes.opacity;
            this.btn_color = dataRes.btn_color;
            this.message_color = dataRes.message_color;
            this.btn_text_color = dataRes.btn_text_color;
            this.interface_type = dataRes.interface_type;
            this.is_not_complete = dataRes.is_not_complete;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.show_type;
            if (num == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
            } else {
                this.show_type = num;
            }
            Integer num2 = builder.ahead_type;
            if (num2 == null) {
                this.ahead_type = DEFAULT_AHEAD_TYPE;
            } else {
                this.ahead_type = num2;
            }
            String str = builder.message;
            if (str == null) {
                this.message = "";
            } else {
                this.message = str;
            }
            String str2 = builder.btn_text;
            if (str2 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str2;
            }
            String str3 = builder.btn_confirm;
            if (str3 == null) {
                this.btn_confirm = "";
            } else {
                this.btn_confirm = str3;
            }
            String str4 = builder.btn_cancel;
            if (str4 == null) {
                this.btn_cancel = "";
            } else {
                this.btn_cancel = str4;
            }
            Integer num3 = builder.toast_duration;
            if (num3 == null) {
                this.toast_duration = DEFAULT_TOAST_DURATION;
            } else {
                this.toast_duration = num3;
            }
            String str5 = builder.img_url;
            if (str5 == null) {
                this.img_url = "";
            } else {
                this.img_url = str5;
            }
            String str6 = builder.url;
            if (str6 == null) {
                this.url = "";
            } else {
                this.url = str6;
            }
            String str7 = builder.schema;
            if (str7 == null) {
                this.schema = "";
            } else {
                this.schema = str7;
            }
            String str8 = builder.token;
            if (str8 == null) {
                this.token = "";
            } else {
                this.token = str8;
            }
            Integer num4 = builder.activity_id;
            if (num4 == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = num4;
            }
            Integer num5 = builder.mission_id;
            if (num5 == null) {
                this.mission_id = DEFAULT_MISSION_ID;
            } else {
                this.mission_id = num5;
            }
            Double d2 = builder.opacity;
            if (d2 == null) {
                this.opacity = DEFAULT_OPACITY;
            } else {
                this.opacity = d2;
            }
            String str9 = builder.btn_color;
            if (str9 == null) {
                this.btn_color = "";
            } else {
                this.btn_color = str9;
            }
            String str10 = builder.message_color;
            if (str10 == null) {
                this.message_color = "";
            } else {
                this.message_color = str10;
            }
            String str11 = builder.btn_text_color;
            if (str11 == null) {
                this.btn_text_color = "";
            } else {
                this.btn_text_color = str11;
            }
            Integer num6 = builder.interface_type;
            if (num6 == null) {
                this.interface_type = DEFAULT_INTERFACE_TYPE;
            } else {
                this.interface_type = num6;
            }
            Integer num7 = builder.is_not_complete;
            if (num7 == null) {
                this.is_not_complete = DEFAULT_IS_NOT_COMPLETE;
                return;
            } else {
                this.is_not_complete = num7;
                return;
            }
        }
        this.show_type = builder.show_type;
        this.ahead_type = builder.ahead_type;
        this.message = builder.message;
        this.btn_text = builder.btn_text;
        this.btn_confirm = builder.btn_confirm;
        this.btn_cancel = builder.btn_cancel;
        this.toast_duration = builder.toast_duration;
        this.img_url = builder.img_url;
        this.url = builder.url;
        this.schema = builder.schema;
        this.token = builder.token;
        this.activity_id = builder.activity_id;
        this.mission_id = builder.mission_id;
        this.opacity = builder.opacity;
        this.btn_color = builder.btn_color;
        this.message_color = builder.message_color;
        this.btn_text_color = builder.btn_text_color;
        this.interface_type = builder.interface_type;
        this.is_not_complete = builder.is_not_complete;
    }
}
