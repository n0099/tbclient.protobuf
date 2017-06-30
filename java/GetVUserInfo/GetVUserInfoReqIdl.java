package tbclient.GetVUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetVUserInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetVUserInfoReqIdl(Builder builder, boolean z, GetVUserInfoReqIdl getVUserInfoReqIdl) {
        this(builder, z);
    }

    private GetVUserInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetVUserInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetVUserInfoReqIdl getVUserInfoReqIdl) {
            super(getVUserInfoReqIdl);
            if (getVUserInfoReqIdl != null) {
                this.data = getVUserInfoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetVUserInfoReqIdl build(boolean z) {
            return new GetVUserInfoReqIdl(this, z, null);
        }
    }
}
