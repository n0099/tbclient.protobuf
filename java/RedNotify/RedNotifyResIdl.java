package tbclient.RedNotify;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes16.dex */
public final class RedNotifyResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private RedNotifyResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<RedNotifyResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RedNotifyResIdl redNotifyResIdl) {
            super(redNotifyResIdl);
            if (redNotifyResIdl != null) {
                this.error = redNotifyResIdl.error;
                this.data = redNotifyResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RedNotifyResIdl build(boolean z) {
            return new RedNotifyResIdl(this, z);
        }
    }
}
