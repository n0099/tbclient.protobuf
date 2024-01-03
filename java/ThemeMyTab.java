package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThemeMyTab extends Message {
    public static final String DEFAULT_BUTTON_COLOR = "";
    public static final String DEFAULT_DYNAMIC_URL = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_color;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String dynamic_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThemeMyTab> {
        public String button_color;
        public String dynamic_url;
        public String url;

        public Builder() {
        }

        public Builder(ThemeMyTab themeMyTab) {
            super(themeMyTab);
            if (themeMyTab == null) {
                return;
            }
            this.url = themeMyTab.url;
            this.dynamic_url = themeMyTab.dynamic_url;
            this.button_color = themeMyTab.button_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeMyTab build(boolean z) {
            return new ThemeMyTab(this, z);
        }
    }

    public ThemeMyTab(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.dynamic_url;
            if (str2 == null) {
                this.dynamic_url = "";
            } else {
                this.dynamic_url = str2;
            }
            String str3 = builder.button_color;
            if (str3 == null) {
                this.button_color = "";
                return;
            } else {
                this.button_color = str3;
                return;
            }
        }
        this.url = builder.url;
        this.dynamic_url = builder.dynamic_url;
        this.button_color = builder.button_color;
    }
}
