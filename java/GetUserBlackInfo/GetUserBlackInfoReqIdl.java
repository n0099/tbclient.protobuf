package tbclient.GetUserBlackInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetUserBlackInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetUserBlackInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserBlackInfoReqIdl getUserBlackInfoReqIdl) {
            super(getUserBlackInfoReqIdl);
            if (getUserBlackInfoReqIdl == null) {
                return;
            }
            this.data = getUserBlackInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserBlackInfoReqIdl build(boolean z) {
            return new GetUserBlackInfoReqIdl(this, z);
        }
    }

    public GetUserBlackInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
