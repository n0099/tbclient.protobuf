package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetUserFreeChanceReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetUserFreeChanceReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserFreeChanceReqIdl getUserFreeChanceReqIdl) {
            super(getUserFreeChanceReqIdl);
            if (getUserFreeChanceReqIdl == null) {
                return;
            }
            this.data = getUserFreeChanceReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserFreeChanceReqIdl build(boolean z) {
            return new GetUserFreeChanceReqIdl(this, z);
        }
    }

    public GetUserFreeChanceReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}