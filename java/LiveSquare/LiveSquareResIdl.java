package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class LiveSquareResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private LiveSquareResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveSquareResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(LiveSquareResIdl liveSquareResIdl) {
            super(liveSquareResIdl);
            if (liveSquareResIdl != null) {
                this.error = liveSquareResIdl.error;
                this.data = liveSquareResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveSquareResIdl build(boolean z) {
            return new LiveSquareResIdl(this, z);
        }
    }
}
