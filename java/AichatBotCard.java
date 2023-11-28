package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AichatBotCard extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    @ProtoField(tag = 1)
    public final User bot_info;
    @ProtoField(tag = 3)
    public final ChatContent chat_button;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String target_scheme;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AichatBotCard> {
        public User bot_info;
        public ChatContent chat_button;
        public String content;
        public String target_scheme;

        public Builder() {
        }

        public Builder(AichatBotCard aichatBotCard) {
            super(aichatBotCard);
            if (aichatBotCard == null) {
                return;
            }
            this.bot_info = aichatBotCard.bot_info;
            this.content = aichatBotCard.content;
            this.chat_button = aichatBotCard.chat_button;
            this.target_scheme = aichatBotCard.target_scheme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AichatBotCard build(boolean z) {
            return new AichatBotCard(this, z);
        }
    }

    public AichatBotCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.bot_info = builder.bot_info;
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            this.chat_button = builder.chat_button;
            String str2 = builder.target_scheme;
            if (str2 == null) {
                this.target_scheme = "";
                return;
            } else {
                this.target_scheme = str2;
                return;
            }
        }
        this.bot_info = builder.bot_info;
        this.content = builder.content;
        this.chat_button = builder.chat_button;
        this.target_scheme = builder.target_scheme;
    }
}
