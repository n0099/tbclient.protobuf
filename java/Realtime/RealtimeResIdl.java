package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes16.dex */
public final class RealtimeResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private RealtimeResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<RealtimeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RealtimeResIdl realtimeResIdl) {
            super(realtimeResIdl);
            if (realtimeResIdl != null) {
                this.error = realtimeResIdl.error;
                this.data = realtimeResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RealtimeResIdl build(boolean z) {
            return new RealtimeResIdl(this, z);
        }
    }
}
