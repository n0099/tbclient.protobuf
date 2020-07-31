package tbclient.GodFollowRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes18.dex */
public final class GodFollowRecommendReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GodFollowRecommendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes18.dex */
    public static final class Builder extends Message.Builder<GodFollowRecommendReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GodFollowRecommendReqIdl godFollowRecommendReqIdl) {
            super(godFollowRecommendReqIdl);
            if (godFollowRecommendReqIdl != null) {
                this.data = godFollowRecommendReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodFollowRecommendReqIdl build(boolean z) {
            return new GodFollowRecommendReqIdl(this, z);
        }
    }
}
