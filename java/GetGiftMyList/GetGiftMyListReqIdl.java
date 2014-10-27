package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class GetGiftMyListReqIdl extends Message {
    @ProtoField(tag = 2)
    public final CommonReq common;
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetGiftMyListReqIdl(Builder builder, boolean z, GetGiftMyListReqIdl getGiftMyListReqIdl) {
        this(builder, z);
    }

    private GetGiftMyListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.common = builder.common;
            return;
        }
        this.data = builder.data;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetGiftMyListReqIdl> {
        public CommonReq common;
        public DataReq data;

        public Builder(GetGiftMyListReqIdl getGiftMyListReqIdl) {
            super(getGiftMyListReqIdl);
            if (getGiftMyListReqIdl != null) {
                this.data = getGiftMyListReqIdl.data;
                this.common = getGiftMyListReqIdl.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftMyListReqIdl build(boolean z) {
            return new GetGiftMyListReqIdl(this, z, null);
        }
    }
}
