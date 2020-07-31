package tbclient.CommitCardInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes15.dex */
public final class CommitCardInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private CommitCardInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes15.dex */
    public static final class Builder extends Message.Builder<CommitCardInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CommitCardInfoReqIdl commitCardInfoReqIdl) {
            super(commitCardInfoReqIdl);
            if (commitCardInfoReqIdl != null) {
                this.data = commitCardInfoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommitCardInfoReqIdl build(boolean z) {
            return new CommitCardInfoReqIdl(this, z);
        }
    }
}
