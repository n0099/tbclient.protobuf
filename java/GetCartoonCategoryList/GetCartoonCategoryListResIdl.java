package tbclient.GetCartoonCategoryList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes4.dex */
public final class GetCartoonCategoryListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetCartoonCategoryListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GetCartoonCategoryListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetCartoonCategoryListResIdl getCartoonCategoryListResIdl) {
            super(getCartoonCategoryListResIdl);
            if (getCartoonCategoryListResIdl != null) {
                this.error = getCartoonCategoryListResIdl.error;
                this.data = getCartoonCategoryListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetCartoonCategoryListResIdl build(boolean z) {
            return new GetCartoonCategoryListResIdl(this, z);
        }
    }
}
