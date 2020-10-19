package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ZhiBoInfoTW;
/* loaded from: classes22.dex */
public final class ExcellentThreadInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ABTEST = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_LEGO_CARD = "";
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String abtest;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long excid;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer frs_type;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String lego_card;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer pb_type;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 18, type = Message.Datatype.UINT64)
    public final Long rank;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer source;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> thumbnail;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 13)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long zansum;
    public static final Long DEFAULT_EXCID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_FRS_TYPE = 0;
    public static final Integer DEFAULT_PB_TYPE = 0;
    public static final List<String> DEFAULT_THUMBNAIL = Collections.emptyList();
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final Long DEFAULT_ZANSUM = 0L;
    public static final Long DEFAULT_POST_NUM = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_SOURCE = 0;
    public static final Long DEFAULT_RANK = 0L;
    public static final Integer DEFAULT_PUBLISH_TIME = 0;

    private ExcellentThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.excid == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = builder.excid;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.frs_type == null) {
                this.frs_type = DEFAULT_FRS_TYPE;
            } else {
                this.frs_type = builder.frs_type;
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
            if (builder.thumbnail == null) {
                this.thumbnail = DEFAULT_THUMBNAIL;
            } else {
                this.thumbnail = immutableCopyOf(builder.thumbnail);
            }
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
            if (builder.zansum == null) {
                this.zansum = DEFAULT_ZANSUM;
            } else {
                this.zansum = builder.zansum;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = builder.thread_type;
            }
            this.twzhibo_info = builder.twzhibo_info;
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.abtest == null) {
                this.abtest = "";
            } else {
                this.abtest = builder.abtest;
            }
            if (builder.source == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = builder.source;
            }
            if (builder.rank == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = builder.rank;
            }
            if (builder.publish_time == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = builder.publish_time;
            }
            if (builder.lego_card == null) {
                this.lego_card = "";
                return;
            } else {
                this.lego_card = builder.lego_card;
                return;
            }
        }
        this.excid = builder.excid;
        this.thread_id = builder.thread_id;
        this.frs_type = builder.frs_type;
        this.pb_type = builder.pb_type;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.thumbnail = immutableCopyOf(builder.thumbnail);
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.zansum = builder.zansum;
        this.post_num = builder.post_num;
        this.thread_type = builder.thread_type;
        this.twzhibo_info = builder.twzhibo_info;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.abtest = builder.abtest;
        this.source = builder.source;
        this.rank = builder.rank;
        this.publish_time = builder.publish_time;
        this.lego_card = builder.lego_card;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<ExcellentThreadInfo> {
        public String _abstract;
        public String abtest;
        public Long excid;
        public Long forum_id;
        public String forum_name;
        public Integer frs_type;
        public String lego_card;
        public Integer pb_type;
        public Long post_num;
        public Integer publish_time;
        public Long rank;
        public Integer source;
        public Long tag_code;
        public String tag_name;
        public Long thread_id;
        public Integer thread_type;
        public List<String> thumbnail;
        public String title;
        public ZhiBoInfoTW twzhibo_info;
        public Long zansum;

        public Builder() {
        }

        public Builder(ExcellentThreadInfo excellentThreadInfo) {
            super(excellentThreadInfo);
            if (excellentThreadInfo != null) {
                this.excid = excellentThreadInfo.excid;
                this.thread_id = excellentThreadInfo.thread_id;
                this.frs_type = excellentThreadInfo.frs_type;
                this.pb_type = excellentThreadInfo.pb_type;
                this.title = excellentThreadInfo.title;
                this._abstract = excellentThreadInfo._abstract;
                this.thumbnail = ExcellentThreadInfo.copyOf(excellentThreadInfo.thumbnail);
                this.tag_code = excellentThreadInfo.tag_code;
                this.tag_name = excellentThreadInfo.tag_name;
                this.zansum = excellentThreadInfo.zansum;
                this.post_num = excellentThreadInfo.post_num;
                this.thread_type = excellentThreadInfo.thread_type;
                this.twzhibo_info = excellentThreadInfo.twzhibo_info;
                this.forum_id = excellentThreadInfo.forum_id;
                this.forum_name = excellentThreadInfo.forum_name;
                this.abtest = excellentThreadInfo.abtest;
                this.source = excellentThreadInfo.source;
                this.rank = excellentThreadInfo.rank;
                this.publish_time = excellentThreadInfo.publish_time;
                this.lego_card = excellentThreadInfo.lego_card;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcellentThreadInfo build(boolean z) {
            return new ExcellentThreadInfo(this, z);
        }
    }
}
