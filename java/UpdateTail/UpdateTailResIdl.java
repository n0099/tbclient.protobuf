package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class UpdateTailResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    private UpdateTailResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<UpdateTailResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(UpdateTailResIdl updateTailResIdl) {
            super(updateTailResIdl);
            if (updateTailResIdl != null) {
                this.data = updateTailResIdl.data;
                this.error = updateTailResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UpdateTailResIdl build(boolean z) {
            return new UpdateTailResIdl(this, z);
        }
    }
}
