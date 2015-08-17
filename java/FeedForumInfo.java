package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* synthetic */ FeedForumInfo(Builder builder, boolean z, FeedForumInfo feedForumInfo) {
        this(builder, z);
    }

    private FeedForumInfo(Builder builder, boolean z) {
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
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.reason == null) {
                this.reason = "";
            } else {
                this.reason = builder.reason;
            }
            if (builder.pos == null) {
                this.pos = DEFAULT_POS;
            } else {
                this.pos = builder.pos;
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
                return;
            } else {
                this.is_like = builder.is_like;
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
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<FeedForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Integer member_count;
        public Integer pos;
        public Integer post_num;
        public String reason;

        public Builder() {
        }

        public Builder(FeedForumInfo feedForumInfo) {
            super(feedForumInfo);
            if (feedForumInfo != null) {
                this.forum_id = feedForumInfo.forum_id;
                this.forum_name = feedForumInfo.forum_name;
                this.member_count = feedForumInfo.member_count;
                this.post_num = feedForumInfo.post_num;
                this.avatar = feedForumInfo.avatar;
                this.reason = feedForumInfo.reason;
                this.pos = feedForumInfo.pos;
                this.is_like = feedForumInfo.is_like;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedForumInfo build(boolean z) {
            return new FeedForumInfo(this, z, null);
        }
    }
}
