package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class ItemPlot extends Message {
    public static final Integer DEFAULT_LEVEL = 0;
    public static final Integer DEFAULT_NUM = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer level;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer num;

    private ItemPlot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.level == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = builder.level;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = builder.num;
                return;
            }
        }
        this.level = builder.level;
        this.num = builder.num;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<ItemPlot> {
        public Integer level;
        public Integer num;

        public Builder() {
        }

        public Builder(ItemPlot itemPlot) {
            super(itemPlot);
            if (itemPlot != null) {
                this.level = itemPlot.level;
                this.num = itemPlot.num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemPlot build(boolean z) {
            return new ItemPlot(this, z);
        }
    }
}
