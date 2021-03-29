package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class MoreTreasureTroveResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<MoreTreasureTroveResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(MoreTreasureTroveResIdl moreTreasureTroveResIdl) {
            super(moreTreasureTroveResIdl);
            if (moreTreasureTroveResIdl == null) {
                return;
            }
            this.error = moreTreasureTroveResIdl.error;
            this.data = moreTreasureTroveResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MoreTreasureTroveResIdl build(boolean z) {
            return new MoreTreasureTroveResIdl(this, z);
        }
    }

    public MoreTreasureTroveResIdl(Builder builder, boolean z) {
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