package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class GetGiftMyListReqIdl extends Message {
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14818common;
    @ProtoField(tag = 1)
    public final DataReq data;

    private GetGiftMyListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.f14818common = builder.f14819common;
            return;
        }
        this.data = builder.data;
        this.f14818common = builder.f14819common;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetGiftMyListReqIdl> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14819common;
        public DataReq data;

        public Builder() {
        }

        public Builder(GetGiftMyListReqIdl getGiftMyListReqIdl) {
            super(getGiftMyListReqIdl);
            if (getGiftMyListReqIdl != null) {
                this.data = getGiftMyListReqIdl.data;
                this.f14819common = getGiftMyListReqIdl.f14818common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftMyListReqIdl build(boolean z) {
            return new GetGiftMyListReqIdl(this, z);
        }
    }
}
