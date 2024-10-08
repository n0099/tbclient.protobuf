package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AddPollPostReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AddPollPostReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AddPollPostReqIdl addPollPostReqIdl) {
            super(addPollPostReqIdl);
            if (addPollPostReqIdl == null) {
                return;
            }
            this.data = addPollPostReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddPollPostReqIdl build(boolean z) {
            return new AddPollPostReqIdl(this, z);
        }
    }

    public AddPollPostReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
