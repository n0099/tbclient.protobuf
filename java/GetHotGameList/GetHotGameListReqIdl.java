package tbclient.GetHotGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetHotGameListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetHotGameListReqIdl(Builder builder, boolean z, GetHotGameListReqIdl getHotGameListReqIdl) {
        this(builder, z);
    }

    private GetHotGameListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetHotGameListReqIdl> {
        public DataReq data;

        public Builder(GetHotGameListReqIdl getHotGameListReqIdl) {
            super(getHotGameListReqIdl);
            if (getHotGameListReqIdl != null) {
                this.data = getHotGameListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHotGameListReqIdl build(boolean z) {
            return new GetHotGameListReqIdl(this, z, null);
        }
    }
}
