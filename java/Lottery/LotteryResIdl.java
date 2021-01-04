package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class LotteryResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private LotteryResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<LotteryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(LotteryResIdl lotteryResIdl) {
            super(lotteryResIdl);
            if (lotteryResIdl != null) {
                this.error = lotteryResIdl.error;
                this.data = lotteryResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LotteryResIdl build(boolean z) {
            return new LotteryResIdl(this, z);
        }
    }
}
