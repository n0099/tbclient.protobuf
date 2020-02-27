package tbclient.SmartAppList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SmartAppListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private SmartAppListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SmartAppListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SmartAppListReqIdl smartAppListReqIdl) {
            super(smartAppListReqIdl);
            if (smartAppListReqIdl != null) {
                this.data = smartAppListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SmartAppListReqIdl build(boolean z) {
            return new SmartAppListReqIdl(this, z);
        }
    }
}
