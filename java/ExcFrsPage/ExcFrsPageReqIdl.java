package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class ExcFrsPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ExcFrsPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ExcFrsPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ExcFrsPageReqIdl excFrsPageReqIdl) {
            super(excFrsPageReqIdl);
            if (excFrsPageReqIdl != null) {
                this.data = excFrsPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcFrsPageReqIdl build(boolean z) {
            return new ExcFrsPageReqIdl(this, z);
        }
    }
}
