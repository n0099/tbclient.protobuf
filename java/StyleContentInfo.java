package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class StyleContentInfo extends Message {
    public static final String DEFAULT_CONTENT_COLOR = "";
    public static final String DEFAULT_ICON = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content_color;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StyleContentInfo> {
        public String content_color;
        public String icon;

        public Builder() {
        }

        public Builder(StyleContentInfo styleContentInfo) {
            super(styleContentInfo);
            if (styleContentInfo == null) {
                return;
            }
            this.content_color = styleContentInfo.content_color;
            this.icon = styleContentInfo.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StyleContentInfo build(boolean z) {
            return new StyleContentInfo(this, z);
        }
    }

    public StyleContentInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content_color;
            if (str == null) {
                this.content_color = "";
            } else {
                this.content_color = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str2;
                return;
            }
        }
        this.content_color = builder.content_color;
        this.icon = builder.icon;
    }
}
