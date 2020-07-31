package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class GetVerticalForumListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetVerticalForumListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<GetVerticalForumListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetVerticalForumListReqIdl getVerticalForumListReqIdl) {
            super(getVerticalForumListReqIdl);
            if (getVerticalForumListReqIdl != null) {
                this.data = getVerticalForumListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetVerticalForumListReqIdl build(boolean z) {
            return new GetVerticalForumListReqIdl(this, z);
        }
    }
}
