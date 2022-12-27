package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ForumSquareRecommendForumInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_RECOMMEND_REASON = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long member_count;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String recommend_reason;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long thread_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Long DEFAULT_MEMBER_COUNT = 0L;
    public static final Long DEFAULT_THREAD_COUNT = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumSquareRecommendForumInfo> {
        public String _abstract;
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Long member_count;
        public String recommend_reason;
        public Long thread_count;

        public Builder() {
        }

        public Builder(ForumSquareRecommendForumInfo forumSquareRecommendForumInfo) {
            super(forumSquareRecommendForumInfo);
            if (forumSquareRecommendForumInfo == null) {
                return;
            }
            this.recommend_reason = forumSquareRecommendForumInfo.recommend_reason;
            this.forum_id = forumSquareRecommendForumInfo.forum_id;
            this.forum_name = forumSquareRecommendForumInfo.forum_name;
            this.avatar = forumSquareRecommendForumInfo.avatar;
            this._abstract = forumSquareRecommendForumInfo._abstract;
            this.is_like = forumSquareRecommendForumInfo.is_like;
            this.member_count = forumSquareRecommendForumInfo.member_count;
            this.thread_count = forumSquareRecommendForumInfo.thread_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSquareRecommendForumInfo build(boolean z) {
            return new ForumSquareRecommendForumInfo(this, z);
        }
    }

    public ForumSquareRecommendForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.recommend_reason;
            if (str == null) {
                this.recommend_reason = "";
            } else {
                this.recommend_reason = str;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            String str3 = builder.avatar;
            if (str3 == null) {
                this.avatar = "";
            } else {
                this.avatar = str3;
            }
            String str4 = builder._abstract;
            if (str4 == null) {
                this._abstract = "";
            } else {
                this._abstract = str4;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            Long l2 = builder.member_count;
            if (l2 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = l2;
            }
            Long l3 = builder.thread_count;
            if (l3 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
                return;
            } else {
                this.thread_count = l3;
                return;
            }
        }
        this.recommend_reason = builder.recommend_reason;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this._abstract = builder._abstract;
        this.is_like = builder.is_like;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
    }
}
