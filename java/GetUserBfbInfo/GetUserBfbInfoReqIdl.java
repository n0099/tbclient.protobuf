package tbclient.GetUserBfbInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetUserBfbInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetUserBfbInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserBfbInfoReqIdl getUserBfbInfoReqIdl) {
            super(getUserBfbInfoReqIdl);
            if (getUserBfbInfoReqIdl == null) {
                return;
            }
            this.data = getUserBfbInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserBfbInfoReqIdl build(boolean z) {
            return new GetUserBfbInfoReqIdl(this, z);
        }
    }

    public GetUserBfbInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
