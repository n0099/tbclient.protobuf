package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ThemeRecommand extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_BUTTON_URL = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TIP_TEXT = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tip_text;

    private ThemeRecommand(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.tip_text == null) {
                this.tip_text = "";
            } else {
                this.tip_text = builder.tip_text;
            }
            if (builder.button_url == null) {
                this.button_url = "";
            } else {
                this.button_url = builder.button_url;
            }
            if (builder.button_text == null) {
                this.button_text = "";
                return;
            } else {
                this.button_text = builder.button_text;
                return;
            }
        }
        this.icon = builder.icon;
        this.tip_text = builder.tip_text;
        this.button_url = builder.button_url;
        this.button_text = builder.button_text;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThemeRecommand> {
        public String button_text;
        public String button_url;
        public String icon;
        public String tip_text;

        public Builder() {
        }

        public Builder(ThemeRecommand themeRecommand) {
            super(themeRecommand);
            if (themeRecommand != null) {
                this.icon = themeRecommand.icon;
                this.tip_text = themeRecommand.tip_text;
                this.button_url = themeRecommand.button_url;
                this.button_text = themeRecommand.button_text;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeRecommand build(boolean z) {
            return new ThemeRecommand(this, z);
        }
    }
}
