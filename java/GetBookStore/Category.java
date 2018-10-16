package tbclient.GetBookStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class Category extends Message {
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    public static final String DEFAULT_CATEGORY_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer category_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String category_text;

    private Category(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.category_id == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = builder.category_id;
            }
            if (builder.category_text == null) {
                this.category_text = "";
                return;
            } else {
                this.category_text = builder.category_text;
                return;
            }
        }
        this.category_id = builder.category_id;
        this.category_text = builder.category_text;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Category> {
        public Integer category_id;
        public String category_text;

        public Builder() {
        }

        public Builder(Category category) {
            super(category);
            if (category != null) {
                this.category_id = category.category_id;
                this.category_text = category.category_text;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Category build(boolean z) {
            return new Category(this, z);
        }
    }
}
