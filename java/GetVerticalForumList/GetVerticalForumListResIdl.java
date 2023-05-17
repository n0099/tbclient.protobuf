package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class GetVerticalForumListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GetVerticalForumListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetVerticalForumListResIdl getVerticalForumListResIdl) {
            super(getVerticalForumListResIdl);
            if (getVerticalForumListResIdl == null) {
                return;
            }
            this.error = getVerticalForumListResIdl.error;
            this.data = getVerticalForumListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetVerticalForumListResIdl build(boolean z) {
            return new GetVerticalForumListResIdl(this, z);
        }
    }

    public GetVerticalForumListResIdl(Builder builder, boolean z) {
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
