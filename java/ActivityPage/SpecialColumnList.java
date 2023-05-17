package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class SpecialColumnList extends Message {
    public static final Integer DEFAULT_FLOOR_POSITION = 0;
    public static final List<SpecialColumn> DEFAULT_ITEM_LIST = Collections.emptyList();
    public static final String DEFAULT_SPECIAL_COLUMN_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer floor_position;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<SpecialColumn> item_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String special_column_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<SpecialColumnList> {
        public Integer floor_position;
        public List<SpecialColumn> item_list;
        public String special_column_name;

        public Builder() {
        }

        public Builder(SpecialColumnList specialColumnList) {
            super(specialColumnList);
            if (specialColumnList == null) {
                return;
            }
            this.floor_position = specialColumnList.floor_position;
            this.special_column_name = specialColumnList.special_column_name;
            this.item_list = Message.copyOf(specialColumnList.item_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpecialColumnList build(boolean z) {
            return new SpecialColumnList(this, z);
        }
    }

    public SpecialColumnList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.floor_position;
            if (num == null) {
                this.floor_position = DEFAULT_FLOOR_POSITION;
            } else {
                this.floor_position = num;
            }
            String str = builder.special_column_name;
            if (str == null) {
                this.special_column_name = "";
            } else {
                this.special_column_name = str;
            }
            List<SpecialColumn> list = builder.item_list;
            if (list == null) {
                this.item_list = DEFAULT_ITEM_LIST;
                return;
            } else {
                this.item_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.floor_position = builder.floor_position;
        this.special_column_name = builder.special_column_name;
        this.item_list = Message.immutableCopyOf(builder.item_list);
    }
}
