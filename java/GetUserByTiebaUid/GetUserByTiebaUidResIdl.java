package tbclient.GetUserByTiebaUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class GetUserByTiebaUidResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GetUserByTiebaUidResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUserByTiebaUidResIdl getUserByTiebaUidResIdl) {
            super(getUserByTiebaUidResIdl);
            if (getUserByTiebaUidResIdl == null) {
                return;
            }
            this.error = getUserByTiebaUidResIdl.error;
            this.data = getUserByTiebaUidResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserByTiebaUidResIdl build(boolean z) {
            return new GetUserByTiebaUidResIdl(this, z);
        }
    }

    public GetUserByTiebaUidResIdl(Builder builder, boolean z) {
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
