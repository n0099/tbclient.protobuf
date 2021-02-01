package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ForumList extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_SLOGAN = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer member_count;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long post_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long thread_num;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Long DEFAULT_POST_NUM = 0L;
    public static final Long DEFAULT_THREAD_NUM = 0L;

    private ForumList(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.slogan == null) {
                this.slogan = "";
            } else {
                this.slogan = builder.slogan;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.thread_num == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
                return;
            } else {
                this.thread_num = builder.thread_num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.member_count = builder.member_count;
        this.slogan = builder.slogan;
        this.content = builder.content;
        this.post_num = builder.post_num;
        this.thread_num = builder.thread_num;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumList> {
        public String avatar;
        public String content;
        public Long forum_id;
        public String forum_name;
        public Integer member_count;
        public Long post_num;
        public String slogan;
        public Long thread_num;

        public Builder() {
        }

        public Builder(ForumList forumList) {
            super(forumList);
            if (forumList != null) {
                this.forum_id = forumList.forum_id;
                this.forum_name = forumList.forum_name;
                this.avatar = forumList.avatar;
                this.member_count = forumList.member_count;
                this.slogan = forumList.slogan;
                this.content = forumList.content;
                this.post_num = forumList.post_num;
                this.thread_num = forumList.thread_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumList build(boolean z) {
            return new ForumList(this, z);
        }
    }
}
