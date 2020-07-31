package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class ItemInfo extends Message {
    public static final String DEFAULT_BRIEF = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double icon_size;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer is_school;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ItemOptions> item_options;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 8)
    public final ItemTable score;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> tags;
    public static final Integer DEFAULT_ID = 0;
    public static final List<String> DEFAULT_TAGS = Collections.emptyList();
    public static final Double DEFAULT_ICON_SIZE = Double.valueOf(0.0d);
    public static final List<ItemOptions> DEFAULT_ITEM_OPTIONS = Collections.emptyList();
    public static final Integer DEFAULT_IS_SCHOOL = 0;

    private ItemInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.brief == null) {
                this.brief = "";
            } else {
                this.brief = builder.brief;
            }
            if (builder.tags == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = immutableCopyOf(builder.tags);
            }
            if (builder.icon_size == null) {
                this.icon_size = DEFAULT_ICON_SIZE;
            } else {
                this.icon_size = builder.icon_size;
            }
            if (builder.item_options == null) {
                this.item_options = DEFAULT_ITEM_OPTIONS;
            } else {
                this.item_options = immutableCopyOf(builder.item_options);
            }
            this.score = builder.score;
            if (builder.is_school == null) {
                this.is_school = DEFAULT_IS_SCHOOL;
                return;
            } else {
                this.is_school = builder.is_school;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon_url = builder.icon_url;
        this.brief = builder.brief;
        this.tags = immutableCopyOf(builder.tags);
        this.icon_size = builder.icon_size;
        this.item_options = immutableCopyOf(builder.item_options);
        this.score = builder.score;
        this.is_school = builder.is_school;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ItemInfo> {
        public String brief;
        public Double icon_size;
        public String icon_url;
        public Integer id;
        public Integer is_school;
        public List<ItemOptions> item_options;
        public String name;
        public ItemTable score;
        public List<String> tags;

        public Builder() {
        }

        public Builder(ItemInfo itemInfo) {
            super(itemInfo);
            if (itemInfo != null) {
                this.id = itemInfo.id;
                this.name = itemInfo.name;
                this.icon_url = itemInfo.icon_url;
                this.brief = itemInfo.brief;
                this.tags = ItemInfo.copyOf(itemInfo.tags);
                this.icon_size = itemInfo.icon_size;
                this.item_options = ItemInfo.copyOf(itemInfo.item_options);
                this.score = itemInfo.score;
                this.is_school = itemInfo.is_school;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemInfo build(boolean z) {
            return new ItemInfo(this, z);
        }
    }
}
