package tbclient.GetUpdateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GetUpdateInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetUpdateInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetUpdateInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUpdateInfoReqIdl getUpdateInfoReqIdl) {
            super(getUpdateInfoReqIdl);
            if (getUpdateInfoReqIdl != null) {
                this.data = getUpdateInfoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUpdateInfoReqIdl build(boolean z) {
            return new GetUpdateInfoReqIdl(this, z);
        }
    }
}
