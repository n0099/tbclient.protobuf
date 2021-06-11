package tbclient.GetCardList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetCardListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetCardListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetCardListResIdl getCardListResIdl) {
            super(getCardListResIdl);
            if (getCardListResIdl == null) {
                return;
            }
            this.error = getCardListResIdl.error;
            this.data = getCardListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetCardListResIdl build(boolean z) {
            return new GetCardListResIdl(this, z);
        }
    }

    public GetCardListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
