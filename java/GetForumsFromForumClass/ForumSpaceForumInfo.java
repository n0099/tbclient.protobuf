package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ForumSpaceForumInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer like_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer rank;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_LIKE_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_RANK = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumSpaceForumInfo> {
        public String _abstract;
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Integer like_num;
        public Integer post_num;
        public Integer rank;

        public Builder() {
        }

        public Builder(ForumSpaceForumInfo forumSpaceForumInfo) {
            super(forumSpaceForumInfo);
            if (forumSpaceForumInfo == null) {
                return;
            }
            this.forum_id = forumSpaceForumInfo.forum_id;
            this.forum_name = forumSpaceForumInfo.forum_name;
            this._abstract = forumSpaceForumInfo._abstract;
            this.like_num = forumSpaceForumInfo.like_num;
            this.post_num = forumSpaceForumInfo.post_num;
            this.avatar = forumSpaceForumInfo.avatar;
            this.is_like = forumSpaceForumInfo.is_like;
            this.rank = forumSpaceForumInfo.rank;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSpaceForumInfo build(boolean z) {
            return new ForumSpaceForumInfo(this, z);
        }
    }

    public ForumSpaceForumInfo(Builder builder, boolean z) {
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
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            Integer num = builder.like_num;
            if (num == null) {
                this.like_num = DEFAULT_LIKE_NUM;
            } else {
                this.like_num = num;
            }
            Integer num2 = builder.post_num;
            if (num2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num2;
            }
            String str3 = builder.avatar;
            if (str3 == null) {
                this.avatar = "";
            } else {
                this.avatar = str3;
            }
            Integer num3 = builder.is_like;
            if (num3 == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num3;
            }
            Integer num4 = builder.rank;
            if (num4 == null) {
                this.rank = DEFAULT_RANK;
                return;
            } else {
                this.rank = num4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this._abstract = builder._abstract;
        this.like_num = builder.like_num;
        this.post_num = builder.post_num;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
        this.rank = builder.rank;
    }
}
