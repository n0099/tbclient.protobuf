package tbclient.Frshighlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class FrshighlistResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private FrshighlistResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<FrshighlistResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FrshighlistResIdl frshighlistResIdl) {
            super(frshighlistResIdl);
            if (frshighlistResIdl != null) {
                this.error = frshighlistResIdl.error;
                this.data = frshighlistResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrshighlistResIdl build(boolean z) {
            return new FrshighlistResIdl(this, z);
        }
    }
}
