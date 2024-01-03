package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class RecomVideoResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecomVideoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RecomVideoResIdl recomVideoResIdl) {
            super(recomVideoResIdl);
            if (recomVideoResIdl == null) {
                return;
            }
            this.error = recomVideoResIdl.error;
            this.data = recomVideoResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomVideoResIdl build(boolean z) {
            return new RecomVideoResIdl(this, z);
        }
    }

    public RecomVideoResIdl(Builder builder, boolean z) {
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
