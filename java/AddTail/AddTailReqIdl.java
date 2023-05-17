package tbclient.AddTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class AddTailReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AddTailReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(AddTailReqIdl addTailReqIdl) {
            super(addTailReqIdl);
            if (addTailReqIdl == null) {
                return;
            }
            this.data = addTailReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddTailReqIdl build(boolean z) {
            return new AddTailReqIdl(this, z);
        }
    }

    public AddTailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
