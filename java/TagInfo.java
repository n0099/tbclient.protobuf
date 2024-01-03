package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TagInfo extends Message {
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer rank_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_name;
    public static final Integer DEFAULT_RANK_TYPE = 0;
    public static final Integer DEFAULT_CLASS_ID = 0;
    public static final Integer DEFAULT_TAB_ID = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public Integer class_id;
        public Integer rank_type;
        public Integer tab_id;
        public String tag_name;

        public Builder() {
        }

        public Builder(TagInfo tagInfo) {
            super(tagInfo);
            if (tagInfo == null) {
                return;
            }
            this.rank_type = tagInfo.rank_type;
            this.class_id = tagInfo.class_id;
            this.tab_id = tagInfo.tab_id;
            this.tag_name = tagInfo.tag_name;
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
            Integer num = builder.rank_type;
            if (num == null) {
                this.rank_type = DEFAULT_RANK_TYPE;
            } else {
                this.rank_type = num;
            }
            Integer num2 = builder.class_id;
            if (num2 == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = num2;
            }
            Integer num3 = builder.tab_id;
            if (num3 == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num3;
            }
            String str = builder.tag_name;
            if (str == null) {
                this.tag_name = "";
                return;
            } else {
                this.tag_name = str;
                return;
            }
        }
        this.rank_type = builder.rank_type;
        this.class_id = builder.class_id;
        this.tab_id = builder.tab_id;
        this.tag_name = builder.tag_name;
    }
}
