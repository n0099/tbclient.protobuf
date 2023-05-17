package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ItemThemeColor extends Message {
    @ProtoField(tag = 1)
    public final ItemThemeColorElement day;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ItemThemeColor> {
        public ItemThemeColorElement day;

        public Builder() {
        }

        public Builder(ItemThemeColor itemThemeColor) {
            super(itemThemeColor);
            if (itemThemeColor == null) {
                return;
            }
            this.day = itemThemeColor.day;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemThemeColor build(boolean z) {
            return new ItemThemeColor(this, z);
        }
    }

    public ItemThemeColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.day = builder.day;
        } else {
            this.day = builder.day;
        }
    }
}
