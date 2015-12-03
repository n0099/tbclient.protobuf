package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class UserPkReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ UserPkReqIdl(Builder builder, boolean z, UserPkReqIdl userPkReqIdl) {
        this(builder, z);
    }

    private UserPkReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<UserPkReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UserPkReqIdl userPkReqIdl) {
            super(userPkReqIdl);
            if (userPkReqIdl != null) {
                this.data = userPkReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPkReqIdl build(boolean z) {
            return new UserPkReqIdl(this, z, null);
        }
    }
}
