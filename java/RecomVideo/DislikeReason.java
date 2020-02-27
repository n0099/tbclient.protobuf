package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DislikeReason extends Message {
    public static final Integer DEFAULT_DISLIKE_ID = 0;
    public static final String DEFAULT_DISLIKE_REASON = "";
    public static final String DEFAULT_EXTRA = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer dislike_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String dislike_reason;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String extra;

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
            } else {
                this.dislike_id = builder.dislike_id;
            }
            if (builder.extra == null) {
                this.extra = "";
                return;
            } else {
                this.extra = builder.extra;
                return;
            }
        }
        this.dislike_reason = builder.dislike_reason;
        this.dislike_id = builder.dislike_id;
        this.extra = builder.extra;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DislikeReason> {
        public Integer dislike_id;
        public String dislike_reason;
        public String extra;

        public Builder() {
        }

        public Builder(DislikeReason dislikeReason) {
            super(dislikeReason);
            if (dislikeReason != null) {
                this.dislike_reason = dislikeReason.dislike_reason;
                this.dislike_id = dislikeReason.dislike_id;
                this.extra = dislikeReason.extra;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DislikeReason build(boolean z) {
            return new DislikeReason(this, z);
        }
    }
}
