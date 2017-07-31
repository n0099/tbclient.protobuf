package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Guess extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private Guess(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.title = builder.title;
        this.url = builder.url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Guess> {
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(Guess guess) {
            super(guess);
            if (guess != null) {
                this.title = guess.title;
                this.url = guess.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Guess build(boolean z) {
            return new Guess(this, z);
        }
    }
}
