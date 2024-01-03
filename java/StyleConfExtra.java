package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class StyleConfExtra extends Message {
    public static final String DEFAULT_BOT_LOADING_CONTENT = "";
    public static final String DEFAULT_BOT_LOADING_TOAST = "";
    public static final String DEFAULT_BOT_NAME = "";
    public static final String DEFAULT_BOT_PORTRAIT = "";
    public static final String DEFAULT_BOT_REPLY_CONTENT = "";
    public static final List<BotReplyContent> DEFAULT_BOT_REPLY_CONTENT_LIST = Collections.emptyList();
    public static final String DEFAULT_BOT_TIMEOUT_CONTENT = "";
    public static final String DEFAULT_FIRST_POST_GUIDE = "";
    public static final String DEFAULT_GUIDE = "";
    public static final String DEFAULT_GUIDE_CONTENT = "";
    public static final String DEFAULT_GUIDE_ICON = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String bot_loading_content;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String bot_loading_toast;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bot_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bot_portrait;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bot_reply_content;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<BotReplyContent> bot_reply_content_list;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String bot_timeout_content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String first_post_guide;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String guide;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String guide_content;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String guide_icon;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StyleConfExtra> {
        public String bot_loading_content;
        public String bot_loading_toast;
        public String bot_name;
        public String bot_portrait;
        public String bot_reply_content;
        public List<BotReplyContent> bot_reply_content_list;
        public String bot_timeout_content;
        public String first_post_guide;
        public String guide;
        public String guide_content;
        public String guide_icon;

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
            this.bot_loading_content = styleConfExtra.bot_loading_content;
            this.guide_content = styleConfExtra.guide_content;
            this.guide_icon = styleConfExtra.guide_icon;
            this.bot_loading_toast = styleConfExtra.bot_loading_toast;
            this.bot_timeout_content = styleConfExtra.bot_timeout_content;
            this.bot_reply_content_list = Message.copyOf(styleConfExtra.bot_reply_content_list);
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
            } else {
                this.bot_reply_content = str5;
            }
            String str6 = builder.bot_loading_content;
            if (str6 == null) {
                this.bot_loading_content = "";
            } else {
                this.bot_loading_content = str6;
            }
            String str7 = builder.guide_content;
            if (str7 == null) {
                this.guide_content = "";
            } else {
                this.guide_content = str7;
            }
            String str8 = builder.guide_icon;
            if (str8 == null) {
                this.guide_icon = "";
            } else {
                this.guide_icon = str8;
            }
            String str9 = builder.bot_loading_toast;
            if (str9 == null) {
                this.bot_loading_toast = "";
            } else {
                this.bot_loading_toast = str9;
            }
            String str10 = builder.bot_timeout_content;
            if (str10 == null) {
                this.bot_timeout_content = "";
            } else {
                this.bot_timeout_content = str10;
            }
            List<BotReplyContent> list = builder.bot_reply_content_list;
            if (list == null) {
                this.bot_reply_content_list = DEFAULT_BOT_REPLY_CONTENT_LIST;
                return;
            } else {
                this.bot_reply_content_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.first_post_guide = builder.first_post_guide;
        this.guide = builder.guide;
        this.bot_name = builder.bot_name;
        this.bot_portrait = builder.bot_portrait;
        this.bot_reply_content = builder.bot_reply_content;
        this.bot_loading_content = builder.bot_loading_content;
        this.guide_content = builder.guide_content;
        this.guide_icon = builder.guide_icon;
        this.bot_loading_toast = builder.bot_loading_toast;
        this.bot_timeout_content = builder.bot_timeout_content;
        this.bot_reply_content_list = Message.immutableCopyOf(builder.bot_reply_content_list);
    }
}
