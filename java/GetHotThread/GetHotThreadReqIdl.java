package tbclient.GetHotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetHotThreadReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetHotThreadReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetHotThreadReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetHotThreadReqIdl getHotThreadReqIdl) {
            super(getHotThreadReqIdl);
            if (getHotThreadReqIdl != null) {
                this.data = getHotThreadReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHotThreadReqIdl build(boolean z) {
            return new GetHotThreadReqIdl(this, z);
        }
    }
}
