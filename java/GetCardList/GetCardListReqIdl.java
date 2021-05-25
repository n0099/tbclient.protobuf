package tbclient.GetCardList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class GetCardListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<GetCardListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetCardListReqIdl getCardListReqIdl) {
            super(getCardListReqIdl);
            if (getCardListReqIdl == null) {
                return;
            }
            this.data = getCardListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetCardListReqIdl build(boolean z) {
            return new GetCardListReqIdl(this, z);
        }
    }

    public GetCardListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
