package tbclient.GetHotGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GetHotGodReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetHotGodReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetHotGodReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetHotGodReqIdl getHotGodReqIdl) {
            super(getHotGodReqIdl);
            if (getHotGodReqIdl != null) {
                this.data = getHotGodReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHotGodReqIdl build(boolean z) {
            return new GetHotGodReqIdl(this, z);
        }
    }
}
