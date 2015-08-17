package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SimpleUser extends Message {
    public static final String DEFAULT_SECUREEMAIL = "";
    public static final String DEFAULT_SECUREMOBIL = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
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

    /* synthetic */ SimpleUser(Builder builder, boolean z, SimpleUser simpleUser) {
        this(builder, z);
    }

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
                return;
            } else {
                this.user_nickname = builder.user_nickname;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_status = builder.user_status;
        this.secureemail = builder.secureemail;
        this.securemobil = builder.securemobil;
        this.user_name = builder.user_name;
        this.user_nickname = builder.user_nickname;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<SimpleUser> {
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleUser build(boolean z) {
            return new SimpleUser(this, z, null);
        }
    }
}
