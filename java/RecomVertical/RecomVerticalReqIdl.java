package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RecomVerticalReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecomVerticalReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RecomVerticalReqIdl recomVerticalReqIdl) {
            super(recomVerticalReqIdl);
            if (recomVerticalReqIdl == null) {
                return;
            }
            this.data = recomVerticalReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomVerticalReqIdl build(boolean z) {
            return new RecomVerticalReqIdl(this, z);
        }
    }

    public RecomVerticalReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
