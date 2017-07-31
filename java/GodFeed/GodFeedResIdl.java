package tbclient.GodFeed;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GodFeedResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GodFeedResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GodFeedResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GodFeedResIdl godFeedResIdl) {
            super(godFeedResIdl);
            if (godFeedResIdl != null) {
                this.error = godFeedResIdl.error;
                this.data = godFeedResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodFeedResIdl build(boolean z) {
            return new GodFeedResIdl(this, z);
        }
    }
}
