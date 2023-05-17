package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FeedFeedback extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_COMMON_ID = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String common_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedFeedback> {
        public String button_text;
        public String common_id;
        public String title;
        public String type;

        public Builder() {
        }

        public Builder(FeedFeedback feedFeedback) {
            super(feedFeedback);
            if (feedFeedback == null) {
                return;
            }
            this.type = feedFeedback.type;
            this.title = feedFeedback.title;
            this.button_text = feedFeedback.button_text;
            this.common_id = feedFeedback.common_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedFeedback build(boolean z) {
            return new FeedFeedback(this, z);
        }
    }

    public FeedFeedback(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.button_text;
            if (str3 == null) {
                this.button_text = "";
            } else {
                this.button_text = str3;
            }
            String str4 = builder.common_id;
            if (str4 == null) {
                this.common_id = "";
                return;
            } else {
                this.common_id = str4;
                return;
            }
        }
        this.type = builder.type;
        this.title = builder.title;
        this.button_text = builder.button_text;
        this.common_id = builder.common_id;
    }
}
