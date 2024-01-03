package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DeletedReasonInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_boomgrow;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_grays_cale_forum;
    public static final Integer DEFAULT_IS_GRAYS_CALE_FORUM = 0;
    public static final Integer DEFAULT_IS_BOOMGROW = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DeletedReasonInfo> {
        public Integer is_boomgrow;
        public Integer is_grays_cale_forum;

        public Builder() {
        }

        public Builder(DeletedReasonInfo deletedReasonInfo) {
            super(deletedReasonInfo);
            if (deletedReasonInfo == null) {
                return;
            }
            this.is_grays_cale_forum = deletedReasonInfo.is_grays_cale_forum;
            this.is_boomgrow = deletedReasonInfo.is_boomgrow;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DeletedReasonInfo build(boolean z) {
            return new DeletedReasonInfo(this, z);
        }
    }

    public DeletedReasonInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_grays_cale_forum;
            if (num == null) {
                this.is_grays_cale_forum = DEFAULT_IS_GRAYS_CALE_FORUM;
            } else {
                this.is_grays_cale_forum = num;
            }
            Integer num2 = builder.is_boomgrow;
            if (num2 == null) {
                this.is_boomgrow = DEFAULT_IS_BOOMGROW;
                return;
            } else {
                this.is_boomgrow = num2;
                return;
            }
        }
        this.is_grays_cale_forum = builder.is_grays_cale_forum;
        this.is_boomgrow = builder.is_boomgrow;
    }
}
