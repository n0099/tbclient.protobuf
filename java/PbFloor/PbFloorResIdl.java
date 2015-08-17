package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class PbFloorResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ PbFloorResIdl(Builder builder, boolean z, PbFloorResIdl pbFloorResIdl) {
        this(builder, z);
    }

    private PbFloorResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PbFloorResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PbFloorResIdl pbFloorResIdl) {
            super(pbFloorResIdl);
            if (pbFloorResIdl != null) {
                this.error = pbFloorResIdl.error;
                this.data = pbFloorResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbFloorResIdl build(boolean z) {
            return new PbFloorResIdl(this, z, null);
        }
    }
}
