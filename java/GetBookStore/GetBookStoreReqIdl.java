package tbclient.GetBookStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetBookStoreReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetBookStoreReqIdl(Builder builder, boolean z, GetBookStoreReqIdl getBookStoreReqIdl) {
        this(builder, z);
    }

    private GetBookStoreReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetBookStoreReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBookStoreReqIdl getBookStoreReqIdl) {
            super(getBookStoreReqIdl);
            if (getBookStoreReqIdl != null) {
                this.data = getBookStoreReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBookStoreReqIdl build(boolean z) {
            return new GetBookStoreReqIdl(this, z, null);
        }
    }
}
