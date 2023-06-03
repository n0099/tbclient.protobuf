package tbclient.ItemPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ItemPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ItemPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ItemPageReqIdl itemPageReqIdl) {
            super(itemPageReqIdl);
            if (itemPageReqIdl == null) {
                return;
            }
            this.data = itemPageReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemPageReqIdl build(boolean z) {
            return new ItemPageReqIdl(this, z);
        }
    }

    public ItemPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
