package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DeleteTailReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    private DeleteTailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DeleteTailReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(DeleteTailReqIdl deleteTailReqIdl) {
            super(deleteTailReqIdl);
            if (deleteTailReqIdl != null) {
                this.data = deleteTailReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DeleteTailReqIdl build(boolean z) {
            return new DeleteTailReqIdl(this, z);
        }
    }
}
