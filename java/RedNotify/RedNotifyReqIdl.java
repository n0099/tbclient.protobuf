package tbclient.RedNotify;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class RedNotifyReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private RedNotifyReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<RedNotifyReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RedNotifyReqIdl redNotifyReqIdl) {
            super(redNotifyReqIdl);
            if (redNotifyReqIdl != null) {
                this.data = redNotifyReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RedNotifyReqIdl build(boolean z) {
            return new RedNotifyReqIdl(this, z);
        }
    }
}
