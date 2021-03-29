package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class ItemTable extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer comment_star;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_commented;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ItemPlot> item_plot;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<ItemPoint> item_point;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer total_point_num;
    public static final Integer DEFAULT_IS_COMMENTED = 0;
    public static final Integer DEFAULT_COMMENT_STAR = 0;
    public static final Integer DEFAULT_TOTAL_POINT_NUM = 0;
    public static final List<ItemPoint> DEFAULT_ITEM_POINT = Collections.emptyList();
    public static final List<ItemPlot> DEFAULT_ITEM_PLOT = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ItemTable> {
        public Integer comment_star;
        public Integer is_commented;
        public List<ItemPlot> item_plot;
        public List<ItemPoint> item_point;
        public Integer total_point_num;

        public Builder() {
        }

        public Builder(ItemTable itemTable) {
            super(itemTable);
            if (itemTable == null) {
                return;
            }
            this.is_commented = itemTable.is_commented;
            this.comment_star = itemTable.comment_star;
            this.total_point_num = itemTable.total_point_num;
            this.item_point = Message.copyOf(itemTable.item_point);
            this.item_plot = Message.copyOf(itemTable.item_plot);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemTable build(boolean z) {
            return new ItemTable(this, z);
        }
    }

    public ItemTable(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_commented;
            if (num == null) {
                this.is_commented = DEFAULT_IS_COMMENTED;
            } else {
                this.is_commented = num;
            }
            Integer num2 = builder.comment_star;
            if (num2 == null) {
                this.comment_star = DEFAULT_COMMENT_STAR;
            } else {
                this.comment_star = num2;
            }
            Integer num3 = builder.total_point_num;
            if (num3 == null) {
                this.total_point_num = DEFAULT_TOTAL_POINT_NUM;
            } else {
                this.total_point_num = num3;
            }
            List<ItemPoint> list = builder.item_point;
            if (list == null) {
                this.item_point = DEFAULT_ITEM_POINT;
            } else {
                this.item_point = Message.immutableCopyOf(list);
            }
            List<ItemPlot> list2 = builder.item_plot;
            if (list2 == null) {
                this.item_plot = DEFAULT_ITEM_PLOT;
                return;
            } else {
                this.item_plot = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.is_commented = builder.is_commented;
        this.comment_star = builder.comment_star;
        this.total_point_num = builder.total_point_num;
        this.item_point = Message.immutableCopyOf(builder.item_point);
        this.item_plot = Message.immutableCopyOf(builder.item_plot);
    }
}
