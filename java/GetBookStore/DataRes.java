package tbclient.GetBookStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Category> cartoon_category;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Shelf> my_shelf;
    public static final List<Shelf> DEFAULT_MY_SHELF = Collections.emptyList();
    public static final List<Category> DEFAULT_CARTOON_CATEGORY = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.my_shelf == null) {
                this.my_shelf = DEFAULT_MY_SHELF;
            } else {
                this.my_shelf = immutableCopyOf(builder.my_shelf);
            }
            if (builder.cartoon_category == null) {
                this.cartoon_category = DEFAULT_CARTOON_CATEGORY;
                return;
            } else {
                this.cartoon_category = immutableCopyOf(builder.cartoon_category);
                return;
            }
        }
        this.my_shelf = immutableCopyOf(builder.my_shelf);
        this.cartoon_category = immutableCopyOf(builder.cartoon_category);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<Category> cartoon_category;
        public List<Shelf> my_shelf;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.my_shelf = DataRes.copyOf(dataRes.my_shelf);
                this.cartoon_category = DataRes.copyOf(dataRes.cartoon_category);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
