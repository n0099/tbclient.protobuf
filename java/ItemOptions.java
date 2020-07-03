package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ItemOptions extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String value;

    private ItemOptions(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.key == null) {
                this.key = "";
            } else {
                this.key = builder.key;
            }
            if (builder.value == null) {
                this.value = "";
                return;
            } else {
                this.value = builder.value;
                return;
            }
        }
        this.key = builder.key;
        this.value = builder.value;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ItemOptions> {
        public String key;
        public String value;

        public Builder() {
        }

        public Builder(ItemOptions itemOptions) {
            super(itemOptions);
            if (itemOptions != null) {
                this.key = itemOptions.key;
                this.value = itemOptions.value;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemOptions build(boolean z) {
            return new ItemOptions(this, z);
        }
    }
}
