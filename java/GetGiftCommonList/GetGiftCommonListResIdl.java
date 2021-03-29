package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetGiftCommonListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetGiftCommonListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetGiftCommonListResIdl getGiftCommonListResIdl) {
            super(getGiftCommonListResIdl);
            if (getGiftCommonListResIdl == null) {
                return;
            }
            this.error = getGiftCommonListResIdl.error;
            this.data = getGiftCommonListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftCommonListResIdl build(boolean z) {
            return new GetGiftCommonListResIdl(this, z);
        }
    }

    public GetGiftCommonListResIdl(Builder builder, boolean z) {
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
