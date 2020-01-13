package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class TagInfo extends Message {
    public static final String DEFAULT_LEGO_QS = "";
    public static final String DEFAULT_STAT_KEY = "";
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long lego_page_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String lego_qs;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String stat_key;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer tag_type;
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final Integer DEFAULT_TAG_TYPE = 0;
    public static final Long DEFAULT_LEGO_PAGE_ID = 0L;

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
            } else {
                this.tag_type = builder.tag_type;
            }
            if (builder.stat_key == null) {
                this.stat_key = "";
            } else {
                this.stat_key = builder.stat_key;
            }
            if (builder.lego_page_id == null) {
                this.lego_page_id = DEFAULT_LEGO_PAGE_ID;
            } else {
                this.lego_page_id = builder.lego_page_id;
            }
            if (builder.lego_qs == null) {
                this.lego_qs = "";
                return;
            } else {
                this.lego_qs = builder.lego_qs;
                return;
            }
        }
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.tag_type = builder.tag_type;
        this.stat_key = builder.stat_key;
        this.lego_page_id = builder.lego_page_id;
        this.lego_qs = builder.lego_qs;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public Long lego_page_id;
        public String lego_qs;
        public String stat_key;
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
                this.stat_key = tagInfo.stat_key;
                this.lego_page_id = tagInfo.lego_page_id;
                this.lego_qs = tagInfo.lego_qs;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagInfo build(boolean z) {
            return new TagInfo(this, z);
        }
    }
}
