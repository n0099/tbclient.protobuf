package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class QueryCollectUpdateNumResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ QueryCollectUpdateNumResIdl(Builder builder, boolean z, QueryCollectUpdateNumResIdl queryCollectUpdateNumResIdl) {
        this(builder, z);
    }

    private QueryCollectUpdateNumResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<QueryCollectUpdateNumResIdl> {
        public DataRes data;
        public Error error;

        public Builder(QueryCollectUpdateNumResIdl queryCollectUpdateNumResIdl) {
            super(queryCollectUpdateNumResIdl);
            if (queryCollectUpdateNumResIdl != null) {
                this.error = queryCollectUpdateNumResIdl.error;
                this.data = queryCollectUpdateNumResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public QueryCollectUpdateNumResIdl build(boolean z) {
            return new QueryCollectUpdateNumResIdl(this, z, null);
        }
    }
}
