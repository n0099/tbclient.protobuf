package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final List<Category> DEFAULT_CATEGORY = Collections.emptyList();
    public static final List<Tag> DEFAULT_TAGS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Category> category;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Tag> tags;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<Category> category;
        public List<Tag> tags;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.category = Message.copyOf(dataRes.category);
            this.tags = Message.copyOf(dataRes.tags);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Category> list = builder.category;
            if (list == null) {
                this.category = DEFAULT_CATEGORY;
            } else {
                this.category = Message.immutableCopyOf(list);
            }
            List<Tag> list2 = builder.tags;
            if (list2 == null) {
                this.tags = DEFAULT_TAGS;
                return;
            } else {
                this.tags = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.category = Message.immutableCopyOf(builder.category);
        this.tags = Message.immutableCopyOf(builder.tags);
    }
}
