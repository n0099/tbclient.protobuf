package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class HotThreadListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HotThreadListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HotThreadListResIdl hotThreadListResIdl) {
            super(hotThreadListResIdl);
            if (hotThreadListResIdl == null) {
                return;
            }
            this.error = hotThreadListResIdl.error;
            this.data = hotThreadListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadListResIdl build(boolean z) {
            return new HotThreadListResIdl(this, z);
        }
    }

    public HotThreadListResIdl(Builder builder, boolean z) {
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
