package tbclient.PushThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class PushThreadResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PushThreadResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PushThreadResIdl pushThreadResIdl) {
            super(pushThreadResIdl);
            if (pushThreadResIdl == null) {
                return;
            }
            this.error = pushThreadResIdl.error;
            this.data = pushThreadResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PushThreadResIdl build(boolean z) {
            return new PushThreadResIdl(this, z);
        }
    }

    public PushThreadResIdl(Builder builder, boolean z) {
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
