package tbclient.SetPendant;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class SetPendantReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private SetPendantReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SetPendantReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SetPendantReqIdl setPendantReqIdl) {
            super(setPendantReqIdl);
            if (setPendantReqIdl != null) {
                this.data = setPendantReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetPendantReqIdl build(boolean z) {
            return new SetPendantReqIdl(this, z);
        }
    }
}
