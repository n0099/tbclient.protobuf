package tbclient.MultiConcern;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class MultiConcernReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private MultiConcernReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<MultiConcernReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(MultiConcernReqIdl multiConcernReqIdl) {
            super(multiConcernReqIdl);
            if (multiConcernReqIdl != null) {
                this.data = multiConcernReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MultiConcernReqIdl build(boolean z) {
            return new MultiConcernReqIdl(this, z);
        }
    }
}
