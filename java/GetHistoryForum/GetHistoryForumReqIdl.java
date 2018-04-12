package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetHistoryForumReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetHistoryForumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetHistoryForumReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetHistoryForumReqIdl getHistoryForumReqIdl) {
            super(getHistoryForumReqIdl);
            if (getHistoryForumReqIdl != null) {
                this.data = getHistoryForumReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHistoryForumReqIdl build(boolean z) {
            return new GetHistoryForumReqIdl(this, z);
        }
    }
}
