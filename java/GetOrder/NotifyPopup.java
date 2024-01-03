package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class NotifyPopup extends Message {
    public static final String DEFAULT_APPENDIX_LINK = "";
    public static final String DEFAULT_APPENDIX_TEXT = "";
    public static final String DEFAULT_APP_VERSION = "";
    public static final String DEFAULT_CHANGELOGS = "";
    public static final String DEFAULT_HINT = "";
    public static final String DEFAULT_N_BTN_LINK = "";
    public static final String DEFAULT_N_BTN_TEXT = "";
    public static final String DEFAULT_Y_BTN_LINK = "";
    public static final String DEFAULT_Y_BTN_TEXT = "";
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer app_size;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_version;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String appendix_link;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer appendix_optional;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String appendix_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String changelogs;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String hint;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String n_btn_link;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String n_btn_text;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer popup_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer popup_times;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer popup_type;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String y_btn_link;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String y_btn_text;
    public static final Integer DEFAULT_POPUP_ID = 0;
    public static final Integer DEFAULT_POPUP_TIMES = 0;
    public static final Integer DEFAULT_POPUP_TYPE = 0;
    public static final Integer DEFAULT_APP_SIZE = 0;
    public static final Integer DEFAULT_APPENDIX_OPTIONAL = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NotifyPopup> {
        public Integer app_size;
        public String app_version;
        public String appendix_link;
        public Integer appendix_optional;
        public String appendix_text;
        public String changelogs;
        public String hint;
        public String n_btn_link;
        public String n_btn_text;
        public Integer popup_id;
        public Integer popup_times;
        public Integer popup_type;
        public String y_btn_link;
        public String y_btn_text;

        public Builder() {
        }

        public Builder(NotifyPopup notifyPopup) {
            super(notifyPopup);
            if (notifyPopup == null) {
                return;
            }
            this.popup_id = notifyPopup.popup_id;
            this.popup_times = notifyPopup.popup_times;
            this.popup_type = notifyPopup.popup_type;
            this.hint = notifyPopup.hint;
            this.app_version = notifyPopup.app_version;
            this.app_size = notifyPopup.app_size;
            this.changelogs = notifyPopup.changelogs;
            this.appendix_text = notifyPopup.appendix_text;
            this.appendix_link = notifyPopup.appendix_link;
            this.appendix_optional = notifyPopup.appendix_optional;
            this.y_btn_text = notifyPopup.y_btn_text;
            this.y_btn_link = notifyPopup.y_btn_link;
            this.n_btn_text = notifyPopup.n_btn_text;
            this.n_btn_link = notifyPopup.n_btn_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NotifyPopup build(boolean z) {
            return new NotifyPopup(this, z);
        }
    }

    public NotifyPopup(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.popup_id;
            if (num == null) {
                this.popup_id = DEFAULT_POPUP_ID;
            } else {
                this.popup_id = num;
            }
            Integer num2 = builder.popup_times;
            if (num2 == null) {
                this.popup_times = DEFAULT_POPUP_TIMES;
            } else {
                this.popup_times = num2;
            }
            Integer num3 = builder.popup_type;
            if (num3 == null) {
                this.popup_type = DEFAULT_POPUP_TYPE;
            } else {
                this.popup_type = num3;
            }
            String str = builder.hint;
            if (str == null) {
                this.hint = "";
            } else {
                this.hint = str;
            }
            String str2 = builder.app_version;
            if (str2 == null) {
                this.app_version = "";
            } else {
                this.app_version = str2;
            }
            Integer num4 = builder.app_size;
            if (num4 == null) {
                this.app_size = DEFAULT_APP_SIZE;
            } else {
                this.app_size = num4;
            }
            String str3 = builder.changelogs;
            if (str3 == null) {
                this.changelogs = "";
            } else {
                this.changelogs = str3;
            }
            String str4 = builder.appendix_text;
            if (str4 == null) {
                this.appendix_text = "";
            } else {
                this.appendix_text = str4;
            }
            String str5 = builder.appendix_link;
            if (str5 == null) {
                this.appendix_link = "";
            } else {
                this.appendix_link = str5;
            }
            Integer num5 = builder.appendix_optional;
            if (num5 == null) {
                this.appendix_optional = DEFAULT_APPENDIX_OPTIONAL;
            } else {
                this.appendix_optional = num5;
            }
            String str6 = builder.y_btn_text;
            if (str6 == null) {
                this.y_btn_text = "";
            } else {
                this.y_btn_text = str6;
            }
            String str7 = builder.y_btn_link;
            if (str7 == null) {
                this.y_btn_link = "";
            } else {
                this.y_btn_link = str7;
            }
            String str8 = builder.n_btn_text;
            if (str8 == null) {
                this.n_btn_text = "";
            } else {
                this.n_btn_text = str8;
            }
            String str9 = builder.n_btn_link;
            if (str9 == null) {
                this.n_btn_link = "";
                return;
            } else {
                this.n_btn_link = str9;
                return;
            }
        }
        this.popup_id = builder.popup_id;
        this.popup_times = builder.popup_times;
        this.popup_type = builder.popup_type;
        this.hint = builder.hint;
        this.app_version = builder.app_version;
        this.app_size = builder.app_size;
        this.changelogs = builder.changelogs;
        this.appendix_text = builder.appendix_text;
        this.appendix_link = builder.appendix_link;
        this.appendix_optional = builder.appendix_optional;
        this.y_btn_text = builder.y_btn_text;
        this.y_btn_link = builder.y_btn_link;
        this.n_btn_text = builder.n_btn_text;
        this.n_btn_link = builder.n_btn_link;
    }
}
