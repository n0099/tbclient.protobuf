package tbclient.GetChannelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class GetChannelInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetChannelInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<GetChannelInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetChannelInfoReqIdl getChannelInfoReqIdl) {
            super(getChannelInfoReqIdl);
            if (getChannelInfoReqIdl != null) {
                this.data = getChannelInfoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetChannelInfoReqIdl build(boolean z) {
            return new GetChannelInfoReqIdl(this, z);
        }
    }
}
