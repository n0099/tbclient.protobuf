package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ThemeElement extends Message {
    public static final String DEFAULT_COMMON_COLOR = "";
    public static final String DEFAULT_DARK_COLOR = "";
    public static final String DEFAULT_FONT_COLOR = "";
    public static final String DEFAULT_LIGHT_COLOR = "";
    public static final String DEFAULT_PATTERN_IMAGE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_color;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String dark_color;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String font_color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String light_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pattern_image;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ThemeElement> {
        public String common_color;
        public String dark_color;
        public String font_color;
        public String light_color;
        public String pattern_image;

        public Builder() {
        }

        public Builder(ThemeElement themeElement) {
            super(themeElement);
            if (themeElement == null) {
                return;
            }
            this.common_color = themeElement.common_color;
            this.dark_color = themeElement.dark_color;
            this.light_color = themeElement.light_color;
            this.pattern_image = themeElement.pattern_image;
            this.font_color = themeElement.font_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeElement build(boolean z) {
            return new ThemeElement(this, z);
        }
    }

    public ThemeElement(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.common_color;
            if (str == null) {
                this.common_color = "";
            } else {
                this.common_color = str;
            }
            String str2 = builder.dark_color;
            if (str2 == null) {
                this.dark_color = "";
            } else {
                this.dark_color = str2;
            }
            String str3 = builder.light_color;
            if (str3 == null) {
                this.light_color = "";
            } else {
                this.light_color = str3;
            }
            String str4 = builder.pattern_image;
            if (str4 == null) {
                this.pattern_image = "";
            } else {
                this.pattern_image = str4;
            }
            String str5 = builder.font_color;
            if (str5 == null) {
                this.font_color = "";
                return;
            } else {
                this.font_color = str5;
                return;
            }
        }
        this.common_color = builder.common_color;
        this.dark_color = builder.dark_color;
        this.light_color = builder.light_color;
        this.pattern_image = builder.pattern_image;
        this.font_color = builder.font_color;
    }
}
