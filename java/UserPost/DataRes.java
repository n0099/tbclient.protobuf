package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PostInfoList;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long ctime;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer hide_post;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long logid;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer mask_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PostInfoList> post_list;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer reddot_deleted_thread;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long time;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer view_card_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
    public final List<String> week_forum_list;
    public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HIDE_POST = 0;
    public static final Long DEFAULT_TIME = 0L;
    public static final Long DEFAULT_CTIME = 0L;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_MASK_TYPE = 0;
    public static final Integer DEFAULT_VIEW_CARD_NUM = 0;
    public static final Integer DEFAULT_REDDOT_DELETED_THREAD = 0;
    public static final List<String> DEFAULT_WEEK_FORUM_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long ctime;
        public Integer hide_post;
        public Long logid;
        public Integer mask_type;
        public List<PostInfoList> post_list;
        public Integer reddot_deleted_thread;
        public Long time;
        public Integer view_card_num;
        public List<String> week_forum_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.post_list = Message.copyOf(dataRes.post_list);
            this.hide_post = dataRes.hide_post;
            this.time = dataRes.time;
            this.ctime = dataRes.ctime;
            this.logid = dataRes.logid;
            this.mask_type = dataRes.mask_type;
            this.view_card_num = dataRes.view_card_num;
            this.reddot_deleted_thread = dataRes.reddot_deleted_thread;
            this.week_forum_list = Message.copyOf(dataRes.week_forum_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<PostInfoList> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.hide_post;
            if (num == null) {
                this.hide_post = DEFAULT_HIDE_POST;
            } else {
                this.hide_post = num;
            }
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            Long l2 = builder.ctime;
            if (l2 == null) {
                this.ctime = DEFAULT_CTIME;
            } else {
                this.ctime = l2;
            }
            Long l3 = builder.logid;
            if (l3 == null) {
                this.logid = DEFAULT_LOGID;
            } else {
                this.logid = l3;
            }
            Integer num2 = builder.mask_type;
            if (num2 == null) {
                this.mask_type = DEFAULT_MASK_TYPE;
            } else {
                this.mask_type = num2;
            }
            Integer num3 = builder.view_card_num;
            if (num3 == null) {
                this.view_card_num = DEFAULT_VIEW_CARD_NUM;
            } else {
                this.view_card_num = num3;
            }
            Integer num4 = builder.reddot_deleted_thread;
            if (num4 == null) {
                this.reddot_deleted_thread = DEFAULT_REDDOT_DELETED_THREAD;
            } else {
                this.reddot_deleted_thread = num4;
            }
            List<String> list2 = builder.week_forum_list;
            if (list2 == null) {
                this.week_forum_list = DEFAULT_WEEK_FORUM_LIST;
                return;
            } else {
                this.week_forum_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.hide_post = builder.hide_post;
        this.time = builder.time;
        this.ctime = builder.ctime;
        this.logid = builder.logid;
        this.mask_type = builder.mask_type;
        this.view_card_num = builder.view_card_num;
        this.reddot_deleted_thread = builder.reddot_deleted_thread;
        this.week_forum_list = Message.immutableCopyOf(builder.week_forum_list);
    }
}
