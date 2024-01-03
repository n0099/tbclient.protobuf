package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class IconUrlInfo extends Message {
    public static final String DEFAULT_DARK = "";
    public static final String DEFAULT_DAY = "";
    public static final String DEFAULT_NIGHT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String dark;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String day;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String night;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<IconUrlInfo> {
        public String dark;
        public String day;
        public String night;

        public Builder() {
        }

        public Builder(IconUrlInfo iconUrlInfo) {
            super(iconUrlInfo);
            if (iconUrlInfo == null) {
                return;
            }
            this.day = iconUrlInfo.day;
            this.night = iconUrlInfo.night;
            this.dark = iconUrlInfo.dark;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IconUrlInfo build(boolean z) {
            return new IconUrlInfo(this, z);
        }
    }

    public IconUrlInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.day;
            if (str == null) {
                this.day = "";
            } else {
                this.day = str;
            }
            String str2 = builder.night;
            if (str2 == null) {
                this.night = "";
            } else {
                this.night = str2;
            }
            String str3 = builder.dark;
            if (str3 == null) {
                this.dark = "";
                return;
            } else {
                this.dark = str3;
                return;
            }
        }
        this.day = builder.day;
        this.night = builder.night;
        this.dark = builder.dark;
    }
}
