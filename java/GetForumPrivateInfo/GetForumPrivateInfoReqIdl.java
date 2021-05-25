package tbclient.GetForumPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GetForumPrivateInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetForumPrivateInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumPrivateInfoReqIdl getForumPrivateInfoReqIdl) {
            super(getForumPrivateInfoReqIdl);
            if (getForumPrivateInfoReqIdl == null) {
                return;
            }
            this.data = getForumPrivateInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumPrivateInfoReqIdl build(boolean z) {
            return new GetForumPrivateInfoReqIdl(this, z);
        }
    }

    public GetForumPrivateInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
