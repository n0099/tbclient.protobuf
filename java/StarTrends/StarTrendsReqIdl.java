package tbclient.StarTrends;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class StarTrendsReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<StarTrendsReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(StarTrendsReqIdl starTrendsReqIdl) {
            super(starTrendsReqIdl);
            if (starTrendsReqIdl == null) {
                return;
            }
            this.data = starTrendsReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarTrendsReqIdl build(boolean z) {
            return new StarTrendsReqIdl(this, z);
        }
    }

    public StarTrendsReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
