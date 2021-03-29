package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
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

    /* loaded from: classes7.dex */
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
            if (forumList == null) {
                return;
            }
            this.forum_id = forumList.forum_id;
            this.forum_name = forumList.forum_name;
            this.avatar = forumList.avatar;
            this.member_count = forumList.member_count;
            this.slogan = forumList.slogan;
            this.content = forumList.content;
            this.post_num = forumList.post_num;
            this.thread_num = forumList.thread_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumList build(boolean z) {
            return new ForumList(this, z);
        }
    }

    public ForumList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.member_count;
            if (num == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num;
            }
            String str3 = builder.slogan;
            if (str3 == null) {
                this.slogan = "";
            } else {
                this.slogan = str3;
            }
            String str4 = builder.content;
            if (str4 == null) {
                this.content = "";
            } else {
                this.content = str4;
            }
            Long l2 = builder.post_num;
            if (l2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l2;
            }
            Long l3 = builder.thread_num;
            if (l3 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
                return;
            } else {
                this.thread_num = l3;
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
}
