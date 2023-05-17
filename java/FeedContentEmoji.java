package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FeedContentEmoji extends Message {
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedContentEmoji> {
        public String name;

        public Builder() {
        }

        public Builder(FeedContentEmoji feedContentEmoji) {
            super(feedContentEmoji);
            if (feedContentEmoji == null) {
                return;
            }
            this.name = feedContentEmoji.name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedContentEmoji build(boolean z) {
            return new FeedContentEmoji(this, z);
        }
    }

    public FeedContentEmoji(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
                return;
            } else {
                this.name = str;
                return;
            }
        }
        this.name = builder.name;
    }
}
