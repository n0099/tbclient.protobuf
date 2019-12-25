package tbclient.StarTrends;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes6.dex */
public final class StarTrendsResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private StarTrendsResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<StarTrendsResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(StarTrendsResIdl starTrendsResIdl) {
            super(starTrendsResIdl);
            if (starTrendsResIdl != null) {
                this.error = starTrendsResIdl.error;
                this.data = starTrendsResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarTrendsResIdl build(boolean z) {
            return new StarTrendsResIdl(this, z);
        }
    }
}
