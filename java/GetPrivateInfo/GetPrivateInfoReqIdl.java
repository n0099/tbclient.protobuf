package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class GetPrivateInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    private GetPrivateInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<GetPrivateInfoReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(GetPrivateInfoReqIdl getPrivateInfoReqIdl) {
            super(getPrivateInfoReqIdl);
            if (getPrivateInfoReqIdl != null) {
                this.data = getPrivateInfoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPrivateInfoReqIdl build(boolean z) {
            return new GetPrivateInfoReqIdl(this, z);
        }
    }
}
