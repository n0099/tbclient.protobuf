package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_like;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String _abstract;
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;

        public Builder() {
        }

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo == null) {
                return;
            }
            this.forum_id = forumInfo.forum_id;
            this.forum_name = forumInfo.forum_name;
            this.avatar = forumInfo.avatar;
            this._abstract = forumInfo._abstract;
            this.is_like = forumInfo.is_like;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z);
        }
    }

    public ForumInfo(Builder builder, boolean z) {
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
            String str3 = builder._abstract;
            if (str3 == null) {
                this._abstract = "";
            } else {
                this._abstract = str3;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
                return;
            } else {
                this.is_like = num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this._abstract = builder._abstract;
        this.is_like = builder.is_like;
    }
}
