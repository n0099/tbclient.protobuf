package tbclient.GetBookStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Category extends Message {
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    public static final String DEFAULT_CATEGORY_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer category_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String category_text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Category> {
        public Integer category_id;
        public String category_text;

        public Builder() {
        }

        public Builder(Category category) {
            super(category);
            if (category == null) {
                return;
            }
            this.category_id = category.category_id;
            this.category_text = category.category_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Category build(boolean z) {
            return new Category(this, z);
        }
    }

    public Category(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.category_id;
            if (num == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num;
            }
            String str = builder.category_text;
            if (str == null) {
                this.category_text = "";
                return;
            } else {
                this.category_text = str;
                return;
            }
        }
        this.category_id = builder.category_id;
        this.category_text = builder.category_text;
    }
}
