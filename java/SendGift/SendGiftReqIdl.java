package tbclient.SendGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SendGiftReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ SendGiftReqIdl(Builder builder, boolean z, SendGiftReqIdl sendGiftReqIdl) {
        this(builder, z);
    }

    private SendGiftReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<SendGiftReqIdl> {
        public DataReq data;

        public Builder(SendGiftReqIdl sendGiftReqIdl) {
            super(sendGiftReqIdl);
            if (sendGiftReqIdl != null) {
                this.data = sendGiftReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendGiftReqIdl build(boolean z) {
            return new SendGiftReqIdl(this, z, null);
        }
    }
}
