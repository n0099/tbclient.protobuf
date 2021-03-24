package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetForumDetailReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetForumDetailReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumDetailReqIdl getForumDetailReqIdl) {
            super(getForumDetailReqIdl);
            if (getForumDetailReqIdl == null) {
                return;
            }
            this.data = getForumDetailReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumDetailReqIdl build(boolean z) {
            return new GetForumDetailReqIdl(this, z);
        }
    }

    public GetForumDetailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
