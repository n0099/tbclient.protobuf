package tbclient.GetGameCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetGameCategoryReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetGameCategoryReqIdl(Builder builder, boolean z, GetGameCategoryReqIdl getGameCategoryReqIdl) {
        this(builder, z);
    }

    private GetGameCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GetGameCategoryReqIdl> {
        public DataReq data;

        public Builder(GetGameCategoryReqIdl getGameCategoryReqIdl) {
            super(getGameCategoryReqIdl);
            if (getGameCategoryReqIdl != null) {
                this.data = getGameCategoryReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameCategoryReqIdl build(boolean z) {
            return new GetGameCategoryReqIdl(this, z, null);
        }
    }
}
