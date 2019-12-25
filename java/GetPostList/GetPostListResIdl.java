package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes6.dex */
public final class GetPostListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetPostListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<GetPostListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetPostListResIdl getPostListResIdl) {
            super(getPostListResIdl);
            if (getPostListResIdl != null) {
                this.error = getPostListResIdl.error;
                this.data = getPostListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPostListResIdl build(boolean z) {
            return new GetPostListResIdl(this, z);
        }
    }
}
