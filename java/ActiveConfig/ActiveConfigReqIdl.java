package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ActiveConfigReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ActiveConfigReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ActiveConfigReqIdl activeConfigReqIdl) {
            super(activeConfigReqIdl);
            if (activeConfigReqIdl == null) {
                return;
            }
            this.data = activeConfigReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveConfigReqIdl build(boolean z) {
            return new ActiveConfigReqIdl(this, z);
        }
    }

    public ActiveConfigReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
