package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FinefrspageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ FinefrspageReqIdl(Builder builder, boolean z, FinefrspageReqIdl finefrspageReqIdl) {
        this(builder, z);
    }

    private FinefrspageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<FinefrspageReqIdl> {
        public DataReq data;

        public Builder(FinefrspageReqIdl finefrspageReqIdl) {
            super(finefrspageReqIdl);
            if (finefrspageReqIdl != null) {
                this.data = finefrspageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinefrspageReqIdl build(boolean z) {
            return new FinefrspageReqIdl(this, z, null);
        }
    }
}
