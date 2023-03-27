package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeedContentText extends Message {
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 3)
    public final FeedContentColor bg_color;
    @ProtoField(tag = 2)
    public final FeedContentColor color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedContentText> {
        public FeedContentColor bg_color;
        public FeedContentColor color;
        public String text;

        public Builder() {
        }

        public Builder(FeedContentText feedContentText) {
            super(feedContentText);
            if (feedContentText == null) {
                return;
            }
            this.text = feedContentText.text;
            this.color = feedContentText.color;
            this.bg_color = feedContentText.bg_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedContentText build(boolean z) {
            return new FeedContentText(this, z);
        }
    }

    public FeedContentText(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            this.color = builder.color;
            this.bg_color = builder.bg_color;
            return;
        }
        this.text = builder.text;
        this.color = builder.color;
        this.bg_color = builder.bg_color;
    }
}
