package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
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
            if (itemInfo == null) {
                return;
            }
            this.id = itemInfo.id;
            this.name = itemInfo.name;
            this.icon_url = itemInfo.icon_url;
            this.brief = itemInfo.brief;
            this.tags = Message.copyOf(itemInfo.tags);
            this.icon_size = itemInfo.icon_size;
            this.item_options = Message.copyOf(itemInfo.item_options);
            this.score = itemInfo.score;
            this.is_school = itemInfo.is_school;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemInfo build(boolean z) {
            return new ItemInfo(this, z);
        }
    }

    public ItemInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            String str3 = builder.brief;
            if (str3 == null) {
                this.brief = "";
            } else {
                this.brief = str3;
            }
            List<String> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            Double d2 = builder.icon_size;
            if (d2 == null) {
                this.icon_size = DEFAULT_ICON_SIZE;
            } else {
                this.icon_size = d2;
            }
            List<ItemOptions> list2 = builder.item_options;
            if (list2 == null) {
                this.item_options = DEFAULT_ITEM_OPTIONS;
            } else {
                this.item_options = Message.immutableCopyOf(list2);
            }
            this.score = builder.score;
            Integer num2 = builder.is_school;
            if (num2 == null) {
                this.is_school = DEFAULT_IS_SCHOOL;
                return;
            } else {
                this.is_school = num2;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon_url = builder.icon_url;
        this.brief = builder.brief;
        this.tags = Message.immutableCopyOf(builder.tags);
        this.icon_size = builder.icon_size;
        this.item_options = Message.immutableCopyOf(builder.item_options);
        this.score = builder.score;
        this.is_school = builder.is_school;
    }
}
