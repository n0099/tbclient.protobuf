package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ItemPlot extends Message {
    public static final Integer DEFAULT_LEVEL = 0;
    public static final Integer DEFAULT_NUM = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer level;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer num;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ItemPlot> {
        public Integer level;
        public Integer num;

        public Builder() {
        }

        public Builder(ItemPlot itemPlot) {
            super(itemPlot);
            if (itemPlot == null) {
                return;
            }
            this.level = itemPlot.level;
            this.num = itemPlot.num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemPlot build(boolean z) {
            return new ItemPlot(this, z);
        }
    }

    public ItemPlot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.level;
            if (num == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num;
            }
            Integer num2 = builder.num;
            if (num2 == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num2;
                return;
            }
        }
        this.level = builder.level;
        this.num = builder.num;
    }
}
