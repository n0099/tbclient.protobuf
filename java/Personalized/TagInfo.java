package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TagInfo extends Message {
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer tag_type;
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final Integer DEFAULT_TAG_TYPE = 0;

    /* synthetic */ TagInfo(Builder builder, boolean z, TagInfo tagInfo) {
        this(builder, z);
    }

    private TagInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tag_code == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = builder.tag_code;
            }
            if (builder.tag_name == null) {
                this.tag_name = "";
            } else {
                this.tag_name = builder.tag_name;
            }
            if (builder.tag_type == null) {
                this.tag_type = DEFAULT_TAG_TYPE;
                return;
            } else {
                this.tag_type = builder.tag_type;
                return;
            }
        }
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.tag_type = builder.tag_type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public Long tag_code;
        public String tag_name;
        public Integer tag_type;

        public Builder() {
        }

        public Builder(TagInfo tagInfo) {
            super(tagInfo);
            if (tagInfo != null) {
                this.tag_code = tagInfo.tag_code;
                this.tag_name = tagInfo.tag_name;
                this.tag_type = tagInfo.tag_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagInfo build(boolean z) {
            return new TagInfo(this, z, null);
        }
    }
}
