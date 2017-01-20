package tbclient.AlaTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class AlaTabResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ AlaTabResIdl(Builder builder, boolean z, AlaTabResIdl alaTabResIdl) {
        this(builder, z);
    }

    private AlaTabResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AlaTabResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AlaTabResIdl alaTabResIdl) {
            super(alaTabResIdl);
            if (alaTabResIdl != null) {
                this.error = alaTabResIdl.error;
                this.data = alaTabResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaTabResIdl build(boolean z) {
            return new AlaTabResIdl(this, z, null);
        }
    }
}
