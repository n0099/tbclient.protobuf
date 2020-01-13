package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes11.dex */
public final class UserInfoBigVip extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PORTRAITH = "";
    public static final String DEFAULT_USER_DETAIL = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_TYPE = "";
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer message_accept;
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

    private UserInfoBigVip(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.user_type == null) {
                this.user_type = "";
            } else {
                this.user_type = builder.user_type;
            }
            if (builder.user_detail == null) {
                this.user_detail = "";
            } else {
                this.user_detail = builder.user_detail;
            }
            if (builder.message_accept == null) {
                this.message_accept = DEFAULT_MESSAGE_ACCEPT;
            } else {
                this.message_accept = builder.message_accept;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.portraith == null) {
                this.portraith = "";
                return;
            } else {
                this.portraith = builder.portraith;
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
    }

    /* loaded from: classes11.dex */
    public static final class Builder extends Message.Builder<UserInfoBigVip> {
        public Integer message_accept;
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
            if (userInfoBigVip != null) {
                this.user_id = userInfoBigVip.user_id;
                this.user_name = userInfoBigVip.user_name;
                this.user_type = userInfoBigVip.user_type;
                this.user_detail = userInfoBigVip.user_detail;
                this.message_accept = userInfoBigVip.message_accept;
                this.portrait = userInfoBigVip.portrait;
                this.portraith = userInfoBigVip.portraith;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfoBigVip build(boolean z) {
            return new UserInfoBigVip(this, z);
        }
    }
}
