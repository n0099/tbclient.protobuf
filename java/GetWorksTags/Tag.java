package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Tag extends Message {
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final String DEFAULT_SECOND_CLASS = "";
    public static final List<String> DEFAULT_TAGS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String second_class;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> tags;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Tag> {
        public String first_class;
        public String second_class;
        public List<String> tags;

        public Builder() {
        }

        public Builder(Tag tag) {
            super(tag);
            if (tag == null) {
                return;
            }
            this.first_class = tag.first_class;
            this.second_class = tag.second_class;
            this.tags = Message.copyOf(tag.tags);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Tag build(boolean z) {
            return new Tag(this, z);
        }
    }

    public Tag(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.first_class;
            if (str == null) {
                this.first_class = "";
            } else {
                this.first_class = str;
            }
            String str2 = builder.second_class;
            if (str2 == null) {
                this.second_class = "";
            } else {
                this.second_class = str2;
            }
            List<String> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
                return;
            } else {
                this.tags = Message.immutableCopyOf(list);
                return;
            }
        }
        this.first_class = builder.first_class;
        this.second_class = builder.second_class;
        this.tags = Message.immutableCopyOf(builder.tags);
    }
}
