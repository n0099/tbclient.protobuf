package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class ItemRankInfo extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Item> item_list;
    @ProtoField(tag = 1)
    public final FrsTabInfo tab_info;
    @ProtoField(tag = 3)
    public final ModuleTitleInfo title_info;
    public static final List<Item> DEFAULT_ITEM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ItemRankInfo> {
        public Integer has_more;
        public List<Item> item_list;
        public FrsTabInfo tab_info;
        public ModuleTitleInfo title_info;

        public Builder() {
        }

        public Builder(ItemRankInfo itemRankInfo) {
            super(itemRankInfo);
            if (itemRankInfo == null) {
                return;
            }
            this.tab_info = itemRankInfo.tab_info;
            this.item_list = Message.copyOf(itemRankInfo.item_list);
            this.title_info = itemRankInfo.title_info;
            this.has_more = itemRankInfo.has_more;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemRankInfo build(boolean z) {
            return new ItemRankInfo(this, z);
        }
    }

    public ItemRankInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.tab_info = builder.tab_info;
            List<Item> list = builder.item_list;
            if (list == null) {
                this.item_list = DEFAULT_ITEM_LIST;
            } else {
                this.item_list = Message.immutableCopyOf(list);
            }
            this.title_info = builder.title_info;
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.tab_info = builder.tab_info;
        this.item_list = Message.immutableCopyOf(builder.item_list);
        this.title_info = builder.title_info;
        this.has_more = builder.has_more;
    }
}
