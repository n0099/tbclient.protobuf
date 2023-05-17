package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ActionControl extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_TEXT_COLOR = "";
    public static final String DEFAULT_TEXT_COLOR_PRESSED = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text_color_pressed;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ActionControl> {
        public String name;
        public String text_color;
        public String text_color_pressed;
        public String url;

        public Builder() {
        }

        public Builder(ActionControl actionControl) {
            super(actionControl);
            if (actionControl == null) {
                return;
            }
            this.url = actionControl.url;
            this.name = actionControl.name;
            this.text_color = actionControl.text_color;
            this.text_color_pressed = actionControl.text_color_pressed;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActionControl build(boolean z) {
            return new ActionControl(this, z);
        }
    }

    public ActionControl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.text_color;
            if (str3 == null) {
                this.text_color = "";
            } else {
                this.text_color = str3;
            }
            String str4 = builder.text_color_pressed;
            if (str4 == null) {
                this.text_color_pressed = "";
                return;
            } else {
                this.text_color_pressed = str4;
                return;
            }
        }
        this.url = builder.url;
        this.name = builder.name;
        this.text_color = builder.text_color;
        this.text_color_pressed = builder.text_color_pressed;
    }
}
