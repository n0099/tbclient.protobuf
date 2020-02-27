package tbclient.AddLotteryCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class AddLotteryCountResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private AddLotteryCountResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AddLotteryCountResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AddLotteryCountResIdl addLotteryCountResIdl) {
            super(addLotteryCountResIdl);
            if (addLotteryCountResIdl != null) {
                this.error = addLotteryCountResIdl.error;
                this.data = addLotteryCountResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddLotteryCountResIdl build(boolean z) {
            return new AddLotteryCountResIdl(this, z);
        }
    }
}
