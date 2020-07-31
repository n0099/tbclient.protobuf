package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class LotteryReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private LotteryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<LotteryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(LotteryReqIdl lotteryReqIdl) {
            super(lotteryReqIdl);
            if (lotteryReqIdl != null) {
                this.data = lotteryReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LotteryReqIdl build(boolean z) {
            return new LotteryReqIdl(this, z);
        }
    }
}
