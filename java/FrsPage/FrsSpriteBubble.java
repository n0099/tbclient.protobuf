package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SpriteBubble;
/* loaded from: classes2.dex */
public final class FrsSpriteBubble extends Message {
    public static final Integer DEFAULT_BUBBLE_SECONDS = 0;
    public static final String DEFAULT_BUBBLE_URI = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer bubble_seconds;
    @ProtoField(tag = 1)
    public final SpriteBubble bubble_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bubble_uri;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsSpriteBubble> {
        public Integer bubble_seconds;
        public SpriteBubble bubble_text;
        public String bubble_uri;

        public Builder() {
        }

        public Builder(FrsSpriteBubble frsSpriteBubble) {
            super(frsSpriteBubble);
            if (frsSpriteBubble == null) {
                return;
            }
            this.bubble_text = frsSpriteBubble.bubble_text;
            this.bubble_uri = frsSpriteBubble.bubble_uri;
            this.bubble_seconds = frsSpriteBubble.bubble_seconds;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsSpriteBubble build(boolean z) {
            return new FrsSpriteBubble(this, z);
        }
    }

    public FrsSpriteBubble(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.bubble_text = builder.bubble_text;
            String str = builder.bubble_uri;
            if (str == null) {
                this.bubble_uri = "";
            } else {
                this.bubble_uri = str;
            }
            Integer num = builder.bubble_seconds;
            if (num == null) {
                this.bubble_seconds = DEFAULT_BUBBLE_SECONDS;
                return;
            } else {
                this.bubble_seconds = num;
                return;
            }
        }
        this.bubble_text = builder.bubble_text;
        this.bubble_uri = builder.bubble_uri;
        this.bubble_seconds = builder.bubble_seconds;
    }
}
