package tbclient.AdNewLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class AdNewLogResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AdNewLogResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AdNewLogResIdl adNewLogResIdl) {
            super(adNewLogResIdl);
            if (adNewLogResIdl == null) {
                return;
            }
            this.error = adNewLogResIdl.error;
            this.data = adNewLogResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdNewLogResIdl build(boolean z) {
            return new AdNewLogResIdl(this, z);
        }
    }

    public AdNewLogResIdl(Builder builder, boolean z) {
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
