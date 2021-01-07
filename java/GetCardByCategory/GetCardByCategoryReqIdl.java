package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GetCardByCategoryReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetCardByCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetCardByCategoryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetCardByCategoryReqIdl getCardByCategoryReqIdl) {
            super(getCardByCategoryReqIdl);
            if (getCardByCategoryReqIdl != null) {
                this.data = getCardByCategoryReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetCardByCategoryReqIdl build(boolean z) {
            return new GetCardByCategoryReqIdl(this, z);
        }
    }
}
