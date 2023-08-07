package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BotReplyContent extends Message {
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String target_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2)
    public final BotReplyUserInfo user_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BotReplyContent> {
        public String target_scheme;
        public String text;
        public BotReplyUserInfo user_info;

        public Builder() {
        }

        public Builder(BotReplyContent botReplyContent) {
            super(botReplyContent);
            if (botReplyContent == null) {
                return;
            }
            this.text = botReplyContent.text;
            this.user_info = botReplyContent.user_info;
            this.target_scheme = botReplyContent.target_scheme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BotReplyContent build(boolean z) {
            return new BotReplyContent(this, z);
        }
    }

    public BotReplyContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            this.user_info = builder.user_info;
            String str2 = builder.target_scheme;
            if (str2 == null) {
                this.target_scheme = "";
                return;
            } else {
                this.target_scheme = str2;
                return;
            }
        }
        this.text = builder.text;
        this.user_info = builder.user_info;
        this.target_scheme = builder.target_scheme;
    }
}
