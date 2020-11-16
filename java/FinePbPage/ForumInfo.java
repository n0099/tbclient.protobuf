package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes22.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AUTHORREMARK = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FROMFNAME = "";
    public static final String DEFAULT_ORIGINALURL = "";
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TAGABSTRACT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String authorremark;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Content> content;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long fromfid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String fromfname;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long ftid;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long member_num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String originalurl;
    @ProtoField(tag = 17, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String tagabstract;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long threadsnum;
    @ProtoField(tag = 16, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5)
    public final ZanInfo zan;
    public static final Long DEFAULT_FTID = 0L;
    public static final List<Content> DEFAULT_CONTENT = Collections.emptyList();
    public static final Long DEFAULT_FROMFID = 0L;
    public static final Long DEFAULT_THREADSNUM = 0L;
    public static final Long DEFAULT_MEMBER_NUM = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_PID = 0L;

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
            } else {
                this.threadsnum = builder.threadsnum;
            }
            if (builder.member_num == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = builder.member_num;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.tagabstract == null) {
                this.tagabstract = "";
            } else {
                this.tagabstract = builder.tagabstract;
            }
            if (builder.authorremark == null) {
                this.authorremark = "";
            } else {
                this.authorremark = builder.authorremark;
            }
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.pid == null) {
                this.pid = DEFAULT_PID;
                return;
            } else {
                this.pid = builder.pid;
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
        this.member_num = builder.member_num;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
        this.tagabstract = builder.tagabstract;
        this.authorremark = builder.authorremark;
        this.tid = builder.tid;
        this.pid = builder.pid;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String _abstract;
        public String authorremark;
        public String avatar;
        public List<Content> content;
        public Long fromfid;
        public String fromfname;
        public Long ftid;
        public Integer is_like;
        public Long member_num;
        public String originalurl;
        public Long pid;
        public String tag;
        public String tagabstract;
        public Long threadsnum;
        public Long tid;
        public String title;
        public ZanInfo zan;

        public Builder() {
        }

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
                this.member_num = forumInfo.member_num;
                this.avatar = forumInfo.avatar;
                this.is_like = forumInfo.is_like;
                this.tagabstract = forumInfo.tagabstract;
                this.authorremark = forumInfo.authorremark;
                this.tid = forumInfo.tid;
                this.pid = forumInfo.pid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z);
        }
    }
}
