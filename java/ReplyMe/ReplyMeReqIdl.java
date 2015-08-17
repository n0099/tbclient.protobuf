package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ReplyMeReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ ReplyMeReqIdl(Builder builder, boolean z, ReplyMeReqIdl replyMeReqIdl) {
        this(builder, z);
    }

    private ReplyMeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ReplyMeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ReplyMeReqIdl replyMeReqIdl) {
            super(replyMeReqIdl);
            if (replyMeReqIdl != null) {
                this.data = replyMeReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyMeReqIdl build(boolean z) {
            return new ReplyMeReqIdl(this, z, null);
        }
    }
}
