package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class MoreTreasureTroveReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private MoreTreasureTroveReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MoreTreasureTroveReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(MoreTreasureTroveReqIdl moreTreasureTroveReqIdl) {
            super(moreTreasureTroveReqIdl);
            if (moreTreasureTroveReqIdl != null) {
                this.data = moreTreasureTroveReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MoreTreasureTroveReqIdl build(boolean z) {
            return new MoreTreasureTroveReqIdl(this, z);
        }
    }
}
