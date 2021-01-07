package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetGiftMyListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetGiftMyListResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GetGiftMyListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetGiftMyListResIdl getGiftMyListResIdl) {
            super(getGiftMyListResIdl);
            if (getGiftMyListResIdl != null) {
                this.error = getGiftMyListResIdl.error;
                this.data = getGiftMyListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftMyListResIdl build(boolean z) {
            return new GetGiftMyListResIdl(this, z);
        }
    }
}
