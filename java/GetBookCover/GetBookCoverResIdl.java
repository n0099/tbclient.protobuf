package tbclient.GetBookCover;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetBookCoverResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetBookCoverResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetBookCoverResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBookCoverResIdl getBookCoverResIdl) {
            super(getBookCoverResIdl);
            if (getBookCoverResIdl != null) {
                this.error = getBookCoverResIdl.error;
                this.data = getBookCoverResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBookCoverResIdl build(boolean z) {
            return new GetBookCoverResIdl(this, z);
        }
    }
}
