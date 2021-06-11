package tbclient.Feed;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class FeedResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<FeedResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FeedResIdl feedResIdl) {
            super(feedResIdl);
            if (feedResIdl == null) {
                return;
            }
            this.error = feedResIdl.error;
            this.data = feedResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedResIdl build(boolean z) {
            return new FeedResIdl(this, z);
        }
    }

    public FeedResIdl(Builder builder, boolean z) {
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
