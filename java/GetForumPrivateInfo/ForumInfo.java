package tbclient.GetForumPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_IS_HIDE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String is_hide;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer level_id;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_LEVEL_ID = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public String is_hide;
        public Integer level_id;

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
            this.level_id = forumInfo.level_id;
            this.is_hide = forumInfo.is_hide;
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
            Integer num = builder.level_id;
            if (num == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num;
            }
            String str3 = builder.is_hide;
            if (str3 == null) {
                this.is_hide = "";
                return;
            } else {
                this.is_hide = str3;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.level_id = builder.level_id;
        this.is_hide = builder.is_hide;
    }
}
