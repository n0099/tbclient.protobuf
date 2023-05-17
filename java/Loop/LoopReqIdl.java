package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LoopReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LoopReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(LoopReqIdl loopReqIdl) {
            super(loopReqIdl);
            if (loopReqIdl == null) {
                return;
            }
            this.data = loopReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LoopReqIdl build(boolean z) {
            return new LoopReqIdl(this, z);
        }
    }

    public LoopReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
