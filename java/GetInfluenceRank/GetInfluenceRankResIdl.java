package tbclient.GetInfluenceRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetInfluenceRankResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetInfluenceRankResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetInfluenceRankResIdl getInfluenceRankResIdl) {
            super(getInfluenceRankResIdl);
            if (getInfluenceRankResIdl == null) {
                return;
            }
            this.error = getInfluenceRankResIdl.error;
            this.data = getInfluenceRankResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetInfluenceRankResIdl build(boolean z) {
            return new GetInfluenceRankResIdl(this, z);
        }
    }

    public GetInfluenceRankResIdl(Builder builder, boolean z) {
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
