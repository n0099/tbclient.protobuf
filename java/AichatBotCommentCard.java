package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AichatBotCommentCard extends Message {
    public static final String DEFAULT_UK = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String uk;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AichatBotCommentCard> {
        public String uk;

        public Builder() {
        }

        public Builder(AichatBotCommentCard aichatBotCommentCard) {
            super(aichatBotCommentCard);
            if (aichatBotCommentCard == null) {
                return;
            }
            this.uk = aichatBotCommentCard.uk;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AichatBotCommentCard build(boolean z) {
            return new AichatBotCommentCard(this, z);
        }
    }

    public AichatBotCommentCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.uk;
            if (str == null) {
                this.uk = "";
                return;
            } else {
                this.uk = str;
                return;
            }
        }
        this.uk = builder.uk;
    }
}
