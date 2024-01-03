package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (forumSquareDirs == null) {
                return;
            }
            this.id = forumSquareDirs.id;
            this.title = forumSquareDirs.title;
            this.torder = forumSquareDirs.torder;
            this.type = forumSquareDirs.type;
            this.link = forumSquareDirs.link;
            this.pic = forumSquareDirs.pic;
            this.forum_list = Message.copyOf(forumSquareDirs.forum_list);
            this.time = forumSquareDirs.time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSquareDirs build(boolean z) {
            return new ForumSquareDirs(this, z);
        }
    }

    public ForumSquareDirs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.torder;
            if (num == null) {
                this.torder = DEFAULT_TORDER;
            } else {
                this.torder = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
            } else {
                this.link = str2;
            }
            String str3 = builder.pic;
            if (str3 == null) {
                this.pic = "";
            } else {
                this.pic = str3;
            }
            List<ChildDir> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            Long l2 = builder.time;
            if (l2 == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = l2;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.torder = builder.torder;
        this.type = builder.type;
        this.link = builder.link;
        this.pic = builder.pic;
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.time = builder.time;
    }
}
