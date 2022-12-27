package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ForumGodDetailInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DETAIL_INTRO = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String detail_intro;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long god_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_GOD_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumGodDetailInfo> {
        public String avatar;
        public String detail_intro;
        public Long forum_id;
        public String forum_name;
        public Long god_id;
        public String intro;
        public Long user_id;

        public Builder() {
        }

        public Builder(ForumGodDetailInfo forumGodDetailInfo) {
            super(forumGodDetailInfo);
            if (forumGodDetailInfo == null) {
                return;
            }
            this.god_id = forumGodDetailInfo.god_id;
            this.user_id = forumGodDetailInfo.user_id;
            this.intro = forumGodDetailInfo.intro;
            this.detail_intro = forumGodDetailInfo.detail_intro;
            this.forum_id = forumGodDetailInfo.forum_id;
            this.forum_name = forumGodDetailInfo.forum_name;
            this.avatar = forumGodDetailInfo.avatar;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumGodDetailInfo build(boolean z) {
            return new ForumGodDetailInfo(this, z);
        }
    }

    public ForumGodDetailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.god_id;
            if (l == null) {
                this.god_id = DEFAULT_GOD_ID;
            } else {
                this.god_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str = builder.intro;
            if (str == null) {
                this.intro = "";
            } else {
                this.intro = str;
            }
            String str2 = builder.detail_intro;
            if (str2 == null) {
                this.detail_intro = "";
            } else {
                this.detail_intro = str2;
            }
            Long l3 = builder.forum_id;
            if (l3 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l3;
            }
            String str3 = builder.forum_name;
            if (str3 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str3;
            }
            String str4 = builder.avatar;
            if (str4 == null) {
                this.avatar = "";
                return;
            } else {
                this.avatar = str4;
                return;
            }
        }
        this.god_id = builder.god_id;
        this.user_id = builder.user_id;
        this.intro = builder.intro;
        this.detail_intro = builder.detail_intro;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
    }
}
