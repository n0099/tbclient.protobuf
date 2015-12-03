package tbclient.GetUserForumStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetUserForumStoreReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetUserForumStoreReqIdl(Builder builder, boolean z, GetUserForumStoreReqIdl getUserForumStoreReqIdl) {
        this(builder, z);
    }

    private GetUserForumStoreReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetUserForumStoreReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserForumStoreReqIdl getUserForumStoreReqIdl) {
            super(getUserForumStoreReqIdl);
            if (getUserForumStoreReqIdl != null) {
                this.data = getUserForumStoreReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserForumStoreReqIdl build(boolean z) {
            return new GetUserForumStoreReqIdl(this, z, null);
        }
    }
}
