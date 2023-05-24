package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ModuleTitleInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ModuleTitleInfo> {
        public String icon;
        public ThemeColorInfo theme_color;
        public String title;

        public Builder() {
        }

        public Builder(ModuleTitleInfo moduleTitleInfo) {
            super(moduleTitleInfo);
            if (moduleTitleInfo == null) {
                return;
            }
            this.title = moduleTitleInfo.title;
            this.icon = moduleTitleInfo.icon;
            this.theme_color = moduleTitleInfo.theme_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ModuleTitleInfo build(boolean z) {
            return new ModuleTitleInfo(this, z);
        }
    }

    public ModuleTitleInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            this.theme_color = builder.theme_color;
            return;
        }
        this.title = builder.title;
        this.icon = builder.icon;
        this.theme_color = builder.theme_color;
    }
}
