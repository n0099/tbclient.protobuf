package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class UserAlaInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer live_id;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer live_status;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_nickname;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_LIVE_ID = 0;
    public static final Integer DEFAULT_LIVE_STATUS = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<UserAlaInfo> {
        public Integer live_id;
        public Integer live_status;
        public String portrait;
        public Long user_id;
        public String user_name;
        public String user_nickname;

        public Builder() {
        }

        public Builder(UserAlaInfo userAlaInfo) {
            super(userAlaInfo);
            if (userAlaInfo == null) {
                return;
            }
            this.user_id = userAlaInfo.user_id;
            this.user_name = userAlaInfo.user_name;
            this.user_nickname = userAlaInfo.user_nickname;
            this.portrait = userAlaInfo.portrait;
            this.live_id = userAlaInfo.live_id;
            this.live_status = userAlaInfo.live_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserAlaInfo build(boolean z) {
            return new UserAlaInfo(this, z);
        }
    }

    public UserAlaInfo(Builder builder, boolean z) {
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
            String str2 = builder.user_nickname;
            if (str2 == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Integer num = builder.live_id;
            if (num == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = num;
            }
            Integer num2 = builder.live_status;
            if (num2 == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
                return;
            } else {
                this.live_status = num2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.user_nickname = builder.user_nickname;
        this.portrait = builder.portrait;
        this.live_id = builder.live_id;
        this.live_status = builder.live_status;
    }
}
