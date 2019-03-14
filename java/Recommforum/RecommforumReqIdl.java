package tbclient.Recommforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class RecommforumReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private RecommforumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecommforumReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RecommforumReqIdl recommforumReqIdl) {
            super(recommforumReqIdl);
            if (recommforumReqIdl != null) {
                this.data = recommforumReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommforumReqIdl build(boolean z) {
            return new RecommforumReqIdl(this, z);
        }
    }
}