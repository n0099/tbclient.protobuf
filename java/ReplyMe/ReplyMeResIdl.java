package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes21.dex */
public final class ReplyMeResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private ReplyMeResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<ReplyMeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ReplyMeResIdl replyMeResIdl) {
            super(replyMeResIdl);
            if (replyMeResIdl != null) {
                this.error = replyMeResIdl.error;
                this.data = replyMeResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyMeResIdl build(boolean z) {
            return new ReplyMeResIdl(this, z);
        }
    }
}
