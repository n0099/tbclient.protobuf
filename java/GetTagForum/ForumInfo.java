package tbclient.GetTagForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer concern_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer post_num;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_CONCERN_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String avatar;
        public Integer concern_num;
        public Long forum_id;
        public String forum_name;
        public Integer post_num;

        public Builder() {
        }

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo == null) {
                return;
            }
            this.forum_id = forumInfo.forum_id;
            this.forum_name = forumInfo.forum_name;
            this.concern_num = forumInfo.concern_num;
            this.post_num = forumInfo.post_num;
            this.avatar = forumInfo.avatar;
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
            Integer num = builder.concern_num;
            if (num == null) {
                this.concern_num = DEFAULT_CONCERN_NUM;
            } else {
                this.concern_num = num;
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
                return;
            } else {
                this.avatar = str2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.concern_num = builder.concern_num;
        this.post_num = builder.post_num;
        this.avatar = builder.avatar;
    }
}
