package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetRecommendGodListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetRecommendGodListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetRecommendGodListResIdl getRecommendGodListResIdl) {
            super(getRecommendGodListResIdl);
            if (getRecommendGodListResIdl == null) {
                return;
            }
            this.error = getRecommendGodListResIdl.error;
            this.data = getRecommendGodListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRecommendGodListResIdl build(boolean z) {
            return new GetRecommendGodListResIdl(this, z);
        }
    }

    public GetRecommendGodListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
