package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class ZhiBoInfoTW extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FIELD_EX = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_LIVECOVER_SRC = "";
    public static final String DEFAULT_LIVECOVER_SRC_BSIZE = "";
    public static final String DEFAULT_LIVECOVER_SRC_STATUS = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 20, type = Message.Datatype.UINT32)
    public final Integer copythread_remind;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String field_ex;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer freq_num;
    @ProtoField(tag = 13)
    public final HotTWThreadInfo hot_tw_info;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer is_copytwzhibo;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer is_headline;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<LabelInfo> labelInfo;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long last_modified_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String livecover_src;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String livecover_src_bsize;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String livecover_src_status;
    @ProtoField(tag = 18)
    public final LiveCoverStatus livecover_status;
    @ProtoField(tag = 16)
    public final NoticeInfo notice_info;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer post_num;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer reply_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 12)
    public final User user;
    @ProtoField(tag = 6)
    public final Zan zan;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_LAST_MODIFIED_TIME = 0L;
    public static final List<LabelInfo> DEFAULT_LABELINFO = Collections.emptyList();
    public static final Integer DEFAULT_IS_HEADLINE = 0;
    public static final Integer DEFAULT_FREQ_NUM = 0;
    public static final Integer DEFAULT_COPYTHREAD_REMIND = 0;
    public static final Integer DEFAULT_IS_COPYTWZHIBO = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ZhiBoInfoTW> {
        public String content;
        public Integer copythread_remind;
        public String field_ex;
        public Long forum_id;
        public String forum_name;
        public Integer freq_num;
        public HotTWThreadInfo hot_tw_info;
        public Integer is_copytwzhibo;
        public Integer is_headline;
        public List<LabelInfo> labelInfo;
        public Long last_modified_time;
        public String livecover_src;
        public String livecover_src_bsize;
        public String livecover_src_status;
        public LiveCoverStatus livecover_status;
        public NoticeInfo notice_info;
        public Integer post_num;
        public Integer reply_num;
        public Long thread_id;
        public String title;
        public User user;
        public Zan zan;

        public Builder() {
        }

        public Builder(ZhiBoInfoTW zhiBoInfoTW) {
            super(zhiBoInfoTW);
            if (zhiBoInfoTW == null) {
                return;
            }
            this.thread_id = zhiBoInfoTW.thread_id;
            this.livecover_src = zhiBoInfoTW.livecover_src;
            this.livecover_src_bsize = zhiBoInfoTW.livecover_src_bsize;
            this.post_num = zhiBoInfoTW.post_num;
            this.reply_num = zhiBoInfoTW.reply_num;
            this.zan = zhiBoInfoTW.zan;
            this.forum_name = zhiBoInfoTW.forum_name;
            this.forum_id = zhiBoInfoTW.forum_id;
            this.last_modified_time = zhiBoInfoTW.last_modified_time;
            this.title = zhiBoInfoTW.title;
            this.content = zhiBoInfoTW.content;
            this.user = zhiBoInfoTW.user;
            this.hot_tw_info = zhiBoInfoTW.hot_tw_info;
            this.labelInfo = Message.copyOf(zhiBoInfoTW.labelInfo);
            this.livecover_src_status = zhiBoInfoTW.livecover_src_status;
            this.notice_info = zhiBoInfoTW.notice_info;
            this.is_headline = zhiBoInfoTW.is_headline;
            this.livecover_status = zhiBoInfoTW.livecover_status;
            this.freq_num = zhiBoInfoTW.freq_num;
            this.copythread_remind = zhiBoInfoTW.copythread_remind;
            this.is_copytwzhibo = zhiBoInfoTW.is_copytwzhibo;
            this.field_ex = zhiBoInfoTW.field_ex;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ZhiBoInfoTW build(boolean z) {
            return new ZhiBoInfoTW(this, z);
        }
    }

    public ZhiBoInfoTW(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            String str = builder.livecover_src;
            if (str == null) {
                this.livecover_src = "";
            } else {
                this.livecover_src = str;
            }
            String str2 = builder.livecover_src_bsize;
            if (str2 == null) {
                this.livecover_src_bsize = "";
            } else {
                this.livecover_src_bsize = str2;
            }
            Integer num = builder.post_num;
            if (num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num;
            }
            Integer num2 = builder.reply_num;
            if (num2 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num2;
            }
            this.zan = builder.zan;
            String str3 = builder.forum_name;
            if (str3 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str3;
            }
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l2;
            }
            Long l3 = builder.last_modified_time;
            if (l3 == null) {
                this.last_modified_time = DEFAULT_LAST_MODIFIED_TIME;
            } else {
                this.last_modified_time = l3;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
            } else {
                this.title = str4;
            }
            String str5 = builder.content;
            if (str5 == null) {
                this.content = "";
            } else {
                this.content = str5;
            }
            this.user = builder.user;
            this.hot_tw_info = builder.hot_tw_info;
            List<LabelInfo> list = builder.labelInfo;
            if (list == null) {
                this.labelInfo = DEFAULT_LABELINFO;
            } else {
                this.labelInfo = Message.immutableCopyOf(list);
            }
            String str6 = builder.livecover_src_status;
            if (str6 == null) {
                this.livecover_src_status = "";
            } else {
                this.livecover_src_status = str6;
            }
            this.notice_info = builder.notice_info;
            Integer num3 = builder.is_headline;
            if (num3 == null) {
                this.is_headline = DEFAULT_IS_HEADLINE;
            } else {
                this.is_headline = num3;
            }
            this.livecover_status = builder.livecover_status;
            Integer num4 = builder.freq_num;
            if (num4 == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = num4;
            }
            Integer num5 = builder.copythread_remind;
            if (num5 == null) {
                this.copythread_remind = DEFAULT_COPYTHREAD_REMIND;
            } else {
                this.copythread_remind = num5;
            }
            Integer num6 = builder.is_copytwzhibo;
            if (num6 == null) {
                this.is_copytwzhibo = DEFAULT_IS_COPYTWZHIBO;
            } else {
                this.is_copytwzhibo = num6;
            }
            String str7 = builder.field_ex;
            if (str7 == null) {
                this.field_ex = "";
                return;
            } else {
                this.field_ex = str7;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.livecover_src = builder.livecover_src;
        this.livecover_src_bsize = builder.livecover_src_bsize;
        this.post_num = builder.post_num;
        this.reply_num = builder.reply_num;
        this.zan = builder.zan;
        this.forum_name = builder.forum_name;
        this.forum_id = builder.forum_id;
        this.last_modified_time = builder.last_modified_time;
        this.title = builder.title;
        this.content = builder.content;
        this.user = builder.user;
        this.hot_tw_info = builder.hot_tw_info;
        this.labelInfo = Message.immutableCopyOf(builder.labelInfo);
        this.livecover_src_status = builder.livecover_src_status;
        this.notice_info = builder.notice_info;
        this.is_headline = builder.is_headline;
        this.livecover_status = builder.livecover_status;
        this.freq_num = builder.freq_num;
        this.copythread_remind = builder.copythread_remind;
        this.is_copytwzhibo = builder.is_copytwzhibo;
        this.field_ex = builder.field_ex;
    }
}
