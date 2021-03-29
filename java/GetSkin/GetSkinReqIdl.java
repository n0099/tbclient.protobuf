package tbclient.GetSkin;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetSkinReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetSkinReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetSkinReqIdl getSkinReqIdl) {
            super(getSkinReqIdl);
            if (getSkinReqIdl == null) {
                return;
            }
            this.data = getSkinReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSkinReqIdl build(boolean z) {
            return new GetSkinReqIdl(this, z);
        }
    }

    public GetSkinReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}