package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetMyGiftReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetMyGiftReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMyGiftReqIdl getMyGiftReqIdl) {
            super(getMyGiftReqIdl);
            if (getMyGiftReqIdl == null) {
                return;
            }
            this.data = getMyGiftReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMyGiftReqIdl build(boolean z) {
            return new GetMyGiftReqIdl(this, z);
        }
    }

    public GetMyGiftReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
