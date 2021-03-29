package tbclient.SetPendant;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class SetPendantResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SetPendantResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SetPendantResIdl setPendantResIdl) {
            super(setPendantResIdl);
            if (setPendantResIdl == null) {
                return;
            }
            this.error = setPendantResIdl.error;
            this.data = setPendantResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetPendantResIdl build(boolean z) {
            return new SetPendantResIdl(this, z);
        }
    }

    public SetPendantResIdl(Builder builder, boolean z) {
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
