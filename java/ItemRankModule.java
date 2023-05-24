package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class ItemRankModule extends Message {
    public static final String DEFAULT_RANK_CODE = "";
    public static final List<ItemRankInfo> DEFAULT_RANK_LIST = Collections.emptyList();
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String rank_code;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ItemRankInfo> rank_list;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ItemRankModule> {
        public String rank_code;
        public List<ItemRankInfo> rank_list;

        public Builder() {
        }

        public Builder(ItemRankModule itemRankModule) {
            super(itemRankModule);
            if (itemRankModule == null) {
                return;
            }
            this.rank_list = Message.copyOf(itemRankModule.rank_list);
            this.rank_code = itemRankModule.rank_code;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemRankModule build(boolean z) {
            return new ItemRankModule(this, z);
        }
    }

    public ItemRankModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ItemRankInfo> list = builder.rank_list;
            if (list == null) {
                this.rank_list = DEFAULT_RANK_LIST;
            } else {
                this.rank_list = Message.immutableCopyOf(list);
            }
            String str = builder.rank_code;
            if (str == null) {
                this.rank_code = "";
                return;
            } else {
                this.rank_code = str;
                return;
            }
        }
        this.rank_list = Message.immutableCopyOf(builder.rank_list);
        this.rank_code = builder.rank_code;
    }
}
