package tbclient.SearchFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class userInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<userInfo> {
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(userInfo userinfo) {
            super(userinfo);
            if (userinfo == null) {
                return;
            }
            this.portrait = userinfo.portrait;
            this.user_name = userinfo.user_name;
            this.user_id = userinfo.user_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public userInfo build(boolean z) {
            return new userInfo(this, z);
        }
    }

    public userInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = l;
                return;
            }
        }
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
    }
}
