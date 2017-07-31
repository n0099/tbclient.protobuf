package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumDynamic extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_SLOGAN = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer user_thread_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_THREAD_COUNT = 0;
    public static final Integer DEFAULT_USER_THREAD_COUNT = 0;

    private ForumDynamic(Builder builder, boolean z) {
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
            if (builder.slogan == null) {
                this.slogan = "";
            } else {
                this.slogan = builder.slogan;
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.thread_count == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
            } else {
                this.thread_count = builder.thread_count;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.user_thread_count == null) {
                this.user_thread_count = DEFAULT_USER_THREAD_COUNT;
                return;
            } else {
                this.user_thread_count = builder.user_thread_count;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.slogan = builder.slogan;
        this.is_like = builder.is_like;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
        this.title = builder.title;
        this.user_thread_count = builder.user_thread_count;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumDynamic> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Integer member_count;
        public String slogan;
        public Integer thread_count;
        public String title;
        public Integer user_thread_count;

        public Builder() {
        }

        public Builder(ForumDynamic forumDynamic) {
            super(forumDynamic);
            if (forumDynamic != null) {
                this.forum_id = forumDynamic.forum_id;
                this.forum_name = forumDynamic.forum_name;
                this.avatar = forumDynamic.avatar;
                this.slogan = forumDynamic.slogan;
                this.is_like = forumDynamic.is_like;
                this.member_count = forumDynamic.member_count;
                this.thread_count = forumDynamic.thread_count;
                this.title = forumDynamic.title;
                this.user_thread_count = forumDynamic.user_thread_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumDynamic build(boolean z) {
            return new ForumDynamic(this, z);
        }
    }
}
