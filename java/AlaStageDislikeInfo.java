package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class AlaStageDislikeInfo extends Message {
    public static final Integer DEFAULT_DISLIKE_ID = 0;
    public static final String DEFAULT_DISLIKE_REASON = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer dislike_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String dislike_reason;

    private AlaStageDislikeInfo(Builder builder, boolean z) {
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

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<AlaStageDislikeInfo> {
        public Integer dislike_id;
        public String dislike_reason;

        public Builder() {
        }

        public Builder(AlaStageDislikeInfo alaStageDislikeInfo) {
            super(alaStageDislikeInfo);
            if (alaStageDislikeInfo != null) {
                this.dislike_reason = alaStageDislikeInfo.dislike_reason;
                this.dislike_id = alaStageDislikeInfo.dislike_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaStageDislikeInfo build(boolean z) {
            return new AlaStageDislikeInfo(this, z);
        }
    }
}
