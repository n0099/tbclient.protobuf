package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class BusinessPromot extends Message {
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_IMG_POPUP = "";
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

    private BusinessPromot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.img == null) {
                this.img = "";
            } else {
                this.img = builder.img;
            }
            if (builder.img_popup == null) {
                this.img_popup = "";
            } else {
                this.img_popup = builder.img_popup;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.thread_id == null) {
                this.thread_id = "";
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.join_num == null) {
                this.join_num = DEFAULT_JOIN_NUM;
            } else {
                this.join_num = builder.join_num;
            }
            if (builder.comment_list == null) {
                this.comment_list = DEFAULT_COMMENT_LIST;
            } else {
                this.comment_list = immutableCopyOf(builder.comment_list);
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
                return;
            } else {
                this.thread_type = builder.thread_type;
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
        this.comment_list = immutableCopyOf(builder.comment_list);
        this.id = builder.id;
        this.thread_type = builder.thread_type;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<BusinessPromot> {
        public List<BusinessPromotCommentList> comment_list;
        public Long id;
        public String img;
        public String img_popup;
        public Integer join_num;
        public String thread_id;
        public Integer thread_type;
        public String title;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(BusinessPromot businessPromot) {
            super(businessPromot);
            if (businessPromot != null) {
                this.title = businessPromot.title;
                this.img = businessPromot.img;
                this.img_popup = businessPromot.img_popup;
                this.type = businessPromot.type;
                this.thread_id = businessPromot.thread_id;
                this.url = businessPromot.url;
                this.join_num = businessPromot.join_num;
                this.comment_list = BusinessPromot.copyOf(businessPromot.comment_list);
                this.id = businessPromot.id;
                this.thread_type = businessPromot.thread_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromot build(boolean z) {
            return new BusinessPromot(this, z);
        }
    }
}
