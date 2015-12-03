package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class ExcFrsPageResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ ExcFrsPageResIdl(Builder builder, boolean z, ExcFrsPageResIdl excFrsPageResIdl) {
        this(builder, z);
    }

    private ExcFrsPageResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<ExcFrsPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ExcFrsPageResIdl excFrsPageResIdl) {
            super(excFrsPageResIdl);
            if (excFrsPageResIdl != null) {
                this.data = excFrsPageResIdl.data;
                this.error = excFrsPageResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcFrsPageResIdl build(boolean z) {
            return new ExcFrsPageResIdl(this, z, null);
        }
    }
}
