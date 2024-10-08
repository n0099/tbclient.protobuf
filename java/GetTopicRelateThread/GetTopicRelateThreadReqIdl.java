package tbclient.GetTopicRelateThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetTopicRelateThreadReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetTopicRelateThreadReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetTopicRelateThreadReqIdl getTopicRelateThreadReqIdl) {
            super(getTopicRelateThreadReqIdl);
            if (getTopicRelateThreadReqIdl == null) {
                return;
            }
            this.data = getTopicRelateThreadReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetTopicRelateThreadReqIdl build(boolean z) {
            return new GetTopicRelateThreadReqIdl(this, z);
        }
    }

    public GetTopicRelateThreadReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
