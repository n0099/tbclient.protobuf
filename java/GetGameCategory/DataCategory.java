package tbclient.GetGameCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataCategory extends Message {
    public static final List<CategoryList> DEFAULT_CATEGORY_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<CategoryList> category_list;

    /* synthetic */ DataCategory(Builder builder, boolean z, DataCategory dataCategory) {
        this(builder, z);
    }

    private DataCategory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.category_list == null) {
                this.category_list = DEFAULT_CATEGORY_LIST;
                return;
            } else {
                this.category_list = immutableCopyOf(builder.category_list);
                return;
            }
        }
        this.category_list = immutableCopyOf(builder.category_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataCategory> {
        public List<CategoryList> category_list;

        public Builder(DataCategory dataCategory) {
            super(dataCategory);
            if (dataCategory != null) {
                this.category_list = DataCategory.copyOf(dataCategory.category_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataCategory build(boolean z) {
            return new DataCategory(this, z, null);
        }
    }
}
