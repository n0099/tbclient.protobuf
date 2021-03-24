package tbclient.AlaTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AlaTabReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AlaTabReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AlaTabReqIdl alaTabReqIdl) {
            super(alaTabReqIdl);
            if (alaTabReqIdl == null) {
                return;
            }
            this.data = alaTabReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaTabReqIdl build(boolean z) {
            return new AlaTabReqIdl(this, z);
        }
    }

    public AlaTabReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
