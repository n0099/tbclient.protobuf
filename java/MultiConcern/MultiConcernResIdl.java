package tbclient.MultiConcern;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes16.dex */
public final class MultiConcernResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private MultiConcernResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<MultiConcernResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(MultiConcernResIdl multiConcernResIdl) {
            super(multiConcernResIdl);
            if (multiConcernResIdl != null) {
                this.error = multiConcernResIdl.error;
                this.data = multiConcernResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MultiConcernResIdl build(boolean z) {
            return new MultiConcernResIdl(this, z);
        }
    }
}
