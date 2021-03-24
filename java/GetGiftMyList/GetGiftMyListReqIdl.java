package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class GetGiftMyListReqIdl extends Message {
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68429common;
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetGiftMyListReqIdl> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68430common;
        public DataReq data;

        public Builder() {
        }

        public Builder(GetGiftMyListReqIdl getGiftMyListReqIdl) {
            super(getGiftMyListReqIdl);
            if (getGiftMyListReqIdl == null) {
                return;
            }
            this.data = getGiftMyListReqIdl.data;
            this.f68430common = getGiftMyListReqIdl.f68429common;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftMyListReqIdl build(boolean z) {
            return new GetGiftMyListReqIdl(this, z);
        }
    }

    public GetGiftMyListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.f68429common = builder.f68430common;
            return;
        }
        this.data = builder.data;
        this.f68429common = builder.f68430common;
    }
}
