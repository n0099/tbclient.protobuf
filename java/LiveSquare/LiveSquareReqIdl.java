package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class LiveSquareReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<LiveSquareReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(LiveSquareReqIdl liveSquareReqIdl) {
            super(liveSquareReqIdl);
            if (liveSquareReqIdl == null) {
                return;
            }
            this.data = liveSquareReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveSquareReqIdl build(boolean z) {
            return new LiveSquareReqIdl(this, z);
        }
    }

    public LiveSquareReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
