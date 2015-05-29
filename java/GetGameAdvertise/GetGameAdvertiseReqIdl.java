package tbclient.GetGameAdvertise;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetGameAdvertiseReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetGameAdvertiseReqIdl(Builder builder, boolean z, GetGameAdvertiseReqIdl getGameAdvertiseReqIdl) {
        this(builder, z);
    }

    private GetGameAdvertiseReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetGameAdvertiseReqIdl> {
        public DataReq data;

        public Builder(GetGameAdvertiseReqIdl getGameAdvertiseReqIdl) {
            super(getGameAdvertiseReqIdl);
            if (getGameAdvertiseReqIdl != null) {
                this.data = getGameAdvertiseReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameAdvertiseReqIdl build(boolean z) {
            return new GetGameAdvertiseReqIdl(this, z, null);
        }
    }
}
