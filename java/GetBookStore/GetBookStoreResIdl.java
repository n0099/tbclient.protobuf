package tbclient.GetBookStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes4.dex */
public final class GetBookStoreResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetBookStoreResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GetBookStoreResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBookStoreResIdl getBookStoreResIdl) {
            super(getBookStoreResIdl);
            if (getBookStoreResIdl != null) {
                this.error = getBookStoreResIdl.error;
                this.data = getBookStoreResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBookStoreResIdl build(boolean z) {
            return new GetBookStoreResIdl(this, z);
        }
    }
}
