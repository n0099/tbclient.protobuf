package tbclient.FinishMemberTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FinishMemberTaskReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FinishMemberTaskReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FinishMemberTaskReqIdl finishMemberTaskReqIdl) {
            super(finishMemberTaskReqIdl);
            if (finishMemberTaskReqIdl == null) {
                return;
            }
            this.data = finishMemberTaskReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinishMemberTaskReqIdl build(boolean z) {
            return new FinishMemberTaskReqIdl(this, z);
        }
    }

    public FinishMemberTaskReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
