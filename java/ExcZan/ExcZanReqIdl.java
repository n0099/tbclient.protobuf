package tbclient.ExcZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes17.dex */
public final class ExcZanReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ExcZanReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes17.dex */
    public static final class Builder extends Message.Builder<ExcZanReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ExcZanReqIdl excZanReqIdl) {
            super(excZanReqIdl);
            if (excZanReqIdl != null) {
                this.data = excZanReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcZanReqIdl build(boolean z) {
            return new ExcZanReqIdl(this, z);
        }
    }
}
