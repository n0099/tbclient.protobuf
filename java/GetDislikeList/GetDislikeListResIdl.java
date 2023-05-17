package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class GetDislikeListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetDislikeListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetDislikeListResIdl getDislikeListResIdl) {
            super(getDislikeListResIdl);
            if (getDislikeListResIdl == null) {
                return;
            }
            this.error = getDislikeListResIdl.error;
            this.data = getDislikeListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetDislikeListResIdl build(boolean z) {
            return new GetDislikeListResIdl(this, z);
        }
    }

    public GetDislikeListResIdl(Builder builder, boolean z) {
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
