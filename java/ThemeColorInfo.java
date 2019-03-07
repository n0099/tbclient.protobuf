package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class ThemeColorInfo extends Message {
    @ProtoField(tag = 1)
    public final ThemeElement day;
    @ProtoField(tag = 2)
    public final ThemeElement night;

    private ThemeColorInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.day = builder.day;
            this.night = builder.night;
            return;
        }
        this.day = builder.day;
        this.night = builder.night;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ThemeColorInfo> {
        public ThemeElement day;
        public ThemeElement night;

        public Builder() {
        }

        public Builder(ThemeColorInfo themeColorInfo) {
            super(themeColorInfo);
            if (themeColorInfo != null) {
                this.day = themeColorInfo.day;
                this.night = themeColorInfo.night;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeColorInfo build(boolean z) {
            return new ThemeColorInfo(this, z);
        }
    }
}
