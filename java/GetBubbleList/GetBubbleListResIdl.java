package tbclient.GetBubbleList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetBubbleListResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetBubbleListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBubbleListResIdl getBubbleListResIdl) {
            super(getBubbleListResIdl);
            if (getBubbleListResIdl == null) {
                return;
            }
            this.data = getBubbleListResIdl.data;
            this.error = getBubbleListResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetBubbleListResIdl build(boolean z) {
            return new GetBubbleListResIdl(this, z);
        }
    }

    public GetBubbleListResIdl(Builder builder, boolean z) {
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
