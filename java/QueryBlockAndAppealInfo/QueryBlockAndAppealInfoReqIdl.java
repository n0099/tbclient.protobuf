package tbclient.QueryBlockAndAppealInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class QueryBlockAndAppealInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<QueryBlockAndAppealInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(QueryBlockAndAppealInfoReqIdl queryBlockAndAppealInfoReqIdl) {
            super(queryBlockAndAppealInfoReqIdl);
            if (queryBlockAndAppealInfoReqIdl == null) {
                return;
            }
            this.data = queryBlockAndAppealInfoReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public QueryBlockAndAppealInfoReqIdl build(boolean z) {
            return new QueryBlockAndAppealInfoReqIdl(this, z);
        }
    }

    public QueryBlockAndAppealInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
