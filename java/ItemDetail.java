package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ItemDetail extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_VALUE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String value;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ItemDetail> {
        public String name;
        public String value;

        public Builder() {
        }

        public Builder(ItemDetail itemDetail) {
            super(itemDetail);
            if (itemDetail == null) {
                return;
            }
            this.name = itemDetail.name;
            this.value = itemDetail.value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemDetail build(boolean z) {
            return new ItemDetail(this, z);
        }
    }

    public ItemDetail(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.value;
            if (str2 == null) {
                this.value = "";
                return;
            } else {
                this.value = str2;
                return;
            }
        }
        this.name = builder.name;
        this.value = builder.value;
    }
}
