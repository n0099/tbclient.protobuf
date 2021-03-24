package tbclient.GetSkinByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetSkinByCategoryReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetSkinByCategoryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetSkinByCategoryReqIdl getSkinByCategoryReqIdl) {
            super(getSkinByCategoryReqIdl);
            if (getSkinByCategoryReqIdl == null) {
                return;
            }
            this.data = getSkinByCategoryReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSkinByCategoryReqIdl build(boolean z) {
            return new GetSkinByCategoryReqIdl(this, z);
        }
    }

    public GetSkinByCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
