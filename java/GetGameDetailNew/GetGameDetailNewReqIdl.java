package tbclient.GetGameDetailNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetGameDetailNewReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetGameDetailNewReqIdl(Builder builder, boolean z, GetGameDetailNewReqIdl getGameDetailNewReqIdl) {
        this(builder, z);
    }

    private GetGameDetailNewReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetGameDetailNewReqIdl> {
        public DataReq data;

        public Builder(GetGameDetailNewReqIdl getGameDetailNewReqIdl) {
            super(getGameDetailNewReqIdl);
            if (getGameDetailNewReqIdl != null) {
                this.data = getGameDetailNewReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameDetailNewReqIdl build(boolean z) {
            return new GetGameDetailNewReqIdl(this, z, null);
        }
    }
}
