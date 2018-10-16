package tbclient.Frshighlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class FrshighlistReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private FrshighlistReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<FrshighlistReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FrshighlistReqIdl frshighlistReqIdl) {
            super(frshighlistReqIdl);
            if (frshighlistReqIdl != null) {
                this.data = frshighlistReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrshighlistReqIdl build(boolean z) {
            return new FrshighlistReqIdl(this, z);
        }
    }
}
