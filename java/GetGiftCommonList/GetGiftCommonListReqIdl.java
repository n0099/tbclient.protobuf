package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetGiftCommonListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetGiftCommonListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetGiftCommonListReqIdl getGiftCommonListReqIdl) {
            super(getGiftCommonListReqIdl);
            if (getGiftCommonListReqIdl == null) {
                return;
            }
            this.data = getGiftCommonListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftCommonListReqIdl build(boolean z) {
            return new GetGiftCommonListReqIdl(this, z);
        }
    }

    public GetGiftCommonListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
