package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GetMyPostReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetMyPostReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMyPostReqIdl getMyPostReqIdl) {
            super(getMyPostReqIdl);
            if (getMyPostReqIdl == null) {
                return;
            }
            this.data = getMyPostReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMyPostReqIdl build(boolean z) {
            return new GetMyPostReqIdl(this, z);
        }
    }

    public GetMyPostReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
