package tbclient.GetBgList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GetBgListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetBgListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBgListReqIdl getBgListReqIdl) {
            super(getBgListReqIdl);
            if (getBgListReqIdl == null) {
                return;
            }
            this.data = getBgListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBgListReqIdl build(boolean z) {
            return new GetBgListReqIdl(this, z);
        }
    }

    public GetBgListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
