package tbclient.IncrForumAccessCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class IncrForumAccessCountReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private IncrForumAccessCountReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<IncrForumAccessCountReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(IncrForumAccessCountReqIdl incrForumAccessCountReqIdl) {
            super(incrForumAccessCountReqIdl);
            if (incrForumAccessCountReqIdl != null) {
                this.data = incrForumAccessCountReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IncrForumAccessCountReqIdl build(boolean z) {
            return new IncrForumAccessCountReqIdl(this, z);
        }
    }
}
