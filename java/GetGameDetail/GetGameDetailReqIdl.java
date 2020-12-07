package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes26.dex */
public final class GetGameDetailReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetGameDetailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes26.dex */
    public static final class Builder extends Message.Builder<GetGameDetailReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetGameDetailReqIdl getGameDetailReqIdl) {
            super(getGameDetailReqIdl);
            if (getGameDetailReqIdl != null) {
                this.data = getGameDetailReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameDetailReqIdl build(boolean z) {
            return new GetGameDetailReqIdl(this, z);
        }
    }
}
