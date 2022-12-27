package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class RelateRecThreadResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RelateRecThreadResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RelateRecThreadResIdl relateRecThreadResIdl) {
            super(relateRecThreadResIdl);
            if (relateRecThreadResIdl == null) {
                return;
            }
            this.error = relateRecThreadResIdl.error;
            this.data = relateRecThreadResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RelateRecThreadResIdl build(boolean z) {
            return new RelateRecThreadResIdl(this, z);
        }
    }

    public RelateRecThreadResIdl(Builder builder, boolean z) {
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
