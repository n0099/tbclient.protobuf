package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetBubbleByCategoryResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetBubbleByCategoryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBubbleByCategoryResIdl getBubbleByCategoryResIdl) {
            super(getBubbleByCategoryResIdl);
            if (getBubbleByCategoryResIdl == null) {
                return;
            }
            this.data = getBubbleByCategoryResIdl.data;
            this.error = getBubbleByCategoryResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBubbleByCategoryResIdl build(boolean z) {
            return new GetBubbleByCategoryResIdl(this, z);
        }
    }

    public GetBubbleByCategoryResIdl(Builder builder, boolean z) {
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
