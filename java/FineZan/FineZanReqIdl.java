package tbclient.FineZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FineZanReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FineZanReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FineZanReqIdl fineZanReqIdl) {
            super(fineZanReqIdl);
            if (fineZanReqIdl == null) {
                return;
            }
            this.data = fineZanReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineZanReqIdl build(boolean z) {
            return new FineZanReqIdl(this, z);
        }
    }

    public FineZanReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
