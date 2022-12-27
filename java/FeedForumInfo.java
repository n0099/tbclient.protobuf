package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeedForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_REASON = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_private_forum;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer member_count;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer pos;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String reason;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_POS = 0;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_IS_PRIVATE_FORUM = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Integer is_private_forum;
        public Integer member_count;
        public Integer pos;
        public Integer post_num;
        public String reason;

        public Builder() {
        }

        public Builder(FeedForumInfo feedForumInfo) {
            super(feedForumInfo);
            if (feedForumInfo == null) {
                return;
            }
            this.forum_id = feedForumInfo.forum_id;
            this.forum_name = feedForumInfo.forum_name;
            this.member_count = feedForumInfo.member_count;
            this.post_num = feedForumInfo.post_num;
            this.avatar = feedForumInfo.avatar;
            this.reason = feedForumInfo.reason;
            this.pos = feedForumInfo.pos;
            this.is_like = feedForumInfo.is_like;
            this.is_private_forum = feedForumInfo.is_private_forum;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedForumInfo build(boolean z) {
            return new FeedForumInfo(this, z);
        }
    }

    public FeedForumInfo(Builder builder, boolean z) {
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
            Integer num = builder.member_count;
            if (num == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num;
            }
            Integer num2 = builder.post_num;
            if (num2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num2;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            String str3 = builder.reason;
            if (str3 == null) {
                this.reason = "";
            } else {
                this.reason = str3;
            }
            Integer num3 = builder.pos;
            if (num3 == null) {
                this.pos = DEFAULT_POS;
            } else {
                this.pos = num3;
            }
            Integer num4 = builder.is_like;
            if (num4 == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num4;
            }
            Integer num5 = builder.is_private_forum;
            if (num5 == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
                return;
            } else {
                this.is_private_forum = num5;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.member_count = builder.member_count;
        this.post_num = builder.post_num;
        this.avatar = builder.avatar;
        this.reason = builder.reason;
        this.pos = builder.pos;
        this.is_like = builder.is_like;
        this.is_private_forum = builder.is_private_forum;
    }
}
