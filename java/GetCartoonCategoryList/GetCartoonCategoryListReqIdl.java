package tbclient.GetCartoonCategoryList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetCartoonCategoryListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetCartoonCategoryListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetCartoonCategoryListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetCartoonCategoryListReqIdl getCartoonCategoryListReqIdl) {
            super(getCartoonCategoryListReqIdl);
            if (getCartoonCategoryListReqIdl != null) {
                this.data = getCartoonCategoryListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetCartoonCategoryListReqIdl build(boolean z) {
            return new GetCartoonCategoryListReqIdl(this, z);
        }
    }
}
