package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TagStruct extends Message {
    public static final Integer DEFAULT_SELECTED = 0;
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer selected;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tag_name;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TagStruct> {
        public Integer selected;
        public String tag_name;

        public Builder() {
        }

        public Builder(TagStruct tagStruct) {
            super(tagStruct);
            if (tagStruct == null) {
                return;
            }
            this.tag_name = tagStruct.tag_name;
            this.selected = tagStruct.selected;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagStruct build(boolean z) {
            return new TagStruct(this, z);
        }
    }

    public TagStruct(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tag_name;
            if (str == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str;
            }
            Integer num = builder.selected;
            if (num == null) {
                this.selected = DEFAULT_SELECTED;
                return;
            } else {
                this.selected = num;
                return;
            }
        }
        this.tag_name = builder.tag_name;
        this.selected = builder.selected;
    }
}
