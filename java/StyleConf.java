package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class StyleConf extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_SCENE = "";
    @ProtoField(tag = 3)
    public final StyleConfExtra android_extra;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 6)
    public final StyleContentInfo dark;
    @ProtoField(tag = 5)
    public final StyleContentInfo day;
    @ProtoField(tag = 4)
    public final StyleConfExtra ios_extra;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String scene;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StyleConf> {
        public StyleConfExtra android_extra;
        public String content;
        public StyleContentInfo dark;
        public StyleContentInfo day;
        public StyleConfExtra ios_extra;
        public String scene;

        public Builder() {
        }

        public Builder(StyleConf styleConf) {
            super(styleConf);
            if (styleConf == null) {
                return;
            }
            this.scene = styleConf.scene;
            this.content = styleConf.content;
            this.android_extra = styleConf.android_extra;
            this.ios_extra = styleConf.ios_extra;
            this.day = styleConf.day;
            this.dark = styleConf.dark;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StyleConf build(boolean z) {
            return new StyleConf(this, z);
        }
    }

    public StyleConf(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.scene;
            if (str == null) {
                this.scene = "";
            } else {
                this.scene = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            this.android_extra = builder.android_extra;
            this.ios_extra = builder.ios_extra;
            this.day = builder.day;
            this.dark = builder.dark;
            return;
        }
        this.scene = builder.scene;
        this.content = builder.content;
        this.android_extra = builder.android_extra;
        this.ios_extra = builder.ios_extra;
        this.day = builder.day;
        this.dark = builder.dark;
    }
}
