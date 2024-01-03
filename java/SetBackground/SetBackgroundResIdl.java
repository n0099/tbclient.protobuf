package tbclient.SetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class SetBackgroundResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SetBackgroundResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SetBackgroundResIdl setBackgroundResIdl) {
            super(setBackgroundResIdl);
            if (setBackgroundResIdl == null) {
                return;
            }
            this.data = setBackgroundResIdl.data;
            this.error = setBackgroundResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetBackgroundResIdl build(boolean z) {
            return new SetBackgroundResIdl(this, z);
        }
    }

    public SetBackgroundResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
