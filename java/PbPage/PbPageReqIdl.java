package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PbPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private PbPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PbPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PbPageReqIdl pbPageReqIdl) {
            super(pbPageReqIdl);
            if (pbPageReqIdl != null) {
                this.data = pbPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbPageReqIdl build(boolean z) {
            return new PbPageReqIdl(this, z);
        }
    }
}
