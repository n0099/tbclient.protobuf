package tbclient.Unlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class UnlikeReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private UnlikeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<UnlikeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UnlikeReqIdl unlikeReqIdl) {
            super(unlikeReqIdl);
            if (unlikeReqIdl != null) {
                this.data = unlikeReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UnlikeReqIdl build(boolean z) {
            return new UnlikeReqIdl(this, z);
        }
    }
}
