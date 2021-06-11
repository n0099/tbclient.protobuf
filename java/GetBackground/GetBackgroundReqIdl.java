package tbclient.GetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetBackgroundReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetBackgroundReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBackgroundReqIdl getBackgroundReqIdl) {
            super(getBackgroundReqIdl);
            if (getBackgroundReqIdl == null) {
                return;
            }
            this.data = getBackgroundReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBackgroundReqIdl build(boolean z) {
            return new GetBackgroundReqIdl(this, z);
        }
    }

    public GetBackgroundReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
