package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class TagInfo extends Message {
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer color;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer hot_value;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer influence;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer op_time;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer relation_weight;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tag_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer tag_level;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer tag_type;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_TAG_ID = 0;
    public static final Integer DEFAULT_COLOR = 0;
    public static final Integer DEFAULT_HOT_VALUE = 0;
    public static final Integer DEFAULT_TAG_TYPE = 0;
    public static final Integer DEFAULT_TAG_LEVEL = 0;
    public static final Integer DEFAULT_INFLUENCE = 0;
    public static final Integer DEFAULT_RELATION_WEIGHT = 0;
    public static final Integer DEFAULT_OP_TIME = 0;

    private TagInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.tag_id == null) {
                this.tag_id = DEFAULT_TAG_ID;
            } else {
                this.tag_id = builder.tag_id;
            }
            if (builder.tag_name == null) {
                this.tag_name = "";
            } else {
                this.tag_name = builder.tag_name;
            }
            if (builder.color == null) {
                this.color = DEFAULT_COLOR;
            } else {
                this.color = builder.color;
            }
            if (builder.hot_value == null) {
                this.hot_value = DEFAULT_HOT_VALUE;
            } else {
                this.hot_value = builder.hot_value;
            }
            if (builder.tag_type == null) {
                this.tag_type = DEFAULT_TAG_TYPE;
            } else {
                this.tag_type = builder.tag_type;
            }
            if (builder.tag_level == null) {
                this.tag_level = DEFAULT_TAG_LEVEL;
            } else {
                this.tag_level = builder.tag_level;
            }
            if (builder.influence == null) {
                this.influence = DEFAULT_INFLUENCE;
            } else {
                this.influence = builder.influence;
            }
            if (builder.relation_weight == null) {
                this.relation_weight = DEFAULT_RELATION_WEIGHT;
            } else {
                this.relation_weight = builder.relation_weight;
            }
            if (builder.op_time == null) {
                this.op_time = DEFAULT_OP_TIME;
                return;
            } else {
                this.op_time = builder.op_time;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.tag_id = builder.tag_id;
        this.tag_name = builder.tag_name;
        this.color = builder.color;
        this.hot_value = builder.hot_value;
        this.tag_type = builder.tag_type;
        this.tag_level = builder.tag_level;
        this.influence = builder.influence;
        this.relation_weight = builder.relation_weight;
        this.op_time = builder.op_time;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public Integer color;
        public Long forum_id;
        public Integer hot_value;
        public Integer influence;
        public Integer op_time;
        public Integer relation_weight;
        public Integer tag_id;
        public Integer tag_level;
        public String tag_name;
        public Integer tag_type;

        public Builder() {
        }

        public Builder(TagInfo tagInfo) {
            super(tagInfo);
            if (tagInfo != null) {
                this.forum_id = tagInfo.forum_id;
                this.tag_id = tagInfo.tag_id;
                this.tag_name = tagInfo.tag_name;
                this.color = tagInfo.color;
                this.hot_value = tagInfo.hot_value;
                this.tag_type = tagInfo.tag_type;
                this.tag_level = tagInfo.tag_level;
                this.influence = tagInfo.influence;
                this.relation_weight = tagInfo.relation_weight;
                this.op_time = tagInfo.op_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagInfo build(boolean z) {
            return new TagInfo(this, z);
        }
    }
}
