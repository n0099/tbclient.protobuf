package tbclient.SquareRecommand;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class SquareRecommandReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private SquareRecommandReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<SquareRecommandReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SquareRecommandReqIdl squareRecommandReqIdl) {
            super(squareRecommandReqIdl);
            if (squareRecommandReqIdl != null) {
                this.data = squareRecommandReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SquareRecommandReqIdl build(boolean z) {
            return new SquareRecommandReqIdl(this, z);
        }
    }
}
