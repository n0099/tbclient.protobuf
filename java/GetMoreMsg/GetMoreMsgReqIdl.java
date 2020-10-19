package tbclient.GetMoreMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class GetMoreMsgReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetMoreMsgReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<GetMoreMsgReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMoreMsgReqIdl getMoreMsgReqIdl) {
            super(getMoreMsgReqIdl);
            if (getMoreMsgReqIdl != null) {
                this.data = getMoreMsgReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMoreMsgReqIdl build(boolean z) {
            return new GetMoreMsgReqIdl(this, z);
        }
    }
}
