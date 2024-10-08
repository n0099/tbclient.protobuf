package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class FrsPageResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FrsPageResIdl frsPageResIdl) {
            super(frsPageResIdl);
            if (frsPageResIdl == null) {
                return;
            }
            this.error = frsPageResIdl.error;
            this.data = frsPageResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsPageResIdl build(boolean z) {
            return new FrsPageResIdl(this, z);
        }
    }

    public FrsPageResIdl(Builder builder, boolean z) {
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
