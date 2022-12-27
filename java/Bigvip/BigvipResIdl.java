package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class BigvipResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BigvipResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(BigvipResIdl bigvipResIdl) {
            super(bigvipResIdl);
            if (bigvipResIdl == null) {
                return;
            }
            this.data = bigvipResIdl.data;
            this.error = bigvipResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BigvipResIdl build(boolean z) {
            return new BigvipResIdl(this, z);
        }
    }

    public BigvipResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
