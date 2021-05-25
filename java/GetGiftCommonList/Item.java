package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class Item extends Message {
    public static final String DEFAULT_IOS_PRODUCT_ID = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PLAY_URL = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer ios_count;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer ios_price;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ios_product_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String play_url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Integer DEFAULT_PRICE = 0;
    public static final Integer DEFAULT_IOS_PRICE = 0;
    public static final Integer DEFAULT_IOS_COUNT = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Item> {
        public Integer gift_id;
        public Integer ios_count;
        public Integer ios_price;
        public String ios_product_id;
        public String name;
        public String play_url;
        public Integer price;
        public String thumbnail_url;

        public Builder() {
        }

        public Builder(Item item) {
            super(item);
            if (item == null) {
                return;
            }
            this.gift_id = item.gift_id;
            this.name = item.name;
            this.price = item.price;
            this.thumbnail_url = item.thumbnail_url;
            this.play_url = item.play_url;
            this.ios_product_id = item.ios_product_id;
            this.ios_price = item.ios_price;
            this.ios_count = item.ios_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Item build(boolean z) {
            return new Item(this, z);
        }
    }

    public Item(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num2 = builder.price;
            if (num2 == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num2;
            }
            String str2 = builder.thumbnail_url;
            if (str2 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str2;
            }
            String str3 = builder.play_url;
            if (str3 == null) {
                this.play_url = "";
            } else {
                this.play_url = str3;
            }
            String str4 = builder.ios_product_id;
            if (str4 == null) {
                this.ios_product_id = "";
            } else {
                this.ios_product_id = str4;
            }
            Integer num3 = builder.ios_price;
            if (num3 == null) {
                this.ios_price = DEFAULT_IOS_PRICE;
            } else {
                this.ios_price = num3;
            }
            Integer num4 = builder.ios_count;
            if (num4 == null) {
                this.ios_count = DEFAULT_IOS_COUNT;
                return;
            } else {
                this.ios_count = num4;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.name = builder.name;
        this.price = builder.price;
        this.thumbnail_url = builder.thumbnail_url;
        this.play_url = builder.play_url;
        this.ios_product_id = builder.ios_product_id;
        this.ios_price = builder.ios_price;
        this.ios_count = builder.ios_count;
    }
}
