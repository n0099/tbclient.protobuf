package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TagInfo extends Message {
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer is_followed;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tag_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tag_name;
    public static final Integer DEFAULT_TAG_ID = 0;
    public static final Integer DEFAULT_IS_FOLLOWED = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public Integer is_followed;
        public Integer tag_id;
        public String tag_name;

        public Builder() {
        }

        public Builder(TagInfo tagInfo) {
            super(tagInfo);
            if (tagInfo == null) {
                return;
            }
            this.tag_name = tagInfo.tag_name;
            this.tag_id = tagInfo.tag_id;
            this.is_followed = tagInfo.is_followed;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagInfo build(boolean z) {
            return new TagInfo(this, z);
        }
    }

    public TagInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tag_name;
            if (str == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str;
            }
            Integer num = builder.tag_id;
            if (num == null) {
                this.tag_id = DEFAULT_TAG_ID;
            } else {
                this.tag_id = num;
            }
            Integer num2 = builder.is_followed;
            if (num2 == null) {
                this.is_followed = DEFAULT_IS_FOLLOWED;
                return;
            } else {
                this.is_followed = num2;
                return;
            }
        }
        this.tag_name = builder.tag_name;
        this.tag_id = builder.tag_id;
        this.is_followed = builder.is_followed;
    }
}
