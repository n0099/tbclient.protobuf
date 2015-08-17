package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FinePbPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ FinePbPageReqIdl(Builder builder, boolean z, FinePbPageReqIdl finePbPageReqIdl) {
        this(builder, z);
    }

    private FinePbPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<FinePbPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FinePbPageReqIdl finePbPageReqIdl) {
            super(finePbPageReqIdl);
            if (finePbPageReqIdl != null) {
                this.data = finePbPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinePbPageReqIdl build(boolean z) {
            return new FinePbPageReqIdl(this, z, null);
        }
    }
}
