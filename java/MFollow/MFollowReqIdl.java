package tbclient.MFollow;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes24.dex */
public final class MFollowReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private MFollowReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes24.dex */
    public static final class Builder extends Message.Builder<MFollowReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(MFollowReqIdl mFollowReqIdl) {
            super(mFollowReqIdl);
            if (mFollowReqIdl != null) {
                this.data = mFollowReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MFollowReqIdl build(boolean z) {
            return new MFollowReqIdl(this, z);
        }
    }
}
