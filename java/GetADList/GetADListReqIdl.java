package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class GetADListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetADListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<GetADListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetADListReqIdl getADListReqIdl) {
            super(getADListReqIdl);
            if (getADListReqIdl != null) {
                this.data = getADListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetADListReqIdl build(boolean z) {
            return new GetADListReqIdl(this, z);
        }
    }
}
