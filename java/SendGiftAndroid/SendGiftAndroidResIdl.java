package tbclient.SendGiftAndroid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class SendGiftAndroidResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SendGiftAndroidResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SendGiftAndroidResIdl sendGiftAndroidResIdl) {
            super(sendGiftAndroidResIdl);
            if (sendGiftAndroidResIdl == null) {
                return;
            }
            this.error = sendGiftAndroidResIdl.error;
            this.data = sendGiftAndroidResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendGiftAndroidResIdl build(boolean z) {
            return new SendGiftAndroidResIdl(this, z);
        }
    }

    public SendGiftAndroidResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
