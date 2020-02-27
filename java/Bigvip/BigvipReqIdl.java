package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes13.dex */
public final class BigvipReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private BigvipReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes13.dex */
    public static final class Builder extends Message.Builder<BigvipReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(BigvipReqIdl bigvipReqIdl) {
            super(bigvipReqIdl);
            if (bigvipReqIdl != null) {
                this.data = bigvipReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BigvipReqIdl build(boolean z) {
            return new BigvipReqIdl(this, z);
        }
    }
}
