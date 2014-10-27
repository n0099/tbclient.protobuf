package tbclient.GetGameCategoryDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetGameCategoryDetailReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetGameCategoryDetailReqIdl(Builder builder, boolean z, GetGameCategoryDetailReqIdl getGameCategoryDetailReqIdl) {
        this(builder, z);
    }

    private GetGameCategoryDetailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetGameCategoryDetailReqIdl> {
        public DataReq data;

        public Builder(GetGameCategoryDetailReqIdl getGameCategoryDetailReqIdl) {
            super(getGameCategoryDetailReqIdl);
            if (getGameCategoryDetailReqIdl != null) {
                this.data = getGameCategoryDetailReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameCategoryDetailReqIdl build(boolean z) {
            return new GetGameCategoryDetailReqIdl(this, z, null);
        }
    }
}
