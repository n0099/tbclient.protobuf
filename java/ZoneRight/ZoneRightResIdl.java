package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class ZoneRightResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ZoneRightResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ZoneRightResIdl zoneRightResIdl) {
            super(zoneRightResIdl);
            if (zoneRightResIdl == null) {
                return;
            }
            this.error = zoneRightResIdl.error;
            this.data = zoneRightResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ZoneRightResIdl build(boolean z) {
            return new ZoneRightResIdl(this, z);
        }
    }

    public ZoneRightResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
