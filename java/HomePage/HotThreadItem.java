package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HotThreadItem extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long comment_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long excid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pb_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long tag_code;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long zan_num;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_EXCID = 0L;
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final Integer DEFAULT_PB_TYPE = 0;
    public static final Long DEFAULT_ZAN_NUM = 0L;
    public static final Long DEFAULT_COMMENT_NUM = 0L;

    /* synthetic */ HotThreadItem(Builder builder, boolean z, HotThreadItem hotThreadItem) {
        this(builder, z);
    }

    private HotThreadItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.excid == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = builder.excid;
            }
            if (builder.tag_code == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = builder.tag_code;
            }
            if (builder.pb_type == null) {
                this.pb_type = DEFAULT_PB_TYPE;
            } else {
                this.pb_type = builder.pb_type;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder._abstract == null) {
                this._abstract = "";
            } else {
                this._abstract = builder._abstract;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.zan_num == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = builder.zan_num;
            }
            if (builder.comment_num == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
                return;
            } else {
                this.comment_num = builder.comment_num;
                return;
            }
        }
        this.tid = builder.tid;
        this.excid = builder.excid;
        this.tag_code = builder.tag_code;
        this.pb_type = builder.pb_type;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.forum_name = builder.forum_name;
        this.pic_url = builder.pic_url;
        this.zan_num = builder.zan_num;
        this.comment_num = builder.comment_num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HotThreadItem> {
        public String _abstract;
        public Long comment_num;
        public Long excid;
        public String forum_name;
        public Integer pb_type;
        public String pic_url;
        public Long tag_code;
        public Long tid;
        public String title;
        public Long zan_num;

        public Builder() {
        }

        public Builder(HotThreadItem hotThreadItem) {
            super(hotThreadItem);
            if (hotThreadItem != null) {
                this.tid = hotThreadItem.tid;
                this.excid = hotThreadItem.excid;
                this.tag_code = hotThreadItem.tag_code;
                this.pb_type = hotThreadItem.pb_type;
                this.title = hotThreadItem.title;
                this._abstract = hotThreadItem._abstract;
                this.forum_name = hotThreadItem.forum_name;
                this.pic_url = hotThreadItem.pic_url;
                this.zan_num = hotThreadItem.zan_num;
                this.comment_num = hotThreadItem.comment_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadItem build(boolean z) {
            return new HotThreadItem(this, z, null);
        }
    }
}
