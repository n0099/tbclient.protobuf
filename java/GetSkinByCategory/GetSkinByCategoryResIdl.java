package tbclient.GetSkinByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetSkinByCategoryResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    private GetSkinByCategoryResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetSkinByCategoryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetSkinByCategoryResIdl getSkinByCategoryResIdl) {
            super(getSkinByCategoryResIdl);
            if (getSkinByCategoryResIdl != null) {
                this.data = getSkinByCategoryResIdl.data;
                this.error = getSkinByCategoryResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSkinByCategoryResIdl build(boolean z) {
            return new GetSkinByCategoryResIdl(this, z);
        }
    }
}
