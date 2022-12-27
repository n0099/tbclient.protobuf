package tbclient.GetRecentWatchRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Tag extends Message {
    public static final Integer DEFAULT_TAG_TYPE = 0;
    public static final String DEFAULT_TAG_WORD = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tag_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tag_word;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Tag> {
        public Integer tag_type;
        public String tag_word;

        public Builder() {
        }

        public Builder(Tag tag) {
            super(tag);
            if (tag == null) {
                return;
            }
            this.tag_word = tag.tag_word;
            this.tag_type = tag.tag_type;
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
            String str = builder.tag_word;
            if (str == null) {
                this.tag_word = "";
            } else {
                this.tag_word = str;
            }
            Integer num = builder.tag_type;
            if (num == null) {
                this.tag_type = DEFAULT_TAG_TYPE;
                return;
            } else {
                this.tag_type = num;
                return;
            }
        }
        this.tag_word = builder.tag_word;
        this.tag_type = builder.tag_type;
    }
}
