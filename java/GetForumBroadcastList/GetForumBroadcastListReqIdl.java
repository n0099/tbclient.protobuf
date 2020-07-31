package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes20.dex */
public final class GetForumBroadcastListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetForumBroadcastListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<GetForumBroadcastListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumBroadcastListReqIdl getForumBroadcastListReqIdl) {
            super(getForumBroadcastListReqIdl);
            if (getForumBroadcastListReqIdl != null) {
                this.data = getForumBroadcastListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumBroadcastListReqIdl build(boolean z) {
            return new GetForumBroadcastListReqIdl(this, z);
        }
    }
}
