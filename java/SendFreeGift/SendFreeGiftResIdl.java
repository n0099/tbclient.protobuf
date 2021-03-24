package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class SendFreeGiftResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SendFreeGiftResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SendFreeGiftResIdl sendFreeGiftResIdl) {
            super(sendFreeGiftResIdl);
            if (sendFreeGiftResIdl == null) {
                return;
            }
            this.data = sendFreeGiftResIdl.data;
            this.error = sendFreeGiftResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendFreeGiftResIdl build(boolean z) {
            return new SendFreeGiftResIdl(this, z);
        }
    }

    public SendFreeGiftResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
