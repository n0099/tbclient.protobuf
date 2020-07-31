package tbclient.GetFocus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class GetFocusReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetFocusReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GetFocusReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetFocusReqIdl getFocusReqIdl) {
            super(getFocusReqIdl);
            if (getFocusReqIdl != null) {
                this.data = getFocusReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetFocusReqIdl build(boolean z) {
            return new GetFocusReqIdl(this, z);
        }
    }
}
