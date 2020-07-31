package tbclient.StarTrends;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class StarTrendsReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private StarTrendsReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<StarTrendsReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(StarTrendsReqIdl starTrendsReqIdl) {
            super(starTrendsReqIdl);
            if (starTrendsReqIdl != null) {
                this.data = starTrendsReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarTrendsReqIdl build(boolean z) {
            return new StarTrendsReqIdl(this, z);
        }
    }
}
