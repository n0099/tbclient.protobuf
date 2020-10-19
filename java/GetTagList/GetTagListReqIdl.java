package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes23.dex */
public final class GetTagListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetTagListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes23.dex */
    public static final class Builder extends Message.Builder<GetTagListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetTagListReqIdl getTagListReqIdl) {
            super(getTagListReqIdl);
            if (getTagListReqIdl != null) {
                this.data = getTagListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetTagListReqIdl build(boolean z) {
            return new GetTagListReqIdl(this, z);
        }
    }
}
