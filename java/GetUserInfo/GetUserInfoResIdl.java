package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetUserInfoResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetUserInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUserInfoResIdl getUserInfoResIdl) {
            super(getUserInfoResIdl);
            if (getUserInfoResIdl == null) {
                return;
            }
            this.error = getUserInfoResIdl.error;
            this.data = getUserInfoResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserInfoResIdl build(boolean z) {
            return new GetUserInfoResIdl(this, z);
        }
    }

    public GetUserInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
