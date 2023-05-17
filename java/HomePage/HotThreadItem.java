package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
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

    /* loaded from: classes10.dex */
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
            if (hotThreadItem == null) {
                return;
            }
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

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadItem build(boolean z) {
            return new HotThreadItem(this, z);
        }
    }

    public HotThreadItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            Long l2 = builder.excid;
            if (l2 == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = l2;
            }
            Long l3 = builder.tag_code;
            if (l3 == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = l3;
            }
            Integer num = builder.pb_type;
            if (num == null) {
                this.pb_type = DEFAULT_PB_TYPE;
            } else {
                this.pb_type = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            String str3 = builder.forum_name;
            if (str3 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str3;
            }
            String str4 = builder.pic_url;
            if (str4 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str4;
            }
            Long l4 = builder.zan_num;
            if (l4 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = l4;
            }
            Long l5 = builder.comment_num;
            if (l5 == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
                return;
            } else {
                this.comment_num = l5;
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
}
