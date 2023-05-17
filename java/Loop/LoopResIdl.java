package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class LoopResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LoopResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(LoopResIdl loopResIdl) {
            super(loopResIdl);
            if (loopResIdl == null) {
                return;
            }
            this.error = loopResIdl.error;
            this.data = loopResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LoopResIdl build(boolean z) {
            return new LoopResIdl(this, z);
        }
    }

    public LoopResIdl(Builder builder, boolean z) {
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
