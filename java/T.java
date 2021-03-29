package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class T extends Message {
    public static final String DEFAULT_DESCRIBE = "";
    public static final List<TwAnchorPKItem> DEFAULT_PK_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String describe;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TwAnchorPKItem> pk_list;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<T> {
        public String describe;
        public List<TwAnchorPKItem> pk_list;

        public Builder() {
        }

        public Builder(T t) {
            super(t);
            if (t == null) {
                return;
            }
            this.describe = t.describe;
            this.pk_list = Message.copyOf(t.pk_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public T build(boolean z) {
            return new T(this, z);
        }
    }

    public T(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.describe;
            if (str == null) {
                this.describe = "";
            } else {
                this.describe = str;
            }
            List<TwAnchorPKItem> list = builder.pk_list;
            if (list == null) {
                this.pk_list = DEFAULT_PK_LIST;
                return;
            } else {
                this.pk_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.describe = builder.describe;
        this.pk_list = Message.immutableCopyOf(builder.pk_list);
    }
}
