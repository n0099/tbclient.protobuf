package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_FROMFNAME = "";
    public static final String DEFAULT_ORIGINALURL = "";
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Content> content;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long fromfid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String fromfname;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long ftid;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String originalurl;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long threadsnum;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5)
    public final ZanInfo zan;
    public static final Long DEFAULT_FTID = 0L;
    public static final List<Content> DEFAULT_CONTENT = Collections.emptyList();
    public static final Long DEFAULT_FROMFID = 0L;
    public static final Long DEFAULT_THREADSNUM = 0L;

    /* synthetic */ ForumInfo(Builder builder, boolean z, ForumInfo forumInfo) {
        this(builder, z);
    }

    private ForumInfo(Builder builder, boolean z) {
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
            this.zan = builder.zan;
            if (builder.originalurl == null) {
                this.originalurl = "";
            } else {
                this.originalurl = builder.originalurl;
            }
            if (builder.tag == null) {
                this.tag = "";
            } else {
                this.tag = builder.tag;
            }
            if (builder.fromfname == null) {
                this.fromfname = "";
            } else {
                this.fromfname = builder.fromfname;
            }
            if (builder.fromfid == null) {
                this.fromfid = DEFAULT_FROMFID;
            } else {
                this.fromfid = builder.fromfid;
            }
            if (builder.threadsnum == null) {
                this.threadsnum = DEFAULT_THREADSNUM;
                return;
            } else {
                this.threadsnum = builder.threadsnum;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.content = immutableCopyOf(builder.content);
        this.zan = builder.zan;
        this.originalurl = builder.originalurl;
        this.tag = builder.tag;
        this.fromfname = builder.fromfname;
        this.fromfid = builder.fromfid;
        this.threadsnum = builder.threadsnum;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ForumInfo> {
        public String _abstract;
        public List<Content> content;
        public Long fromfid;
        public String fromfname;
        public Long ftid;
        public String originalurl;
        public String tag;
        public Long threadsnum;
        public String title;
        public ZanInfo zan;

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo != null) {
                this.ftid = forumInfo.ftid;
                this.title = forumInfo.title;
                this._abstract = forumInfo._abstract;
                this.content = ForumInfo.copyOf(forumInfo.content);
                this.zan = forumInfo.zan;
                this.originalurl = forumInfo.originalurl;
                this.tag = forumInfo.tag;
                this.fromfname = forumInfo.fromfname;
                this.fromfid = forumInfo.fromfid;
                this.threadsnum = forumInfo.threadsnum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z, null);
        }
    }
}
