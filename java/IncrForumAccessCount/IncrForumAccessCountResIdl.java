package tbclient.IncrForumAccessCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class IncrForumAccessCountResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private IncrForumAccessCountResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<IncrForumAccessCountResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(IncrForumAccessCountResIdl incrForumAccessCountResIdl) {
            super(incrForumAccessCountResIdl);
            if (incrForumAccessCountResIdl != null) {
                this.error = incrForumAccessCountResIdl.error;
                this.data = incrForumAccessCountResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IncrForumAccessCountResIdl build(boolean z) {
            return new IncrForumAccessCountResIdl(this, z);
        }
    }
}
