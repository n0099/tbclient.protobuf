package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ExcPbPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ExcPbPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ExcPbPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ExcPbPageReqIdl excPbPageReqIdl) {
            super(excPbPageReqIdl);
            if (excPbPageReqIdl != null) {
                this.data = excPbPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcPbPageReqIdl build(boolean z) {
            return new ExcPbPageReqIdl(this, z);
        }
    }
}
