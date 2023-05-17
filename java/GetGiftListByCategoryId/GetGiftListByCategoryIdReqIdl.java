package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GetGiftListByCategoryIdReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetGiftListByCategoryIdReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetGiftListByCategoryIdReqIdl getGiftListByCategoryIdReqIdl) {
            super(getGiftListByCategoryIdReqIdl);
            if (getGiftListByCategoryIdReqIdl == null) {
                return;
            }
            this.data = getGiftListByCategoryIdReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftListByCategoryIdReqIdl build(boolean z) {
            return new GetGiftListByCategoryIdReqIdl(this, z);
        }
    }

    public GetGiftListByCategoryIdReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
