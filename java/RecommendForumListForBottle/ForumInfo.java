package tbclient.RecommendForumListForBottle;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long member_count;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_MEMBER_COUNT = 0L;
    public static final Long DEFAULT_THREAD_COUNT = 0L;

    private ForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
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
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.thread_count == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
                return;
            } else {
                this.thread_count = builder.thread_count;
                return;
            }
        }
        this.avatar = builder.avatar;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Long member_count;
        public Long thread_count;

        public Builder() {
        }

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo != null) {
                this.avatar = forumInfo.avatar;
                this.forum_id = forumInfo.forum_id;
                this.forum_name = forumInfo.forum_name;
                this.member_count = forumInfo.member_count;
                this.thread_count = forumInfo.thread_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z);
        }
    }
}