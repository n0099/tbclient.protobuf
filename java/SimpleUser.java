package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class SimpleUser extends Message {
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_BLOCK_MSG = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SECUREEMAIL = "";
    public static final String DEFAULT_SECUREMOBIL = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer agree_type;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String block_msg;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer incomplete_user;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String secureemail;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String securemobil;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String user_nickname;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer user_status;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_USER_STATUS = 0;
    public static final Integer DEFAULT_INCOMPLETE_USER = 0;
    public static final Integer DEFAULT_AGREE_TYPE = 0;

    private SimpleUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_status == null) {
                this.user_status = DEFAULT_USER_STATUS;
            } else {
                this.user_status = builder.user_status;
            }
            if (builder.secureemail == null) {
                this.secureemail = "";
            } else {
                this.secureemail = builder.secureemail;
            }
            if (builder.securemobil == null) {
                this.securemobil = "";
            } else {
                this.securemobil = builder.securemobil;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.user_nickname == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = builder.user_nickname;
            }
            if (builder.incomplete_user == null) {
                this.incomplete_user = DEFAULT_INCOMPLETE_USER;
            } else {
                this.incomplete_user = builder.incomplete_user;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.agree_type == null) {
                this.agree_type = DEFAULT_AGREE_TYPE;
            } else {
                this.agree_type = builder.agree_type;
            }
            if (builder.ahead_url == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = builder.ahead_url;
            }
            if (builder.block_msg == null) {
                this.block_msg = "";
                return;
            } else {
                this.block_msg = builder.block_msg;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_status = builder.user_status;
        this.secureemail = builder.secureemail;
        this.securemobil = builder.securemobil;
        this.user_name = builder.user_name;
        this.user_nickname = builder.user_nickname;
        this.incomplete_user = builder.incomplete_user;
        this.portrait = builder.portrait;
        this.agree_type = builder.agree_type;
        this.ahead_url = builder.ahead_url;
        this.block_msg = builder.block_msg;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<SimpleUser> {
        public Integer agree_type;
        public String ahead_url;
        public String block_msg;
        public Integer incomplete_user;
        public String portrait;
        public String secureemail;
        public String securemobil;
        public Long user_id;
        public String user_name;
        public String user_nickname;
        public Integer user_status;

        public Builder() {
        }

        public Builder(SimpleUser simpleUser) {
            super(simpleUser);
            if (simpleUser != null) {
                this.user_id = simpleUser.user_id;
                this.user_status = simpleUser.user_status;
                this.secureemail = simpleUser.secureemail;
                this.securemobil = simpleUser.securemobil;
                this.user_name = simpleUser.user_name;
                this.user_nickname = simpleUser.user_nickname;
                this.incomplete_user = simpleUser.incomplete_user;
                this.portrait = simpleUser.portrait;
                this.agree_type = simpleUser.agree_type;
                this.ahead_url = simpleUser.ahead_url;
                this.block_msg = simpleUser.block_msg;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleUser build(boolean z) {
            return new SimpleUser(this, z);
        }
    }
}
