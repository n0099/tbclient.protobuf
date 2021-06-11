package tbclient.AddTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class AddTailResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AddTailResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(AddTailResIdl addTailResIdl) {
            super(addTailResIdl);
            if (addTailResIdl == null) {
                return;
            }
            this.data = addTailResIdl.data;
            this.error = addTailResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddTailResIdl build(boolean z) {
            return new AddTailResIdl(this, z);
        }
    }

    public AddTailResIdl(Builder builder, boolean z) {
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
