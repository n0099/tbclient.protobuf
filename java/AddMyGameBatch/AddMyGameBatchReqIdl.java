package tbclient.AddMyGameBatch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AddMyGameBatchReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ AddMyGameBatchReqIdl(Builder builder, boolean z, AddMyGameBatchReqIdl addMyGameBatchReqIdl) {
        this(builder, z);
    }

    private AddMyGameBatchReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<AddMyGameBatchReqIdl> {
        public DataReq data;

        public Builder(AddMyGameBatchReqIdl addMyGameBatchReqIdl) {
            super(addMyGameBatchReqIdl);
            if (addMyGameBatchReqIdl != null) {
                this.data = addMyGameBatchReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddMyGameBatchReqIdl build(boolean z) {
            return new AddMyGameBatchReqIdl(this, z, null);
        }
    }
}
