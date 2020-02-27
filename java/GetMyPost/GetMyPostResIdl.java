package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetMyPostResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GetMyPostResIdl(Builder builder, boolean z) {
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
    public static final class Builder extends Message.Builder<GetMyPostResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetMyPostResIdl getMyPostResIdl) {
            super(getMyPostResIdl);
            if (getMyPostResIdl != null) {
                this.error = getMyPostResIdl.error;
                this.data = getMyPostResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMyPostResIdl build(boolean z) {
            return new GetMyPostResIdl(this, z);
        }
    }
}
