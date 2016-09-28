package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DislikeReason extends Message {
    public static final Integer DEFAULT_DISLIKE_ID = 0;
    public static final String DEFAULT_DISLIKE_REASON = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer dislike_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String dislike_reason;

    /* synthetic */ DislikeReason(Builder builder, boolean z, DislikeReason dislikeReason) {
        this(builder, z);
    }

    private DislikeReason(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.dislike_reason == null) {
                this.dislike_reason = "";
            } else {
                this.dislike_reason = builder.dislike_reason;
            }
            if (builder.dislike_id == null) {
                this.dislike_id = DEFAULT_DISLIKE_ID;
                return;
            } else {
                this.dislike_id = builder.dislike_id;
                return;
            }
        }
        this.dislike_reason = builder.dislike_reason;
        this.dislike_id = builder.dislike_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DislikeReason> {
        public Integer dislike_id;
        public String dislike_reason;

        public Builder() {
        }

        public Builder(DislikeReason dislikeReason) {
            super(dislikeReason);
            if (dislikeReason != null) {
                this.dislike_reason = dislikeReason.dislike_reason;
                this.dislike_id = dislikeReason.dislike_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DislikeReason build(boolean z) {
            return new DislikeReason(this, z, null);
        }
    }
}
