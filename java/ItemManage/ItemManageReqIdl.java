package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ItemManageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ItemManageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ItemManageReqIdl itemManageReqIdl) {
            super(itemManageReqIdl);
            if (itemManageReqIdl == null) {
                return;
            }
            this.data = itemManageReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemManageReqIdl build(boolean z) {
            return new ItemManageReqIdl(this, z);
        }
    }

    public ItemManageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
