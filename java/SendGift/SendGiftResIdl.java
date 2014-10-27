package tbclient.SendGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class SendGiftResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ SendGiftResIdl(Builder builder, boolean z, SendGiftResIdl sendGiftResIdl) {
        this(builder, z);
    }

    private SendGiftResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<SendGiftResIdl> {
        public DataRes data;
        public Error error;

        public Builder(SendGiftResIdl sendGiftResIdl) {
            super(sendGiftResIdl);
            if (sendGiftResIdl != null) {
                this.error = sendGiftResIdl.error;
                this.data = sendGiftResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendGiftResIdl build(boolean z) {
            return new SendGiftResIdl(this, z, null);
        }
    }
}
