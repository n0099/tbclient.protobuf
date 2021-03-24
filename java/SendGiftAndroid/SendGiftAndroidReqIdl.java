package tbclient.SendGiftAndroid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SendGiftAndroidReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SendGiftAndroidReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SendGiftAndroidReqIdl sendGiftAndroidReqIdl) {
            super(sendGiftAndroidReqIdl);
            if (sendGiftAndroidReqIdl == null) {
                return;
            }
            this.data = sendGiftAndroidReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendGiftAndroidReqIdl build(boolean z) {
            return new SendGiftAndroidReqIdl(this, z);
        }
    }

    public SendGiftAndroidReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
