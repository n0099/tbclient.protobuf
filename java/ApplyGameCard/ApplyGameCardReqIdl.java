package tbclient.ApplyGameCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ApplyGameCardReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ ApplyGameCardReqIdl(Builder builder, boolean z, ApplyGameCardReqIdl applyGameCardReqIdl) {
        this(builder, z);
    }

    private ApplyGameCardReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ApplyGameCardReqIdl> {
        public DataReq data;

        public Builder(ApplyGameCardReqIdl applyGameCardReqIdl) {
            super(applyGameCardReqIdl);
            if (applyGameCardReqIdl != null) {
                this.data = applyGameCardReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ApplyGameCardReqIdl build(boolean z) {
            return new ApplyGameCardReqIdl(this, z, null);
        }
    }
}
