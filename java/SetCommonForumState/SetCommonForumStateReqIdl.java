package tbclient.SetCommonForumState;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class SetCommonForumStateReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SetCommonForumStateReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SetCommonForumStateReqIdl setCommonForumStateReqIdl) {
            super(setCommonForumStateReqIdl);
            if (setCommonForumStateReqIdl == null) {
                return;
            }
            this.data = setCommonForumStateReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetCommonForumStateReqIdl build(boolean z) {
            return new SetCommonForumStateReqIdl(this, z);
        }
    }

    public SetCommonForumStateReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
