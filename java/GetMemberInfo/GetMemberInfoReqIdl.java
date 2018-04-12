package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class GetMemberInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetMemberInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<GetMemberInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMemberInfoReqIdl getMemberInfoReqIdl) {
            super(getMemberInfoReqIdl);
            if (getMemberInfoReqIdl != null) {
                this.data = getMemberInfoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMemberInfoReqIdl build(boolean z) {
            return new GetMemberInfoReqIdl(this, z);
        }
    }
}