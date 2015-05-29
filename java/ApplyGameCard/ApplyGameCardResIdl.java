package tbclient.ApplyGameCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class ApplyGameCardResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ ApplyGameCardResIdl(Builder builder, boolean z, ApplyGameCardResIdl applyGameCardResIdl) {
        this(builder, z);
    }

    private ApplyGameCardResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<ApplyGameCardResIdl> {
        public DataRes data;
        public Error error;

        public Builder(ApplyGameCardResIdl applyGameCardResIdl) {
            super(applyGameCardResIdl);
            if (applyGameCardResIdl != null) {
                this.data = applyGameCardResIdl.data;
                this.error = applyGameCardResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ApplyGameCardResIdl build(boolean z) {
            return new ApplyGameCardResIdl(this, z, null);
        }
    }
}
