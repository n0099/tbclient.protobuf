package tbclient.GetSkinList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetSkinListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetSkinListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetSkinListReqIdl getSkinListReqIdl) {
            super(getSkinListReqIdl);
            if (getSkinListReqIdl == null) {
                return;
            }
            this.data = getSkinListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSkinListReqIdl build(boolean z) {
            return new GetSkinListReqIdl(this, z);
        }
    }

    public GetSkinListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
