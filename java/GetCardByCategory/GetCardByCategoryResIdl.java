package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetCardByCategoryResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetCardByCategoryResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetCardByCategoryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetCardByCategoryResIdl getCardByCategoryResIdl) {
            super(getCardByCategoryResIdl);
            if (getCardByCategoryResIdl != null) {
                this.error = getCardByCategoryResIdl.error;
                this.data = getCardByCategoryResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetCardByCategoryResIdl build(boolean z) {
            return new GetCardByCategoryResIdl(this, z);
        }
    }
}
