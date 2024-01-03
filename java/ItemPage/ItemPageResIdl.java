package tbclient.ItemPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class ItemPageResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ItemPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ItemPageResIdl itemPageResIdl) {
            super(itemPageResIdl);
            if (itemPageResIdl == null) {
                return;
            }
            this.error = itemPageResIdl.error;
            this.data = itemPageResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemPageResIdl build(boolean z) {
            return new ItemPageResIdl(this, z);
        }
    }

    public ItemPageResIdl(Builder builder, boolean z) {
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
