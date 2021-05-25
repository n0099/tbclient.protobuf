package tbclient.GetGiftList;

import com.squareup.wire.Message;
/* loaded from: classes8.dex */
public final class Category extends Message {

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Category> {
        public Builder() {
        }

        public Builder(Category category) {
            super(category);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Category build(boolean z) {
            return new Category(this, z);
        }
    }

    public Category(Builder builder, boolean z) {
        super(builder);
    }
}
