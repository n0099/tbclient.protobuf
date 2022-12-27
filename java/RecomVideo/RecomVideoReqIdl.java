package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class RecomVideoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecomVideoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RecomVideoReqIdl recomVideoReqIdl) {
            super(recomVideoReqIdl);
            if (recomVideoReqIdl == null) {
                return;
            }
            this.data = recomVideoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomVideoReqIdl build(boolean z) {
            return new RecomVideoReqIdl(this, z);
        }
    }

    public RecomVideoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
