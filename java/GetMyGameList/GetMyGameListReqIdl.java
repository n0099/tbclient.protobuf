package tbclient.GetMyGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetMyGameListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetMyGameListReqIdl(Builder builder, boolean z, GetMyGameListReqIdl getMyGameListReqIdl) {
        this(builder, z);
    }

    private GetMyGameListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetMyGameListReqIdl> {
        public DataReq data;

        public Builder(GetMyGameListReqIdl getMyGameListReqIdl) {
            super(getMyGameListReqIdl);
            if (getMyGameListReqIdl != null) {
                this.data = getMyGameListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMyGameListReqIdl build(boolean z) {
            return new GetMyGameListReqIdl(this, z, null);
        }
    }
}
