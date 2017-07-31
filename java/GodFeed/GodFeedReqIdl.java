package tbclient.GodFeed;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GodFeedReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GodFeedReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GodFeedReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GodFeedReqIdl godFeedReqIdl) {
            super(godFeedReqIdl);
            if (godFeedReqIdl != null) {
                this.data = godFeedReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodFeedReqIdl build(boolean z) {
            return new GodFeedReqIdl(this, z);
        }
    }
}
