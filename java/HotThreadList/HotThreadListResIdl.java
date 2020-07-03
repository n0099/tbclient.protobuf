package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class HotThreadListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private HotThreadListResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<HotThreadListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HotThreadListResIdl hotThreadListResIdl) {
            super(hotThreadListResIdl);
            if (hotThreadListResIdl != null) {
                this.error = hotThreadListResIdl.error;
                this.data = hotThreadListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadListResIdl build(boolean z) {
            return new HotThreadListResIdl(this, z);
        }
    }
}
