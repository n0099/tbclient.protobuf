package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FeedbackReason extends Message {
    public static final String DEFAULT_EXTRA = "";
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_REASON = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String extra;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String reason;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedbackReason> {
        public String extra;
        public Integer id;
        public String reason;

        public Builder() {
        }

        public Builder(FeedbackReason feedbackReason) {
            super(feedbackReason);
            if (feedbackReason == null) {
                return;
            }
            this.reason = feedbackReason.reason;
            this.id = feedbackReason.id;
            this.extra = feedbackReason.extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedbackReason build(boolean z) {
            return new FeedbackReason(this, z);
        }
    }

    public FeedbackReason(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.reason;
            if (str == null) {
                this.reason = "";
            } else {
                this.reason = str;
            }
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str2 = builder.extra;
            if (str2 == null) {
                this.extra = "";
                return;
            } else {
                this.extra = str2;
                return;
            }
        }
        this.reason = builder.reason;
        this.id = builder.id;
        this.extra = builder.extra;
    }
}
