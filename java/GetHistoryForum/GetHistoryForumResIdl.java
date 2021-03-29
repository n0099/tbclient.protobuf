package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetHistoryForumResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetHistoryForumResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetHistoryForumResIdl getHistoryForumResIdl) {
            super(getHistoryForumResIdl);
            if (getHistoryForumResIdl == null) {
                return;
            }
            this.error = getHistoryForumResIdl.error;
            this.data = getHistoryForumResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetHistoryForumResIdl build(boolean z) {
            return new GetHistoryForumResIdl(this, z);
        }
    }

    public GetHistoryForumResIdl(Builder builder, boolean z) {
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
