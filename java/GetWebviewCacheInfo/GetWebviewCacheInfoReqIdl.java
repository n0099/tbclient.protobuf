package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GetWebviewCacheInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetWebviewCacheInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetWebviewCacheInfoReqIdl getWebviewCacheInfoReqIdl) {
            super(getWebviewCacheInfoReqIdl);
            if (getWebviewCacheInfoReqIdl == null) {
                return;
            }
            this.data = getWebviewCacheInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetWebviewCacheInfoReqIdl build(boolean z) {
            return new GetWebviewCacheInfoReqIdl(this, z);
        }
    }

    public GetWebviewCacheInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
