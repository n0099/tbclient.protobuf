package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Feedback extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    private Feedback(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
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
        this.icon = builder.icon;
        this.title = builder.title;
        this.url = builder.url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Feedback> {
        public String icon;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(Feedback feedback) {
            super(feedback);
            if (feedback != null) {
                this.icon = feedback.icon;
                this.title = feedback.title;
                this.url = feedback.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Feedback build(boolean z) {
            return new Feedback(this, z);
        }
    }
}
