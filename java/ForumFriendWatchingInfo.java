package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumFriendWatchingInfo extends Message {
    public static final String DEFAULT_FORUM_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_SHOW_NUM = 0;
    public static final String DEFAULT_SHOW_TYPE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_avatar;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer show_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ForumFriendWatchingInfo> {
        public String forum_avatar;
        public String forum_name;
        public Integer show_num;
        public String show_type;

        public Builder() {
        }

        public Builder(ForumFriendWatchingInfo forumFriendWatchingInfo) {
            super(forumFriendWatchingInfo);
            if (forumFriendWatchingInfo == null) {
                return;
            }
            this.forum_avatar = forumFriendWatchingInfo.forum_avatar;
            this.forum_name = forumFriendWatchingInfo.forum_name;
            this.show_num = forumFriendWatchingInfo.show_num;
            this.show_type = forumFriendWatchingInfo.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumFriendWatchingInfo build(boolean z) {
            return new ForumFriendWatchingInfo(this, z);
        }
    }

    public ForumFriendWatchingInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.forum_avatar;
            if (str == null) {
                this.forum_avatar = "";
            } else {
                this.forum_avatar = str;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            Integer num = builder.show_num;
            if (num == null) {
                this.show_num = DEFAULT_SHOW_NUM;
            } else {
                this.show_num = num;
            }
            String str3 = builder.show_type;
            if (str3 == null) {
                this.show_type = "";
                return;
            } else {
                this.show_type = str3;
                return;
            }
        }
        this.forum_avatar = builder.forum_avatar;
        this.forum_name = builder.forum_name;
        this.show_num = builder.show_num;
        this.show_type = builder.show_type;
    }
}
