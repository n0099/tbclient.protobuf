package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ToastConfig extends Message {
    public static final String DEFAULT_PRE_COLOR_MSG = "";
    public static final String DEFAULT_TOAST_BACK_IMAGE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pre_color_msg;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String toast_back_image;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ToastConfig> {
        public String pre_color_msg;
        public String toast_back_image;

        public Builder() {
        }

        public Builder(ToastConfig toastConfig) {
            super(toastConfig);
            if (toastConfig == null) {
                return;
            }
            this.pre_color_msg = toastConfig.pre_color_msg;
            this.toast_back_image = toastConfig.toast_back_image;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ToastConfig build(boolean z) {
            return new ToastConfig(this, z);
        }
    }

    public ToastConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pre_color_msg;
            if (str == null) {
                this.pre_color_msg = "";
            } else {
                this.pre_color_msg = str;
            }
            String str2 = builder.toast_back_image;
            if (str2 == null) {
                this.toast_back_image = "";
                return;
            } else {
                this.toast_back_image = str2;
                return;
            }
        }
        this.pre_color_msg = builder.pre_color_msg;
        this.toast_back_image = builder.toast_back_image;
    }
}
