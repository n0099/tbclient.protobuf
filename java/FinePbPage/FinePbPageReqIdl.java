package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FinePbPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FinePbPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FinePbPageReqIdl finePbPageReqIdl) {
            super(finePbPageReqIdl);
            if (finePbPageReqIdl == null) {
                return;
            }
            this.data = finePbPageReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinePbPageReqIdl build(boolean z) {
            return new FinePbPageReqIdl(this, z);
        }
    }

    public FinePbPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
