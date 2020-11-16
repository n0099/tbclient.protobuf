package tbclient.Recommforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes21.dex */
public final class RecommforumResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private RecommforumResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<RecommforumResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RecommforumResIdl recommforumResIdl) {
            super(recommforumResIdl);
            if (recommforumResIdl != null) {
                this.error = recommforumResIdl.error;
                this.data = recommforumResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommforumResIdl build(boolean z) {
            return new RecommforumResIdl(this, z);
        }
    }
}
