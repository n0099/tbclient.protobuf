package tbclient.FineZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FineZanReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ FineZanReqIdl(Builder builder, boolean z, FineZanReqIdl fineZanReqIdl) {
        this(builder, z);
    }

    private FineZanReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<FineZanReqIdl> {
        public DataReq data;

        public Builder(FineZanReqIdl fineZanReqIdl) {
            super(fineZanReqIdl);
            if (fineZanReqIdl != null) {
                this.data = fineZanReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineZanReqIdl build(boolean z) {
            return new FineZanReqIdl(this, z, null);
        }
    }
}
