package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetUserInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetUserInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserInfoReqIdl getUserInfoReqIdl) {
            super(getUserInfoReqIdl);
            if (getUserInfoReqIdl == null) {
                return;
            }
            this.data = getUserInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserInfoReqIdl build(boolean z) {
            return new GetUserInfoReqIdl(this, z);
        }
    }

    public GetUserInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
