package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ColorInfo extends Message {
    public static final String DEFAULT_FONTCOLOR = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String fontColor;

    private ColorInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.fontColor == null) {
                this.fontColor = "";
                return;
            } else {
                this.fontColor = builder.fontColor;
                return;
            }
        }
        this.fontColor = builder.fontColor;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ColorInfo> {
        public String fontColor;

        public Builder() {
        }

        public Builder(ColorInfo colorInfo) {
            super(colorInfo);
            if (colorInfo != null) {
                this.fontColor = colorInfo.fontColor;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ColorInfo build(boolean z) {
            return new ColorInfo(this, z);
        }
    }
}
