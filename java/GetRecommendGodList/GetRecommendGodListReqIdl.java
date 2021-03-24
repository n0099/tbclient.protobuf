package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetRecommendGodListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetRecommendGodListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetRecommendGodListReqIdl getRecommendGodListReqIdl) {
            super(getRecommendGodListReqIdl);
            if (getRecommendGodListReqIdl == null) {
                return;
            }
            this.data = getRecommendGodListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRecommendGodListReqIdl build(boolean z) {
            return new GetRecommendGodListReqIdl(this, z);
        }
    }

    public GetRecommendGodListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
