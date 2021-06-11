package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class DeleteTailResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DeleteTailResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(DeleteTailResIdl deleteTailResIdl) {
            super(deleteTailResIdl);
            if (deleteTailResIdl == null) {
                return;
            }
            this.data = deleteTailResIdl.data;
            this.error = deleteTailResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DeleteTailResIdl build(boolean z) {
            return new DeleteTailResIdl(this, z);
        }
    }

    public DeleteTailResIdl(Builder builder, boolean z) {
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
