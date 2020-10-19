package tbclient.SmartAppList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes22.dex */
public final class SmartAppListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private SmartAppListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<SmartAppListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SmartAppListResIdl smartAppListResIdl) {
            super(smartAppListResIdl);
            if (smartAppListResIdl != null) {
                this.error = smartAppListResIdl.error;
                this.data = smartAppListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SmartAppListResIdl build(boolean z) {
            return new SmartAppListResIdl(this, z);
        }
    }
}
