package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ForumVDetailInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DETAIL_INFO = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String detail_info;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long v_id;
    public static final Long DEFAULT_V_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumVDetailInfo> {
        public String avatar;
        public String detail_info;
        public Long forum_id;
        public String forum_name;
        public String intro;
        public Long user_id;
        public Long v_id;

        public Builder() {
        }

        public Builder(ForumVDetailInfo forumVDetailInfo) {
            super(forumVDetailInfo);
            if (forumVDetailInfo == null) {
                return;
            }
            this.v_id = forumVDetailInfo.v_id;
            this.user_id = forumVDetailInfo.user_id;
            this.intro = forumVDetailInfo.intro;
            this.detail_info = forumVDetailInfo.detail_info;
            this.forum_id = forumVDetailInfo.forum_id;
            this.forum_name = forumVDetailInfo.forum_name;
            this.avatar = forumVDetailInfo.avatar;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumVDetailInfo build(boolean z) {
            return new ForumVDetailInfo(this, z);
        }
    }

    public ForumVDetailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.v_id;
            if (l == null) {
                this.v_id = DEFAULT_V_ID;
            } else {
                this.v_id = l;
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
            String str2 = builder.detail_info;
            if (str2 == null) {
                this.detail_info = "";
            } else {
                this.detail_info = str2;
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
        this.v_id = builder.v_id;
        this.user_id = builder.user_id;
        this.intro = builder.intro;
        this.detail_info = builder.detail_info;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
    }
}
