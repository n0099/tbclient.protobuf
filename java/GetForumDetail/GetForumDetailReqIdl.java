package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetForumDetailReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetForumDetailReqIdl(Builder builder, boolean z, GetForumDetailReqIdl getForumDetailReqIdl) {
        this(builder, z);
    }

    private GetForumDetailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetForumDetailReqIdl> {
        public DataReq data;

        public Builder(GetForumDetailReqIdl getForumDetailReqIdl) {
            super(getForumDetailReqIdl);
            if (getForumDetailReqIdl != null) {
                this.data = getForumDetailReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumDetailReqIdl build(boolean z) {
            return new GetForumDetailReqIdl(this, z, null);
        }
    }
}
