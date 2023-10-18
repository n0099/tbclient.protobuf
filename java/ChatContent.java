package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChatContent extends Message {
    public static final String DEFAULT_BOT_UK = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_SCHEME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bot_uk;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String scheme;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChatContent> {
        public String bot_uk;
        public String btn_text;
        public String scheme;

        public Builder() {
        }

        public Builder(ChatContent chatContent) {
            super(chatContent);
            if (chatContent == null) {
                return;
            }
            this.scheme = chatContent.scheme;
            this.btn_text = chatContent.btn_text;
            this.bot_uk = chatContent.bot_uk;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatContent build(boolean z) {
            return new ChatContent(this, z);
        }
    }

    public ChatContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.scheme;
            if (str == null) {
                this.scheme = "";
            } else {
                this.scheme = str;
            }
            String str2 = builder.btn_text;
            if (str2 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str2;
            }
            String str3 = builder.bot_uk;
            if (str3 == null) {
                this.bot_uk = "";
                return;
            } else {
                this.bot_uk = str3;
                return;
            }
        }
        this.scheme = builder.scheme;
        this.btn_text = builder.btn_text;
        this.bot_uk = builder.bot_uk;
    }
}
