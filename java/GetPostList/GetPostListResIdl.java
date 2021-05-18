package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetPostListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetPostListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetPostListResIdl getPostListResIdl) {
            super(getPostListResIdl);
            if (getPostListResIdl == null) {
                return;
            }
            this.error = getPostListResIdl.error;
            this.data = getPostListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetPostListResIdl build(boolean z) {
            return new GetPostListResIdl(this, z);
        }
    }

    public GetPostListResIdl(Builder builder, boolean z) {
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
