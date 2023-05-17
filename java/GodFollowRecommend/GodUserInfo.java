package tbclient.GodFollowRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GodUserInfo extends Message {
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GodUserInfo> {
        public String forum_name;
        public String intro;
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(GodUserInfo godUserInfo) {
            super(godUserInfo);
            if (godUserInfo == null) {
                return;
            }
            this.user_id = godUserInfo.user_id;
            this.user_name = godUserInfo.user_name;
            this.portrait = godUserInfo.portrait;
            this.forum_name = godUserInfo.forum_name;
            this.intro = godUserInfo.intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodUserInfo build(boolean z) {
            return new GodUserInfo(this, z);
        }
    }

    public GodUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.forum_name;
            if (str3 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str3;
            }
            String str4 = builder.intro;
            if (str4 == null) {
                this.intro = "";
                return;
            } else {
                this.intro = str4;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.forum_name = builder.forum_name;
        this.intro = builder.intro;
    }
}
