package tbclient.GetMyShelf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class GetMyShelfReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetMyShelfReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GetMyShelfReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMyShelfReqIdl getMyShelfReqIdl) {
            super(getMyShelfReqIdl);
            if (getMyShelfReqIdl != null) {
                this.data = getMyShelfReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMyShelfReqIdl build(boolean z) {
            return new GetMyShelfReqIdl(this, z);
        }
    }
}
