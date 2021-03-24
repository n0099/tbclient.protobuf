package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetGiftListByCategoryIdResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetGiftListByCategoryIdResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetGiftListByCategoryIdResIdl getGiftListByCategoryIdResIdl) {
            super(getGiftListByCategoryIdResIdl);
            if (getGiftListByCategoryIdResIdl == null) {
                return;
            }
            this.data = getGiftListByCategoryIdResIdl.data;
            this.error = getGiftListByCategoryIdResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGiftListByCategoryIdResIdl build(boolean z) {
            return new GetGiftListByCategoryIdResIdl(this, z);
        }
    }

    public GetGiftListByCategoryIdResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
