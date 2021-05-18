package tbclient.HotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class HotThreadResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<HotThreadResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HotThreadResIdl hotThreadResIdl) {
            super(hotThreadResIdl);
            if (hotThreadResIdl == null) {
                return;
            }
            this.error = hotThreadResIdl.error;
            this.data = hotThreadResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadResIdl build(boolean z) {
            return new HotThreadResIdl(this, z);
        }
    }

    public HotThreadResIdl(Builder builder, boolean z) {
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
