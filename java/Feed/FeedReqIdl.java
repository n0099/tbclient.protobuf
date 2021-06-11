package tbclient.Feed;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class FeedReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<FeedReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FeedReqIdl feedReqIdl) {
            super(feedReqIdl);
            if (feedReqIdl == null) {
                return;
            }
            this.data = feedReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedReqIdl build(boolean z) {
            return new FeedReqIdl(this, z);
        }
    }

    public FeedReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
