package tbclient.GetSingleGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetSingleGameListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetSingleGameListReqIdl(Builder builder, boolean z, GetSingleGameListReqIdl getSingleGameListReqIdl) {
        this(builder, z);
    }

    private GetSingleGameListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetSingleGameListReqIdl> {
        public DataReq data;

        public Builder(GetSingleGameListReqIdl getSingleGameListReqIdl) {
            super(getSingleGameListReqIdl);
            if (getSingleGameListReqIdl != null) {
                this.data = getSingleGameListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetSingleGameListReqIdl build(boolean z) {
            return new GetSingleGameListReqIdl(this, z, null);
        }
    }
}
