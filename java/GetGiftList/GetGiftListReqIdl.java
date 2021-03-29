package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetGiftListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetGiftListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetGiftListReqIdl getGiftListReqIdl) {
            super(getGiftListReqIdl);
            if (getGiftListReqIdl == null) {
                return;
            }
            this.data = getGiftListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftListReqIdl build(boolean z) {
            return new GetGiftListReqIdl(this, z);
        }
    }

    public GetGiftListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
