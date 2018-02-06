package tbclient.GodFollowRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes3.dex */
public final class GodFollowRecommendResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GodFollowRecommendResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<GodFollowRecommendResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GodFollowRecommendResIdl godFollowRecommendResIdl) {
            super(godFollowRecommendResIdl);
            if (godFollowRecommendResIdl != null) {
                this.error = godFollowRecommendResIdl.error;
                this.data = godFollowRecommendResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodFollowRecommendResIdl build(boolean z) {
            return new GodFollowRecommendResIdl(this, z);
        }
    }
}
