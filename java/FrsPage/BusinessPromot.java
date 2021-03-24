package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BusinessPromot extends Message {
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_IMG_POPUP = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_THREAD_ID = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<BusinessPromotCommentList> comment_list;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_popup;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer join_num;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_JOIN_NUM = 0;
    public static final List<BusinessPromotCommentList> DEFAULT_COMMENT_LIST = Collections.emptyList();
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<BusinessPromot> {
        public List<BusinessPromotCommentList> comment_list;
        public Long id;
        public String img;
        public String img_popup;
        public Integer join_num;
        public String schema;
        public String thread_id;
        public Integer thread_type;
        public String title;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(BusinessPromot businessPromot) {
            super(businessPromot);
            if (businessPromot == null) {
                return;
            }
            this.title = businessPromot.title;
            this.img = businessPromot.img;
            this.img_popup = businessPromot.img_popup;
            this.type = businessPromot.type;
            this.thread_id = businessPromot.thread_id;
            this.url = businessPromot.url;
            this.join_num = businessPromot.join_num;
            this.comment_list = Message.copyOf(businessPromot.comment_list);
            this.id = businessPromot.id;
            this.thread_type = businessPromot.thread_type;
            this.schema = businessPromot.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromot build(boolean z) {
            return new BusinessPromot(this, z);
        }
    }

    public BusinessPromot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.img;
            if (str2 == null) {
                this.img = "";
            } else {
                this.img = str2;
            }
            String str3 = builder.img_popup;
            if (str3 == null) {
                this.img_popup = "";
            } else {
                this.img_popup = str3;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str4 = builder.thread_id;
            if (str4 == null) {
                this.thread_id = "";
            } else {
                this.thread_id = str4;
            }
            String str5 = builder.url;
            if (str5 == null) {
                this.url = "";
            } else {
                this.url = str5;
            }
            Integer num2 = builder.join_num;
            if (num2 == null) {
                this.join_num = DEFAULT_JOIN_NUM;
            } else {
                this.join_num = num2;
            }
            List<BusinessPromotCommentList> list = builder.comment_list;
            if (list == null) {
                this.comment_list = DEFAULT_COMMENT_LIST;
            } else {
                this.comment_list = Message.immutableCopyOf(list);
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            String str6 = builder.schema;
            if (str6 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str6;
                return;
            }
        }
        this.title = builder.title;
        this.img = builder.img;
        this.img_popup = builder.img_popup;
        this.type = builder.type;
        this.thread_id = builder.thread_id;
        this.url = builder.url;
        this.join_num = builder.join_num;
        this.comment_list = Message.immutableCopyOf(builder.comment_list);
        this.id = builder.id;
        this.thread_type = builder.thread_type;
        this.schema = builder.schema;
    }
}
