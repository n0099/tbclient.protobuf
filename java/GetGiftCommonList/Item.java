package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Item extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PLAY_URL = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
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

    /* synthetic */ Item(Builder builder, boolean z, Item item) {
        this(builder, z);
    }

    private Item(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.gift_id == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = builder.gift_id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.price == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = builder.price;
            }
            if (builder.thumbnail_url == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = builder.thumbnail_url;
            }
            if (builder.play_url == null) {
                this.play_url = "";
                return;
            } else {
                this.play_url = builder.play_url;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.name = builder.name;
        this.price = builder.price;
        this.thumbnail_url = builder.thumbnail_url;
        this.play_url = builder.play_url;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Item> {
        public Integer gift_id;
        public String name;
        public String play_url;
        public Integer price;
        public String thumbnail_url;

        public Builder(Item item) {
            super(item);
            if (item != null) {
                this.gift_id = item.gift_id;
                this.name = item.name;
                this.price = item.price;
                this.thumbnail_url = item.thumbnail_url;
                this.play_url = item.play_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Item build(boolean z) {
            return new Item(this, z, null);
        }
    }
}
