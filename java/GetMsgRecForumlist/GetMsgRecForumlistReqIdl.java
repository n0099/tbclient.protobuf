package tbclient.GetMsgRecForumlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GetMsgRecForumlistReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetMsgRecForumlistReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMsgRecForumlistReqIdl getMsgRecForumlistReqIdl) {
            super(getMsgRecForumlistReqIdl);
            if (getMsgRecForumlistReqIdl == null) {
                return;
            }
            this.data = getMsgRecForumlistReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMsgRecForumlistReqIdl build(boolean z) {
            return new GetMsgRecForumlistReqIdl(this, z);
        }
    }

    public GetMsgRecForumlistReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
