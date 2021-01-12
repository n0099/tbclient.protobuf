package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetTailsReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    private GetTailsReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetTailsReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(GetTailsReqIdl getTailsReqIdl) {
            super(getTailsReqIdl);
            if (getTailsReqIdl != null) {
                this.data = getTailsReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetTailsReqIdl build(boolean z) {
            return new GetTailsReqIdl(this, z);
        }
    }
}
