package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class GetForumSquareResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetForumSquareResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetForumSquareResIdl getForumSquareResIdl) {
            super(getForumSquareResIdl);
            if (getForumSquareResIdl == null) {
                return;
            }
            this.error = getForumSquareResIdl.error;
            this.data = getForumSquareResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumSquareResIdl build(boolean z) {
            return new GetForumSquareResIdl(this, z);
        }
    }

    public GetForumSquareResIdl(Builder builder, boolean z) {
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
