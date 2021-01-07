package tbclient.FinishMemberTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class FinishMemberTaskResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private FinishMemberTaskResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<FinishMemberTaskResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FinishMemberTaskResIdl finishMemberTaskResIdl) {
            super(finishMemberTaskResIdl);
            if (finishMemberTaskResIdl != null) {
                this.error = finishMemberTaskResIdl.error;
                this.data = finishMemberTaskResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinishMemberTaskResIdl build(boolean z) {
            return new FinishMemberTaskResIdl(this, z);
        }
    }
}
