package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class StyleConfExtra extends Message {
    public static final String DEFAULT_BOT_NAME = "";
    public static final String DEFAULT_BOT_PORTRAIT = "";
    public static final String DEFAULT_BOT_REPLY_CONTENT = "";
    public static final String DEFAULT_FIRST_POST_GUIDE = "";
    public static final String DEFAULT_GUIDE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bot_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bot_portrait;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bot_reply_content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String first_post_guide;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String guide;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StyleConfExtra> {
        public String bot_name;
        public String bot_portrait;
        public String bot_reply_content;
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
            this.bot_name = styleConfExtra.bot_name;
            this.bot_portrait = styleConfExtra.bot_portrait;
            this.bot_reply_content = styleConfExtra.bot_reply_content;
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
            } else {
                this.guide = str2;
            }
            String str3 = builder.bot_name;
            if (str3 == null) {
                this.bot_name = "";
            } else {
                this.bot_name = str3;
            }
            String str4 = builder.bot_portrait;
            if (str4 == null) {
                this.bot_portrait = "";
            } else {
                this.bot_portrait = str4;
            }
            String str5 = builder.bot_reply_content;
            if (str5 == null) {
                this.bot_reply_content = "";
                return;
            } else {
                this.bot_reply_content = str5;
                return;
            }
        }
        this.first_post_guide = builder.first_post_guide;
        this.guide = builder.guide;
        this.bot_name = builder.bot_name;
        this.bot_portrait = builder.bot_portrait;
        this.bot_reply_content = builder.bot_reply_content;
    }
}