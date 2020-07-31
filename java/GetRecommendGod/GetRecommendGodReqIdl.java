package tbclient.GetRecommendGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes18.dex */
public final class GetRecommendGodReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetRecommendGodReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes18.dex */
    public static final class Builder extends Message.Builder<GetRecommendGodReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetRecommendGodReqIdl getRecommendGodReqIdl) {
            super(getRecommendGodReqIdl);
            if (getRecommendGodReqIdl != null) {
                this.data = getRecommendGodReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetRecommendGodReqIdl build(boolean z) {
            return new GetRecommendGodReqIdl(this, z);
        }
    }
}
