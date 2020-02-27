package tbclient.AddLotteryCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AddLotteryCountReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private AddLotteryCountReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AddLotteryCountReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AddLotteryCountReqIdl addLotteryCountReqIdl) {
            super(addLotteryCountReqIdl);
            if (addLotteryCountReqIdl != null) {
                this.data = addLotteryCountReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddLotteryCountReqIdl build(boolean z) {
            return new AddLotteryCountReqIdl(this, z);
        }
    }
}
