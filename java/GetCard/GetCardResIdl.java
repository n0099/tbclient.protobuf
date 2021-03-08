package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetCardResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetCardResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetCardResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetCardResIdl getCardResIdl) {
            super(getCardResIdl);
            if (getCardResIdl != null) {
                this.error = getCardResIdl.error;
                this.data = getCardResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetCardResIdl build(boolean z) {
            return new GetCardResIdl(this, z);
        }
    }
}
