package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ZhiBoInfoTW;
/* loaded from: classes4.dex */
public final class FineThreadInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_FROMFNAME = "";
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer forder;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long forumid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String fromfname;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long threadsnum;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> thumbnail;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 12)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long zansum;
    public static final Long DEFAULT_FTID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<String> DEFAULT_THUMBNAIL = Collections.emptyList();
    public static final Integer DEFAULT_PUBLISH_TIME = 0;
    public static final Long DEFAULT_ZANSUM = 0L;
    public static final Long DEFAULT_THREADSNUM = 0L;
    public static final Long DEFAULT_FORUMID = 0L;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Integer DEFAULT_FORDER = 0;

    private FineThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ftid == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = builder.ftid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
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
            if (builder.publish_time == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = builder.publish_time;
            }
            if (builder.tag == null) {
                this.tag = "";
            } else {
                this.tag = builder.tag;
            }
            if (builder.zansum == null) {
                this.zansum = DEFAULT_ZANSUM;
            } else {
                this.zansum = builder.zansum;
            }
            if (builder.threadsnum == null) {
                this.threadsnum = DEFAULT_THREADSNUM;
            } else {
                this.threadsnum = builder.threadsnum;
            }
            if (builder.fromfname == null) {
                this.fromfname = "";
            } else {
                this.fromfname = builder.fromfname;
            }
            if (builder.forumid == null) {
                this.forumid = DEFAULT_FORUMID;
            } else {
                this.forumid = builder.forumid;
            }
            this.twzhibo_info = builder.twzhibo_info;
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = builder.thread_type;
            }
            if (builder.forder == null) {
                this.forder = DEFAULT_FORDER;
                return;
            } else {
                this.forder = builder.forder;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this.type = builder.type;
        this._abstract = builder._abstract;
        this.thumbnail = immutableCopyOf(builder.thumbnail);
        this.publish_time = builder.publish_time;
        this.tag = builder.tag;
        this.zansum = builder.zansum;
        this.threadsnum = builder.threadsnum;
        this.fromfname = builder.fromfname;
        this.forumid = builder.forumid;
        this.twzhibo_info = builder.twzhibo_info;
        this.thread_type = builder.thread_type;
        this.forder = builder.forder;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<FineThreadInfo> {
        public String _abstract;
        public Integer forder;
        public Long forumid;
        public String fromfname;
        public Long ftid;
        public Integer publish_time;
        public String tag;
        public Integer thread_type;
        public Long threadsnum;
        public List<String> thumbnail;
        public String title;
        public ZhiBoInfoTW twzhibo_info;
        public Integer type;
        public Long zansum;

        public Builder() {
        }

        public Builder(FineThreadInfo fineThreadInfo) {
            super(fineThreadInfo);
            if (fineThreadInfo != null) {
                this.ftid = fineThreadInfo.ftid;
                this.title = fineThreadInfo.title;
                this.type = fineThreadInfo.type;
                this._abstract = fineThreadInfo._abstract;
                this.thumbnail = FineThreadInfo.copyOf(fineThreadInfo.thumbnail);
                this.publish_time = fineThreadInfo.publish_time;
                this.tag = fineThreadInfo.tag;
                this.zansum = fineThreadInfo.zansum;
                this.threadsnum = fineThreadInfo.threadsnum;
                this.fromfname = fineThreadInfo.fromfname;
                this.forumid = fineThreadInfo.forumid;
                this.twzhibo_info = fineThreadInfo.twzhibo_info;
                this.thread_type = fineThreadInfo.thread_type;
                this.forder = fineThreadInfo.forder;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineThreadInfo build(boolean z) {
            return new FineThreadInfo(this, z);
        }
    }
}
