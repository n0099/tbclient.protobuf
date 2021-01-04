package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CategoryInfo extends Message {
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    public static final String DEFAULT_CATEGORY_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer category_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String category_name;

    private CategoryInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.category_id == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = builder.category_id;
            }
            if (builder.category_name == null) {
                this.category_name = "";
                return;
            } else {
                this.category_name = builder.category_name;
                return;
            }
        }
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CategoryInfo> {
        public Integer category_id;
        public String category_name;

        public Builder() {
        }

        public Builder(CategoryInfo categoryInfo) {
            super(categoryInfo);
            if (categoryInfo != null) {
                this.category_id = categoryInfo.category_id;
                this.category_name = categoryInfo.category_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CategoryInfo build(boolean z) {
            return new CategoryInfo(this, z);
        }
    }
}
