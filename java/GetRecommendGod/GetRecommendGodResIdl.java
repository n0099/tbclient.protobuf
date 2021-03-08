package tbclient.GetRecommendGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetRecommendGodResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetRecommendGodResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetRecommendGodResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetRecommendGodResIdl getRecommendGodResIdl) {
            super(getRecommendGodResIdl);
            if (getRecommendGodResIdl != null) {
                this.error = getRecommendGodResIdl.error;
                this.data = getRecommendGodResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRecommendGodResIdl build(boolean z) {
            return new GetRecommendGodResIdl(this, z);
        }
    }
}
