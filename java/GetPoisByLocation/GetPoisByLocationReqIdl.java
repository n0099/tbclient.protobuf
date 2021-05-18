package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetPoisByLocationReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetPoisByLocationReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetPoisByLocationReqIdl getPoisByLocationReqIdl) {
            super(getPoisByLocationReqIdl);
            if (getPoisByLocationReqIdl == null) {
                return;
            }
            this.data = getPoisByLocationReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPoisByLocationReqIdl build(boolean z) {
            return new GetPoisByLocationReqIdl(this, z);
        }
    }

    public GetPoisByLocationReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
