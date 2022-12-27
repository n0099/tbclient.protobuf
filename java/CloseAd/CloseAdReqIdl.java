package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class CloseAdReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CloseAdReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CloseAdReqIdl closeAdReqIdl) {
            super(closeAdReqIdl);
            if (closeAdReqIdl == null) {
                return;
            }
            this.data = closeAdReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CloseAdReqIdl build(boolean z) {
            return new CloseAdReqIdl(this, z);
        }
    }

    public CloseAdReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
