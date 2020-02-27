package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer gender;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 7)
    public final ShowIcon tshow_icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_GENDER = 0;

    private UserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.gender == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = builder.gender;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            this.tshow_icon = builder.tshow_icon;
            return;
        }
        this.user_id = builder.user_id;
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.gender = builder.gender;
        this.intro = builder.intro;
        this.tshow_icon = builder.tshow_icon;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserInfo> {
        public Integer gender;
        public String intro;
        public String portrait;
        public ShowIcon tshow_icon;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(UserInfo userInfo) {
            super(userInfo);
            if (userInfo != null) {
                this.user_id = userInfo.user_id;
                this.portrait = userInfo.portrait;
                this.user_name = userInfo.user_name;
                this.gender = userInfo.gender;
                this.intro = userInfo.intro;
                this.tshow_icon = userInfo.tshow_icon;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfo build(boolean z) {
            return new UserInfo(this, z);
        }
    }
}
