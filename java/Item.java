package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class Item extends Message {
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_ITEM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
    public final Double icon_size;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long item_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String item_name;
    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double score;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer star;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> tags;
    public static final Long DEFAULT_ITEM_ID = 0L;
    public static final Double DEFAULT_ICON_SIZE = Double.valueOf(0.0d);
    public static final List<String> DEFAULT_TAGS = Collections.emptyList();
    public static final Double DEFAULT_SCORE = Double.valueOf(0.0d);
    public static final Integer DEFAULT_STAR = 0;

    private Item(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.item_id == null) {
                this.item_id = DEFAULT_ITEM_ID;
            } else {
                this.item_id = builder.item_id;
            }
            if (builder.item_name == null) {
                this.item_name = "";
            } else {
                this.item_name = builder.item_name;
            }
            if (builder.icon_size == null) {
                this.icon_size = DEFAULT_ICON_SIZE;
            } else {
                this.icon_size = builder.icon_size;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.tags == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = immutableCopyOf(builder.tags);
            }
            if (builder.score == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = builder.score;
            }
            if (builder.star == null) {
                this.star = DEFAULT_STAR;
                return;
            } else {
                this.star = builder.star;
                return;
            }
        }
        this.item_id = builder.item_id;
        this.item_name = builder.item_name;
        this.icon_size = builder.icon_size;
        this.icon_url = builder.icon_url;
        this.tags = immutableCopyOf(builder.tags);
        this.score = builder.score;
        this.star = builder.star;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<Item> {
        public Double icon_size;
        public String icon_url;
        public Long item_id;
        public String item_name;
        public Double score;
        public Integer star;
        public List<String> tags;

        public Builder() {
        }

        public Builder(Item item) {
            super(item);
            if (item != null) {
                this.item_id = item.item_id;
                this.item_name = item.item_name;
                this.icon_size = item.icon_size;
                this.icon_url = item.icon_url;
                this.tags = Item.copyOf(item.tags);
                this.score = item.score;
                this.star = item.star;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Item build(boolean z) {
            return new Item(this, z);
        }
    }
}
