package tbclient.GetInfluenceRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetInfluenceRankReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetInfluenceRankReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetInfluenceRankReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetInfluenceRankReqIdl getInfluenceRankReqIdl) {
            super(getInfluenceRankReqIdl);
            if (getInfluenceRankReqIdl != null) {
                this.data = getInfluenceRankReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetInfluenceRankReqIdl build(boolean z) {
            return new GetInfluenceRankReqIdl(this, z);
        }
    }
}
