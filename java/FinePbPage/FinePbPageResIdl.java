package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class FinePbPageResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    private FinePbPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FinePbPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FinePbPageResIdl finePbPageResIdl) {
            super(finePbPageResIdl);
            if (finePbPageResIdl != null) {
                this.data = finePbPageResIdl.data;
                this.error = finePbPageResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinePbPageResIdl build(boolean z) {
            return new FinePbPageResIdl(this, z);
        }
    }
}
