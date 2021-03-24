package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class FineFrsPageResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FineFrsPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FineFrsPageResIdl fineFrsPageResIdl) {
            super(fineFrsPageResIdl);
            if (fineFrsPageResIdl == null) {
                return;
            }
            this.data = fineFrsPageResIdl.data;
            this.error = fineFrsPageResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineFrsPageResIdl build(boolean z) {
            return new FineFrsPageResIdl(this, z);
        }
    }

    public FineFrsPageResIdl(Builder builder, boolean z) {
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
