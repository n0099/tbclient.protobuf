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

    /* synthetic */ FineFrsPageResIdl(Builder builder, boolean z, FineFrsPageResIdl fineFrsPageResIdl) {
        this(builder, z);
    }

    private FineFrsPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<FineFrsPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder(FineFrsPageResIdl fineFrsPageResIdl) {
            super(fineFrsPageResIdl);
            if (fineFrsPageResIdl != null) {
                this.data = fineFrsPageResIdl.data;
                this.error = fineFrsPageResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineFrsPageResIdl build(boolean z) {
            return new FineFrsPageResIdl(this, z, null);
        }
    }
}
