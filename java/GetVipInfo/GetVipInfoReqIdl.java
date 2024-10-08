package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetVipInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetVipInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetVipInfoReqIdl getVipInfoReqIdl) {
            super(getVipInfoReqIdl);
            if (getVipInfoReqIdl == null) {
                return;
            }
            this.data = getVipInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetVipInfoReqIdl build(boolean z) {
            return new GetVipInfoReqIdl(this, z);
        }
    }

    public GetVipInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
