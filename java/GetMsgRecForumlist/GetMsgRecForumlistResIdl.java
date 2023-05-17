package tbclient.GetMsgRecForumlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class GetMsgRecForumlistResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetMsgRecForumlistResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetMsgRecForumlistResIdl getMsgRecForumlistResIdl) {
            super(getMsgRecForumlistResIdl);
            if (getMsgRecForumlistResIdl == null) {
                return;
            }
            this.error = getMsgRecForumlistResIdl.error;
            this.data = getMsgRecForumlistResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMsgRecForumlistResIdl build(boolean z) {
            return new GetMsgRecForumlistResIdl(this, z);
        }
    }

    public GetMsgRecForumlistResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
