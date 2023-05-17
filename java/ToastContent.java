package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ToastContent extends Message {
    public static final Integer DEFAULT_HAS_COLOR = 0;
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TEXT_COLOR = "";
    public static final String DEFAULT_TEXT_COLOR_DARK = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text_color_dark;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ToastContent> {
        public Integer has_color;
        public String text;
        public String text_color;
        public String text_color_dark;

        public Builder() {
        }

        public Builder(ToastContent toastContent) {
            super(toastContent);
            if (toastContent == null) {
                return;
            }
            this.text = toastContent.text;
            this.has_color = toastContent.has_color;
            this.text_color = toastContent.text_color;
            this.text_color_dark = toastContent.text_color_dark;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ToastContent build(boolean z) {
            return new ToastContent(this, z);
        }
    }

    public ToastContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            Integer num = builder.has_color;
            if (num == null) {
                this.has_color = DEFAULT_HAS_COLOR;
            } else {
                this.has_color = num;
            }
            String str2 = builder.text_color;
            if (str2 == null) {
                this.text_color = "";
            } else {
                this.text_color = str2;
            }
            String str3 = builder.text_color_dark;
            if (str3 == null) {
                this.text_color_dark = "";
                return;
            } else {
                this.text_color_dark = str3;
                return;
            }
        }
        this.text = builder.text;
        this.has_color = builder.has_color;
        this.text_color = builder.text_color;
        this.text_color_dark = builder.text_color_dark;
    }
}
