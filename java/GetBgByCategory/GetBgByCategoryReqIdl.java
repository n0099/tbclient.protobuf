package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetBgByCategoryReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetBgByCategoryReqIdl(Builder builder, boolean z, GetBgByCategoryReqIdl getBgByCategoryReqIdl) {
        this(builder, z);
    }

    private GetBgByCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetBgByCategoryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBgByCategoryReqIdl getBgByCategoryReqIdl) {
            super(getBgByCategoryReqIdl);
            if (getBgByCategoryReqIdl != null) {
                this.data = getBgByCategoryReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBgByCategoryReqIdl build(boolean z) {
            return new GetBgByCategoryReqIdl(this, z, null);
        }
    }
}
