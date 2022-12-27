package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GetPostListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetPostListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetPostListReqIdl getPostListReqIdl) {
            super(getPostListReqIdl);
            if (getPostListReqIdl == null) {
                return;
            }
            this.data = getPostListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPostListReqIdl build(boolean z) {
            return new GetPostListReqIdl(this, z);
        }
    }

    public GetPostListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
