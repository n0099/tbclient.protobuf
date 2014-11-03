package tbclient.XiubaExchange;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class XiubaExchangeReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ XiubaExchangeReqIdl(Builder builder, boolean z, XiubaExchangeReqIdl xiubaExchangeReqIdl) {
        this(builder, z);
    }

    private XiubaExchangeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<XiubaExchangeReqIdl> {
        public DataReq data;

        public Builder(XiubaExchangeReqIdl xiubaExchangeReqIdl) {
            super(xiubaExchangeReqIdl);
            if (xiubaExchangeReqIdl != null) {
                this.data = xiubaExchangeReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public XiubaExchangeReqIdl build(boolean z) {
            return new XiubaExchangeReqIdl(this, z, null);
        }
    }
}
