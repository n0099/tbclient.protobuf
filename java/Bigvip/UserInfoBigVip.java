package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserInfoBigVip extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PORTRAITH = "";
    public static final String DEFAULT_USER_DETAIL = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_TYPE = "";
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer message_accept;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer mute_notifications;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String portraith;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_detail;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_type;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_ACCEPT = 0;
    public static final Integer DEFAULT_MUTE_NOTIFICATIONS = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserInfoBigVip> {
        public Integer message_accept;
        public Integer mute_notifications;
        public String portrait;
        public String portraith;
        public String user_detail;
        public Long user_id;
        public String user_name;
        public String user_type;

        public Builder() {
        }

        public Builder(UserInfoBigVip userInfoBigVip) {
            super(userInfoBigVip);
            if (userInfoBigVip == null) {
                return;
            }
            this.user_id = userInfoBigVip.user_id;
            this.user_name = userInfoBigVip.user_name;
            this.user_type = userInfoBigVip.user_type;
            this.user_detail = userInfoBigVip.user_detail;
            this.message_accept = userInfoBigVip.message_accept;
            this.portrait = userInfoBigVip.portrait;
            this.portraith = userInfoBigVip.portraith;
            this.mute_notifications = userInfoBigVip.mute_notifications;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfoBigVip build(boolean z) {
            return new UserInfoBigVip(this, z);
        }
    }

    public UserInfoBigVip(Builder builder, boolean z) {
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
            String str2 = builder.user_type;
            if (str2 == null) {
                this.user_type = "";
            } else {
                this.user_type = str2;
            }
            String str3 = builder.user_detail;
            if (str3 == null) {
                this.user_detail = "";
            } else {
                this.user_detail = str3;
            }
            Integer num = builder.message_accept;
            if (num == null) {
                this.message_accept = DEFAULT_MESSAGE_ACCEPT;
            } else {
                this.message_accept = num;
            }
            String str4 = builder.portrait;
            if (str4 == null) {
                this.portrait = "";
            } else {
                this.portrait = str4;
            }
            String str5 = builder.portraith;
            if (str5 == null) {
                this.portraith = "";
            } else {
                this.portraith = str5;
            }
            Integer num2 = builder.mute_notifications;
            if (num2 == null) {
                this.mute_notifications = DEFAULT_MUTE_NOTIFICATIONS;
                return;
            } else {
                this.mute_notifications = num2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.user_type = builder.user_type;
        this.user_detail = builder.user_detail;
        this.message_accept = builder.message_accept;
        this.portrait = builder.portrait;
        this.portraith = builder.portraith;
        this.mute_notifications = builder.mute_notifications;
    }
}
