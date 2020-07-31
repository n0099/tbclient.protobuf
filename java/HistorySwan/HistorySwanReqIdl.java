package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class HistorySwanReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private HistorySwanReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<HistorySwanReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(HistorySwanReqIdl historySwanReqIdl) {
            super(historySwanReqIdl);
            if (historySwanReqIdl != null) {
                this.data = historySwanReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HistorySwanReqIdl build(boolean z) {
            return new HistorySwanReqIdl(this, z);
        }
    }
}
