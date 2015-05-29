package tbclient.Unlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class UnlikeReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ UnlikeReqIdl(Builder builder, boolean z, UnlikeReqIdl unlikeReqIdl) {
        this(builder, z);
    }

    private UnlikeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<UnlikeReqIdl> {
        public DataReq data;

        public Builder(UnlikeReqIdl unlikeReqIdl) {
            super(unlikeReqIdl);
            if (unlikeReqIdl != null) {
                this.data = unlikeReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UnlikeReqIdl build(boolean z) {
            return new UnlikeReqIdl(this, z, null);
        }
    }
}
