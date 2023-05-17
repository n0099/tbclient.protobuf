package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class SetTailResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SetTailResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(SetTailResIdl setTailResIdl) {
            super(setTailResIdl);
            if (setTailResIdl == null) {
                return;
            }
            this.data = setTailResIdl.data;
            this.error = setTailResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetTailResIdl build(boolean z) {
            return new SetTailResIdl(this, z);
        }
    }

    public SetTailResIdl(Builder builder, boolean z) {
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
