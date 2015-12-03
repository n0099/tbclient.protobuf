package tbclient.GetUserForumStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetUserForumStoreResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ GetUserForumStoreResIdl(Builder builder, boolean z, GetUserForumStoreResIdl getUserForumStoreResIdl) {
        this(builder, z);
    }

    private GetUserForumStoreResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetUserForumStoreResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUserForumStoreResIdl getUserForumStoreResIdl) {
            super(getUserForumStoreResIdl);
            if (getUserForumStoreResIdl != null) {
                this.data = getUserForumStoreResIdl.data;
                this.error = getUserForumStoreResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserForumStoreResIdl build(boolean z) {
            return new GetUserForumStoreResIdl(this, z, null);
        }
    }
}
