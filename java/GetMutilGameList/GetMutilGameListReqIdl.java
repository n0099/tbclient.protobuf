package tbclient.GetMutilGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetMutilGameListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetMutilGameListReqIdl(Builder builder, boolean z, GetMutilGameListReqIdl getMutilGameListReqIdl) {
        this(builder, z);
    }

    private GetMutilGameListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetMutilGameListReqIdl> {
        public DataReq data;

        public Builder(GetMutilGameListReqIdl getMutilGameListReqIdl) {
            super(getMutilGameListReqIdl);
            if (getMutilGameListReqIdl != null) {
                this.data = getMutilGameListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMutilGameListReqIdl build(boolean z) {
            return new GetMutilGameListReqIdl(this, z, null);
        }
    }
}
