package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ZoneRightReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ZoneRightReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ZoneRightReqIdl zoneRightReqIdl) {
            super(zoneRightReqIdl);
            if (zoneRightReqIdl == null) {
                return;
            }
            this.data = zoneRightReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ZoneRightReqIdl build(boolean z) {
            return new ZoneRightReqIdl(this, z);
        }
    }

    public ZoneRightReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
