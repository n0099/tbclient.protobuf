package tbclient.GetCloseLiveText;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ButtonInfo extends Message {
    public static final String DEFAULT_BOTTON_COLOR = "";
    public static final String DEFAULT_BOTTON_LINK = "";
    public static final String DEFAULT_BOTTON_TEXT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String botton_color;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String botton_link;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String botton_text;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ButtonInfo> {
        public String botton_color;
        public String botton_link;
        public String botton_text;

        public Builder() {
        }

        public Builder(ButtonInfo buttonInfo) {
            super(buttonInfo);
            if (buttonInfo == null) {
                return;
            }
            this.botton_text = buttonInfo.botton_text;
            this.botton_link = buttonInfo.botton_link;
            this.botton_color = buttonInfo.botton_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ButtonInfo build(boolean z) {
            return new ButtonInfo(this, z);
        }
    }

    public ButtonInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.botton_text;
            if (str == null) {
                this.botton_text = "";
            } else {
                this.botton_text = str;
            }
            String str2 = builder.botton_link;
            if (str2 == null) {
                this.botton_link = "";
            } else {
                this.botton_link = str2;
            }
            String str3 = builder.botton_color;
            if (str3 == null) {
                this.botton_color = "";
                return;
            } else {
                this.botton_color = str3;
                return;
            }
        }
        this.botton_text = builder.botton_text;
        this.botton_link = builder.botton_link;
        this.botton_color = builder.botton_color;
    }
}
