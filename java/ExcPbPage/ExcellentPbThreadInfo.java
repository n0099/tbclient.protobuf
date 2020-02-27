package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class ExcellentPbThreadInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ABTEST = "";
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String abtest;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ExcContent> content;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long excid;
    @ProtoField(tag = 8)
    public final postForumInfo forum;
    @ProtoField(tag = 12, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer source;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 13)
    public final ZanInfo zan;
    public static final Long DEFAULT_EXCID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final List<ExcContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_SOURCE = 0;
    public static final Integer DEFAULT_PUBLISH_TIME = 0;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_POST_NUM = 0L;

    private ExcellentPbThreadInfo(Builder builder, boolean z) {
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
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            this.forum = builder.forum;
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
            if (builder.publish_time == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = builder.publish_time;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            this.zan = builder.zan;
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
                return;
            } else {
                this.post_num = builder.post_num;
                return;
            }
        }
        this.excid = builder.excid;
        this.thread_id = builder.thread_id;
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.content = immutableCopyOf(builder.content);
        this.forum = builder.forum;
        this.abtest = builder.abtest;
        this.source = builder.source;
        this.publish_time = builder.publish_time;
        this.post_id = builder.post_id;
        this.zan = builder.zan;
        this.post_num = builder.post_num;
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ExcellentPbThreadInfo> {
        public String _abstract;
        public String abtest;
        public List<ExcContent> content;
        public Long excid;
        public postForumInfo forum;
        public Long post_id;
        public Long post_num;
        public Integer publish_time;
        public Integer source;
        public Long tag_code;
        public String tag_name;
        public Long thread_id;
        public String title;
        public ZanInfo zan;

        public Builder() {
        }

        public Builder(ExcellentPbThreadInfo excellentPbThreadInfo) {
            super(excellentPbThreadInfo);
            if (excellentPbThreadInfo != null) {
                this.excid = excellentPbThreadInfo.excid;
                this.thread_id = excellentPbThreadInfo.thread_id;
                this.tag_code = excellentPbThreadInfo.tag_code;
                this.tag_name = excellentPbThreadInfo.tag_name;
                this.title = excellentPbThreadInfo.title;
                this._abstract = excellentPbThreadInfo._abstract;
                this.content = ExcellentPbThreadInfo.copyOf(excellentPbThreadInfo.content);
                this.forum = excellentPbThreadInfo.forum;
                this.abtest = excellentPbThreadInfo.abtest;
                this.source = excellentPbThreadInfo.source;
                this.publish_time = excellentPbThreadInfo.publish_time;
                this.post_id = excellentPbThreadInfo.post_id;
                this.zan = excellentPbThreadInfo.zan;
                this.post_num = excellentPbThreadInfo.post_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcellentPbThreadInfo build(boolean z) {
            return new ExcellentPbThreadInfo(this, z);
        }
    }
}
