package tbclient.AgreeMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes16.dex */
public final class AgreeMeResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private AgreeMeResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<AgreeMeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AgreeMeResIdl agreeMeResIdl) {
            super(agreeMeResIdl);
            if (agreeMeResIdl != null) {
                this.error = agreeMeResIdl.error;
                this.data = agreeMeResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgreeMeResIdl build(boolean z) {
            return new AgreeMeResIdl(this, z);
        }
    }
}
