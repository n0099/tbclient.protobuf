package tbclient.SendGiftAndroid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SendGiftAndroidReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ SendGiftAndroidReqIdl(Builder builder, boolean z, SendGiftAndroidReqIdl sendGiftAndroidReqIdl) {
        this(builder, z);
    }

    private SendGiftAndroidReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<SendGiftAndroidReqIdl> {
        public DataReq data;

        public Builder(SendGiftAndroidReqIdl sendGiftAndroidReqIdl) {
            super(sendGiftAndroidReqIdl);
            if (sendGiftAndroidReqIdl != null) {
                this.data = sendGiftAndroidReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendGiftAndroidReqIdl build(boolean z) {
            return new SendGiftAndroidReqIdl(this, z, null);
        }
    }
}
