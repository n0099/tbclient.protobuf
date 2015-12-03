package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ChildDir extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_EXPLAIN = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TAG = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String explain;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_lid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long member_count;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long thread_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long torder;
    public static final Long DEFAULT_FORUM_LID = 0L;
    public static final Long DEFAULT_TORDER = 0L;
    public static final Long DEFAULT_MEMBER_COUNT = 0L;
    public static final Long DEFAULT_THREAD_NUM = 0L;

    /* synthetic */ ChildDir(Builder builder, boolean z, ChildDir childDir) {
        this(builder, z);
    }

    private ChildDir(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_lid == null) {
                this.forum_lid = DEFAULT_FORUM_LID;
            } else {
                this.forum_lid = builder.forum_lid;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.torder == null) {
                this.torder = DEFAULT_TORDER;
            } else {
                this.torder = builder.torder;
            }
            if (builder.explain == null) {
                this.explain = "";
            } else {
                this.explain = builder.explain;
            }
            if (builder.tag == null) {
                this.tag = "";
            } else {
                this.tag = builder.tag;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.thread_num == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
                return;
            } else {
                this.thread_num = builder.thread_num;
                return;
            }
        }
        this.forum_lid = builder.forum_lid;
        this.forum_name = builder.forum_name;
        this.torder = builder.torder;
        this.explain = builder.explain;
        this.tag = builder.tag;
        this.link = builder.link;
        this.avatar = builder.avatar;
        this.desc = builder.desc;
        this.member_count = builder.member_count;
        this.thread_num = builder.thread_num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ChildDir> {
        public String avatar;
        public String desc;
        public String explain;
        public Long forum_lid;
        public String forum_name;
        public String link;
        public Long member_count;
        public String tag;
        public Long thread_num;
        public Long torder;

        public Builder() {
        }

        public Builder(ChildDir childDir) {
            super(childDir);
            if (childDir != null) {
                this.forum_lid = childDir.forum_lid;
                this.forum_name = childDir.forum_name;
                this.torder = childDir.torder;
                this.explain = childDir.explain;
                this.tag = childDir.tag;
                this.link = childDir.link;
                this.avatar = childDir.avatar;
                this.desc = childDir.desc;
                this.member_count = childDir.member_count;
                this.thread_num = childDir.thread_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChildDir build(boolean z) {
            return new ChildDir(this, z, null);
        }
    }
}
