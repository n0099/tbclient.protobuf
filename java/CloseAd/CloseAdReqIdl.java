package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class CloseAdReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private CloseAdReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<CloseAdReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CloseAdReqIdl closeAdReqIdl) {
            super(closeAdReqIdl);
            if (closeAdReqIdl != null) {
                this.data = closeAdReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CloseAdReqIdl build(boolean z) {
            return new CloseAdReqIdl(this, z);
        }
    }
}
