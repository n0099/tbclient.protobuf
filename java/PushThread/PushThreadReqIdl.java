package tbclient.PushThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PushThreadReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PushThreadReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PushThreadReqIdl pushThreadReqIdl) {
            super(pushThreadReqIdl);
            if (pushThreadReqIdl == null) {
                return;
            }
            this.data = pushThreadReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PushThreadReqIdl build(boolean z) {
            return new PushThreadReqIdl(this, z);
        }
    }

    public PushThreadReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
