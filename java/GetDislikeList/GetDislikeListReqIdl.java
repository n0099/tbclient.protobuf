package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetDislikeListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetDislikeListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetDislikeListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetDislikeListReqIdl getDislikeListReqIdl) {
            super(getDislikeListReqIdl);
            if (getDislikeListReqIdl != null) {
                this.data = getDislikeListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetDislikeListReqIdl build(boolean z) {
            return new GetDislikeListReqIdl(this, z);
        }
    }
}
