package tbclient.BackUser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BackUserReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BackUserReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(BackUserReqIdl backUserReqIdl) {
            super(backUserReqIdl);
            if (backUserReqIdl == null) {
                return;
            }
            this.data = backUserReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BackUserReqIdl build(boolean z) {
            return new BackUserReqIdl(this, z);
        }
    }

    public BackUserReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
