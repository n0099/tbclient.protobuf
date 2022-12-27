package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ToastContent extends Message {
    public static final Integer DEFAULT_HAS_COLOR = 0;
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ToastContent> {
        public Integer has_color;
        public String text;

        public Builder() {
        }

        public Builder(ToastContent toastContent) {
            super(toastContent);
            if (toastContent == null) {
                return;
            }
            this.text = toastContent.text;
            this.has_color = toastContent.has_color;
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
                return;
            } else {
                this.has_color = num;
                return;
            }
        }
        this.text = builder.text;
        this.has_color = builder.has_color;
    }
}
