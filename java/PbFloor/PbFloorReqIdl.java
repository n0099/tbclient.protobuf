package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PbFloorReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PbFloorReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PbFloorReqIdl pbFloorReqIdl) {
            super(pbFloorReqIdl);
            if (pbFloorReqIdl == null) {
                return;
            }
            this.data = pbFloorReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbFloorReqIdl build(boolean z) {
            return new PbFloorReqIdl(this, z);
        }
    }

    public PbFloorReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
