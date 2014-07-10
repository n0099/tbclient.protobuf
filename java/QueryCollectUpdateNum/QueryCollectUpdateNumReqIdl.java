package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class QueryCollectUpdateNumReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ QueryCollectUpdateNumReqIdl(Builder builder, boolean z, QueryCollectUpdateNumReqIdl queryCollectUpdateNumReqIdl) {
        this(builder, z);
    }

    private QueryCollectUpdateNumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<QueryCollectUpdateNumReqIdl> {
        public DataReq data;

        public Builder(QueryCollectUpdateNumReqIdl queryCollectUpdateNumReqIdl) {
            super(queryCollectUpdateNumReqIdl);
            if (queryCollectUpdateNumReqIdl != null) {
                this.data = queryCollectUpdateNumReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public QueryCollectUpdateNumReqIdl build(boolean z) {
            return new QueryCollectUpdateNumReqIdl(this, z, null);
        }
    }
}
