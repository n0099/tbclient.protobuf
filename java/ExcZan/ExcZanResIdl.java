package tbclient.ExcZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class ExcZanResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ExcZanResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ExcZanResIdl excZanResIdl) {
            super(excZanResIdl);
            if (excZanResIdl == null) {
                return;
            }
            this.data = excZanResIdl.data;
            this.error = excZanResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcZanResIdl build(boolean z) {
            return new ExcZanResIdl(this, z);
        }
    }

    public ExcZanResIdl(Builder builder, boolean z) {
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
