package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UserMuteCheckReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private UserMuteCheckReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserMuteCheckReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UserMuteCheckReqIdl userMuteCheckReqIdl) {
            super(userMuteCheckReqIdl);
            if (userMuteCheckReqIdl != null) {
                this.data = userMuteCheckReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserMuteCheckReqIdl build(boolean z) {
            return new UserMuteCheckReqIdl(this, z);
        }
    }
}
