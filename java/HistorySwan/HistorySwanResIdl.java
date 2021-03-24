package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class HistorySwanResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HistorySwanResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HistorySwanResIdl historySwanResIdl) {
            super(historySwanResIdl);
            if (historySwanResIdl == null) {
                return;
            }
            this.error = historySwanResIdl.error;
            this.data = historySwanResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HistorySwanResIdl build(boolean z) {
            return new HistorySwanResIdl(this, z);
        }
    }

    public HistorySwanResIdl(Builder builder, boolean z) {
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
