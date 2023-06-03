package tbclient.GetBubbleList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetBubbleListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetBubbleListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBubbleListReqIdl getBubbleListReqIdl) {
            super(getBubbleListReqIdl);
            if (getBubbleListReqIdl == null) {
                return;
            }
            this.data = getBubbleListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBubbleListReqIdl build(boolean z) {
            return new GetBubbleListReqIdl(this, z);
        }
    }

    public GetBubbleListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
