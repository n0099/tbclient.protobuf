package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ElectionInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ElectionInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ElectionInfoReqIdl electionInfoReqIdl) {
            super(electionInfoReqIdl);
            if (electionInfoReqIdl == null) {
                return;
            }
            this.data = electionInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ElectionInfoReqIdl build(boolean z) {
            return new ElectionInfoReqIdl(this, z);
        }
    }

    public ElectionInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
