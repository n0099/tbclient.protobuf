package tbclient.SetUserBlack;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class SetUserBlackResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SetUserBlackResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SetUserBlackResIdl setUserBlackResIdl) {
            super(setUserBlackResIdl);
            if (setUserBlackResIdl == null) {
                return;
            }
            this.error = setUserBlackResIdl.error;
            this.data = setUserBlackResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetUserBlackResIdl build(boolean z) {
            return new SetUserBlackResIdl(this, z);
        }
    }

    public SetUserBlackResIdl(Builder builder, boolean z) {
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
