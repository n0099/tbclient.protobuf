package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class RecomVideoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private RecomVideoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<RecomVideoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RecomVideoReqIdl recomVideoReqIdl) {
            super(recomVideoReqIdl);
            if (recomVideoReqIdl != null) {
                this.data = recomVideoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomVideoReqIdl build(boolean z) {
            return new RecomVideoReqIdl(this, z);
        }
    }
}
