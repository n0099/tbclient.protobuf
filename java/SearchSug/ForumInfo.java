package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_CONCERN_NUM = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_POST_NUM = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String concern_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_concerned;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String post_num;
    public static final Integer DEFAULT_FORUM_ID = 0;
    public static final Integer DEFAULT_HAS_CONCERNED = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String avatar;
        public String concern_num;
        public Integer forum_id;
        public String forum_name;
        public Integer has_concerned;
        public String post_num;

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
            this.post_num = forumInfo.post_num;
            this.concern_num = forumInfo.concern_num;
            this.has_concerned = forumInfo.has_concerned;
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
            Integer num = builder.forum_id;
            if (num == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num;
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
            String str3 = builder.post_num;
            if (str3 == null) {
                this.post_num = "";
            } else {
                this.post_num = str3;
            }
            String str4 = builder.concern_num;
            if (str4 == null) {
                this.concern_num = "";
            } else {
                this.concern_num = str4;
            }
            Integer num2 = builder.has_concerned;
            if (num2 == null) {
                this.has_concerned = DEFAULT_HAS_CONCERNED;
                return;
            } else {
                this.has_concerned = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.post_num = builder.post_num;
        this.concern_num = builder.concern_num;
        this.has_concerned = builder.has_concerned;
    }
}
