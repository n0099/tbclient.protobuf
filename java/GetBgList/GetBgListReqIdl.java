package tbclient.GetBgList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetBgListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetBgListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetBgListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBgListReqIdl getBgListReqIdl) {
            super(getBgListReqIdl);
            if (getBgListReqIdl != null) {
                this.data = getBgListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBgListReqIdl build(boolean z) {
            return new GetBgListReqIdl(this, z);
        }
    }
}
