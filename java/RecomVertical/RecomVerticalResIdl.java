package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class RecomVerticalResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<RecomVerticalResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RecomVerticalResIdl recomVerticalResIdl) {
            super(recomVerticalResIdl);
            if (recomVerticalResIdl == null) {
                return;
            }
            this.error = recomVerticalResIdl.error;
            this.data = recomVerticalResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomVerticalResIdl build(boolean z) {
            return new RecomVerticalResIdl(this, z);
        }
    }

    public RecomVerticalResIdl(Builder builder, boolean z) {
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
