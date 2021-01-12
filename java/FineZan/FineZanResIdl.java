package tbclient.FineZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class FineZanResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    private FineZanResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FineZanResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FineZanResIdl fineZanResIdl) {
            super(fineZanResIdl);
            if (fineZanResIdl != null) {
                this.data = fineZanResIdl.data;
                this.error = fineZanResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineZanResIdl build(boolean z) {
            return new FineZanResIdl(this, z);
        }
    }
}
