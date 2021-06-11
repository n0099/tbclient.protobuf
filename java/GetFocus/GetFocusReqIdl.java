package tbclient.GetFocus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetFocusReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetFocusReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetFocusReqIdl getFocusReqIdl) {
            super(getFocusReqIdl);
            if (getFocusReqIdl == null) {
                return;
            }
            this.data = getFocusReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetFocusReqIdl build(boolean z) {
            return new GetFocusReqIdl(this, z);
        }
    }

    public GetFocusReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
