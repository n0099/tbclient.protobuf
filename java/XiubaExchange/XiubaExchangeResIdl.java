package tbclient.XiubaExchange;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class XiubaExchangeResIdl extends Message {
    public static final String DEFAULT_PUBLICKEY = "";
    @ProtoField(tag = 1)
    public final Error error;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String publicKey;

    /* synthetic */ XiubaExchangeResIdl(Builder builder, boolean z, XiubaExchangeResIdl xiubaExchangeResIdl) {
        this(builder, z);
    }

    private XiubaExchangeResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            if (builder.publicKey == null) {
                this.publicKey = "";
                return;
            } else {
                this.publicKey = builder.publicKey;
                return;
            }
        }
        this.error = builder.error;
        this.publicKey = builder.publicKey;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<XiubaExchangeResIdl> {
        public Error error;
        public String publicKey;

        public Builder(XiubaExchangeResIdl xiubaExchangeResIdl) {
            super(xiubaExchangeResIdl);
            if (xiubaExchangeResIdl != null) {
                this.error = xiubaExchangeResIdl.error;
                this.publicKey = xiubaExchangeResIdl.publicKey;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public XiubaExchangeResIdl build(boolean z) {
            return new XiubaExchangeResIdl(this, z, null);
        }
    }
}
