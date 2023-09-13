package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChatContent extends Message {
    public static final String DEFAULT_SCHEME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String scheme;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChatContent> {
        public String scheme;

        public Builder() {
        }

        public Builder(ChatContent chatContent) {
            super(chatContent);
            if (chatContent == null) {
                return;
            }
            this.scheme = chatContent.scheme;
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
                return;
            } else {
                this.scheme = str;
                return;
            }
        }
        this.scheme = builder.scheme;
    }
}
