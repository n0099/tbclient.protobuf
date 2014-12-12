package tbclient.AddMyGameBatch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class AddMyGameBatchResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ AddMyGameBatchResIdl(Builder builder, boolean z, AddMyGameBatchResIdl addMyGameBatchResIdl) {
        this(builder, z);
    }

    private AddMyGameBatchResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<AddMyGameBatchResIdl> {
        public ResData data;
        public Error error;

        public Builder(AddMyGameBatchResIdl addMyGameBatchResIdl) {
            super(addMyGameBatchResIdl);
            if (addMyGameBatchResIdl != null) {
                this.error = addMyGameBatchResIdl.error;
                this.data = addMyGameBatchResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddMyGameBatchResIdl build(boolean z) {
            return new AddMyGameBatchResIdl(this, z, null);
        }
    }
}
