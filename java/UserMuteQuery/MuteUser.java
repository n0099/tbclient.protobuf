package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class MuteUser extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer mute_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_MUTE_TIME = 0;

    private MuteUser(Builder builder, boolean z) {
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
            if (builder.mute_time == null) {
                this.mute_time = DEFAULT_MUTE_TIME;
            } else {
                this.mute_time = builder.mute_time;
            }
            if (builder.portrait == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = builder.portrait;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.mute_time = builder.mute_time;
        this.portrait = builder.portrait;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<MuteUser> {
        public Integer mute_time;
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(MuteUser muteUser) {
            super(muteUser);
            if (muteUser != null) {
                this.user_id = muteUser.user_id;
                this.user_name = muteUser.user_name;
                this.mute_time = muteUser.mute_time;
                this.portrait = muteUser.portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MuteUser build(boolean z) {
            return new MuteUser(this, z);
        }
    }
}
