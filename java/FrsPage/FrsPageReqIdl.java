package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class FrsPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private FrsPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<FrsPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FrsPageReqIdl frsPageReqIdl) {
            super(frsPageReqIdl);
            if (frsPageReqIdl != null) {
                this.data = frsPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsPageReqIdl build(boolean z) {
            return new FrsPageReqIdl(this, z);
        }
    }
}
