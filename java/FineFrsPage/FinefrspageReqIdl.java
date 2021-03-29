package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class FinefrspageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FinefrspageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FinefrspageReqIdl finefrspageReqIdl) {
            super(finefrspageReqIdl);
            if (finefrspageReqIdl == null) {
                return;
            }
            this.data = finefrspageReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinefrspageReqIdl build(boolean z) {
            return new FinefrspageReqIdl(this, z);
        }
    }

    public FinefrspageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
