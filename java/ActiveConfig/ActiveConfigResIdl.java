package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class ActiveConfigResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ActiveConfigResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ActiveConfigResIdl activeConfigResIdl) {
            super(activeConfigResIdl);
            if (activeConfigResIdl == null) {
                return;
            }
            this.error = activeConfigResIdl.error;
            this.data = activeConfigResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveConfigResIdl build(boolean z) {
            return new ActiveConfigResIdl(this, z);
        }
    }

    public ActiveConfigResIdl(Builder builder, boolean z) {
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
