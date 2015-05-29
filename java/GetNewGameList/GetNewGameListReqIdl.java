package tbclient.GetNewGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetNewGameListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetNewGameListReqIdl(Builder builder, boolean z, GetNewGameListReqIdl getNewGameListReqIdl) {
        this(builder, z);
    }

    private GetNewGameListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetNewGameListReqIdl> {
        public DataReq data;

        public Builder(GetNewGameListReqIdl getNewGameListReqIdl) {
            super(getNewGameListReqIdl);
            if (getNewGameListReqIdl != null) {
                this.data = getNewGameListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetNewGameListReqIdl build(boolean z) {
            return new GetNewGameListReqIdl(this, z, null);
        }
    }
}
