package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class AccessState extends Message {
    public static final String DEFAULT_TOKEN = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String token;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 3)
    public final UserSessionInfo userinfo;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AccessState> {
        public String token;
        public String type;
        public UserSessionInfo userinfo;

        public Builder() {
        }

        public Builder(AccessState accessState) {
            super(accessState);
            if (accessState == null) {
                return;
            }
            this.type = accessState.type;
            this.token = accessState.token;
            this.userinfo = accessState.userinfo;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AccessState build(boolean z) {
            return new AccessState(this, z);
        }
    }

    public AccessState(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.token;
            if (str2 == null) {
                this.token = "";
            } else {
                this.token = str2;
            }
            this.userinfo = builder.userinfo;
            return;
        }
        this.type = builder.type;
        this.token = builder.token;
        this.userinfo = builder.userinfo;
    }
}
