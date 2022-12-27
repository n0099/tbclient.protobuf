package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Category extends Message {
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final List<String> DEFAULT_SECOND_CLASS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> second_class;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Category> {
        public String first_class;
        public List<String> second_class;

        public Builder() {
        }

        public Builder(Category category) {
            super(category);
            if (category == null) {
                return;
            }
            this.first_class = category.first_class;
            this.second_class = Message.copyOf(category.second_class);
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
            String str = builder.first_class;
            if (str == null) {
                this.first_class = "";
            } else {
                this.first_class = str;
            }
            List<String> list = builder.second_class;
            if (list == null) {
                this.second_class = DEFAULT_SECOND_CLASS;
                return;
            } else {
                this.second_class = Message.immutableCopyOf(list);
                return;
            }
        }
        this.first_class = builder.first_class;
        this.second_class = Message.immutableCopyOf(builder.second_class);
    }
}
