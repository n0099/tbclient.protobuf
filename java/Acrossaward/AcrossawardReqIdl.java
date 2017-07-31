package tbclient.Acrossaward;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AcrossawardReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private AcrossawardReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AcrossawardReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AcrossawardReqIdl acrossawardReqIdl) {
            super(acrossawardReqIdl);
            if (acrossawardReqIdl != null) {
                this.data = acrossawardReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AcrossawardReqIdl build(boolean z) {
            return new AcrossawardReqIdl(this, z);
        }
    }
}
