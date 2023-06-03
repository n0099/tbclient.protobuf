package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class StyleConfExtra extends Message {
    public static final String DEFAULT_FIRST_POST_GUIDE = "";
    public static final String DEFAULT_GUIDE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String first_post_guide;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String guide;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StyleConfExtra> {
        public String first_post_guide;
        public String guide;

        public Builder() {
        }

        public Builder(StyleConfExtra styleConfExtra) {
            super(styleConfExtra);
            if (styleConfExtra == null) {
                return;
            }
            this.first_post_guide = styleConfExtra.first_post_guide;
            this.guide = styleConfExtra.guide;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StyleConfExtra build(boolean z) {
            return new StyleConfExtra(this, z);
        }
    }

    public StyleConfExtra(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.first_post_guide;
            if (str == null) {
                this.first_post_guide = "";
            } else {
                this.first_post_guide = str;
            }
            String str2 = builder.guide;
            if (str2 == null) {
                this.guide = "";
                return;
            } else {
                this.guide = str2;
                return;
            }
        }
        this.first_post_guide = builder.first_post_guide;
        this.guide = builder.guide;
    }
}
