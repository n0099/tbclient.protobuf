package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ForumSquareDirs extends Message {
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ChildDir> forum_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer torder;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_TORDER = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<ChildDir> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final Long DEFAULT_TIME = 0L;

    /* synthetic */ ForumSquareDirs(Builder builder, boolean z, ForumSquareDirs forumSquareDirs) {
        this(builder, z);
    }

    private ForumSquareDirs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.torder == null) {
                this.torder = DEFAULT_TORDER;
            } else {
                this.torder = builder.torder;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.pic == null) {
                this.pic = "";
            } else {
                this.pic = builder.pic;
            }
            if (builder.forum_list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = immutableCopyOf(builder.forum_list);
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = builder.time;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.torder = builder.torder;
        this.type = builder.type;
        this.link = builder.link;
        this.pic = builder.pic;
        this.forum_list = immutableCopyOf(builder.forum_list);
        this.time = builder.time;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumSquareDirs> {
        public List<ChildDir> forum_list;
        public Long id;
        public String link;
        public String pic;
        public Long time;
        public String title;
        public Integer torder;
        public Integer type;

        public Builder() {
        }

        public Builder(ForumSquareDirs forumSquareDirs) {
            super(forumSquareDirs);
            if (forumSquareDirs != null) {
                this.id = forumSquareDirs.id;
                this.title = forumSquareDirs.title;
                this.torder = forumSquareDirs.torder;
                this.type = forumSquareDirs.type;
                this.link = forumSquareDirs.link;
                this.pic = forumSquareDirs.pic;
                this.forum_list = ForumSquareDirs.copyOf(forumSquareDirs.forum_list);
                this.time = forumSquareDirs.time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSquareDirs build(boolean z) {
            return new ForumSquareDirs(this, z, null);
        }
    }
}
