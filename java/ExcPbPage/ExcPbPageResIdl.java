package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class ExcPbPageResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ExcPbPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ExcPbPageResIdl excPbPageResIdl) {
            super(excPbPageResIdl);
            if (excPbPageResIdl == null) {
                return;
            }
            this.data = excPbPageResIdl.data;
            this.error = excPbPageResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcPbPageResIdl build(boolean z) {
            return new ExcPbPageResIdl(this, z);
        }
    }

    public ExcPbPageResIdl(Builder builder, boolean z) {
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
