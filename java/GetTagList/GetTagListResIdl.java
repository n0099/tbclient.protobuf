package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes5.dex */
public final class GetTagListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetTagListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<GetTagListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetTagListResIdl getTagListResIdl) {
            super(getTagListResIdl);
            if (getTagListResIdl != null) {
                this.error = getTagListResIdl.error;
                this.data = getTagListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetTagListResIdl build(boolean z) {
            return new GetTagListResIdl(this, z);
        }
    }
}
