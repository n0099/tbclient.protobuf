package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UserSessionInfo extends Message {
    public static final String DEFAULT_BDUSS = "";
    public static final String DEFAULT_EMAIL = "";
    public static final String DEFAULT_MOBILE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bduss;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String email;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String mobile;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserSessionInfo> {
        public String bduss;
        public String email;
        public String mobile;

        public Builder() {
        }

        public Builder(UserSessionInfo userSessionInfo) {
            super(userSessionInfo);
            if (userSessionInfo == null) {
                return;
            }
            this.bduss = userSessionInfo.bduss;
            this.mobile = userSessionInfo.mobile;
            this.email = userSessionInfo.email;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserSessionInfo build(boolean z) {
            return new UserSessionInfo(this, z);
        }
    }

    public UserSessionInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.bduss;
            if (str == null) {
                this.bduss = "";
            } else {
                this.bduss = str;
            }
            String str2 = builder.mobile;
            if (str2 == null) {
                this.mobile = "";
            } else {
                this.mobile = str2;
            }
            String str3 = builder.email;
            if (str3 == null) {
                this.email = "";
                return;
            } else {
                this.email = str3;
                return;
            }
        }
        this.bduss = builder.bduss;
        this.mobile = builder.mobile;
        this.email = builder.email;
    }
}
